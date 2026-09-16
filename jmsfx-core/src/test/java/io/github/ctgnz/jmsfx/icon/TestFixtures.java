package io.github.ctgnz.jmsfx.icon;

import java.util.Collections;
import java.util.List;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;

import nz.co.ctg.foxglove.SvgGraphic;

import io.github.ctgnz.jmsfx.Amplifier;
import io.github.ctgnz.jmsfx.AmplifierGuide;
import io.github.ctgnz.jmsfx.AmplifierList;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.Context;
import io.github.ctgnz.jmsfx.CountryCode;
import io.github.ctgnz.jmsfx.Dimension;
import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.HqtfDummy;
import io.github.ctgnz.jmsfx.IconLibrary;
import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.StandardIdentityGroup;
import io.github.ctgnz.jmsfx.Status;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.Version;
import io.github.ctgnz.jmsfx.types.AmplifierType;
import io.github.ctgnz.jmsfx.types.GeometryType;
import io.github.ctgnz.jmsfx.types.GraphicType;
import io.github.ctgnz.jmsfx.types.GuideType;
import io.github.ctgnz.jmsfx.types.ModifierCategory;

/**
 * Hand-written fakes for jmsfx-core's model interfaces, used to test {@link IdentificationSymbol} in isolation from any real symbol library (jmsfx-standard depends on jmsfx-core,
 * not the other way around, so a real {@code StandardIconLibrary} is never available here). Deliberately not mocks - every fake is a small, real object with fixed, inspectable
 * behaviour, matching this project's (and foxglove's) house style of testing real objects over mock-based specification.
 */
final class TestFixtures {

    private TestFixtures() {
    }

    static FakeAmplifier amplifier(String id, String label) {
        return new FakeAmplifier(id, label);
    }

    static FakeAmplifierListItem unknownAmplifier() {
        return new FakeAmplifierListItem("00", "Unspecified", false);
    }

    static FakeContext realityContext() {
        return new FakeContext("1", "Reality", true);
    }

    static FakeEntity entity(String id, String label) {
        return new FakeEntity(id, label);
    }

    static FakeHqtfDummy unknownHqtfDummy() {
        return new FakeHqtfDummy("00", "Unspecified");
    }

    static FakeIconLibrary newLibrary() {
        return new FakeIconLibrary();
    }

    static FakeSectorOneModifier unknownSectorOneModifier(SymbolSet symbolSet) {
        return new FakeSectorOneModifier("00", "Unspecified", symbolSet);
    }

    static FakeSectorTwoModifier unknownSectorTwoModifier(SymbolSet symbolSet) {
        return new FakeSectorTwoModifier("00", "Unspecified", symbolSet);
    }

    static FakeStandardIdentity standardIdentity(String id, String label, boolean confirmed) {
        return new FakeStandardIdentity(id, label, confirmed);
    }

    static FakeStatus status(String id, String label, boolean operationalCondition, boolean planned) {
        return new FakeStatus(id, label, operationalCondition, planned);
    }

    static FakeSymbolSet symbolSet(String id, String label, GeometryType geometryType) {
        return new FakeSymbolSet(id, label, geometryType);
    }

    static FakeVersion version(String id, String label) {
        return new FakeVersion(id, label);
    }

    /**
     * An {@link SvgGraphic} whose {@code createGroup()} is overridden to return a fixed {@link Group} containing a single filled {@link Rectangle} -
     * {@code SvgGraphic.createGroup()} isn't final, so this sidesteps needing to build a real SVG element tree just to give {@code IdentificationSymbolIcon}'s fill-replacement
     * logic a real {@link javafx.scene.shape.Shape} to act on.
     */
    static SvgGraphic svgGraphicWithFilledRectangle(Color initialFill) {
        Rectangle rectangle = new Rectangle(10, 10);
        rectangle.setFill(initialFill);
        Group group = new Group(rectangle);
        return new SvgGraphic() {
            @Override
            public Group createGroup() {
                return group;
            }
        };
    }

