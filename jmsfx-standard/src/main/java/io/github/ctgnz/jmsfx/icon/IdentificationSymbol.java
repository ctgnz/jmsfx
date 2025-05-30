package io.github.ctgnz.jmsfx.icon;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import nz.co.ctg.foxglove.FoxgloveParser;
import nz.co.ctg.foxglove.ISvgContent;
import nz.co.ctg.foxglove.ISvgStylable;
import nz.co.ctg.foxglove.SvgGraphic;
import nz.co.ctg.foxglove.type.ViewBox;

import io.github.ctgnz.jmsfx.icon.amplifier.CountryCode;
import javafx.beans.binding.Bindings;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.property.adapter.JavaBeanObjectPropertyBuilder;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;
import javafx.geometry.Bounds;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.paint.Color;

public class IdentificationSymbol {
    public static final Color CRYSTAL_BLUE = Color.rgb(128, 224, 255); // 80E0FF
    public static final Color LT_YELLOW = Color.rgb(255, 255, 128);    // FFFF80
    public static final Color BAMBOO_GREEN = Color.rgb(170, 255, 170); // AAFFAA
    public static final Color SALMON_RED = Color.rgb(255, 128, 128);   // FF8080
    public static final Color CIV_PURPLE = Color.rgb(255, 161, 255);   // FFA1FF
    public static final Color HOSTILE_ORANGE = Color.rgb(255, 120, 0); // FF7800
    public static final Color OFF_WHITE = Color.rgb(239, 239, 239);    // EFEFEF
    public static final Color NEARLY_WHITE = Color.rgb(250, 250, 250); // FAFAFA
    private final SymbolIdentificationCode sidc = new SymbolIdentificationCode();
    private final ObjectProperty<IconScale> scale = new SimpleObjectProperty<>(IconScale.Medium);
    private final ObjectProperty<Version> version;
    private final ObjectProperty<Context> context;
    private final ObjectProperty<StandardIdentity> standardIdentity;
    private final ObjectProperty<SymbolSet> symbolSet;
    private final ObjectProperty<Status> status;
    private final ObjectProperty<HqtfDummy> hqtfDummy;
    private final ObjectProperty<EnumeratedAmplifier> amplifier;
    private final ObjectProperty<EnumeratedAmplifier> amplifierTwo;
    private final ObjectProperty<EnumeratedAmplifier> amplifierThree;
    private final ObjectProperty<EnumeratedAmplifier> frameAmplifier;
    private final ObjectProperty<Entity> entity;
    private final ObjectProperty<EntityType> entityType;
    private final ObjectProperty<EntitySubType> entitySubType;
    private final ObjectProperty<SectorOneModifier> sectorOneModifier;
    private final ObjectProperty<SectorTwoModifier> sectorTwoModifier;
    private final ObjectProperty<CountryCode> countryCode;
    private final ObjectProperty<SvgGraphic> frameGraphic = new SimpleObjectProperty<>();
    private final ObjectProperty<SvgGraphic> frameOverlayGraphic = new SimpleObjectProperty<>();
    private final ObjectProperty<SvgGraphic> mainIconGraphic = new SimpleObjectProperty<>();
    private final ObjectProperty<SvgGraphic> amplifierGraphic = new SimpleObjectProperty<>();
    private final ObjectProperty<SvgGraphic> amplifierTwoGraphic = new SimpleObjectProperty<>();
    private final ObjectProperty<SvgGraphic> amplifierThreeGraphic = new SimpleObjectProperty<>();
    private final ObjectProperty<SvgGraphic> frameAmplifierGraphic = new SimpleObjectProperty<>();
    private final ObjectProperty<SvgGraphic> sectorOneModifierGraphic = new SimpleObjectProperty<>();
    private final ObjectProperty<SvgGraphic> sectorTwoModifierGraphic = new SimpleObjectProperty<>();
    private final ObjectProperty<SvgGraphic> statusGraphic = new SimpleObjectProperty<>();
    private final ObjectProperty<SvgGraphic> hqtfDummyGraphic = new SimpleObjectProperty<>();
    private final StringProperty code = new SimpleStringProperty(sidc.toString());
    private final ObservableList<EnumeratedAmplifier> amplifiers = FXCollections.observableArrayList(sidc.getEnumeratedAmplifiers());
    private final ObservableList<EnumeratedAmplifier> amplifiersTwo = FXCollections.observableArrayList(sidc.getAmplifierTwoGroups());
    private final ObservableList<EnumeratedAmplifier> amplifiersThree = FXCollections.observableArrayList(sidc.getAmplifierThreeGroups());
    private final ObservableList<EnumeratedAmplifier> frameAmplifiers = FXCollections.observableArrayList(sidc.getFrameEnumeratedAmplifiers());
    private final ObservableList<Entity> entities = FXCollections.observableArrayList(sidc.getEntities());
    private final ObservableList<EntityType> entityTypes = FXCollections.observableArrayList();
    private final ObservableList<EntitySubType> entitySubTypes = FXCollections.observableArrayList();
    private final ObservableList<SectorOneModifier> sectorOneModifiers = FXCollections.observableArrayList(sidc.getSectorOneModifiers());
    private final ObservableList<SectorTwoModifier> sectorTwoModifiers = FXCollections.observableArrayList(sidc.getSectorTwoModifiers());
    private final ObservableMap<Amplifier, TextAmplifier> textAmplifiers = FXCollections.observableHashMap();
    private final ObservableMap<Amplifier, GraphicAmplifier> graphicAmplifiers = FXCollections.observableHashMap();
    private final BooleanProperty amplifierGuidesVisible = new SimpleBooleanProperty(false);
    private final FoxgloveParser parser;

