package io.github.ctgnz.jmsfx.icon;

import java.util.stream.Stream;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import nz.co.ctg.foxglove.ISvgContent;
import nz.co.ctg.foxglove.ISvgStylable;
import nz.co.ctg.foxglove.SvgGraphic;
import nz.co.ctg.foxglove.type.ViewBox;

import io.github.ctgnz.jmsfx.Amplifier;
import io.github.ctgnz.jmsfx.AmplifierGuide;
import io.github.ctgnz.jmsfx.AmplifierListItem;
import io.github.ctgnz.jmsfx.Context;
import io.github.ctgnz.jmsfx.CountryCode;
import io.github.ctgnz.jmsfx.Entity;
import io.github.ctgnz.jmsfx.EntitySubType;
import io.github.ctgnz.jmsfx.EntityType;
import io.github.ctgnz.jmsfx.HqtfDummy;
import io.github.ctgnz.jmsfx.IconLibrary;
import io.github.ctgnz.jmsfx.MainElement;
import io.github.ctgnz.jmsfx.SectorOneModifier;
import io.github.ctgnz.jmsfx.SectorTwoModifier;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.Status;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.Version;
import io.github.ctgnz.jmsfx.types.GeometryType;
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
    public static final Color CRYSTAL_BLUE = Color.rgb(128, 224, 255);    // 80E0FF
    public static final Color LIGHTISH_YELLOW = Color.rgb(255, 255, 128); // FFFF80
    public static final Color BAMBOO_GREEN = Color.rgb(170, 255, 170);    // AAFFAA
    public static final Color SALMON_RED = Color.rgb(255, 128, 128);      // FF8080
    public static final Color CIVILIAN_PURPLE = Color.rgb(255, 161, 255); // FFA1FF
    public static final Color HOSTILE_ORANGE = Color.rgb(255, 120, 0);    // FF7800
    public static final Color OFF_WHITE = Color.rgb(239, 239, 239);       // EFEFEF
    public static final Color NEARLY_WHITE = Color.rgb(250, 250, 250);    // FAFAFA
    private final SymbolIdentificationCode sidc = StaticIconLibrary.code().build();
    private final ObjectProperty<IconScale> scale = new SimpleObjectProperty<>(IconScale.Medium);
    private final ObjectProperty<Version> version;
    private final ObjectProperty<Context> context;
    private final ObjectProperty<StandardIdentity> standardIdentity;
    private final ObjectProperty<SymbolSet> symbolSet;
    private final ObjectProperty<Status> status;
    private final ObjectProperty<HqtfDummy> hqtfDummy;
    private final ObjectProperty<AmplifierListItem> amplifier;
    private final ObjectProperty<AmplifierListItem> amplifierTwo;
    private final ObjectProperty<AmplifierListItem> amplifierThree;
    private final ObjectProperty<AmplifierListItem> frameAmplifier;
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
    private final ObservableList<AmplifierListItem> amplifiers = FXCollections.observableArrayList(sidc.getListAmplifiers());
    private final ObservableList<AmplifierListItem> amplifiersTwo = FXCollections.observableArrayList(sidc.getAmplifierTwoItems());
    private final ObservableList<AmplifierListItem> amplifiersThree = FXCollections.observableArrayList(sidc.getAmplifierThreeItems());
    private final ObservableList<AmplifierListItem> frameAmplifiers = FXCollections.observableArrayList(sidc.getFrameListAmplifiers());
    private final ObservableList<Entity> entities = FXCollections.observableArrayList(sidc.getEntities());
    private final ObservableList<EntityType> entityTypes = FXCollections.observableArrayList();
    private final ObservableList<EntitySubType> entitySubTypes = FXCollections.observableArrayList();
    private final ObservableList<SectorOneModifier> sectorOneModifiers = FXCollections.observableArrayList(sidc.getSectorOneModifiers());
    private final ObservableList<SectorTwoModifier> sectorTwoModifiers = FXCollections.observableArrayList(sidc.getSectorTwoModifiers());
    private final ObservableMap<Amplifier, TextAmplifierValue> textAmplifiers = FXCollections.observableHashMap();
    private final ObservableMap<Amplifier, GraphicAmplifierValue> graphicAmplifiers = FXCollections.observableHashMap();
    private final BooleanProperty amplifierTemplateVisible = new SimpleBooleanProperty(false);
    private final IconLibrary library;

    @SuppressWarnings("unchecked")
    public IdentificationSymbol(IconLibrary library) {
        this.library = library;
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

    public GraphicAmplifierValue addGraphicAmplifier(Amplifier amplifier, SvgGraphic graphic, ScaleDirection scaleDirection, Pos attachment) {
        return graphicAmplifiers.computeIfAbsent(amplifier, key -> {
            AmplifierGuide guide = getSymbolSet().getAmplifierGuide(amplifier);
            return new GraphicAmplifierValue(guide, graphic, scaleDirection, attachment);
        });
    }

    public TextAmplifierValue addTextAmplifier(Amplifier amplifier, Pos attachment, String text) {
        TextAmplifierValue textAmplifier = textAmplifiers.computeIfAbsent(amplifier, key -> {
            AmplifierGuide guide = getSymbolSet().getAmplifierGuide(amplifier);
            return new TextAmplifierValue(guide, attachment, text);
        });
        textAmplifier.setText(text);
        return textAmplifier;
    }

    public ObservableList<AmplifierListItem> amplifierGroupsList() {
        return amplifiers;
    }

    public BooleanProperty amplifierGuidesVisibleProperty() {
        return amplifierTemplateVisible;
    }

    public ObjectProperty<AmplifierListItem> amplifierProperty() {
        return amplifier;
    }

    public ObservableList<AmplifierListItem> amplifierThreeGroupsList() {
        return amplifiersThree;
    }

    public ObjectProperty<AmplifierListItem> amplifierThreeProperty() {
        return amplifierThree;
    }

    public ObservableList<AmplifierListItem> amplifierTwoGroupsList() {
        return amplifiersTwo;
    }

    public ObjectProperty<AmplifierListItem> amplifierTwoProperty() {
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

    public ObservableList<AmplifierListItem> frameAmplifierGroupsList() {
        return frameAmplifiers;
    }

    public ObjectProperty<AmplifierListItem> frameAmplifierProperty() {
        return frameAmplifier;
    }

    public AmplifierListItem getAmplifier() {
        return amplifier.get();
    }

    public SvgGraphic getAmplifierGraphic() {
        return amplifierGraphic.get();
    }

    public AmplifierListItem getAmplifierThree() {
        return amplifierThree.get();
    }

    public SvgGraphic getAmplifierThreeGraphic() {
        return amplifierThreeGraphic.get();
    }

    public AmplifierListItem getAmplifierTwo() {
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
                AmplifierListItem frameAmplifier = getFrameAmplifier();
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

    public AmplifierListItem getFrameAmplifier() {
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

    public GraphicAmplifierValue getGraphicAmplifier(Amplifier amplifier) {
        return graphicAmplifiers.get(amplifier);
    }

    public ObservableMap<Amplifier, GraphicAmplifierValue> getGraphicAmplifiers() {
        return graphicAmplifiers;
    }

    public HqtfDummy getHqtfDummy() {
        return hqtfDummy.get();
    }

    public SvgGraphic getHqtfDummyGraphic() {
        return hqtfDummyGraphic.get();
    }

    public MainElement getMainIconElement() {
        if (entitySubType.get() != null) {
            return entitySubType.get();
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

    public String getSIDC() {
        return sidc.toString();
    }

    public StandardIdentity getStandardIdentity() {
        return standardIdentity.get();
    }

    public String getStandardIdentityGroupId() {
        StandardIdentity stdId = getStandardIdentity();
        return stdId.getGroup() != null ? stdId.getGroupId() : "0";
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

    public TextAmplifierValue getTextAmplifier(Amplifier amplifier) {
        return textAmplifiers.get(amplifier);
    }

    public ObservableMap<Amplifier, TextAmplifierValue> getTextAmplifiers() {
        return textAmplifiers;
    }

    public Version getVersion() {
        return version.get();
    }

    public ObjectProperty<HqtfDummy> hqtfDummyProperty() {
        return hqtfDummy;
    }

    public boolean isAmplifierTemplateVisible() {
        return amplifierTemplateVisible.get();
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
        return !getContext().isReality();
    }

    public boolean isFrameUsed() {
        SymbolSet selectedSymbolSet = getSymbolSet();
        return selectedSymbolSet != null && selectedSymbolSet.getDimension().getGeometryType() == GeometryType.POINT_GEOMETRY;
    }

    public boolean isHqtfDummyIconUsed() {
        HqtfDummy currentHqtfDummy = getHqtfDummy();
        return currentHqtfDummy != null && !currentHqtfDummy.isUnknown();
    }

    public boolean isMainIconUsed() {
        MainElement mainIconElement = getMainIconElement();
        return mainIconElement != null && mainIconElement.isGraphicalIcon();
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
        return getStatus().isOperationalCondition() && getContext().isReality() && isFrameUsed();
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
        return sectorTwoModifiers.sorted(SectorTwoModifier.VIEW_ORDER);
    }

    public void setAmplifierTemplateVisible(boolean visible) {
        amplifierTemplateVisible.set(visible);
    }

    public void setEntity(Entity entity) {
        sidc.setEntity(entity);
    }

    public void setEntitySubType(EntitySubType entitySubType) {
        sidc.setEntitySubType(entitySubType);
    }

    public void setEntityType(EntityType entityType) {
        sidc.setEntityType(entityType);
    }

    public void setHqtfDummy(HqtfDummy hqtfDummy) {
        sidc.setHqtfDummy(hqtfDummy);
    }

    public void setScale(IconScale iconScale) {
        scale.set(iconScale);
    }

    public void setSectorOneModifier(SectorOneModifier sectorOneModifier) {
        sidc.setSectorOneModifier(sectorOneModifier);
    }

    public void setSectorTwoModifier(SectorTwoModifier sectorTwoModifier) {
        sidc.setSectorTwoModifier(sectorTwoModifier);
    }

    public void setStandardIdentity(StandardIdentity standardId) {
        sidc.setStandardIdentity(standardId);
    }

    public void setStatus(Status status) {
        sidc.setStatus(status);
    }

    public void setSymbolSet(SymbolSet symbolSet) {
        sidc.setSymbolSet(symbolSet);
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
            amplifiers.setAll(sidc.getListAmplifiers());
            amplifier.set(sidc.getAmplifier());

            amplifiersTwo.setAll(sidc.getAmplifierTwoItems());
            amplifierTwo.set(sidc.getAmplifierTwo());

            amplifiersThree.setAll(sidc.getAmplifierThreeItems());
            amplifierThree.set(sidc.getAmplifierThree());

            frameAmplifiers.setAll(sidc.getFrameListAmplifiers());
            frameAmplifier.set(sidc.getFrameAmplifier());

            sectorOneModifiers.setAll(Stream.concat(sidc.getSectorOneModifiers().stream(), library.getCommonSectorOneModifiers().stream()).toList());
            sectorOneModifier.set(sidc.getSectorOneModifier());

            sectorTwoModifiers.setAll(Stream.concat(sidc.getSectorTwoModifiers().stream(), library.getCommonSectorTwoModifiers().stream()).toList());
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
        code.bind(Bindings.createStringBinding(sidc::toString,
                                               version, context, standardIdentity, status, hqtfDummy, symbolSet, amplifier,
                                               entity, entityType, entitySubType, sectorOneModifier, sectorTwoModifier,
                                               amplifierTwo, amplifierThree, frameAmplifier, countryCode));

        // Graphic location properties only need to be updated after the component parts are changed
        frameGraphic.bind(Bindings.createObjectBinding(this::loadFrameGraphic, code));
        frameOverlayGraphic.bind(Bindings.createObjectBinding(this::loadFrameOverlayGraphic, code));
        mainIconGraphic.bind(Bindings.createObjectBinding(this::loadMainIconGraphic, code));
        amplifierGraphic.bind(Bindings.createObjectBinding(this::loadAmplifierGraphic, code, amplifier));
        amplifierTwoGraphic.bind(Bindings.createObjectBinding(this::loadAmplifierTwoGraphic, code, amplifierTwo));
        amplifierThreeGraphic.bind(Bindings.createObjectBinding(this::loadAmplifierThreeGraphic, code, amplifierThree));
        frameAmplifierGraphic.bind(Bindings.createObjectBinding(this::loadFrameAmplifierGraphic, code, frameAmplifier));
        sectorOneModifierGraphic.bind(Bindings.createObjectBinding(this::loadSectorOneModifierGraphic, code, sectorOneModifier));
        sectorTwoModifierGraphic.bind(Bindings.createObjectBinding(this::loadSectorTwoModifierGraphic, code, sectorTwoModifier));
        statusGraphic.bind(Bindings.createObjectBinding(this::loadStatusGraphic, code, status));
        hqtfDummyGraphic.bind(Bindings.createObjectBinding(this::loadHqtfDummyGraphic, code, hqtfDummy));
    }

    private Status getStatusForFrame() {
        if (!getStandardIdentity().isConfirmed()) {
            return library.getDefaultStatus();
        }
        Status currentStatus = status.get();
        return currentStatus.isPlanned() ? currentStatus : library.getDefaultStatus();
    }

    private SvgGraphic loadAmplifierGraphic() {
        return library.loadAmplifierGraphic(getAmplifier(), getStandardIdentity());
    }

    private SvgGraphic loadAmplifierThreeGraphic() {
        return library.loadAmplifierGraphic(getAmplifierThree(), getStandardIdentity());
    }

    private SvgGraphic loadAmplifierTwoGraphic() {
        return library.loadAmplifierGraphic(getAmplifierTwo(), getStandardIdentity());
    }

    private SvgGraphic loadFrameAmplifierGraphic() {
        return library.loadAmplifierGraphic(getFrameAmplifier(), getStandardIdentity());
    }

    private SvgGraphic loadFrameGraphic() {
        return library.loadFrameGraphic(getSymbolSet(), getStandardIdentity(), getStatusForFrame(), isCivilianEntity());
    }

    private SvgGraphic loadFrameOverlayGraphic() {
        return library.loadFrameOverlayGraphic(getContext());
    }

    private SvgGraphic loadHqtfDummyGraphic() {
        return library.loadHqtfDummyGraphic(getHqtfDummy(), getStandardIdentity(), getSymbolSet());
    }

    private SvgGraphic loadMainIconGraphic() {
        return library.loadMainIconGraphic(getMainIconElement(), getStandardIdentity());
    }

    private SvgGraphic loadSectorOneModifierGraphic() {
        return library.loadSectorOneModifierGraphic(getSectorOneModifier());
    }

    private SvgGraphic loadSectorTwoModifierGraphic() {
        return library.loadSectorTwoModifierGraphic(getSectorTwoModifier());
    }

    private SvgGraphic loadStatusGraphic() {
        return library.loadStatusGraphic(getStatus(), isStatusIconUsed(), getStandardIdentity(), getSymbolSet());
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