    static class FakeAmplifier implements Amplifier {
        private final String id;
        private final String label;

        FakeAmplifier(String id, String label) {
            this.id = id;
            this.label = label;
        }

        @Override
        public String getDescription() {
            return label;
        }

        @Override
        public String getId() {
            return id;
        }

        @Override
        public String getLabel() {
            return label;
        }

        @Override
        public int getMax() {
            return 1;
        }

        @Override
        public int getMin() {
            return 0;
        }

        @Override
        public AmplifierType getType() {
            return AmplifierType.ALPHA;
        }
    }

    static class FakeAmplifierList implements AmplifierList {
        @Override
        public Amplifier getAmplifier() {
            return null;
        }

        @Override
        public String getId() {
            return "0";
        }

        @Override
        public String getLabel() {
            return "Fake Amplifier List";
        }

        @Override
        public <A extends AmplifierListItem> List<A> getItems() {
            return Collections.emptyList();
        }

        @Override
        public List<SymbolSet> getSymbolSets() {
            return Collections.emptyList();
        }

        @SuppressWarnings("unchecked")
        @Override
        public <A extends AmplifierListItem> Class<A> getValueClass() {
            return (Class<A>) StandardAmplifierItem.class;
        }
    }

    static class FakeAmplifierListItem implements StandardAmplifierItem {
        private final String id;
        private final String label;
        private final boolean graphicalIcon;
        private final AmplifierList amplifierList = new FakeAmplifierList();

        FakeAmplifierListItem(String id, String label, boolean graphicalIcon) {
            this.id = id;
            this.label = label;
            this.graphicalIcon = graphicalIcon;
        }

        @Override
        public AmplifierList getAmplifierList() {
            return amplifierList;
        }

        @Override
        public String getGraphicLocation() {
            return "Amplifier/" + id;
        }

        @Override
        public String getId() {
            return id;
        }

        @Override
        public String getLabel() {
            return label;
        }

        @Override
        public String getName() {
            return label;
        }

        @Override
        public boolean isGraphicalIcon() {
            return graphicalIcon;
        }
    }

    static class FakeContext implements Context {
        private final String id;
        private final String label;
        private final boolean reality;

        FakeContext(String id, String label, boolean reality) {
            this.id = id;
            this.label = label;
            this.reality = reality;
        }

        @Override
        public String getId() {
            return id;
        }

        @Override
        public String getLabel() {
            return label;
        }

        @Override
        public String getOverlayGraphicLocation() {
            return "Overlay/" + id;
        }

        @Override
        public boolean isReality() {
            return reality;
        }
    }

    static class FakeEntity implements Entity {
        private final String id;
        private final String label;
        private boolean civilian;
        private GraphicType graphicType = GraphicType.MAIN;
        private List<EntityType> entityTypes = Collections.emptyList();
        private SymbolSet symbolSet;

        FakeEntity(String id, String label) {
            this.id = id;
            this.label = label;
        }

        @Override
        public List<EntityType> getEntityTypes() {
            return entityTypes;
        }

        @Override
        public GraphicType getGraphicType() {
            return graphicType;
        }

        @Override
        public String getId() {
            return id;
        }

        @Override
        public String getLabel() {
            return label;
        }

        @Override
        public SymbolSet getSymbolSet() {
            return symbolSet;
        }

        @Override
        public boolean isCivilian() {
            // Overridden directly (rather than relying on MainElement's default, which delegates to
            // getEntity().isCivilian()) since Entity.getEntity() returns this - relying on the default would
            // recurse infinitely. Every generated Entity (e.g. ActivityEntity) overrides this the same way.
            return civilian;
        }

        FakeEntity withCivilian(boolean value) {
            this.civilian = value;
            return this;
        }

        FakeEntity withEntityTypes(List<EntityType> value) {
            this.entityTypes = value;
            return this;
        }

