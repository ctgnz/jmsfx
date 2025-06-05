package io.github.ctgnz.jmsfx.icon;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import com.google.common.base.Objects;

import io.github.ctgnz.jmsfx.IContext;
import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.IHqtfDummy;
import io.github.ctgnz.jmsfx.IListAmplifier;
import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.IStandardIdentity;
import io.github.ctgnz.jmsfx.IStatus;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.IVersion;
import io.github.ctgnz.jmsfx.icon.amplifier.CountryCode;
import io.github.ctgnz.jmsfx.icon.common.CommonSymbolSetInfo;
import io.github.ctgnz.jmsfx.icon.common.CommonSectorOneModifier;
import io.github.ctgnz.jmsfx.icon.common.CommonSectorTwoModifier;

import static java.util.stream.Collectors.toList;
import static org.apache.commons.lang3.ObjectUtils.defaultIfNull;

public class SymbolIdentificationCode {

    public static final class Builder {
        private IVersion version = Library.getDefaultVersion();
        private IContext context = Library.getDefaultContext();
        private IStandardIdentity standardId = Library.getDefaultStandardIdentity();
        private ISymbolSet symbolSet = Library.getDefaultSymbolSet();
        private IStatus status = Library.getDefaultStatus();
        private IHqtfDummy hqtfDummy = Library.getDefaultHqtfDummy();
        private IListAmplifier amplifier = Library.getDefaultAmplifier();
        private IListAmplifier amplifier2 = Library.getDefaultAmplifier();
        private IListAmplifier amplifier3 = Library.getDefaultAmplifier();
        private IListAmplifier frameAmplifier = Library.getDefaultAmplifier();
        private CountryCode countryCode = Library.getExtensionCountryCode();
        private IEntity entity;
        private IEntityType entityType;
        private IEntitySubType entitySubType;
        private ISectorOneModifier sectorOneModifier;
        private ISectorTwoModifier sectorTwoModifier;

        public Builder(ISymbolSet symbolSet) {
            this.symbolSet = symbolSet;
            this.entity = symbolSet.getEntities().get(0);
        }

        public SymbolIdentificationCode build() {
            SymbolIdentificationCode code = new SymbolIdentificationCode();
            code.setVersion(version);
            code.setContext(context);
            code.setStandardIdentity(standardId);
            code.setSymbolSet(symbolSet);
            code.setStatus(status);
            code.setHqtfDummy(hqtfDummy);
            code.setAmplifier(amplifier);
            code.setAmplifierTwo(amplifier2);
            code.setAmplifierThree(amplifier3);
            code.setFrameAmplifier(frameAmplifier);
            code.setCountryCode(countryCode);
            code.setEntity(entity);
            code.setEntityType(entityType);
            code.setEntitySubType(entitySubType);
            code.setSectorOneModifier(sectorOneModifier);
            code.setSectorTwoModifier(sectorTwoModifier);
            return code;
        }

        public Builder with(IVersion version) {
            this.version = version;
            return this;
        }

        public Builder with(IContext context) {
            this.context = context;
            return this;
        }

        public Builder with(IStandardIdentity standardId) {
            this.standardId = standardId;
            return this;
        }

        public Builder with(IStatus status) {
            this.status = status;
            return this;
        }

        public Builder with(IHqtfDummy hqtfDummy) {
            this.hqtfDummy = hqtfDummy;
            return this;
        }

        public Builder with(CountryCode countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public Builder amplifier(IListAmplifier amplifier) {
            this.amplifier = amplifier;
            return this;
        }

        public Builder amplifier2(IListAmplifier amplifier2) {
            this.amplifier2 = amplifier2;
            return this;
        }

        public Builder amplifier3(IListAmplifier amplifier3) {
            this.amplifier3 = amplifier3;
            return this;
        }

        public Builder frameAmplifier(IListAmplifier frameAmplifier) {
            this.frameAmplifier = frameAmplifier;
            return this;
        }

        public Builder entity(IEntity entity) {
            this.entity = entity;
            return this;
        }

        public Builder entityType(IEntityType entityType) {
            this.entityType = entityType;
            return this;
        }

        public Builder entitySubType(IEntitySubType entitySubType) {
            this.entitySubType = entitySubType;
            return this;
        }

        public Builder sectorOneModifier(ISectorOneModifier sectorOneModifier) {
            this.sectorOneModifier = sectorOneModifier;
            return this;
        }

        public Builder sectorTwoModifier(ISectorTwoModifier sectorTwoModifier) {
            this.sectorTwoModifier = sectorTwoModifier;
            return this;
        }

    }

    public static Builder builder() {
        return new Builder(Library.getDefaultSymbolSet());
    }

    public static Builder builder(ISymbolSet symbolSet) {
        return new Builder(symbolSet);
    }