    @SuppressWarnings("unchecked")
    public IdentificationSymbol(FoxgloveParser parser) {
        this.parser = parser;
        try {
            version = JavaBeanObjectPropertyBuilder.create().bean(sidc).name("version").build();
            context = JavaBeanObjectPropertyBuilder.create().bean(sidc).name("context").build();
            standardIdentity = JavaBeanObjectPropertyBuilder.create().bean(sidc).name("standardIdentity").build();
            symbolSet = JavaBeanObjectPropertyBuilder.create().bean(sidc).name("symbolSet").build();
            status = JavaBeanObjectPropertyBuilder.create().bean(sidc).name("status").build();
            hqtfDummy = JavaBeanObjectPropertyBuilder.create().bean(sidc).name("hqtfDummy").build();
            amplifier = JavaBeanObjectPropertyBuilder.create().bean(sidc).name("amplifier").build();
            amplifierTwo = JavaBeanObjectPropertyBuilder.create().bean(sidc).name("amplifierTwo").build();
            amplifierThree = JavaBeanObjectPropertyBuilder.create().bean(sidc).name("amplifierThree").build();
            frameAmplifier = JavaBeanObjectPropertyBuilder.create().bean(sidc).name("frameAmplifier").build();
            entity = JavaBeanObjectPropertyBuilder.create().bean(sidc).name("entity").build();
            entityType = JavaBeanObjectPropertyBuilder.create().bean(sidc).name("entityType").build();
            entitySubType = JavaBeanObjectPropertyBuilder.create().bean(sidc).name("entitySubType").build();
            sectorOneModifier = JavaBeanObjectPropertyBuilder.create().bean(sidc).name("sectorOneModifier").build();
            sectorTwoModifier = JavaBeanObjectPropertyBuilder.create().bean(sidc).name("sectorTwoModifier").build();
            countryCode = JavaBeanObjectPropertyBuilder.create().bean(sidc).name("countryCode").build();
            // only set up the listeners once all default values are set
            addListeners();
        } catch (Exception e) {
            throw new RuntimeException("Unable to create symbol", e);
        }
    }

    public GraphicAmplifier addGraphicAmplifier(Amplifier amplifier, SvgGraphic graphic, ScaleDirection scaleDirection, Pos attachment) {
        return graphicAmplifiers.computeIfAbsent(amplifier, key -> {
            AmplifierGuide guide = getSymbolSet().getAmplifierGuide(amplifier);
            return new GraphicAmplifier(guide, graphic, scaleDirection, attachment);
        });
    }

    public TextAmplifier addTextAmplifier(Amplifier amplifier, Pos attachment, String text) {
        TextAmplifier textAmplifier = textAmplifiers.computeIfAbsent(amplifier, key -> {
            AmplifierGuide guide = getSymbolSet().getAmplifierGuide(amplifier);
            return new TextAmplifier(guide, attachment, text);
        });
        textAmplifier.setText(text);
        return textAmplifier;
    }

    public ObservableList<EnumeratedAmplifier> amplifierGroupsList() {
        return amplifiers;
    }

