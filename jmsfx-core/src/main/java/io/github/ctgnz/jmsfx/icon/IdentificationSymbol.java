package io.github.ctgnz.jmsfx.icon;

import static java.util.stream.Collectors.toList;
import static org.apache.commons.lang3.ObjectUtils.defaultIfNull;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

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
import javafx.geometry.BoundingBox;
import javafx.geometry.Pos;
import javafx.geometry.Rectangle2D;
import javafx.scene.paint.Color;

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
import io.github.ctgnz.jmsfx.IconGeometry;
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

    @SuppressWarnings("this-escape")
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
        return Stream.concat(Stream.of(library.getDefaultAmplifier()), listAmplifiers.stream())
            .collect(toList());
    }

    public AmplifierListItem getAmplifierThree() {
        return defaultIfNull(amplifierThree.get(), library.getDefaultAmplifier());
    }

    public SvgGraphic getAmplifierThreeGraphic() {
        return amplifierThreeGraphic.get();
    }

    public List<StandardAmplifierItem> getAmplifierThreeItems() {
        List<StandardAmplifierItem> listAmplifiers = getSymbolSet().getAmplifierListThree();
        return Stream.concat(Stream.of(library.getDefaultAmplifier()), listAmplifiers.stream())
            .collect(toList());
    }

    public AmplifierListItem getAmplifierTwo() {
        return defaultIfNull(amplifierTwo.get(), library.getDefaultAmplifier());
    }

    public SvgGraphic getAmplifierTwoGraphic() {
        return amplifierTwoGraphic.get();
    }

    public List<StandardAmplifierItem> getAmplifierTwoItems() {
        List<StandardAmplifierItem> listAmplifiers = getSymbolSet().getAmplifierListTwo();
        return Stream.concat(Stream.of(library.getDefaultAmplifier()), listAmplifiers.stream())
            .collect(toList());
    }

    public String getCode() {
        return toString();
    }

    public SvgGraphic getCombinedGraphic() {
        return getCombinedGraphic(false);
    }

    /**
     * The composed symbol, optionally cropped to what it actually draws.
     * <p>
     * Untrimmed - the default - the result keeps the shared 612 x 792 canvas, which is what lets two exported symbols sit correctly alongside one another. Trimmed, the viewBox
     * becomes {@link #getVisibleBounds()} plus {@link IconGeometry#TRIM_PADDING}, which is what a symbol wants when it is displayed small: the canvas is mostly empty, so scaling
     * it into a thumbnail leaves the symbol itself at around half the size it could be.
     * <p>
     * Only the viewBox differs. The content is identical either way, still in canvas coordinates, so trimming changes how a renderer frames the symbol rather than what is drawn.
     */
    public SvgGraphic getCombinedGraphic(boolean trimToVisibleBounds) {
        SvgGraphic container = new SvgGraphic();
        container.setTitle(getDescription());

        List<SvgGraphic> parts = new ArrayList<>();
        if (isFrameUsed()) {
            SvgGraphic frame = getFrameGraphic();
            if (isFrameAmplifierUsed()) {
                AmplifierListItem frameAmplifier = getFrameAmplifier();
                replaceFill(frame, Color.web(frameAmplifier.getBackgroundFill()));
            }
            parts.add(frame);
        }
        if (isStatusIconUsed()) {
            parts.add(getStatusGraphic());
        }
        if (isHqtfDummyIconUsed()) {
            parts.add(getHqtfDummyGraphic());
        }
        if (isMainIconUsed() && getMainIconGraphic() != null) {
            parts.add(getMainIconGraphic());
        }
        if (isAmplifierUsed()) {
            parts.add(getAmplifierGraphic());
        }
        if (isAmplifierTwoUsed()) {
            parts.add(getAmplifierTwoGraphic());
        }
        if (isAmplifierThreeUsed()) {
            parts.add(getAmplifierThreeGraphic());
        }
        if (isSectorOneModifierUsed()) {
            parts.add(getSectorOneModifierGraphic());
        }
        if (isSectorTwoModifierUsed()) {
            parts.add(getSectorTwoModifierGraphic());
        }
        parts.forEach(part -> container.getContent()
            .addAll(part.getVisibleContent()));

        // APP-6E draws every fragment - frame, main icon, modifiers and amplifiers
        // alike - against one shared canvas, each occupying its own subregion of it.
        // The composite therefore inherits that canvas rather than being cropped to
        // its ink: the coordinate space is what makes the fragments line up, and
        // every part carries the same one, so any of them will do.
        //
        // Neither branch measures the rendered result. Doing so meant building a
        // JavaFX scene graph purely to read a bounding box, which made SVG output
        // need a display - see #32. The trimmed viewBox comes from bounds measured
        // once at generation time and unioned arithmetically, so it costs no toolkit.
        Rectangle2D trimmed = trimToVisibleBounds ? IconGeometry.padded(getVisibleBounds()) : Rectangle2D.EMPTY;
        if (!Rectangle2D.EMPTY.equals(trimmed)) {
            applyViewBox(container, trimmed);
        } else {
            parts.stream()
                .findFirst()
                .ifPresent(reference -> {
                    container.setViewBox(reference.getViewBox());
                    container.setPixelsX(reference.getPixelsX());
                    container.setPixelsY(reference.getPixelsY());
                    container.setPixelsWidth(reference.getPixelsWidth());
                    container.setPixelsHeight(reference.getPixelsHeight());
                });
        }
        // Nothing was drawn and nothing sized the result: no frame to inherit a canvas from, and no ink
        // to trim to. That is Control Measure, which draws no frame, for an element with no graphic of
        // its own. Leaving it unsized is the harmful part rather than leaving it blank - an SVG with no
        // viewBox has no intrinsic size, so an <img> showing it stretches to fill whatever its styling
        // allows, which on the Browse tree meant an empty icon expanding to half the column width.
        if (container.getViewBox() == null) {
            applyViewBox(container, IconGeometry.BLANK);
        }
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
            sb.append(entityType.get()
                .getLabel());
        } else if (entity.get() != null) {
            sb.append(entity.get()
                .getLabel());
        }
        if (entitySubType.get() != null) {
            sb.append(" (");
            sb.append(entitySubType.get()
                .getLabel());
            sb.append(")");
        }
        if (sectorOneModifier.get() != null && !sectorOneModifier.get()
            .isUnknown()) {
            sb.append(" ");
            sb.append(sectorOneModifier.get()
                .getLabel());
        }
        if (sectorTwoModifier.get() != null && !sectorTwoModifier.get()
            .isUnknown()) {
            sb.append(" ");
            sb.append(sectorTwoModifier.get()
                .getLabel());
        }
        if (amplifier.get() != null && !amplifier.get()
            .isUnknown()) {
            sb.append(" ");
            sb.append(amplifier.get()
                .getLabel());
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
        return entityType.get() != null ? entityType.get()
            .getEntitySubTypes() : Collections.emptyList();
    }

    public EntityType getEntityType() {
        return entityType.get();
    }

    public List<EntityType> getEntityTypes() {
        return entity.get()
            .getEntityTypes();
    }

    public String getFirstTenDigits() {
        return String.format("%s%s%s%s%s%s%s",
            version.get()
                .getId(),
            context.get()
                .getId(),
            standardIdentity.get()
                .getId(),
            symbolSet.get() != null ? symbolSet.get()
                .getId() : "00",
            status.get()
                .getId(),
            hqtfDummy.get()
                .getId(),
            // Positions 9 and 10.
            amplifierCode(amplifier.get()));
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
        return Stream.concat(Stream.of(library.getDefaultAmplifier()), listAmplifiers.stream())
            .toList();
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
        if (entitySubType.get() != null && !entitySubType.get()
            .isUnknown()) {
            return entitySubType.get();
        }
        if (entityType.get() != null && !entityType.get()
            .isUnknown()) {
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
            entity.get() != null ? entity.get()
                .getId() : "00",
            entityType.get() != null ? entityType.get()
                .getId() : "00",
            entitySubType.get() != null ? entitySubType.get()
                .getId() : "00",
            sectorOneModifier.get() != null ? sectorOneModifier.get()
                .getId() : "00",
            sectorTwoModifier.get() != null ? sectorTwoModifier.get()
                .getId() : "00");
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
            amplifierCode(amplifierTwo.get()),
            amplifierCode(amplifierThree.get()),
            frameAmplifier.get() != null ? frameAmplifier.get()
                .getId() : "0",
            getCountryCode().getCode());
    }

    public Version getVersion() {
        return defaultIfNull(version.get(), library.getDefaultVersion());
    }

    /**
     * The region of the 612 x 792 canvas this symbol actually draws on, or {@link Rectangle2D#EMPTY} if it draws nothing.
     * <p>
     * This unions the bounds of exactly the parts {@link #getCombinedGraphic()} composes, under the same guards and in the same order. The union is the answer rather than an
     * approximation of it: parts are composited into one shared coordinate space with no transform applied, so the composite's extent is precisely the union of its parts'. That
     * was confirmed by measuring, over 1,084 symbols, with no disagreement beyond float32 epsilon.
     * <p>
     * No JavaFX toolkit is involved. Each part's bounds were measured once at generation time and baked into the model, so this is arithmetic - which is what lets a headless
     * server trim a symbol to its ink. See jmsfx#45.
     * <p>
     * The result is tight to the ink. Callers wanting a viewBox should pass it through {@link IconGeometry#padded(Rectangle2D)}.
     */
    public Rectangle2D getVisibleBounds() {
        StandardIdentity identity = getStandardIdentity();
        SymbolSet symbolSet = getSymbolSet();
        Rectangle2D bounds = Rectangle2D.EMPTY;

        if (isFrameUsed()) {
            bounds = IconGeometry.union(bounds, symbolSet.getDimension()
                .getFrameBounds(identity, effectiveFrameStatus(), isCivilianEntity()));
        }
        if (isStatusIconUsed()) {
            bounds = IconGeometry.union(bounds, getStatus().getStatusBounds(identity, symbolSet));
        }
        if (isHqtfDummyIconUsed()) {
            bounds = IconGeometry.union(bounds, getHqtfDummy().getHqtfDummyBounds(identity, symbolSet));
        }
        if (isMainIconUsed() && getMainIconGraphic() != null) {
            // A main icon is drawn within the octagon, and a FULL_FRAME one is its frame, which is
            // already in the union - so the octagon covers either rule. A FREE_CANVAS element obeys
            // neither and carries its measured extent instead. jmsfx#53 tracks the fragments that
            // overrun the octagon, which are being corrected in the SVGs.
            bounds = IconGeometry.union(bounds, getMainIconElement().getIconBounds());
        }
        if (isAmplifierUsed()) {
            bounds = IconGeometry.union(bounds, amplifierBounds(getAmplifier(), identity));
        }
        if (isAmplifierTwoUsed()) {
            bounds = IconGeometry.union(bounds, amplifierBounds(getAmplifierTwo(), identity));
        }
        if (isAmplifierThreeUsed()) {
            bounds = IconGeometry.union(bounds, amplifierBounds(getAmplifierThree(), identity));
        }
        if (isSectorOneModifierUsed()) {
            bounds = IconGeometry.union(bounds, getSectorOneModifier().getModifierBounds());
        }
        if (isSectorTwoModifierUsed()) {
            bounds = IconGeometry.union(bounds, getSectorTwoModifier().getModifierBounds());
        }
        return bounds;
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

    /**
     * Whether this symbol is drawn inside a frame.
     * <p>
     * Point geometry is the usual answer: a symbol set drawn at a point gets a frame, one drawn as a line or an area does not. A
     * {@link io.github.ctgnz.jmsfx.types.GraphicType#FREE_CANVAS} main element is the exception in the other direction. APP-6E 8.1.3 exempts those from the icon building rules -
     * they are map graphics rather than icons assembled within the octagon - and a map graphic inside a symbol frame is a contradiction, so the exemption belongs to the element
     * rather than to whichever symbol set it happens to sit in.
     * <p>
     * Control Measure hid this for a long time. Its dimension is mixed geometry, so it never had a frame anyway, and the two rules agreed by accident. Cyberspace is point
     * geometry, and its three FREE_CANVAS elements were drawn framed until this was made explicit. See jmsfx#91.
     * <p>
     * The status icon follows without being mentioned: {@link #isStatusIconUsed()} already requires a frame, since the status ring is drawn around one.
     */
    public boolean isFrameUsed() {
        return getSymbolSet().isPointGeometry() && !getMainIconElement().isFreeCanvas();
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

    /** The symbol's intrinsic size follows its viewBox, so a trimmed symbol reports the size of its ink rather than of the canvas. */
    private static void applyViewBox(SvgGraphic container, Rectangle2D bounds) {
        container.setViewBox(new ViewBox(new BoundingBox(bounds.getMinX(), bounds.getMinY(), bounds.getWidth(), bounds.getHeight())));
        container.setPixelsX(bounds.getMinX());
        container.setPixelsY(bounds.getMinY());
        container.setPixelsWidth(bounds.getWidth());
        container.setPixelsHeight(bounds.getHeight());
    }

    /** Only standard amplifiers carry measured bounds; a text or country amplifier draws no graphic of its own. */
    private static Rectangle2D amplifierBounds(AmplifierListItem item, StandardIdentity identity) {
        return item instanceof StandardAmplifierItem standard ? standard.getAmplifierBounds(identity) : Rectangle2D.EMPTY;
    }

    /**
     * An amplifier as it appears in the two SIDC positions it occupies - 9 and 10 for the amplifier proper, 23 to 26 for the second and third.
     * <p>
     * A standard amplifier's own id is already the complete two-digit code from Table A-8. An unspecified one fills both positions with zeros rather than reporting its placeholder
     * id, which is a single digit because that same value doubles as the frame amplifier at position 27.
     */
    private static String amplifierCode(AmplifierListItem item) {
        return item == null || item.isUnknown() ? "00" : item.getFullId();
    }

    /**
     * The status the frame is drawn for, which is not always the symbol's own. A planned status only changes the frame when the identity is confirmed - an unconfirmed identity
     * already draws a dotted frame, and there is no fragment combining the two - so everything else falls back to the default.
     * <p>
     * Shared with {@link #loadFrameGraphic()} so the bounds cannot end up describing a different frame from the one drawn.
     */
    private Status effectiveFrameStatus() {
        Status current = getStatus();
        return getStandardIdentity().isConfirmed() && current.isPlanned() ? current : library.getDefaultStatus();
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
        return library.loadFrameGraphic(getSymbolSet(), getStandardIdentity(), effectiveFrameStatus(), isCivilianEntity());
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
        graphic.getContent()
            .forEach(element -> {
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
