package io.github.ctgnz.jmsfx.icon;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import com.google.common.base.Objects;

import static java.util.stream.Collectors.toList;
import static org.apache.commons.lang3.ObjectUtils.defaultIfNull;

import io.github.ctgnz.jmsfx.Context;
import io.github.ctgnz.jmsfx.CountryCode;
import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.HqtfDummy;
import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.Status;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.Version;

public class SymbolIdentificationCode {

    private Version version;
    private Context context;
    private StandardIdentity standardIdentity;
    private SymbolSet symbolSet;
    private Status status;
    private HqtfDummy hqtfDummy;
    private StandardAmplifierItem amplifier;
    private StandardAmplifierItem amplifierTwo;
    private StandardAmplifierItem amplifierThree;
    private StandardAmplifierItem frameAmplifier;
    private Entity entity;
    private EntityType entityType;
    private EntitySubType entitySubType;
    private SectorOneModifier sectorOneModifier;
    private SectorTwoModifier sectorTwoModifier;
    private CountryCode countryCode = Library.getExtensionCountryCode();
    private final PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    protected SymbolIdentificationCode() {
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.changeSupport.addPropertyChangeListener(listener);
    }

    public StandardAmplifierItem getAmplifier() {
        return amplifier;
    }

    public StandardAmplifierItem getAmplifierThree() {
        return amplifierThree;
    }

    public List<StandardAmplifierItem> getAmplifierThreeItems() {
        List<StandardAmplifierItem> listAmplifiers = symbolSet.getAmplifierListThree();
        return Stream.concat(Stream.of(Library.getDefaultAmplifier()), listAmplifiers.stream()).collect(toList());
    }

    public StandardAmplifierItem getAmplifierTwo() {
        return amplifierTwo;
    }

    public List<StandardAmplifierItem> getAmplifierTwoItems() {
        List<StandardAmplifierItem> listAmplifiers = symbolSet.getAmplifierListTwo();
        return Stream.concat(Stream.of(Library.getDefaultAmplifier()), listAmplifiers.stream()).collect(toList());
    }

    public Context getContext() {
        return context;
    }