    public BooleanProperty amplifierGuidesVisibleProperty() {
        return amplifierGuidesVisible;
    }

    public ObjectProperty<EnumeratedAmplifier> amplifierProperty() {
        return amplifier;
    }

    public ObservableList<EnumeratedAmplifier> amplifierThreeGroupsList() {
        return amplifiersThree;
    }

    public ObjectProperty<EnumeratedAmplifier> amplifierThreeProperty() {
        return amplifierThree;
    }

    public ObservableList<EnumeratedAmplifier> amplifierTwoGroupsList() {
        return amplifiersTwo;
    }

    public ObjectProperty<EnumeratedAmplifier> amplifierTwoProperty() {
        return amplifierTwo;
    }

    public ReadOnlyStringProperty codeProperty() {
        return code;
    }

    public ObjectProperty<Context> contextProperty() {
        return context;
    }

    public ObjectProperty<CountryCode> countryCodeProperty() {
        return countryCode;
    }

    public IdentificationSymbolIcon createIcon() {
        return new IdentificationSymbolIcon(this);
    }

    public ObservableList<Entity> entitiesList() {
        return entities;
    }

    public ObjectProperty<Entity> entityProperty() {
        return entity;
    }

    public ObjectProperty<EntitySubType> entitySubTypeProperty() {
        return entitySubType;
    }

    public ObservableList<EntitySubType> entitySubTypesList() {
        return entitySubTypes;
    }

    public ObjectProperty<EntityType> entityTypeProperty() {
        return entityType;
    }

    public ObservableList<EntityType> entityTypesList() {
        return entityTypes;
    }

    public ObservableList<EnumeratedAmplifier> frameAmplifierGroupsList() {
        return frameAmplifiers;
    }

    public ObjectProperty<EnumeratedAmplifier> frameAmplifierProperty() {
        return frameAmplifier;
    }

    public EnumeratedAmplifier getAmplifier() {
        return amplifier.get();
    }

    public SvgGraphic getAmplifierGraphic() {
        return amplifierGraphic.get();
    }

    public EnumeratedAmplifier getAmplifierThree() {
        return amplifierThree.get();
    }

    public SvgGraphic getAmplifierThreeGraphic() {
        return amplifierThreeGraphic.get();
    }

    public EnumeratedAmplifier getAmplifierTwo() {
        return amplifierTwo.get();
    }

    public SvgGraphic getAmplifierTwoGraphic() {
        return amplifierTwoGraphic.get();
    }

    public SymbolIdentificationCode getCode() {
        return sidc;
    }

    public SvgGraphic getCombinedGraphic() {
        SvgGraphic container = new SvgGraphic();
        container.setTitle(sidc.getDescription());
        if (isFrameUsed()) {
            SvgGraphic frame = getFrameGraphic();
            if (isFrameAmplifierUsed()) {
                EnumeratedAmplifier frameAmplifier = getFrameAmplifier();
                replaceFill(frame, Color.web(frameAmplifier.getBackgroundFill()));
            }
            container.getContent().addAll(frame.getVisibleContent());
        }
        if (isStatusIconUsed()) {
            container.getContent().addAll(getStatusGraphic().getVisibleContent());
        }
        if (isHqtfDummyIconUsed()) {
            container.getContent().addAll(getHqtfDummyGraphic().getVisibleContent());
        }
        if (isMainIconUsed() && getMainIconGraphic() != null) {
            container.getContent().addAll(getMainIconGraphic().getVisibleContent());
        }
        if (isAmplifierUsed()) {
            container.getContent().addAll(getAmplifierGraphic().getVisibleContent());
        }
        if (isAmplifierTwoUsed()) {
            container.getContent().addAll(getAmplifierTwoGraphic().getVisibleContent());
        }
        if (isAmplifierThreeUsed()) {
            container.getContent().addAll(getAmplifierThreeGraphic().getVisibleContent());
        }
        if (isSectorOneModifierUsed()) {
            container.getContent().addAll(getSectorOneModifierGraphic().getVisibleContent());
        }
        if (isSectorTwoModifierUsed()) {
            container.getContent().addAll(getSectorTwoModifierGraphic().getVisibleContent());
        }
        Group graphic = container.createGroup();
        graphic.autosize();
        Bounds bounds = graphic.getBoundsInLocal();
        container.setPixelsX(bounds.getMinX());
        container.setPixelsY(bounds.getMinY());
        container.setPixelsWidth(bounds.getWidth());
        container.setPixelsHeight(bounds.getHeight());
        container.setViewBox(new ViewBox(bounds));
        return container;
    }

