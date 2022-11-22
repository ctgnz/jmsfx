package nz.co.ctg.jmsfx.model;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.stream.Stream;

import com.google.common.base.Objects;

import static java.util.stream.Collectors.toList;
import static org.apache.commons.lang3.ObjectUtils.defaultIfNull;

public class SymbolIdentificationCode {
    public static final EnumSet<Status> ICON_STATUS = EnumSet.of(Status.FULLY_CAPABLE, Status.DAMAGED, Status.DESTROYED, Status.FULL);
    public static final EnumSet<StandardIdentity> KNOWN_IDENTITIES = EnumSet.of(StandardIdentity.SI_UNKNOWN, StandardIdentity.SI_FRIEND, StandardIdentity.SI_NEUTRAL, StandardIdentity.SI_HOSTILE_FAKER);
    public static final EnumSet<StandardIdentity> UNKNOWN_IDENTITIES = EnumSet.complementOf(KNOWN_IDENTITIES);
    public static final Version DEFAULT_VERSION = Version.Base;
    public static final Context DEFAULT_CONTEXT = Context.REALITY;
    public static final StandardIdentity DEFAULT_STANDARD_ID = StandardIdentity.SI_FRIEND;
    public static final SymbolSet DEFAULT_SYMBOL_SET = SymbolSet.SS_UNKNOWN;
    public static final Status DEFAULT_STATUS = Status.PRESENT;
    public static final HqtfDummy DEFAULT_HQTF_DUMMY = HqtfDummy.NA;
    public static final UnknownAmplifier DEFAULT_AMPLIFIER = UnknownAmplifier.NA;
    private static String extensionCountryCode = "826";
    private static String extensionSymbolSet = "0";

    public static String getExtensionCountryCode() {
        return extensionCountryCode;
    }

    public static String getExtensionSymbolSet() {
        return extensionSymbolSet;
    }

    public static void setExtensionCountryCode(String extensionCountryCode) {
        SymbolIdentificationCode.extensionCountryCode = extensionCountryCode;
    }

    public static void setExtensionSymbolSet(String extensionSymbolSet) {
        SymbolIdentificationCode.extensionSymbolSet = extensionSymbolSet;
    }

    private Version version = DEFAULT_VERSION;
    private Context context = DEFAULT_CONTEXT;
    private StandardIdentity standardIdentity = DEFAULT_STANDARD_ID;
    private SymbolSet symbolSet = DEFAULT_SYMBOL_SET;
    private Status status = DEFAULT_STATUS;
    private HqtfDummy hqtfDummy = DEFAULT_HQTF_DUMMY;
    private AmplifierGroup amplifier = DEFAULT_AMPLIFIER;
    private AmplifierGroup amplifierTwo = DEFAULT_AMPLIFIER;
    private AmplifierGroup amplifierThree = DEFAULT_AMPLIFIER;
    private AmplifierGroup frameAmplifier = DEFAULT_AMPLIFIER;
    private Entity entity = getDefaultEntity();
    private EntityType entityType;
    private EntitySubType entitySubType;
    private SectorOneModifier sectorOneModifier;
    private SectorTwoModifier sectorTwoModifier;
    private final PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    public SymbolIdentificationCode() {
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        this.changeSupport.addPropertyChangeListener(listener);
    }

    public AmplifierGroup getAmplifier() {
        return amplifier;
    }

    public AmplifierGroup getAmplifierTwo() {
        return amplifierTwo;
    }

    public AmplifierGroup getAmplifierThree() {
        return amplifierThree;
    }

    public AmplifierGroup getFrameAmplifier() {
        return frameAmplifier;
    }

    public List<AmplifierGroup> getAmplifierGroups() {
        List<AmplifierGroup> amplifierGroups = symbolSet.getAmplifierGroups();
        return Stream.concat(Stream.of(DEFAULT_AMPLIFIER), amplifierGroups.stream()).collect(toList());
    }

    public List<AmplifierGroup> getAmplifierTwoGroups() {
        List<AmplifierGroup> amplifierGroups = symbolSet.getAmplifierTwoGroups();
        return Stream.concat(Stream.of(DEFAULT_AMPLIFIER), amplifierGroups.stream()).collect(toList());
    }

    public List<AmplifierGroup> getAmplifierThreeGroups() {
        List<AmplifierGroup> amplifierGroups = symbolSet.getAmplifierThreeGroups();
        return Stream.concat(Stream.of(DEFAULT_AMPLIFIER), amplifierGroups.stream()).collect(toList());
    }

