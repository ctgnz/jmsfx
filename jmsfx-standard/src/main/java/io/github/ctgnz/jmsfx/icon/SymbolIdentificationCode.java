package io.github.ctgnz.jmsfx.icon;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import com.google.common.base.Objects;

import static java.util.stream.Collectors.toList;
import static org.apache.commons.lang3.ObjectUtils.defaultIfNull;

import io.github.ctgnz.jmsfx.IContext;
import io.github.ctgnz.jmsfx.ICountryCode;
import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.IHqtfDummy;
import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.IStandardAmplifierItem;
import io.github.ctgnz.jmsfx.IStandardIdentity;
import io.github.ctgnz.jmsfx.IStatus;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.IVersion;

public class SymbolIdentificationCode {

    private IVersion version;
    private IContext context;
    private IStandardIdentity standardIdentity;
    private ISymbolSet symbolSet;
    private IStatus status;
    private IHqtfDummy hqtfDummy;
    private IStandardAmplifierItem amplifier;
    private IStandardAmplifierItem amplifierTwo;
    private IStandardAmplifierItem amplifierThree;
    private IStandardAmplifierItem frameAmplifier;
    private IEntity entity;
    private IEntityType entityType;
    private IEntitySubType entitySubType;
    private ISectorOneModifier sectorOneModifier;
    private ISectorTwoModifier sectorTwoModifier;
    private ICountryCode countryCode = Library.getExtensionCountryCode();
    private final PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    protected SymbolIdentificationCode() {
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.changeSupport.addPropertyChangeListener(listener);
    }

    public IStandardAmplifierItem getAmplifier() {
        return amplifier;
    }

    public IStandardAmplifierItem getAmplifierThree() {
        return amplifierThree;
    }

    public List<IStandardAmplifierItem> getAmplifierThreeItems() {
        List<IStandardAmplifierItem> listAmplifiers = symbolSet.getAmplifierListThree();
        return Stream.concat(Stream.of(Library.getDefaultAmplifier()), listAmplifiers.stream()).collect(toList());
    }

    public IStandardAmplifierItem getAmplifierTwo() {
        return amplifierTwo;
    }

    public List<IStandardAmplifierItem> getAmplifierTwoItems() {
        List<IStandardAmplifierItem> listAmplifiers = symbolSet.getAmplifierListTwo();
        return Stream.concat(Stream.of(Library.getDefaultAmplifier()), listAmplifiers.stream()).collect(toList());
    }

    public IContext getContext() {
        return context;
    }

    public ICountryCode getCountryCode() {
        return defaultIfNull(countryCode, Library.getExtensionCountryCode());
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        if (entityType != null) {
            sb.append(entityType.getLabel());
        } else if (entity != null) {
            sb.append(entity.getLabel());
        }
        if (entitySubType != null) {
            sb.append(" (");
            sb.append(entitySubType.getLabel());
            sb.append(")");
        }
        if (sectorOneModifier != null && !sectorOneModifier.isUnknown()) {
            sb.append(" ");
            sb.append(sectorOneModifier.getLabel());
        }
        if (sectorTwoModifier != null && !sectorTwoModifier.isUnknown()) {
            sb.append(" ");
            sb.append(sectorTwoModifier.getLabel());
        }
        if (amplifier != null && !amplifier.isUnknown()) {
            sb.append(" ");
            sb.append(amplifier.getLabel());
        }
        return sb.toString();
    }

    public List<IEntity> getEntities() {
        return symbolSet.getEntities();
    }

    public IEntity getEntity() {
        return entity;
    }

    public IEntitySubType getEntitySubType() {
        return entitySubType;
    }

    public List<IEntitySubType> getEntitySubTypes() {
        return entityType != null ? entityType.getEntitySubTypes() : Collections.emptyList();
    }

    public IEntityType getEntityType() {
        return entityType;
    }

    public List<IEntityType> getEntityTypes() {
        return entity.getEntityTypes();
    }

    public String getFirstTenDigits() {
        return String.format("%s%s%s%s%s%s%s",
                             version.getId(),
                             context.getId(),
                             standardIdentity.getId(),
                             symbolSet != null ? symbolSet.getId() : "00",
                             status.getId(),
                             hqtfDummy.getId(),
                             amplifier != null ? amplifier.getId() : "00");
    }

