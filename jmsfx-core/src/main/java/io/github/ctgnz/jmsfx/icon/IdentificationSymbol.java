package io.github.ctgnz.jmsfx.icon;

import static java.util.stream.Collectors.toList;
import static org.apache.commons.lang3.ObjectUtils.defaultIfNull;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

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
import io.github.ctgnz.jmsfx.StandardAmplifierItem;
import io.github.ctgnz.jmsfx.StandardIdentity;
import io.github.ctgnz.jmsfx.Status;
import io.github.ctgnz.jmsfx.SymbolSet;
import io.github.ctgnz.jmsfx.Version;
import io.github.ctgnz.jmsfx.types.GraphicAmplifierValue;
import io.github.ctgnz.jmsfx.types.IconScale;
import io.github.ctgnz.jmsfx.types.ScaleDirection;
import io.github.ctgnz.jmsfx.types.TextAmplifierValue;
import javafx.beans.binding.Bindings;
import javafx.beans.property.BooleanProperty;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.beans.property.SimpleBooleanProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
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
    private final ObjectProperty<IconScale> scale = new SimpleObjectProperty<>(IconScale.Medium);
    private final ObjectProperty<Version> version = new SimpleObjectProperty<>();
    private final ObjectProperty<Context> context = new SimpleObjectProperty<>();
    private final ObjectProperty<StandardIdentity> standardIdentity = new SimpleObjectProperty<>();
    private final ObjectProperty<SymbolSet> symbolSet = new SimpleObjectProperty<>();
    private final ObjectProperty<Status> status = new SimpleObjectProperty<>();
    private final ObjectProperty<HqtfDummy> hqtfDummy = new SimpleObjectProperty<>();
    private final ObjectProperty<AmplifierListItem> amplifier = new SimpleObjectProperty<>();
    private final ObjectProperty<AmplifierListItem> amplifierTwo = new SimpleObjectProperty<>();
    private final ObjectProperty<AmplifierListItem> amplifierThree = new SimpleObjectProperty<>();
    private final ObjectProperty<AmplifierListItem> frameAmplifier = new SimpleObjectProperty<>();
    private final ObjectProperty<Entity> entity = new SimpleObjectProperty<>();
    private final ObjectProperty<EntityType> entityType = new SimpleObjectProperty<>();
    private final ObjectProperty<EntitySubType> entitySubType = new SimpleObjectProperty<>();
    private final ObjectProperty<SectorOneModifier> sectorOneModifier = new SimpleObjectProperty<>();
    private final ObjectProperty<SectorTwoModifier> sectorTwoModifier = new SimpleObjectProperty<>();
    private final ObjectProperty<CountryCode> countryCode = new SimpleObjectProperty<>();
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
    private final StringProperty code = new SimpleStringProperty();
    private final ObservableMap<Amplifier, TextAmplifierValue> textAmplifiers = FXCollections.observableHashMap();
    private final ObservableMap<Amplifier, GraphicAmplifierValue> graphicAmplifiers = FXCollections.observableHashMap();
    private final BooleanProperty amplifierTemplateVisible = new SimpleBooleanProperty(false);
    private final IconLibrary library;

    public IdentificationSymbol(IconLibrary library) {
        this.library = library;
        initDefaults();
        // only set up the listeners once all default values are set
        addListeners();
    }

    public GraphicAmplifierValue addGraphicAmplifier(Amplifier amplifier, SvgGraphic graphic, ScaleDirection scaleDirection, Pos attachment) {
        return graphicAmplifiers.computeIfAbsent(amplifier, key -> {
            AmplifierGuide guide = getSymbolSet().getAmplifierGuide(amplifier);
            return new GraphicAmplifierValue(guide, graphic, scaleDirection, attachment);
        });
    }

    public GraphicAmplifierValue addOverlayAmplifier(Amplifier amplifier, SvgGraphic graphic) {
        return graphicAmplifiers.computeIfAbsent(amplifier, key -> {
            AmplifierGuide guide = getSymbolSet().getAmplifierGuide(amplifier);
            return new GraphicAmplifierValue(guide, graphic, ScaleDirection.Original, Pos.TOP_LEFT);
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

    public BooleanProperty amplifierGuidesVisibleProperty() {
        return amplifierTemplateVisible;
    }

    public ObjectProperty<AmplifierListItem> amplifierProperty() {
        return amplifier;
    }

    public ObjectProperty<AmplifierListItem> amplifierThreeProperty() {
        return amplifierThree;
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

    public ObjectProperty<Entity> entityProperty() {
        return entity;
    }

    public ObjectProperty<EntitySubType> entitySubTypeProperty() {
        return entitySubType;
    }

    public ObjectProperty<EntityType> entityTypeProperty() {
        return entityType;
    }

    public ObjectProperty<AmplifierListItem> frameAmplifierProperty() {
        return frameAmplifier;
    }

    public AmplifierListItem getAmplifier() {
        return defaultIfNull(amplifier.get(), library.getDefaultAmplifier());
    }

    public SvgGraphic getAmplifierGraphic() {
        return amplifierGraphic.get();
    }

    public List<StandardAmplifierItem> getAmplifierItems() {
        List<StandardAmplifierItem> listAmplifiers = getSymbolSet().getAmplifierList();
        return Stream.concat(Stream.of(library.getDefaultAmplifier()), listAmplifiers.stream()).collect(toList());
    }

    public AmplifierListItem getAmplifierThree() {
        return defaultIfNull(amplifierThree.get(), library.getDefaultAmplifier());
    }

    public SvgGraphic getAmplifierThreeGraphic() {
        return amplifierThreeGraphic.get();
    }

    public List<StandardAmplifierItem> getAmplifierThreeItems() {
        List<StandardAmplifierItem> listAmplifiers = getSymbolSet().getAmplifierListThree();
        return Stream.concat(Stream.of(library.getDefaultAmplifier()), listAmplifiers.stream()).collect(toList());
    }

    public AmplifierListItem getAmplifierTwo() {
        return defaultIfNull(amplifierTwo.get(), library.getDefaultAmplifier());
    }

    public SvgGraphic getAmplifierTwoGraphic() {
        return amplifierTwoGraphic.get();
    }

    public List<StandardAmplifierItem> getAmplifierTwoItems() {
        List<StandardAmplifierItem> listAmplifiers = getSymbolSet().getAmplifierListTwo();
        return Stream.concat(Stream.of(library.getDefaultAmplifier()), listAmplifiers.stream()).collect(toList());
    }

    public String getCode() {
        return toString();
    }

    public SvgGraphic getCombinedGraphic() {
        SvgGraphic container = new SvgGraphic();
        container.setTitle(getDescription());
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
        return defaultIfNull(context.get(), library.getDefaultContext());
    }

    public CountryCode getCountryCode() {
        return defaultIfNull(countryCode.get(), library.getExtensionCountryCode());
    }

    public String getDescription() {
        StringBuilder sb = new StringBuilder();
        if (entityType.get() != null) {
            sb.append(entityType.get().getLabel());
        } else if (entity.get() != null) {
            sb.append(entity.get().getLabel());
        }
        if (entitySubType.get() != null) {
            sb.append(" (");
            sb.append(entitySubType.get().getLabel());
            sb.append(")");
        }
        if (sectorOneModifier.get() != null && !sectorOneModifier.get().isUnknown()) {
            sb.append(" ");
            sb.append(sectorOneModifier.get().getLabel());
        }
        if (sectorTwoModifier.get() != null && !sectorTwoModifier.get().isUnknown()) {
            sb.append(" ");
            sb.append(sectorTwoModifier.get().getLabel());
        }
        if (amplifier.get() != null && !amplifier.get().isUnknown()) {
            sb.append(" ");
            sb.append(amplifier.get().getLabel());
        }
        return sb.toString();
    }

    public Entity getEntity() {
        return defaultIfNull(entity.get(), library.getDefaultEntity());
    }

    public EntitySubType getEntitySubType() {
        return entitySubType.get();
    }

    public List<EntitySubType> getEntitySubTypes() {
        return entityType.get() != null ? entityType.get().getEntitySubTypes() : Collections.emptyList();
    }

    public EntityType getEntityType() {
        return entityType.get();
    }

    public List<EntityType> getEntityTypes() {
        return entity.get().getEntityTypes();
    }

    public String getFirstTenDigits() {
        return String.format("%s%s%s%s%s%s%s",
            version.get().getId(),
            context.get().getId(),
            standardIdentity.get().getId(),
            symbolSet.get() != null ? symbolSet.get().getId() : "00",
            status.get().getId(),
            hqtfDummy.get().getId(),
            amplifier.get() != null ? amplifier.get().getId() : "00");
    }

    public AmplifierListItem getFrameAmplifier() {
        return defaultIfNull(frameAmplifier.get(), library.getDefaultAmplifier());
    }

    public SvgGraphic getFrameAmplifierGraphic() {
        return frameAmplifierGraphic.get();
    }

    public SvgGraphic getFrameGraphic() {
        return frameGraphic.get();
    }

    public List<StandardAmplifierItem> getFrameListAmplifiers() {
        List<StandardAmplifierItem> listAmplifiers = getSymbolSet().getFrameAmplifierList();
        return Stream.concat(Stream.of(library.getDefaultAmplifier()), listAmplifiers.stream()).toList();
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
        return defaultIfNull(hqtfDummy.get(), library.getDefaultHqtfDummy());
    }

    public SvgGraphic getHqtfDummyGraphic() {
        return hqtfDummyGraphic.get();
    }

    public MainElement getMainIconElement() {
        if (entitySubType.get() != null && !entitySubType.get().isUnknown()) {
            return entitySubType.get();
        }
        if (entityType.get() != null && !entityType.get().isUnknown()) {
            return entityType.get();
        }
        return getEntity();
    }

    public SvgGraphic getMainIconGraphic() {
        return mainIconGraphic.get();
    }

    public IconScale getScale() {
        return scale.get();
    }

    public String getSecondTenDigits() {
        return String.format("%s%s%s%s%s",
            entity.get() != null ? entity.get().getId() : "00",
            entityType.get() != null ? entityType.get().getId() : "00",
            entitySubType.get() != null ? entitySubType.get().getId() : "00",
            sectorOneModifier.get() != null ? sectorOneModifier.get().getId() : "00",
            sectorTwoModifier.get() != null ? sectorTwoModifier.get().getId() : "00");
    }

    public SectorOneModifier getSectorOneModifier() {
        return defaultIfNull(sectorOneModifier.get(), library.getDefaultSectorOneModifier());
    }

    public SvgGraphic getSectorOneModifierGraphic() {
        return sectorOneModifierGraphic.get();
    }

    public SectorTwoModifier getSectorTwoModifier() {
        return defaultIfNull(sectorTwoModifier.get(), library.getDefaultSectorTwoModifier());
    }

    public SvgGraphic getSectorTwoModifierGraphic() {
        return sectorTwoModifierGraphic.get();
    }

    public StandardIdentity getStandardIdentity() {
        return defaultIfNull(standardIdentity.get(), library.getDefaultStandardIdentity());
    }

    public String getStandardIdentityGroupId() {
        StandardIdentity stdId = getStandardIdentity();
        return stdId.getGroup() != null ? stdId.getGroupId() : "0";
    }

    public Status getStatus() {
        return defaultIfNull(status.get(), library.getDefaultStatus());
    }

    public SvgGraphic getStatusGraphic() {
        return statusGraphic.get();
    }

    public SymbolSet getSymbolSet() {
        return defaultIfNull(symbolSet.get(), library.getDefaultSymbolSet());
    }

    public TextAmplifierValue getTextAmplifier(Amplifier amplifier) {
        return textAmplifiers.get(amplifier);
    }

    public ObservableMap<Amplifier, TextAmplifierValue> getTextAmplifiers() {
        return textAmplifiers;
    }

    public String getThirdTenDigits() {
        return String.format("%s%s%s%s%s%s",
            getSectorOneModifier() != null ? getSectorOneModifier().getGroupId() : "0",
            getSectorTwoModifier() != null ? getSectorTwoModifier().getGroupId() : "0",
            amplifierTwo.get() != null ? amplifierTwo.get().getFullId() : "00",
            amplifierThree.get() != null ? amplifierThree.get().getFullId() : "00",
            frameAmplifier.get() != null ? frameAmplifier.get().getId() : "0",
            getCountryCode().getCode());
    }

    public Version getVersion() {
        return defaultIfNull(version.get(), library.getDefaultVersion());
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
        return getEntity().isCivilian();
    }

    public boolean isFrameAmplifierUsed() {
        return !getFrameAmplifier().isUnknown();
    }

    public boolean isFrameOverlayUsed() {
        return !getContext().isReality();
    }

    public boolean isFrameUsed() {
        return getSymbolSet().isPointGeometry();
    }

    public boolean isHqtfDummyIconUsed() {
        return !getHqtfDummy().isUnknown();
    }

    public boolean isMainIconUsed() {
        return getMainIconElement().isGraphicalIcon();
    }

    public boolean isSectorOneModifierUsed() {
        return !getSectorOneModifier().isUnknown();
    }

    public boolean isSectorTwoModifierUsed() {
        return !getSectorTwoModifier().isUnknown();
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

    public ObjectProperty<SectorTwoModifier> sectorTwoModifierProperty() {
        return sectorTwoModifier;
    }

    public void setAmplifier(StandardAmplifierItem amplifier) {
        this.amplifier.set(amplifier);
    }

    public void setAmplifierTemplateVisible(boolean visible) {
        amplifierTemplateVisible.set(visible);
    }

    public void setAmplifierThree(StandardAmplifierItem amplifier) {
        this.amplifierThree.set(amplifier);
    }

    public void setAmplifierTwo(StandardAmplifierItem amplifier) {
        this.amplifierTwo.set(amplifier);
    }

    public void setContext(Context context) {
        this.context.set(context);
    }

    public void setCountryCode(CountryCode countryCode) {
        this.countryCode.set(countryCode);
    }

    public void setEntity(Entity entity) {
        this.entity.set(entity);
    }

    public void setEntitySubType(EntitySubType entitySubType) {
        this.entitySubType.set(entitySubType);
    }

    public void setEntityType(EntityType entityType) {
        this.entityType.set(entityType);
    }

    public void setFrameAmplifier(StandardAmplifierItem amplifier) {
        this.frameAmplifier.set(amplifier);
    }

    public void setHqtfDummy(HqtfDummy hqtfDummy) {
        this.hqtfDummy.set(hqtfDummy);
    }

    public void setScale(IconScale iconScale) {
        scale.set(iconScale);
    }

    public void setSectorOneModifier(SectorOneModifier sectorOneModifier) {
        this.sectorOneModifier.set(sectorOneModifier);
    }

    public void setSectorTwoModifier(SectorTwoModifier sectorTwoModifier) {
        this.sectorTwoModifier.set(sectorTwoModifier);
    }

    public void setStandardIdentity(StandardIdentity standardId) {
        this.standardIdentity.set(standardId);
    }

    public void setStatus(Status status) {
        this.status.set(status);
    }

    public void setSymbolSet(SymbolSet symbolSet) {
        this.symbolSet.set(symbolSet);
    }

    public void setVersion(Version version) {
        this.version.set(version);
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
        return String.format("%s %s %s", getFirstTenDigits(), getSecondTenDigits(), getThirdTenDigits());
    }

    public ObjectProperty<Version> versionProperty() {
        return version;
    }

    protected void initDefaults() {
        this.version.set(library.getDefaultVersion());
        this.context.set(library.getDefaultContext());
        this.standardIdentity.set(library.getDefaultStandardIdentity());
        this.status.set(library.getDefaultStatus());
        this.hqtfDummy.set(library.getDefaultHqtfDummy());
        this.countryCode.set(library.getExtensionCountryCode());
    }

    private void addListeners() {
        // Observable lists can't be bound directly, so update these values when the appropriate property changes
        symbolSet.addListener((obs, oldValue, newValue) -> {
            amplifier.set(library.getDefaultAmplifier());
            amplifierTwo.set(library.getDefaultAmplifier());
            amplifierThree.set(library.getDefaultAmplifier());
            frameAmplifier.set(library.getDefaultAmplifier());
            sectorOneModifier.set(library.getDefaultSectorOneModifier());
            sectorTwoModifier.set(library.getDefaultSectorTwoModifier());
            entitySubType.set(library.getDefaultEntitySubType());
            entityType.set(library.getDefaultEntityType());
            entity.set(library.getDefaultEntity());
            textAmplifiers.clear();
            graphicAmplifiers.clear();
        });
        // set initial symbol set value here to initialize the remaining default values
        this.symbolSet.set(library.getDefaultSymbolSet());

        // Code value should be updated after a change in any of the symbol properties
        code.bind(Bindings.createStringBinding(this::toString,
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
        StandardIdentity effectiveIdentity = getStandardIdentity();
        Status effectiveStatus = status.get();
        if (!effectiveIdentity.isConfirmed() || !effectiveStatus.isPlanned()) {
            effectiveStatus = library.getDefaultStatus();
        }
        return library.loadFrameGraphic(getSymbolSet(), effectiveIdentity, effectiveStatus, isCivilianEntity());
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