    private IVersion version;
    private IContext context;
    private IStandardIdentity standardIdentity;
    private ISymbolSet symbolSet;
    private IStatus status;
    private IHqtfDummy hqtfDummy;
    private IListAmplifier amplifier;
    private IListAmplifier amplifierTwo;
    private IListAmplifier amplifierThree;
    private IListAmplifier frameAmplifier;
    private IEntity entity;
    private IEntityType entityType;
    private IEntitySubType entitySubType;
    private ISectorOneModifier sectorOneModifier;
    private ISectorTwoModifier sectorTwoModifier;
    private CountryCode countryCode = Library.getExtensionCountryCode();
    private final PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    protected SymbolIdentificationCode() {
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.changeSupport.addPropertyChangeListener(listener);
    }

    public IListAmplifier getAmplifier() {
        return amplifier;
    }

    public IListAmplifier getAmplifierThree() {
        return amplifierThree;
    }

    public List<IListAmplifier> getAmplifierThreeGroups() {
        List<IListAmplifier> listAmplifiers = symbolSet.getAmplifierThreeGroups();
        return Stream.concat(Stream.of(Library.getDefaultAmplifier()), listAmplifiers.stream()).collect(toList());
    }

    public IListAmplifier getAmplifierTwo() {
        return amplifierTwo;
    }

    public List<IListAmplifier> getAmplifierTwoGroups() {
        List<IListAmplifier> listAmplifiers = symbolSet.getAmplifierTwoGroups();
        return Stream.concat(Stream.of(Library.getDefaultAmplifier()), listAmplifiers.stream()).collect(toList());
    }

    public IContext getContext() {
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

    public IListAmplifier getFrameAmplifier() {
        return frameAmplifier;
    }

    public List<IListAmplifier> getFrameListAmplifiers() {
        List<IListAmplifier> listAmplifiers = symbolSet.getFrameListAmplifiers();
        return Stream.concat(Stream.of(Library.getDefaultAmplifier()), listAmplifiers.stream()).toList();
    }

    public IHqtfDummy getHqtfDummy() {
        return hqtfDummy;
    }

    public List<IListAmplifier> getListAmplifiers() {
        List<IListAmplifier> listAmplifiers = symbolSet.getListAmplifiers();
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
        return Stream.concat(symbolSet.getSectorOneModifiers().stream(), CommonSymbolSetInfo.INSTANCE.getSectorOneModifiers().stream()).toList();
    }

    public String getSectorOneModifierType() {
        if (getSectorOneModifier() instanceof CommonSectorOneModifier commonMod) {
            return commonMod.getGroupId();
        }
        return "0";
    }

    public ISectorTwoModifier getSectorTwoModifier() {
        return sectorTwoModifier;
    }

    public List<ISectorTwoModifier> getSectorTwoModifiers() {
        return Stream.concat(symbolSet.getSectorTwoModifiers().stream(), CommonSymbolSetInfo.INSTANCE.getSectorTwoModifiers().stream()).toList();
    }

    public String getSectorTwoModifierType() {
        if (getSectorTwoModifier() instanceof CommonSectorTwoModifier commonMod) {
            return commonMod.getGroupId();
        }
        return "0";
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
                             getSectorOneModifierType(),
                             getSectorTwoModifierType(),
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

    public void setAmplifier(IListAmplifier amplifier) {
        IListAmplifier oldValue = this.amplifier;
        this.amplifier = defaultIfNull(amplifier, Library.getDefaultAmplifier());
        changeSupport.firePropertyChange("amplifier", oldValue, this.amplifier);
    }

    public void setAmplifierThree(IListAmplifier amplifier) {
        IListAmplifier oldValue = this.amplifierThree;
        this.amplifierThree = defaultIfNull(amplifier, Library.getDefaultAmplifier());
        changeSupport.firePropertyChange("amplifierThree", oldValue, this.amplifierThree);
    }

    public void setAmplifierTwo(IListAmplifier amplifier) {
        IListAmplifier oldValue = this.amplifierTwo;
        this.amplifierTwo = defaultIfNull(amplifier, Library.getDefaultAmplifier());
        changeSupport.firePropertyChange("amplifierTwo", oldValue, this.amplifierTwo);
    }

    public void setContext(IContext context) {
        IContext oldValue = this.context;
        this.context = defaultIfNull(context, Library.getDefaultContext());
        changeSupport.firePropertyChange("context", oldValue, this.context);
    }

    public void setCountryCode(CountryCode countryCode) {
        CountryCode oldValue = this.countryCode;
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

    public void setFrameAmplifier(IListAmplifier amplifier) {
        IListAmplifier oldValue = this.frameAmplifier;
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
        return symbolSet.getEntities().get(0);
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