    public IStandardAmplifierItem getFrameAmplifier() {
        return frameAmplifier;
    }

    public List<IStandardAmplifierItem> getFrameListAmplifiers() {
        List<IStandardAmplifierItem> listAmplifiers = symbolSet.getFrameAmplifierList();
        return Stream.concat(Stream.of(Library.getDefaultAmplifier()), listAmplifiers.stream()).toList();
    }

    public IHqtfDummy getHqtfDummy() {
        return hqtfDummy;
    }

    public List<IStandardAmplifierItem> getListAmplifiers() {
        List<IStandardAmplifierItem> listAmplifiers = symbolSet.getAmplifierList();
        return Stream.concat(Stream.of(Library.getDefaultAmplifier()), listAmplifiers.stream()).collect(toList());
    }

    public String getSecondTenDigits() {
        return String.format("%s%s%s%s%s",
                             entity != null ? entity.getId() : "00",
                             entityType != null ? entityType.getId() : "00",
                             entitySubType != null ? entitySubType.getId() : "00",
                             sectorOneModifier != null ? sectorOneModifier.getId() : "00",
                             sectorTwoModifier != null ? sectorTwoModifier.getId() : "00");
    }

    public ISectorOneModifier getSectorOneModifier() {
        return sectorOneModifier;
    }

    public List<ISectorOneModifier> getSectorOneModifiers() {
        return symbolSet.getSectorOneModifiers();
    }

    public ISectorTwoModifier getSectorTwoModifier() {
        return sectorTwoModifier;
    }

    public List<ISectorTwoModifier> getSectorTwoModifiers() {
        return symbolSet.getSectorTwoModifiers();
    }

    public IStandardIdentity getStandardIdentity() {
        return standardIdentity;
    }

    public IStatus getStatus() {
        return status;
    }

    public ISymbolSet getSymbolSet() {
        return symbolSet;
    }

    public String getThirdTenDigits() {
        return String.format("%s%s%s%s%s%s",
                             getSectorOneModifier() != null ? getSectorOneModifier().getGroupId() : "0",
                             getSectorTwoModifier() != null ? getSectorTwoModifier().getGroupId() : "0",
                             amplifierTwo != null ? amplifierTwo.getFullId() : "00",
                             amplifierThree != null ? amplifierThree.getFullId() : "00",
                             frameAmplifier != null ? frameAmplifier.getId() : "0",
                             getCountryCode().getCode());
    }

    public IVersion getVersion() {
        return version;
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.changeSupport.removePropertyChangeListener(listener);
    }

    public void setAmplifier(IStandardAmplifierItem amplifier) {
        IStandardAmplifierItem oldValue = this.amplifier;
        this.amplifier = defaultIfNull(amplifier, Library.getDefaultAmplifier());
        changeSupport.firePropertyChange("amplifier", oldValue, this.amplifier);
    }

    public void setAmplifierThree(IStandardAmplifierItem amplifier) {
        IStandardAmplifierItem oldValue = this.amplifierThree;
        this.amplifierThree = defaultIfNull(amplifier, Library.getDefaultAmplifier());
        changeSupport.firePropertyChange("amplifierThree", oldValue, this.amplifierThree);
    }

    public void setAmplifierTwo(IStandardAmplifierItem amplifier) {
        IStandardAmplifierItem oldValue = this.amplifierTwo;
        this.amplifierTwo = defaultIfNull(amplifier, Library.getDefaultAmplifier());
        changeSupport.firePropertyChange("amplifierTwo", oldValue, this.amplifierTwo);
    }

    public void setContext(IContext context) {
        IContext oldValue = this.context;
        this.context = defaultIfNull(context, Library.getDefaultContext());
        changeSupport.firePropertyChange("context", oldValue, this.context);
    }

    public void setCountryCode(ICountryCode countryCode) {
        ICountryCode oldValue = this.countryCode;
        this.countryCode = defaultIfNull(countryCode, Library.getExtensionCountryCode());
        changeSupport.firePropertyChange("countryCode", oldValue, this.countryCode);
    }

    public void setEntity(IEntity entity) {
        IEntity oldValue = this.entity;
        this.entity = defaultIfNull(entity, getDefaultEntity());
        changeSupport.firePropertyChange("entity", oldValue, this.entity);
        if (!Objects.equal(oldValue, entity)) {
            setEntityType(null);
        }
    }