        FakeEntity withGraphicType(GraphicType value) {
            this.graphicType = value;
            return this;
        }

        FakeEntity withSymbolSet(SymbolSet value) {
            this.symbolSet = value;
            return this;
        }
    }

    static class FakeEntitySubType implements EntitySubType {
        private final String id;
        private final String label;
        private final EntityType entityType;
        private GraphicType graphicType = GraphicType.MAIN;

        FakeEntitySubType(String id, String label, EntityType entityType) {
            this.id = id;
            this.label = label;
            this.entityType = entityType;
        }

        @Override
        public EntityType getEntityType() {
            return entityType;
        }

        @Override
        public GraphicType getGraphicType() {
            return graphicType;
        }

        @Override
        public String getId() {
            return id;
        }

        @Override
        public String getLabel() {
            return label;
        }

        FakeEntitySubType withGraphicType(GraphicType value) {
            this.graphicType = value;
            return this;
        }
    }

    static class FakeEntityType implements EntityType {
        private final String id;
        private final String label;
        private final Entity entity;
        private GraphicType graphicType = GraphicType.MAIN;
        private List<EntitySubType> entitySubTypes = Collections.emptyList();

        FakeEntityType(String id, String label, Entity entity) {
            this.id = id;
            this.label = label;
            this.entity = entity;
        }

        @Override
        public Entity getEntity() {
            return entity;
        }

        @Override
        public List<EntitySubType> getEntitySubTypes() {
            return entitySubTypes;
        }

        @Override
        public GraphicType getGraphicType() {
            return graphicType;
        }

        @Override
        public String getId() {
            return id;
        }

        @Override
        public String getLabel() {
            return label;
        }

        FakeEntityType withEntitySubTypes(List<EntitySubType> value) {
            this.entitySubTypes = value;
            return this;
        }

        FakeEntityType withGraphicType(GraphicType value) {
            this.graphicType = value;
            return this;
        }
    }

    static class FakeHqtfDummy implements HqtfDummy {
        private final String id;
        private final String label;

        FakeHqtfDummy(String id, String label) {
            this.id = id;
            this.label = label;
        }

        @Override
        public List<String> getDimensionIds() {
            return Collections.emptyList();
        }

        @Override
        public String getId() {
            return id;
        }

        @Override
        public String getLabel() {
            return label;
        }
    }

    /**
     * Every {@code getDefaultXxx()}/{@code getExtensionCountryCode()} returns a fixed fake by default, mutable via the {@code withDefaultXxx} setters so a test can install exactly
     * the fake instance it wants to assert against. Every {@code load*Graphic} method returns a fresh, empty (but non-null) {@link SvgGraphic}, matching production
     * {@code IconLibrary} implementations' documented behaviour of never returning null.
     */
    static class FakeIconLibrary implements IconLibrary {
        private StandardAmplifierItem defaultAmplifier = unknownAmplifier();
        private Context defaultContext = realityContext();
        private Entity defaultEntity = entity("00", "Unspecified");
        private EntitySubType defaultEntitySubType;
        private EntityType defaultEntityType;
        private HqtfDummy defaultHqtfDummy = unknownHqtfDummy();
        // Real IconLibrary implementations never return null here - every isXxxUsed() predicate in
        // IdentificationSymbol/IdentificationSymbolIcon relies on always getting a real (possibly "unknown")
        // instance back, not null. The modifier's own symbolSet reference is never read by isUnknown(), so null is
        // fine there.
        private SectorOneModifier defaultSectorOneModifier = unknownSectorOneModifier(null);
        private SectorTwoModifier defaultSectorTwoModifier = unknownSectorTwoModifier(null);
        private StandardIdentity defaultStandardIdentity = standardIdentity("1", "Friend", true);
        private Status defaultStatus = status("0", "Present", true, false);
        private SymbolSet defaultSymbolSet = symbolSet("10", "Land Unit", GeometryType.POINT_GEOMETRY);
        private Version defaultVersion = version("00", "Current");
        private CountryCode extensionCountryCode = CountryCode.UNDEFINED;
        private SvgGraphic frameGraphic = new SvgGraphic();