    public Context getContext() {
        return context;
    }

    public Entity getDefaultEntity() {
        return symbolSet.getEntities().get(0);
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

    public List<FrameAmplifierGroup> getFrameAmplifierGroups() {
        List<FrameAmplifierGroup> amplifierGroups = symbolSet.getFrameAmplifierGroups();
        return Stream.concat(Stream.of(DEFAULT_AMPLIFIER), amplifierGroups.stream()).map(FrameAmplifierGroup.class::cast).collect(toList());
    }

    public HqtfDummy getHqtfDummy() {
        return hqtfDummy;
    }

    public String getSecondTenDigits() {
        return String.format("%s%s%s%s%s",
                             entity != null ? entity.getId() : "00",
                             entityType != null ? entityType.getId() : "00",
                             entitySubType != null ? entitySubType.getId() : "00",
                             sectorOneModifier != null ? sectorOneModifier.getId() : "00",
                             sectorTwoModifier != null ? sectorTwoModifier.getId() : "00");
    }

    public String getThirdTenDigits() {
        return String.format("%s%s%s%s%s",
                             getExtensionCountryCode(),
                             getExtensionSymbolSet(),
                             amplifierTwo != null ? amplifierTwo.getId() : "00",
                             amplifierThree != null ? amplifierThree.getId() : "00",
                             frameAmplifier != null ? frameAmplifier.getId() : "00");
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

    public Version getVersion() {
        return version;
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        this.changeSupport.removePropertyChangeListener(listener);
    }

    public void setAmplifier(AmplifierGroup amplifier) {
        AmplifierGroup oldValue = this.amplifier;
        this.amplifier = defaultIfNull(amplifier, DEFAULT_AMPLIFIER);
        changeSupport.firePropertyChange("amplifier", oldValue, this.amplifier);
    }

    public void setAmplifierTwo(AmplifierGroup amplifier) {
        AmplifierGroup oldValue = this.amplifierTwo;
        this.amplifierTwo = defaultIfNull(amplifier, DEFAULT_AMPLIFIER);
        changeSupport.firePropertyChange("amplifierTwo", oldValue, this.amplifierTwo);
    }

    public void setAmplifierThree(AmplifierGroup amplifier) {
        AmplifierGroup oldValue = this.amplifierThree;
        this.amplifierThree = defaultIfNull(amplifier, DEFAULT_AMPLIFIER);
        changeSupport.firePropertyChange("amplifierThree", oldValue, this.amplifierThree);
    }

    public void setContext(Context context) {
        Context oldValue = this.context;
        this.context = defaultIfNull(context, DEFAULT_CONTEXT);
        changeSupport.firePropertyChange("context", oldValue, this.context);
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

    public void setFrameAmplifier(AmplifierGroup amplifier) {
        AmplifierGroup oldValue = this.frameAmplifier;
        this.frameAmplifier = defaultIfNull(amplifier, DEFAULT_AMPLIFIER);
        changeSupport.firePropertyChange("frameAmplifier", oldValue, this.frameAmplifier);
    }

    public void setHqtfDummy(HqtfDummy hqtfDummy) {
        HqtfDummy oldValue = this.hqtfDummy;
        this.hqtfDummy = hqtfDummy;
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
        this.standardIdentity = defaultIfNull(standardIdentity, DEFAULT_STANDARD_ID);
        changeSupport.firePropertyChange("standardIdentity", oldValue, this.standardIdentity);
    }

    public void setStatus(Status status) {
        Status oldValue = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldValue, this.status);
    }

    public void setSymbolSet(SymbolSet symbolSet) {
        SymbolSet oldValue = this.symbolSet;
        this.symbolSet = defaultIfNull(symbolSet, DEFAULT_SYMBOL_SET);
        if (!Objects.equal(oldValue, symbolSet)) {
            this.amplifier = DEFAULT_AMPLIFIER;
            this.amplifierTwo = DEFAULT_AMPLIFIER;
            this.amplifierThree = DEFAULT_AMPLIFIER;
            this.frameAmplifier = DEFAULT_AMPLIFIER;
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
        this.version = defaultIfNull(version, DEFAULT_VERSION);
        changeSupport.firePropertyChange("version", oldValue, this.version);
    }

    @Override
    public String toString() {
        return String.format("%s %s %s", getFirstTenDigits(), getSecondTenDigits(), getThirdTenDigits());
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