    public void setEntitySubType(IEntitySubType entitySubType) {
        IEntitySubType oldValue = this.entitySubType;
        this.entitySubType = entitySubType;
        changeSupport.firePropertyChange("entitySubType", oldValue, this.entitySubType);
    }

    public void setEntityType(IEntityType entityType) {
        IEntityType oldValue = this.entityType;
        this.entityType = entityType;
        changeSupport.firePropertyChange("entityType", oldValue, this.entityType);
        if (!Objects.equal(oldValue, entityType)) {
            setEntitySubType(null);
        }
    }

    public void setFrameAmplifier(IStandardAmplifierItem amplifier) {
        IStandardAmplifierItem oldValue = this.frameAmplifier;
        this.frameAmplifier = defaultIfNull(amplifier, Library.getDefaultAmplifier());
        changeSupport.firePropertyChange("frameAmplifier", oldValue, this.frameAmplifier);
    }

    public void setHqtfDummy(IHqtfDummy hqtfDummy) {
        IHqtfDummy oldValue = this.hqtfDummy;
        this.hqtfDummy = defaultIfNull(hqtfDummy, Library.getDefaultHqtfDummy());
        changeSupport.firePropertyChange("hqtfDummy", oldValue, this.hqtfDummy);
    }

    public void setSectorOneModifier(ISectorOneModifier sectorOneModifier) {
        ISectorOneModifier oldValue = this.sectorOneModifier;
        this.sectorOneModifier = sectorOneModifier;
        changeSupport.firePropertyChange("sectorOneModifier", oldValue, this.sectorOneModifier);
    }

    public void setSectorTwoModifier(ISectorTwoModifier sectorTwoModifier) {
        ISectorTwoModifier oldValue = this.sectorTwoModifier;
        this.sectorTwoModifier = sectorTwoModifier;
        changeSupport.firePropertyChange("sectorTwoModifier", oldValue, this.sectorTwoModifier);
    }

    public void setStandardIdentity(IStandardIdentity standardIdentity) {
        IStandardIdentity oldValue = this.standardIdentity;
        this.standardIdentity = defaultIfNull(standardIdentity, Library.getDefaultStandardIdentity());
        changeSupport.firePropertyChange("standardIdentity", oldValue, this.standardIdentity);
    }

    public void setStatus(IStatus status) {
        IStatus oldValue = this.status;
        this.status = defaultIfNull(status, Library.getDefaultStatus());
        changeSupport.firePropertyChange("status", oldValue, this.status);
    }

    public void setSymbolSet(ISymbolSet symbolSet) {
        ISymbolSet oldValue = this.symbolSet;
        this.symbolSet = defaultIfNull(symbolSet, Library.getDefaultSymbolSet());
        if (!Objects.equal(oldValue, symbolSet)) {
            this.amplifier = Library.getDefaultAmplifier();
            this.amplifierTwo = Library.getDefaultAmplifier();
            this.amplifierThree = Library.getDefaultAmplifier();
            this.frameAmplifier = Library.getDefaultAmplifier();
            this.sectorOneModifier = getDefaultSectorOneModifier();
            this.sectorTwoModifier = getDefaultSectorTwoModifier();
            this.entity = getDefaultEntity();
            this.entityType = null;
            this.entitySubType = null;
        }
        changeSupport.firePropertyChange("symbolSet", oldValue, this.symbolSet);
    }

    public void setVersion(IVersion version) {
        IVersion oldValue = this.version;
        this.version = defaultIfNull(version, Library.getDefaultVersion());
        changeSupport.firePropertyChange("version", oldValue, this.version);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getFirstTenDigits(), getSecondTenDigits(), getThirdTenDigits());
    }

    private IEntity getDefaultEntity() {
        return symbolSet.getEntities().getFirst();
    }

    private ISectorOneModifier getDefaultSectorOneModifier() {
        List<ISectorOneModifier> sectorOneModifiers = symbolSet.getSectorOneModifiers();
        return sectorOneModifiers.isEmpty() ? null : sectorOneModifiers.get(0);
    }

    private ISectorTwoModifier getDefaultSectorTwoModifier() {
        List<ISectorTwoModifier> mods = symbolSet.getSectorTwoModifiers();
        return mods.isEmpty() ? null : mods.get(0);
    }
}