        @Override
        public ObservableList<Amplifier> getAmplifiers() {
            return FXCollections.observableArrayList();
        }

        @Override
        public ObservableList<SectorOneModifier> getCommonSectorOneModifiers() {
            return FXCollections.observableArrayList();
        }

        @Override
        public ObservableList<SectorTwoModifier> getCommonSectorTwoModifiers() {
            return FXCollections.observableArrayList();
        }

        @Override
        public ObservableList<Context> getContexts() {
            return FXCollections.observableArrayList();
        }

        @Override
        public ObservableList<CountryCode> getCountryCodes() {
            return FXCollections.observableArrayList();
        }

        @Override
        public StandardAmplifierItem getDefaultAmplifier() {
            return defaultAmplifier;
        }

        @Override
        public Context getDefaultContext() {
            return defaultContext;
        }

        @Override
        public Entity getDefaultEntity() {
            return defaultEntity;
        }

        @Override
        public EntitySubType getDefaultEntitySubType() {
            return defaultEntitySubType;
        }

        @Override
        public EntityType getDefaultEntityType() {
            return defaultEntityType;
        }

        @Override
        public HqtfDummy getDefaultHqtfDummy() {
            return defaultHqtfDummy;
        }

        @Override
        public SectorOneModifier getDefaultSectorOneModifier() {
            return defaultSectorOneModifier;
        }

        @Override
        public SectorTwoModifier getDefaultSectorTwoModifier() {
            return defaultSectorTwoModifier;
        }

        @Override
        public StandardIdentity getDefaultStandardIdentity() {
            return defaultStandardIdentity;
        }

        @Override
        public Status getDefaultStatus() {
            return defaultStatus;
        }

        @Override
        public SymbolSet getDefaultSymbolSet() {
            return defaultSymbolSet;
        }

        @Override
        public Version getDefaultVersion() {
            return defaultVersion;
        }

        @Override
        public ObservableList<Dimension> getDimensions() {
            return FXCollections.observableArrayList();
        }

        @Override
        public CountryCode getExtensionCountryCode() {
            return extensionCountryCode;
        }

        @Override
        public ObservableList<HqtfDummy> getHqtfDummys() {
            return FXCollections.observableArrayList();
        }

        @Override
        public ObservableList<AmplifierList> getListAmplifiers() {
            return FXCollections.observableArrayList();
        }

        @Override
        public ObservableList<StandardIdentity> getStandardIdentities() {
            return FXCollections.observableArrayList();
        }

        @Override
        public ObservableList<StandardIdentityGroup> getStandardIdentityGroups() {
            return FXCollections.observableArrayList();
        }

        @Override
        public ObservableList<Status> getStatuses() {
            return FXCollections.observableArrayList();
        }

        @Override
        public ObservableList<SymbolSet> getSymbolSets() {
            return FXCollections.observableArrayList();
        }

        @Override
        public ObservableList<Version> getVersions() {
            return FXCollections.observableArrayList();
        }

        @Override
        public SvgGraphic loadAmplifierGraphic(AmplifierListItem amplifierItem, StandardIdentity identity) {
            return new SvgGraphic();
        }

        @Override
        public SvgGraphic loadFrameGraphic(SymbolSet symbolSet, StandardIdentity identity, Status status, boolean civilianEntity) {
            return frameGraphic;
        }

        @Override
        public SvgGraphic loadFrameOverlayGraphic(Context context) {
            return new SvgGraphic();
        }

        @Override
        public SvgGraphic loadHqtfDummyGraphic(HqtfDummy hqtfDummy, StandardIdentity identity, SymbolSet symbolSet) {
            return new SvgGraphic();
        }