    public CountryCode getCountryCode() {
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

    public List<Entity> getEntities() {
        return symbolSet.getEntities();
    }

    public Entity getEntity() {
        return entity;
    }

    public EntitySubType getEntitySubType() {
        return entitySubType;
    }

    public List<EntitySubType> getEntitySubTypes() {
        return entityType != null ? entityType.getEntitySubTypes() : Collections.emptyList();
    }

    public EntityType getEntityType() {
        return entityType;
    }

    public List<EntityType> getEntityTypes() {
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

    public StandardAmplifierItem getFrameAmplifier() {
        return frameAmplifier;
    }

    public List<StandardAmplifierItem> getFrameListAmplifiers() {
        List<StandardAmplifierItem> listAmplifiers = symbolSet.getFrameAmplifierList();
        return Stream.concat(Stream.of(Library.getDefaultAmplifier()), listAmplifiers.stream()).toList();
    }

    public HqtfDummy getHqtfDummy() {
        return hqtfDummy;
    }

    public List<StandardAmplifierItem> getListAmplifiers() {
        List<StandardAmplifierItem> listAmplifiers = symbolSet.getAmplifierList();
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

    public SectorOneModifier getSectorOneModifier() {
        return sectorOneModifier;
    }

    public List<SectorOneModifier> getSectorOneModifiers() {
        return symbolSet.getSectorOneModifiers();
    }

    public SectorTwoModifier getSectorTwoModifier() {
        return sectorTwoModifier;
    }

    public List<SectorTwoModifier> getSectorTwoModifiers() {
        return symbolSet.getSectorTwoModifiers();
    }

    public StandardIdentity getStandardIdentity() {
        return standardIdentity;
    }

    public Status getStatus() {
        return status;
    }

    public SymbolSet getSymbolSet() {
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

    public Version getVersion() {
        return version;
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.changeSupport.removePropertyChangeListener(listener);
    }

    public void setAmplifier(StandardAmplifierItem amplifier) {
        StandardAmplifierItem oldValue = this.amplifier;
        this.amplifier = defaultIfNull(amplifier, Library.getDefaultAmplifier());
        changeSupport.firePropertyChange("amplifier", oldValue, this.amplifier);
    }

    public void setAmplifierThree(StandardAmplifierItem amplifier) {
        StandardAmplifierItem oldValue = this.amplifierThree;
        this.amplifierThree = defaultIfNull(amplifier, Library.getDefaultAmplifier());
        changeSupport.firePropertyChange("amplifierThree", oldValue, this.amplifierThree);
    }

    public void setAmplifierTwo(StandardAmplifierItem amplifier) {
        StandardAmplifierItem oldValue = this.amplifierTwo;
        this.amplifierTwo = defaultIfNull(amplifier, Library.getDefaultAmplifier());
        changeSupport.firePropertyChange("amplifierTwo", oldValue, this.amplifierTwo);
    }

    public void setContext(Context context) {
        Context oldValue = this.context;
        this.context = defaultIfNull(context, Library.getDefaultContext());
        changeSupport.firePropertyChange("context", oldValue, this.context);
    }

    public void setCountryCode(CountryCode countryCode) {
        CountryCode oldValue = this.countryCode;
        this.countryCode = defaultIfNull(countryCode, Library.getExtensionCountryCode());
        changeSupport.firePropertyChange("countryCode", oldValue, this.countryCode);
    }

    public void setEntity(Entity entity) {
        Entity oldValue = this.entity;
        this.entity = defaultIfNull(entity, getDefaultEntity());
        changeSupport.firePropertyChange("entity", oldValue, this.entity);
        if (!Objects.equal(oldValue, entity)) {
            setEntityType(null);
        }
    }

    public void setEntitySubType(EntitySubType entitySubType) {
        EntitySubType oldValue = this.entitySubType;
        this.entitySubType = entitySubType;
        changeSupport.firePropertyChange("entitySubType", oldValue, this.entitySubType);
    }

    public void setEntityType(EntityType entityType) {
        EntityType oldValue = this.entityType;
        this.entityType = entityType;
        changeSupport.firePropertyChange("entityType", oldValue, this.entityType);
        if (!Objects.equal(oldValue, entityType)) {
            setEntitySubType(null);
        }
    }

    public void setFrameAmplifier(StandardAmplifierItem amplifier) {
        StandardAmplifierItem oldValue = this.frameAmplifier;
        this.frameAmplifier = defaultIfNull(amplifier, Library.getDefaultAmplifier());
        changeSupport.firePropertyChange("frameAmplifier", oldValue, this.frameAmplifier);
    }

    public void setHqtfDummy(HqtfDummy hqtfDummy) {
        HqtfDummy oldValue = this.hqtfDummy;
        this.hqtfDummy = defaultIfNull(hqtfDummy, Library.getDefaultHqtfDummy());
        changeSupport.firePropertyChange("hqtfDummy", oldValue, this.hqtfDummy);
    }

    public void setSectorOneModifier(SectorOneModifier sectorOneModifier) {
        SectorOneModifier oldValue = this.sectorOneModifier;
        this.sectorOneModifier = sectorOneModifier;
        changeSupport.firePropertyChange("sectorOneModifier", oldValue, this.sectorOneModifier);
    }

    public void setSectorTwoModifier(SectorTwoModifier sectorTwoModifier) {
        SectorTwoModifier oldValue = this.sectorTwoModifier;
        this.sectorTwoModifier = sectorTwoModifier;
        changeSupport.firePropertyChange("sectorTwoModifier", oldValue, this.sectorTwoModifier);
    }

    public void setStandardIdentity(StandardIdentity standardIdentity) {
        StandardIdentity oldValue = this.standardIdentity;
        this.standardIdentity = defaultIfNull(standardIdentity, Library.getDefaultStandardIdentity());
        changeSupport.firePropertyChange("standardIdentity", oldValue, this.standardIdentity);
    }

    public void setStatus(Status status) {
        Status oldValue = this.status;
        this.status = defaultIfNull(status, Library.getDefaultStatus());
        changeSupport.firePropertyChange("status", oldValue, this.status);
    }

    public void setSymbolSet(SymbolSet symbolSet) {
        SymbolSet oldValue = this.symbolSet;
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

    public void setVersion(Version version) {
        Version oldValue = this.version;
        this.version = defaultIfNull(version, Library.getDefaultVersion());
        changeSupport.firePropertyChange("version", oldValue, this.version);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getFirstTenDigits(), getSecondTenDigits(), getThirdTenDigits());
    }

    private Entity getDefaultEntity() {
        return symbolSet.getEntities().getFirst();
    }

    private SectorOneModifier getDefaultSectorOneModifier() {
        List<SectorOneModifier> sectorOneModifiers = symbolSet.getSectorOneModifiers();
        return sectorOneModifiers.isEmpty() ? null : sectorOneModifiers.get(0);
    }

    private SectorTwoModifier getDefaultSectorTwoModifier() {
        List<SectorTwoModifier> mods = symbolSet.getSectorTwoModifiers();
        return mods.isEmpty() ? null : mods.get(0);
    }
}
