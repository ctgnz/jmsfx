package io.github.ctgnz.jmsfx.icon;

import java.util.stream.Stream;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import nz.co.ctg.foxglove.FoxgloveParser;
import nz.co.ctg.foxglove.ISvgContent;
import nz.co.ctg.foxglove.ISvgStylable;
import nz.co.ctg.foxglove.SvgGraphic;
import nz.co.ctg.foxglove.type.ViewBox;

import io.github.ctgnz.jmsfx.IAmplifier;
import io.github.ctgnz.jmsfx.IAmplifierGuide;
import io.github.ctgnz.jmsfx.IAmplifierListItem;
import io.github.ctgnz.jmsfx.IContext;
import io.github.ctgnz.jmsfx.ICountryCode;
import io.github.ctgnz.jmsfx.IEntity;
import io.github.ctgnz.jmsfx.IEntitySubType;
import io.github.ctgnz.jmsfx.IEntityType;
import io.github.ctgnz.jmsfx.IHqtfDummy;
import io.github.ctgnz.jmsfx.IMainElement;
import io.github.ctgnz.jmsfx.ISectorOneModifier;
import io.github.ctgnz.jmsfx.ISectorTwoModifier;
import io.github.ctgnz.jmsfx.IStandardIdentity;
import io.github.ctgnz.jmsfx.IStatus;
import io.github.ctgnz.jmsfx.ISymbolSet;
import io.github.ctgnz.jmsfx.IVersion;
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
    public static final Color CRYSTAL_BLUE = Color.rgb(128, 224, 255); // 80E0FF
    public static final Color LT_YELLOW = Color.rgb(255, 255, 128);    // FFFF80
    public static final Color BAMBOO_GREEN = Color.rgb(170, 255, 170); // AAFFAA
    public static final Color SALMON_RED = Color.rgb(255, 128, 128);   // FF8080
    public static final Color CIV_PURPLE = Color.rgb(255, 161, 255);   // FFA1FF
    public static final Color HOSTILE_ORANGE = Color.rgb(255, 120, 0); // FF7800
    public static final Color OFF_WHITE = Color.rgb(239, 239, 239);    // EFEFEF
    public static final Color NEARLY_WHITE = Color.rgb(250, 250, 250); // FAFAFA
    private final SymbolIdentificationCode sidc = Library.code().build();
    private final ObjectProperty<IconScale> scale = new SimpleObjectProperty<>(IconScale.Medium);
    private final ObjectProperty<IVersion> version;
    private final ObjectProperty<IContext> context;
    private final ObjectProperty<IStandardIdentity> standardIdentity;
    private final ObjectProperty<ISymbolSet> symbolSet;
    private final ObjectProperty<IStatus> status;
    private final ObjectProperty<IHqtfDummy> hqtfDummy;
    private final ObjectProperty<IAmplifierListItem> amplifier;
    private final ObjectProperty<IAmplifierListItem> amplifierTwo;
    private final ObjectProperty<IAmplifierListItem> amplifierThree;
    private final ObjectProperty<IAmplifierListItem> frameAmplifier;
    private final ObjectProperty<IEntity> entity;
    private final ObjectProperty<IEntityType> entityType;
    private final ObjectProperty<IEntitySubType> entitySubType;
    private final ObjectProperty<ISectorOneModifier> sectorOneModifier;
    private final ObjectProperty<ISectorTwoModifier> sectorTwoModifier;
    private final ObjectProperty<ICountryCode> countryCode;
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
    private final ObservableList<IAmplifierListItem> amplifiers = FXCollections.observableArrayList(sidc.getListAmplifiers());
    private final ObservableList<IAmplifierListItem> amplifiersTwo = FXCollections.observableArrayList(sidc.getAmplifierTwoItems());
    private final ObservableList<IAmplifierListItem> amplifiersThree = FXCollections.observableArrayList(sidc.getAmplifierThreeItems());
    private final ObservableList<IAmplifierListItem> frameAmplifiers = FXCollections.observableArrayList(sidc.getFrameListAmplifiers());
    private final ObservableList<IEntity> entities = FXCollections.observableArrayList(sidc.getEntities());
    private final ObservableList<IEntityType> entityTypes = FXCollections.observableArrayList();
    private final ObservableList<IEntitySubType> entitySubTypes = FXCollections.observableArrayList();
    private final ObservableList<ISectorOneModifier> sectorOneModifiers = FXCollections.observableArrayList(sidc.getSectorOneModifiers());
    private final ObservableList<ISectorTwoModifier> sectorTwoModifiers = FXCollections.observableArrayList(sidc.getSectorTwoModifiers());
    private final ObservableList<ISectorOneModifier> commonSectorOneModifiers = FXCollections.observableArrayList(Library.getCommonSectorOneModifiers());
    private final ObservableList<ISectorTwoModifier> commonSectorTwoModifiers = FXCollections.observableArrayList(Library.getCommonSectorTwoModifiers());
    private final ObservableMap<IAmplifier, TextAmplifierValue> textAmplifiers = FXCollections.observableHashMap();
    private final ObservableMap<IAmplifier, GraphicAmplifierValue> graphicAmplifiers = FXCollections.observableHashMap();
    private final BooleanProperty amplifierTemplateVisible = new SimpleBooleanProperty(false);
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

    public GraphicAmplifierValue addGraphicAmplifier(IAmplifier amplifier, SvgGraphic graphic, ScaleDirection scaleDirection, Pos attachment) {
        return graphicAmplifiers.computeIfAbsent(amplifier, key -> {
            IAmplifierGuide guide = getSymbolSet().getAmplifierGuide(amplifier);
            return new GraphicAmplifierValue(guide, graphic, scaleDirection, attachment);
        });
    }

    public TextAmplifierValue addTextAmplifier(IAmplifier amplifier, Pos attachment, String text) {
        TextAmplifierValue textAmplifier = textAmplifiers.computeIfAbsent(amplifier, key -> {
            IAmplifierGuide guide = getSymbolSet().getAmplifierGuide(amplifier);
            return new TextAmplifierValue(guide, attachment, text);
        });
        textAmplifier.setText(text);
        return textAmplifier;
    }

    public ObservableList<IAmplifierListItem> amplifierGroupsList() {
        return amplifiers;
    }

    public BooleanProperty amplifierGuidesVisibleProperty() {
        return amplifierTemplateVisible;
    }

    public ObjectProperty<IAmplifierListItem> amplifierProperty() {
        return amplifier;
    }

    public ObservableList<IAmplifierListItem> amplifierThreeGroupsList() {
        return amplifiersThree;
    }

    public ObjectProperty<IAmplifierListItem> amplifierThreeProperty() {
        return amplifierThree;
    }

    public ObservableList<IAmplifierListItem> amplifierTwoGroupsList() {
        return amplifiersTwo;
    }

    public ObjectProperty<IAmplifierListItem> amplifierTwoProperty() {
        return amplifierTwo;
    }

    public ReadOnlyStringProperty codeProperty() {
        return code;
    }

    public ObjectProperty<IContext> contextProperty() {
        return context;
    }

    public ObjectProperty<ICountryCode> countryCodeProperty() {
        return countryCode;
    }

    public IdentificationSymbolIcon createIcon() {
        return new IdentificationSymbolIcon(this);
    }

    public ObservableList<IEntity> entitiesList() {
        return entities;
    }

    public ObjectProperty<IEntity> entityProperty() {
        return entity;
    }

    public ObjectProperty<IEntitySubType> entitySubTypeProperty() {
        return entitySubType;
    }

    public ObservableList<IEntitySubType> entitySubTypesList() {
        return entitySubTypes;
    }

    public ObjectProperty<IEntityType> entityTypeProperty() {
        return entityType;
    }

    public ObservableList<IEntityType> entityTypesList() {
        return entityTypes;
    }

    public ObservableList<IAmplifierListItem> frameAmplifierGroupsList() {
        return frameAmplifiers;
    }

    public ObjectProperty<IAmplifierListItem> frameAmplifierProperty() {
        return frameAmplifier;
    }

    public IAmplifierListItem getAmplifier() {
        return amplifier.get();
    }

    public SvgGraphic getAmplifierGraphic() {
        return amplifierGraphic.get();
    }

    public IAmplifierListItem getAmplifierThree() {
        return amplifierThree.get();
    }

    public SvgGraphic getAmplifierThreeGraphic() {
        return amplifierThreeGraphic.get();
    }

    public IAmplifierListItem getAmplifierTwo() {
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
                IAmplifierListItem frameAmplifier = getFrameAmplifier();
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

    public IContext getContext() {
        return context.get();
    }

    public IEntity getEntity() {
        return entity.get();
    }

    public IEntitySubType getEntitySubType() {
        return entitySubType.get();
    }

    public IEntityType getEntityType() {
        return entityType.get();
    }

    public IAmplifierListItem getFrameAmplifier() {
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

    public GraphicAmplifierValue getGraphicAmplifier(IAmplifier amplifier) {
        return graphicAmplifiers.get(amplifier);
    }

    public ObservableMap<IAmplifier, GraphicAmplifierValue> getGraphicAmplifiers() {
        return graphicAmplifiers;
    }

    public IHqtfDummy getHqtfDummy() {
        return hqtfDummy.get();
    }

    public SvgGraphic getHqtfDummyGraphic() {
        return hqtfDummyGraphic.get();
    }

    public IMainElement getMainIconElement() {
        IEntitySubType subType = entitySubType.get();
        if (subType != null) {
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

    public ISectorOneModifier getSectorOneModifier() {
        return sectorOneModifier.get();
    }

    public SvgGraphic getSectorOneModifierGraphic() {
        return sectorOneModifierGraphic.get();
    }

    public ISectorTwoModifier getSectorTwoModifier() {
        return sectorTwoModifier.get();
    }

    public SvgGraphic getSectorTwoModifierGraphic() {
        return sectorTwoModifierGraphic.get();
    }

    public IStandardIdentity getStandardIdentity() {
        return standardIdentity.get();
    }

    public String getStandardIdentityGroupId() {
        IStandardIdentity stdId = getStandardIdentity();
        return stdId.getGroup() != null ? stdId.getGroupId() : "0";
    }

    public IStatus getStatus() {
        return status.get();
    }

    public SvgGraphic getStatusGraphic() {
        return statusGraphic.get();
    }

    public ISymbolSet getSymbolSet() {
        return symbolSet.get();
    }

    public TextAmplifierValue getTextAmplifier(IAmplifier amplifier) {
        return textAmplifiers.get(amplifier);
    }

    public ObservableMap<IAmplifier, TextAmplifierValue> getTextAmplifiers() {
        return textAmplifiers;
    }

    public IVersion getVersion() {
        return version.get();
    }

    public ObjectProperty<IHqtfDummy> hqtfDummyProperty() {
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
        IEntity selectedEntity = getEntity();
        return selectedEntity != null && selectedEntity.isCivilian();
    }

    public boolean isFrameAmplifierUsed() {
        return !getFrameAmplifier().isUnknown();
    }

    public boolean isFrameOverlayUsed() {
        return !getContext().isReality();
    }

    public boolean isFrameUsed() {
        ISymbolSet selectedSymbolSet = getSymbolSet();
        return selectedSymbolSet != null && selectedSymbolSet.getDimension().getGeometryType() == GeometryType.POINT_GEOMETRY;
    }

    public boolean isHqtfDummyIconUsed() {
        IHqtfDummy currentHqtfDummy = getHqtfDummy();
        return currentHqtfDummy != null && !currentHqtfDummy.isUnknown();
    }

    public boolean isMainIconUsed() {
        IMainElement mainIconElement = getMainIconElement();
        return mainIconElement != null && mainIconElement.isGraphicalIcon();
    }

    public boolean isSectorOneModifierUsed() {
        ISectorOneModifier mod = getSectorOneModifier();
        return mod != null && !mod.isUnknown();
    }

    public boolean isSectorTwoModifierUsed() {
        ISectorTwoModifier mod = getSectorTwoModifier();
        return mod != null && !mod.isUnknown();
    }

    public boolean isStatusIconUsed() {
        ISymbolSet currentSymbolSet = getSymbolSet();
        if (currentSymbolSet == SymbolSet.DISMOUNTED || currentSymbolSet == SymbolSet.INTERNAL) {
            return false;
        }
        return getStatus().isOperationalCondition() && getContext().isReality() && isFrameUsed();
    }

    public void removeGraphicAmplifier(IAmplifier amplifier) {
        graphicAmplifiers.remove(amplifier);
    }

    public void removeTextAmplifier(IAmplifier amplifier) {
        textAmplifiers.remove(amplifier);
    }

    public ObjectProperty<IconScale> scaleProperty() {
        return scale;
    }

    public ObjectProperty<ISectorOneModifier> sectorOneModifierProperty() {
        return sectorOneModifier;
    }

    public ObservableList<ISectorOneModifier> sectorOneModifiersList() {
        return sectorOneModifiers.sorted(ISectorOneModifier.VIEW_ORDER);
    }

    public ObjectProperty<ISectorTwoModifier> sectorTwoModifierProperty() {
        return sectorTwoModifier;
    }

    public ObservableList<ISectorTwoModifier> sectorTwoModifiersList() {
        return sectorTwoModifiers.sorted(ISectorTwoModifier.VIEW_ORDER);
    }

    public void setAmplifierTemplateVisible(boolean visible) {
        amplifierTemplateVisible.set(visible);
    }

    public void setScale(IconScale iconScale) {
        scale.set(iconScale);
    }

    public ObjectProperty<IStandardIdentity> standardIdentityProperty() {
        return standardIdentity;
    }

    public ObjectProperty<IStatus> statusProperty() {
        return status;
    }

    public ObjectProperty<ISymbolSet> symbolSetProperty() {
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

    public ObjectProperty<IVersion> versionProperty() {
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

            sectorOneModifiers.setAll(Stream.concat(sidc.getSectorOneModifiers().stream(), commonSectorOneModifiers.stream()).toList());
            sectorOneModifier.set(sidc.getSectorOneModifier());

            sectorTwoModifiers.setAll(Stream.concat(sidc.getSectorTwoModifiers().stream(), commonSectorTwoModifiers.stream()).toList());
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

    private IStandardIdentity getStandardIdentityForFrame() {
        return getSymbolSet() == SymbolSet.INTERNAL ? StandardIdentity.SI_UNKNOWN : getStandardIdentity();
    }

    private IStatus getStatusForFrame(IStandardIdentity effectiveStandardId) {
        if (!effectiveStandardId.isConfirmed()) {
            return Status.PRESENT;
        }
        return status.get() == Status.PLANNED ? Status.PLANNED : Status.PRESENT;
    }

    private SvgGraphic loadAmplifierGraphic() {
        IAmplifierListItem amplifierItem = getAmplifier();
        if (!amplifierItem.isUnknown() && amplifierItem.isGraphicalIcon()) {
            return parser.parseFile(amplifierItem.getGraphicLocation(getStandardIdentity()));
        } else {
            return null;
        }
    }

    private SvgGraphic loadAmplifierThreeGraphic() {
        IAmplifierListItem amplifierItem = getAmplifierThree();
        if (!amplifierItem.isUnknown() && amplifierItem.isGraphicalIcon()) {
            return parser.parseFile(amplifierItem.getGraphicLocation(getStandardIdentity()));
        } else {
            return null;
        }
    }

    private SvgGraphic loadAmplifierTwoGraphic() {
        IAmplifierListItem amplifierItem = getAmplifierTwo();
        if (!amplifierItem.isUnknown() && amplifierItem.isGraphicalIcon()) {
            return parser.parseFile(amplifierItem.getGraphicLocation(getStandardIdentity()));
        } else {
            return null;
        }
    }

    private SvgGraphic loadFrameAmplifierGraphic() {
        IAmplifierListItem amplifierItem = getFrameAmplifier();
        if (!amplifierItem.isUnknown() && amplifierItem.isGraphicalIcon()) {
            return parser.parseFile(amplifierItem.getGraphicLocation(getStandardIdentity()));
        } else {
            return null;
        }
    }

    private SvgGraphic loadFrameGraphic() {
        if (isFrameUsed()) {
            ISymbolSet effectiveSymbolSet = getSymbolSet();
            IStandardIdentity effectiveStandardId = getStandardIdentityForFrame();
            IStatus effectiveStatus = getStatusForFrame(effectiveStandardId);
            String filePath = effectiveSymbolSet.getFrameLocation(effectiveStandardId, effectiveStatus, isCivilianEntity());
            return parser.parseFile(filePath);
        } else {
            return null;
        }
    }

    private SvgGraphic loadFrameOverlayGraphic() {
        if (isFrameOverlayUsed()) {
            return parser.parseFile(getContext().getOverlayGraphicLocation());
        } else {
            return null;
        }
    }

    private SvgGraphic loadHqtfDummyGraphic() {
        if (isHqtfDummyIconUsed()) {
            return parser.parseFile(getHqtfDummy().getGraphicLocation(getStandardIdentity(), getSymbolSet()));
        } else {
            return null;
        }
    }

    private SvgGraphic loadMainIconGraphic() {
        if (isMainIconUsed()) {
            String filePath = getMainIconElement().getGraphicLocation(getStandardIdentity());
            return parser.parseFile(filePath);
        } else {
            return null;
        }
    }

    private SvgGraphic loadSectorOneModifierGraphic() {
        if (isSectorOneModifierUsed()) {
            return parser.parseFile(getSectorOneModifier().getFullGraphicLocation());
        } else {
            return null;
        }
    }

    private SvgGraphic loadSectorTwoModifierGraphic() {
        if (isSectorTwoModifierUsed()) {
            return parser.parseFile(getSectorTwoModifier().getFullGraphicLocation());
        } else {
            return null;
        }
    }

    private SvgGraphic loadStatusGraphic() {
        if (isStatusIconUsed()) {
            return parser.parseFile(getStatus().getGraphicLocation(getStandardIdentity(), getSymbolSet()));
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