        @Override
        public SvgGraphic loadMainIconGraphic(io.github.ctgnz.jmsfx.MainElement mainIconElement, StandardIdentity identity) {
            return new SvgGraphic();
        }

        @Override
        public SvgGraphic loadSectorOneModifierGraphic(SectorOneModifier sectorOneModifier) {
            return new SvgGraphic();
        }

        @Override
        public SvgGraphic loadSectorTwoModifierGraphic(SectorTwoModifier sectorTwoModifier) {
            return new SvgGraphic();
        }

        @Override
        public SvgGraphic loadStatusGraphic(Status status, boolean isStatusIconUsed, StandardIdentity identity, SymbolSet symbolSet) {
            return new SvgGraphic();
        }

        @Override
        public void setExtensionCountryCode(CountryCode countryCode) {
            this.extensionCountryCode = countryCode;
        }

        FakeIconLibrary withDefaultAmplifier(StandardAmplifierItem value) {
            this.defaultAmplifier = value;
            return this;
        }

        FakeIconLibrary withDefaultEntity(Entity value) {
            this.defaultEntity = value;
            return this;
        }

        FakeIconLibrary withDefaultEntitySubType(EntitySubType value) {
            this.defaultEntitySubType = value;
            return this;
        }

        FakeIconLibrary withDefaultEntityType(EntityType value) {
            this.defaultEntityType = value;
            return this;
        }

        FakeIconLibrary withDefaultSectorOneModifier(SectorOneModifier value) {
            this.defaultSectorOneModifier = value;
            return this;
        }

        FakeIconLibrary withDefaultSectorTwoModifier(SectorTwoModifier value) {
            this.defaultSectorTwoModifier = value;
            return this;
        }

        FakeIconLibrary withDefaultStatus(Status value) {
            this.defaultStatus = value;
            return this;
        }

        FakeIconLibrary withDefaultSymbolSet(SymbolSet value) {
            this.defaultSymbolSet = value;
            return this;
        }

        FakeIconLibrary withFrameGraphic(SvgGraphic value) {
            this.frameGraphic = value;
            return this;
        }
    }

    static class FakeSectorOneModifier implements SectorOneModifier {
        private final String id;
        private final String label;
        private final SymbolSet symbolSet;

        FakeSectorOneModifier(String id, String label, SymbolSet symbolSet) {
            this.id = id;
            this.label = label;
            this.symbolSet = symbolSet;
        }

        @Override
        public ModifierCategory getCategory() {
            return ModifierCategory.None;
        }

        @Override
        public String getId() {
            return id;
        }

        @Override
        public String getLabel() {
            return label;
        }

        @Override
        public SymbolSet getSymbolSet() {
            return symbolSet;
        }
    }

    static class FakeSectorTwoModifier implements SectorTwoModifier {
        private final String id;
        private final String label;
        private final SymbolSet symbolSet;

        FakeSectorTwoModifier(String id, String label, SymbolSet symbolSet) {
            this.id = id;
            this.label = label;
            this.symbolSet = symbolSet;
        }

        @Override
        public ModifierCategory getCategory() {
            return ModifierCategory.None;
        }

        @Override
        public String getId() {
            return id;
        }

        @Override
        public String getLabel() {
            return label;
        }

        @Override
        public SymbolSet getSymbolSet() {
            return symbolSet;
        }
    }

    static class FakeStandardIdentity implements StandardIdentity {
        private final String id;
        private final String label;
        private final boolean confirmed;

        FakeStandardIdentity(String id, String label, boolean confirmed) {
            this.id = id;
            this.label = label;
            this.confirmed = confirmed;
        }

        @Override
        public StandardIdentityGroup getGroup() {
            return null;
        }

        @Override
        public String getGroupId() {
            return "0";
        }

        @Override
        public String getId() {
            return id;
        }

        @Override
        public String getLabel() {
            return label;
        }

        @Override
        public boolean isConfirmed() {
            return confirmed;
        }

        @Override
        public boolean isHostile() {
            return false;
        }
    }