    public Context getContext() {
        return context.get();
    }

    public Entity getEntity() {
        return entity.get();
    }

    public EntitySubType getEntitySubType() {
        return entitySubType.get();
    }

    public EntityType getEntityType() {
        return entityType.get();
    }

    public EnumeratedAmplifier getFrameAmplifier() {
        return frameAmplifier.get();
    }

    public SvgGraphic getFrameAmplifierGraphic() {
        return frameAmplifierGraphic.get();
    }

    public SvgGraphic getFrameGraphic() {
        return frameGraphic.get();
    }

    public SvgGraphic getFrameOverlayGraphic() {
        return frameOverlayGraphic.get();
    }

    public GraphicAmplifier getGraphicAmplifier(Amplifier amplifier) {
        return graphicAmplifiers.get(amplifier);
    }

    public ObservableMap<Amplifier, GraphicAmplifier> getGraphicAmplifiers() {
        return graphicAmplifiers;
    }

    public HqtfDummy getHqtfDummy() {
        return hqtfDummy.get();
    }

    public SvgGraphic getHqtfDummyGraphic() {
        return hqtfDummyGraphic.get();
    }

    public MainIconElement getMainIconElement() {
        EntitySubType subType = entitySubType.get();
        if (subType != null && subType.getIconType() != IconType.SPECIAL) {
            return subType;
        }
        if (entityType.get() != null) {
            return entityType.get();
        }
        return entity.get();
    }

    public SvgGraphic getMainIconGraphic() {
        return mainIconGraphic.get();
    }

    public IconScale getScale() {
        return scale.get();
    }

    public SectorOneModifier getSectorOneModifier() {
        return sectorOneModifier.get();
    }

    public SvgGraphic getSectorOneModifierGraphic() {
        return sectorOneModifierGraphic.get();
    }

    public SectorTwoModifier getSectorTwoModifier() {
        return sectorTwoModifier.get();
    }

    public SvgGraphic getSectorTwoModifierGraphic() {
        return sectorTwoModifierGraphic.get();
    }

    public StandardIdentity getStandardIdentity() {
        return standardIdentity.get();
    }

    public String getStandardIdentityGroupId() {
        StandardIdentity stdId = getStandardIdentity();
        return stdId.getGroup() != null ? stdId.getGroup().getId() : "0";
    }

    public Status getStatus() {
        return status.get();
    }

    public SvgGraphic getStatusGraphic() {
        return statusGraphic.get();
    }

    public SymbolSet getSymbolSet() {
        return symbolSet.get();
    }

    public TextAmplifier getTextAmplifier(Amplifier amplifier) {
        return textAmplifiers.get(amplifier);
    }

    public ObservableMap<Amplifier, TextAmplifier> getTextAmplifiers() {
        return textAmplifiers;
    }

    public Version getVersion() {
        return version.get();
    }

    public ObjectProperty<HqtfDummy> hqtfDummyProperty() {
        return hqtfDummy;
    }

    public boolean isAmplifierGuidesVisible() {
        return amplifierGuidesVisible.get();
    }

    public boolean isAmplifierThreeUsed() {
        return !getAmplifierThree().isUnknown();
    }

    public boolean isAmplifierTwoUsed() {
        return !getAmplifierTwo().isUnknown();
    }

    public boolean isAmplifierUsed() {
        return !getAmplifier().isUnknown();
    }

    public boolean isCivilianEntity() {
        Entity selectedEntity = getEntity();
        return selectedEntity != null && selectedEntity.isCivilian();
    }

    public boolean isFrameAmplifierUsed() {
        return !getFrameAmplifier().isUnknown();
    }

    public boolean isFrameOverlayUsed() {
        return getContext().ordinal() > 0;
    }

    public boolean isFrameUsed() {
        SymbolSet selectedSymbolSet = getSymbolSet();
        return selectedSymbolSet != null && selectedSymbolSet.getDimension().getGeometry() == Geometry.POINT_GEOMETRY;
    }

    public boolean isHqtfDummyIconUsed() {
        HqtfDummy currentHqtfDummy = getHqtfDummy();
        return currentHqtfDummy != null && currentHqtfDummy != HqtfDummy.NA;
    }