    static class FakeStatus implements Status {
        private final String id;
        private final String label;
        private final boolean operationalCondition;
        private final boolean planned;

        FakeStatus(String id, String label, boolean operationalCondition, boolean planned) {
            this.id = id;
            this.label = label;
            this.operationalCondition = operationalCondition;
            this.planned = planned;
        }

        @Override
        public List<String> getDimensionIds() {
            return Collections.emptyList();
        }

        @Override
        public String getId() {
            return id;
        }

        @Override
        public String getLabel() {
            return label;
        }

        @Override
        public boolean isOperationalCondition() {
            return operationalCondition;
        }

        @Override
        public boolean isPlanned() {
            return planned;
        }

        @Override
        public boolean isPresent() {
            return operationalCondition;
        }
    }

    static class FakeSymbolSet implements SymbolSet {
        private final String id;
        private final String label;
        private final GeometryType geometryType;
        private List<StandardAmplifierItem> amplifierList = Collections.emptyList();
        private Dimension dimension;

        FakeSymbolSet(String id, String label, GeometryType geometryType) {
            this.id = id;
            this.label = label;
            this.geometryType = geometryType;
        }

        @Override
        public AmplifierGuide getAmplifierGuide(Amplifier amplifier) {
            return new AmplifierGuide() {
                @Override
                public Amplifier getAmplifier() {
                    return amplifier;
                }

                @Override
                public String getCode() {
                    return "0";
                }

                @Override
                public double getHeight() {
                    return 0;
                }

                @Override
                public double[] getPoints() {
                    return new double[0];
                }

                @Override
                public Shape getShape() {
                    return null;
                }

                @Override
                public GuideType getType() {
                    return GuideType.RECTANGLE;
                }

                @Override
                public double getWidth() {
                    return 0;
                }

                @Override
                public double getX() {
                    return 0;
                }

                @Override
                public double getY() {
                    return 0;
                }
            };
        }

        @Override
        public List<AmplifierGuide> getAmplifierGuides() {
            return Collections.emptyList();
        }

        @Override
        public List<StandardAmplifierItem> getAmplifierList() {
            return amplifierList;
        }

        @Override
        public List<StandardAmplifierItem> getAmplifierListThree() {
            return amplifierList;
        }

        @Override
        public List<StandardAmplifierItem> getAmplifierListTwo() {
            return amplifierList;
        }

        @Override
        public Dimension getDimension() {
            return dimension;
        }

        @Override
        public List<Entity> getEntities() {
            return Collections.emptyList();
        }

        @Override
        public List<StandardAmplifierItem> getFrameAmplifierList() {
            return amplifierList;
        }

        @Override
        public String getFrameId() {
            return id;
        }

        @Override
        public String getGraphicLocation() {
            return label;
        }

        @Override
        public String getId() {
            return id;
        }

        @Override
        public String getLabel() {
            return label;
        }

        @Override
        public List<SectorOneModifier> getSectorOneModifiers() {
            return Collections.emptyList();
        }

        @Override
        public List<SectorTwoModifier> getSectorTwoModifiers() {
            return Collections.emptyList();
        }

        @Override
        public io.github.ctgnz.jmsfx.SymbolSetInfo getSymbolSetInfo() {
            return null;
        }

        @Override
        public boolean isPointGeometry() {
            return geometryType == GeometryType.POINT_GEOMETRY;
        }

        FakeSymbolSet withAmplifierList(List<StandardAmplifierItem> value) {
            this.amplifierList = value;
            return this;
        }

        FakeSymbolSet withDimension(Dimension value) {
            this.dimension = value;
            return this;
        }
    }

    static class FakeVersion implements Version {
        private final String id;
        private final String label;

        FakeVersion(String id, String label) {
            this.id = id;
            this.label = label;
        }

        @Override
        public String getId() {
            return id;
        }

        @Override
        public String getLabel() {
            return label;
        }
    }
}