    public boolean isKnownIdentity(StandardIdentity stdIdentity) {
        return SymbolIdentificationCode.KNOWN_IDENTITIES.contains(stdIdentity);
    }

    public boolean isMainIconUsed() {
        MainIconElement mainIconElement = getMainIconElement();
        return mainIconElement != null && mainIconElement.isGraphicalIcon();
    }

    public boolean isReality() {
        return context.get() == Context.REALITY;
    }

    public boolean isSectorOneModifierUsed() {
        SectorOneModifier mod = getSectorOneModifier();
        return mod != null && !mod.isUnknown();
    }

    public boolean isSectorTwoModifierUsed() {
        SectorTwoModifier mod = getSectorTwoModifier();
        return mod != null && !mod.isUnknown();
    }

    public boolean isStatusIconUsed() {
        SymbolSet currentSymbolSet = getSymbolSet();
        if (currentSymbolSet == SymbolSet.DISMOUNTED || currentSymbolSet == SymbolSet.INTERNAL) {
            return false;
        }
        Status currentStatus = getStatus();
        return SymbolIdentificationCode.ICON_STATUS.contains(currentStatus) && isReality() && isFrameUsed();
    }

    public void removeGraphicAmplifier(Amplifier amplifier) {
        graphicAmplifiers.remove(amplifier);
    }

    public void removeTextAmplifier(Amplifier amplifier) {
        textAmplifiers.remove(amplifier);
    }

    public ObjectProperty<IconScale> scaleProperty() {
        return scale;
    }

    public ObjectProperty<SectorOneModifier> sectorOneModifierProperty() {
        return sectorOneModifier;
    }

    public ObservableList<SectorOneModifier> sectorOneModifiersList() {
        return sectorOneModifiers.sorted(SectorOneModifier.VIEW_ORDER);
    }

    public ObjectProperty<SectorTwoModifier> sectorTwoModifierProperty() {
        return sectorTwoModifier;
    }

    public ObservableList<SectorTwoModifier> sectorTwoModifiersList() {
        return sectorTwoModifiers;
    }

    public void setAmplifierGuidesVisible(boolean visible) {
        amplifierGuidesVisible.set(visible);
    }

    public void setScale(IconScale iconScale) {
        scale.set(iconScale);
    }

    public ObjectProperty<StandardIdentity> standardIdentityProperty() {
        return standardIdentity;
    }

    public ObjectProperty<Status> statusProperty() {
        return status;
    }

    public ObjectProperty<SymbolSet> symbolSetProperty() {
        return symbolSet;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE)
                        .append("sidc", sidc)
                        .append("scale", scale.get())
                        .append("version", version.get())
                        .append("context", context.get())
                        .append("standardIdentity", standardIdentity.get())
                        .append("symbolSet", symbolSet.get())
                        .append("status", status.get())
                        .append("hqtfDummy", hqtfDummy.get())
                        .append("amplifier", amplifier.get())
                        .append("amplifierTwo", amplifierTwo.get())
                        .append("amplifierThree", amplifierThree.get())
                        .append("frameAmplifier", frameAmplifier.get())
                        .append("entity", entity.get())
                        .append("entityType", entityType.get())
                        .append("entitySubType", entitySubType.get())
                        .append("sectorOneModifier", sectorOneModifier.get())
                        .append("sectorTwoModifier", sectorTwoModifier.get())
                        .toString();
    }

    public ObjectProperty<Version> versionProperty() {
        return version;
    }

    private void addListeners() {
        // Observable lists can't be bound directly, so update these values when the appropriate property changes
        symbolSet.addListener((obs, oldValue, newValue) -> {
            amplifiers.setAll(sidc.getEnumeratedAmplifiers());
            amplifier.set(sidc.getAmplifier());

            amplifiersTwo.setAll(sidc.getAmplifierTwoGroups());
            amplifierTwo.set(sidc.getAmplifierTwo());

            amplifiersThree.setAll(sidc.getAmplifierThreeGroups());
            amplifierThree.set(sidc.getAmplifierThree());

            frameAmplifiers.setAll(sidc.getFrameEnumeratedAmplifiers());
            frameAmplifier.set(sidc.getFrameAmplifier());

            sectorOneModifiers.setAll(sidc.getSectorOneModifiers());
            sectorOneModifier.set(sidc.getSectorOneModifier());

            sectorTwoModifiers.setAll(sidc.getSectorTwoModifiers());
            sectorTwoModifier.set(sidc.getSectorTwoModifier());

            entities.setAll(sidc.getEntities());
            entity.set(sidc.getEntity());

            textAmplifiers.clear();
        });
        entity.addListener((obs, oldValue, newValue) -> {
            entityTypes.setAll(sidc.getEntityTypes());
        });
        entityType.addListener((obs, oldValue, newValue) -> {
            entitySubTypes.setAll(sidc.getEntitySubTypes());
        });

        // Code value should be updated after a change in any of the symbol properties
        code.bind(Bindings.createStringBinding(() -> sidc.toString(),
                                               version, context, standardIdentity, status, hqtfDummy, symbolSet, amplifier,
                                               entity, entityType, entitySubType, sectorOneModifier, sectorTwoModifier,
                                               amplifierTwo, amplifierThree, frameAmplifier, countryCode));

        // Graphic location properties only need to be updated after the component parts are changed
        frameGraphic.bind(Bindings.createObjectBinding(() -> loadFrameGraphic(), code));
        frameOverlayGraphic.bind(Bindings.createObjectBinding(() -> loadFrameOverlayGraphic(), code));
        mainIconGraphic.bind(Bindings.createObjectBinding(() -> loadMainIconGraphic(), code));
        amplifierGraphic.bind(Bindings.createObjectBinding(() -> loadAmplifierGraphic(), code));
        amplifierTwoGraphic.bind(Bindings.createObjectBinding(() -> loadAmplifierTwoGraphic(), code));
        amplifierThreeGraphic.bind(Bindings.createObjectBinding(() -> loadAmplifierThreeGraphic(), code));
        frameAmplifierGraphic.bind(Bindings.createObjectBinding(() -> loadFrameAmplifierGraphic(), code));
        sectorOneModifierGraphic.bind(Bindings.createObjectBinding(() -> loadSectorOneModifierGraphic(), code));
        sectorTwoModifierGraphic.bind(Bindings.createObjectBinding(() -> loadSectorTwoModifierGraphic(), code));
        statusGraphic.bind(Bindings.createObjectBinding(() -> loadStatusGraphic(), code));
        hqtfDummyGraphic.bind(Bindings.createObjectBinding(() -> loadHqtfDummyGraphic(), code));
    }

    private String calculateFrameLocation() {
        SymbolSet effectiveSymbolSet = getSymbolSet();
        StandardIdentity effectiveStandardId = getStandardIdentityForFrame();
        Status effectiveStatus = getStatusForFrame(effectiveStandardId);
        return String.format("/svg/Frames/0_%s%s_%s%s.svg",
                             effectiveStandardId.getId(),
                             effectiveSymbolSet.getFrameId(),
                             effectiveStatus.getId(),
                             isCivilianEntity() ? "c" : "");
    }

    private String calculateMainIconLocation() {
        if (getSymbolSet() == SymbolSet.INTERNAL) {
            return "/svg/Appendices/98100000.svg";
        }
        MainIconElement mainIconElement = getMainIconElement();
        String graphicLocation = getSymbolSet().getGraphicLocation();
        if (mainIconElement.isFullFrameIcon()) {
            return String.format("/svg/Appendices/%s/%s_%s.svg", graphicLocation, mainIconElement.getGraphicIdentifier(), getStandardIdentity().getGroup().ordinal());
        } else {
            return String.format("/svg/Appendices/%s/%s.svg", graphicLocation, mainIconElement.getGraphicIdentifier());
        }
    }

    private StandardIdentity getStandardIdentityForFrame() {
        return getSymbolSet() == SymbolSet.INTERNAL ? StandardIdentity.SI_UNKNOWN : getStandardIdentity();
    }

    private Status getStatusForFrame(StandardIdentity effectiveStandardId) {
        if (!isKnownIdentity(effectiveStandardId)) {
            return Status.PRESENT;
        }
        return status.get() == Status.PLANNED ? Status.PLANNED : Status.PRESENT;
    }

    private SvgGraphic loadAmplifierGraphic() {
        EnumeratedAmplifier amplifierGroup = getAmplifier();
        if (!amplifierGroup.isUnknown() && amplifierGroup.isGraphicalIcon()) {
            String filePath = String.format("/svg/%s/%s%s.svg", amplifierGroup.getGraphicLocation(), getStandardIdentityGroupId(), amplifierGroup.getFullId());
            return parser.parseFile(filePath);
        } else {
            return null;
        }
    }

    private SvgGraphic loadAmplifierThreeGraphic() {
        EnumeratedAmplifier amplifierGroup = getAmplifierThree();
        if (!amplifierGroup.isUnknown() && amplifierGroup.isGraphicalIcon()) {
            String filePath = String.format("/svg/%s/%s%s.svg", amplifierGroup.getGraphicLocation(), getStandardIdentityGroupId(), amplifierGroup.getFullId());
            return parser.parseFile(filePath);
        } else {
            return null;
        }
    }

    private SvgGraphic loadAmplifierTwoGraphic() {
        EnumeratedAmplifier amplifierGroup = getAmplifierTwo();
        if (!amplifierGroup.isUnknown() && amplifierGroup.isGraphicalIcon()) {
            String filePath = String.format("/svg/%s/%s%s.svg", amplifierGroup.getGraphicLocation(), getStandardIdentityGroupId(), amplifierGroup.getFullId());
            return parser.parseFile(filePath);
        } else {
            return null;
        }
    }

    private SvgGraphic loadFrameAmplifierGraphic() {
        EnumeratedAmplifier amplifierGroup = getFrameAmplifier();
        if (!amplifierGroup.isUnknown() && amplifierGroup.isGraphicalIcon()) {
            String filePath = String.format("/svg/%s/%s%s.svg", amplifierGroup.getGraphicLocation(), getStandardIdentityGroupId(), amplifierGroup.getId());
            return parser.parseFile(filePath);
        } else {
            return null;
        }
    }

    private SvgGraphic loadFrameGraphic() {
        if (isFrameUsed()) {
            String filePath = calculateFrameLocation();
            return parser.parseFile(filePath);
        } else {
            return null;
        }
    }

    private SvgGraphic loadFrameOverlayGraphic() {
        if (isFrameOverlayUsed()) {
            String filePath = String.format("/svg/Frames/Overlay/%s.svg", getContext().getId());
            return parser.parseFile(filePath);
        } else {
            return null;
        }
    }

    private SvgGraphic loadHqtfDummyGraphic() {
        if (isHqtfDummyIconUsed()) {
            String filePath = String.format("/svg/HQTFFD/%s%s%s.svg", getStandardIdentity().getId(), getSymbolSet().getId(), getHqtfDummy().getId());
            return parser.parseFile(filePath);
        } else {
            return null;
        }
    }

    private SvgGraphic loadMainIconGraphic() {
        if (isMainIconUsed()) {
            String filePath = calculateMainIconLocation();
            return parser.parseFile(filePath);
        } else {
            return null;
        }
    }

    private SvgGraphic loadSectorOneModifierGraphic() {
        if (isSectorOneModifierUsed()) {
            SectorOneModifier sectorOneMod = getSectorOneModifier();
            String graphicLocation = sectorOneMod.getGraphicLocation();
            String filePath = String.format("/svg/Appendices/%s/mod1/%s.svg", graphicLocation, sectorOneMod.getGraphicIdentifier());
            return parser.parseFile(filePath);
        } else {
            return null;
        }
    }

    private SvgGraphic loadSectorTwoModifierGraphic() {
        if (isSectorTwoModifierUsed()) {
            SectorTwoModifier sectorTwoMod = getSectorTwoModifier();
            String graphicLocation = sectorTwoMod.getGraphicLocation();
            String filePath = String.format("/svg/Appendices/%s/mod2/%s.svg", graphicLocation, sectorTwoMod.getGraphicIdentifier());
            return parser.parseFile(filePath);
        } else {
            return null;
        }
    }

    private SvgGraphic loadStatusGraphic() {
        if (isStatusIconUsed()) {
            String filePath = String.format("/svg/OCA/0%s%s%s2.svg", getStandardIdentityGroupId(), getSymbolSet().getFrameId(), getStatus().getId());
            return parser.parseFile(filePath);
        } else {
            return null;
        }
    }

    private void replaceFill(ISvgContent graphic, Color fill) {
        graphic.getContent().forEach(element -> {
            if (element instanceof ISvgStylable) {
                ISvgStylable styly = (ISvgStylable) element;
                if (styly.isFilled()) {
                    styly.setFill(fill);
                }
            }
            if (element instanceof ISvgContent) {
                replaceFill((ISvgContent) element, fill);
            }
         });
    }

}
