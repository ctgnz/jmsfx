package io.github.ctgnz.jmsfx.generator.schema;

import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "geometries",
    "drawRules",
    "labelRules",
    "amplifiers",
    "commonModifiers",
    "versions",
    "contexts",
    "standardIdentities",
    "standardIdentityGroups",
    "dimensions",
    "statuses",
    "hqtfDummies",
    "amplifierGroups"
})
@XmlRootElement(name = "Library")
public class Library {

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "amplifierGroup"
    })
    public static class AmplifierGroups {

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "amplifierGroupCode",
            "amplifiers"
        })
        public static class AmplifierGroup {

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "amplifier"
            })
            public static class Amplifiers {

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "amplifierCode",
                    "graphics"
                })
                public static class Amplifier {

                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "graphic"
                    })
                    public static class Graphics {

                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Graphic {

                            @XmlAttribute(name = "StandardIdentityGroup", required = true)
                            @XmlIDREF
                            @XmlSchemaType(name = "IDREF")
                            protected Object standardIdentityGroup;
                            @XmlAttribute(name = "Graphic", required = true)
                            @XmlSchemaType(name = "anyURI")
                            protected String graphic;

                            public String getGraphic() {
                                return graphic;
                            }

                            public Object getStandardIdentityGroup() {
                                return standardIdentityGroup;
                            }

                            public void setGraphic(String value) {
                                this.graphic = value;
                            }

                            public void setStandardIdentityGroup(Object value) {
                                this.standardIdentityGroup = value;
                            }

                        }

                        @XmlElement(name = "Graphic", required = true)
                        protected List<Library.AmplifierGroups.AmplifierGroup.Amplifiers.Amplifier.Graphics.Graphic> graphic;

                        public List<Library.AmplifierGroups.AmplifierGroup.Amplifiers.Amplifier.Graphics.Graphic> getGraphic() {
                            if (graphic == null) {
                                graphic = new ArrayList<>();
                            }
                            return this.graphic;
                        }

                    }
                    @XmlElement(name = "AmplifierCode")
                    @XmlSchemaType(name = "unsignedShort")
                    protected HexDigit amplifierCode;
                    @XmlElement(name = "Graphics")
                    protected Library.AmplifierGroups.AmplifierGroup.Amplifiers.Amplifier.Graphics graphics;
                    @XmlAttribute(name = "Extension")
                    protected boolean extension;
                    @XmlAttribute(name = "Name", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String name;
                    @XmlAttribute(name = "Label")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String label;
                    @XmlAttribute(name = "LabelAlias")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String labelAlias;
                    @XmlAttribute(name = "Description")
                    protected String description;

                    @XmlAttribute(name = "Remarks")
                    protected String remarks;

                    public HexDigit getAmplifierCode() {
                        return amplifierCode;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public Library.AmplifierGroups.AmplifierGroup.Amplifiers.Amplifier.Graphics getGraphics() {
                        return graphics;
                    }

                    public String getLabel() {
                        return label;
                    }

                    public String getLabelAlias() {
                        if (labelAlias == null) {
                            return "";
                        } else {
                            return labelAlias;
                        }
                    }

                    public String getName() {
                        return name;
                    }

                    public String getRemarks() {
                        return remarks;
                    }

                    public boolean isExtension() {
                        return extension;
                    }

                    public void setAmplifierCode(HexDigit value) {
                        this.amplifierCode = value;
                    }

                    public void setDescription(String value) {
                        this.description = value;
                    }

                    public void setExtension(boolean value) {
                        this.extension = value;
                    }

                    public void setGraphics(Library.AmplifierGroups.AmplifierGroup.Amplifiers.Amplifier.Graphics value) {
                        this.graphics = value;
                    }

                    public void setLabel(String value) {
                        this.label = value;
                    }

                    public void setLabelAlias(String value) {
                        this.labelAlias = value;
                    }

                    public void setName(String value) {
                        this.name = value;
                    }

                    public void setRemarks(String value) {
                        this.remarks = value;
                    }

                }

                @XmlElement(name = "Amplifier", required = true)
                protected List<Library.AmplifierGroups.AmplifierGroup.Amplifiers.Amplifier> amplifier;

                public List<Library.AmplifierGroups.AmplifierGroup.Amplifiers.Amplifier> getAmplifier() {
                    if (amplifier == null) {
                        amplifier = new ArrayList<>();
                    }
                    return this.amplifier;
                }

            }
            @XmlElement(name = "AmplifierGroupCode")
            @XmlSchemaType(name = "unsignedShort")
            protected int amplifierGroupCode;
            @XmlElement(name = "Amplifiers", required = true)
            protected Library.AmplifierGroups.AmplifierGroup.Amplifiers amplifiers;
            @XmlAttribute(name = "CompatibleSymbolSetIDs")
            @XmlIDREF
            @XmlSchemaType(name = "IDREFS")
            protected List<Object> compatibleSymbolSetIDs;
            @XmlAttribute(name = "Extension")
            protected boolean extension;
            @XmlAttribute(name = "Name", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String name;
            @XmlAttribute(name = "Label")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String label;
            @XmlAttribute(name = "LabelAlias")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String labelAlias;
            @XmlAttribute(name = "Description")
            protected String description;
            @XmlAttribute(name = "Remarks")
            protected String remarks;

            public int getAmplifierGroupCode() {
                return amplifierGroupCode;
            }

            public Library.AmplifierGroups.AmplifierGroup.Amplifiers getAmplifiers() {
                return amplifiers;
            }

            public List<Object> getCompatibleSymbolSetIDs() {
                if (compatibleSymbolSetIDs == null) {
                    compatibleSymbolSetIDs = new ArrayList<>();
                }
                return this.compatibleSymbolSetIDs;
            }

            public String getDescription() {
                return description;
            }

            public String getLabel() {
                return label;
            }

            public String getLabelAlias() {
                if (labelAlias == null) {
                    return "";
                } else {
                    return labelAlias;
                }
            }

            public String getName() {
                return name;
            }

            public String getRemarks() {
                return remarks;
            }

            public boolean isExtension() {
                return extension;
            }

            public void setAmplifierGroupCode(int value) {
                this.amplifierGroupCode = value;
            }

            public void setAmplifiers(Library.AmplifierGroups.AmplifierGroup.Amplifiers value) {
                this.amplifiers = value;
            }

            public void setDescription(String value) {
                this.description = value;
            }

            public void setExtension(boolean value) {
                this.extension = value;
            }

            public void setLabel(String value) {
                this.label = value;
            }

            public void setLabelAlias(String value) {
                this.labelAlias = value;
            }

            public void setName(String value) {
                this.name = value;
            }

            public void setRemarks(String value) {
                this.remarks = value;
            }

        }

        @XmlElement(name = "AmplifierGroup", required = true)
        protected List<Library.AmplifierGroups.AmplifierGroup> amplifierGroup;

        public List<Library.AmplifierGroups.AmplifierGroup> getAmplifierGroup() {
            if (amplifierGroup == null) {
                amplifierGroup = new ArrayList<>();
            }
            return this.amplifierGroup;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "amplifier"
    })
    public static class Amplifiers {

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "description", "remarks", "note", "values"
        })
        public static class Amplifier {

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Values {

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Value {

                    @XmlAttribute(name = "Name", required = true)
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String name;
                    @XmlAttribute(name = "Label")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String label;
                    @XmlAttribute(name = "LabelAlias")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String labelAlias;
                    @XmlAttribute(name = "Description")
                    protected String description;
                    @XmlAttribute(name = "Remarks")
                    protected String remarks;
                    @XmlAttribute(name = "Extension")
                    protected boolean extension;

                    public String getDescription() {
                        return description;
                    }

                    public String getLabel() {
                        return label;
                    }

                    public String getLabelAlias() {
                        if (labelAlias == null) {
                            return "";
                        } else {
                            return labelAlias;
                        }
                    }

                    public String getName() {
                        return name;
                    }

                    public String getRemarks() {
                        return remarks;
                    }

                    public boolean isExtension() {
                        return extension;
                    }

                    public void setDescription(String value) {
                        this.description = value;
                    }

                    public void setExtension(boolean extension) {
                        this.extension = extension;
                    }

                    public void setLabel(String value) {
                        this.label = value;
                    }

                    public void setLabelAlias(String value) {
                        this.labelAlias = value;
                    }

                    public void setName(String value) {
                        this.name = value;
                    }

                    public void setRemarks(String value) {
                        this.remarks = value;
                    }

                }
                @XmlElement(name = "Value", required = true)
                protected List<Library.Amplifiers.Amplifier.Values.Value> value;
                @XmlAttribute(name = "ID", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlID
                @XmlSchemaType(name = "ID")
                protected String id;
                @XmlAttribute(name = "Label")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String label;
                @XmlAttribute(name = "LabelAlias")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                @XmlSchemaType(name = "token")
                protected String labelAlias;
                @XmlAttribute(name = "Description")
                protected String description;

                @XmlAttribute(name = "Remarks")
                protected String remarks;

                public String getDescription() {
                    return description;
                }

                public String getID() {
                    return id;
                }

                public String getLabel() {
                    return label;
                }

                public String getLabelAlias() {
                    if (labelAlias == null) {
                        return "";
                    } else {
                        return labelAlias;
                    }
                }

                public String getRemarks() {
                    return remarks;
                }

                public List<Library.Amplifiers.Amplifier.Values.Value> getValue() {
                    if (value == null) {
                        value = new ArrayList<>();
                    }
                    return this.value;
                }

                public void setDescription(String value) {
                    this.description = value;
                }

                public void setID(String value) {
                    this.id = value;
                }

                public void setLabel(String value) {
                    this.label = value;
                }

                public void setLabelAlias(String value) {
                    this.labelAlias = value;
                }

                public void setRemarks(String value) {
                    this.remarks = value;
                }

            }
            @XmlElement(name = "Values")
            protected List<Library.Amplifiers.Amplifier.Values> values;
            @XmlAttribute(name = "Type")
            protected AmplifierType type;
            @XmlAttribute(name = "MinLength")
            protected Integer minLength;
            @XmlAttribute(name = "MaxLength")
            protected Integer maxLength;
            @XmlElement(name = "Note")
            protected String note;
            @XmlAttribute(name = "ID", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "Label")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String label;
            @XmlAttribute(name = "LabelAlias")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String labelAlias;
            @XmlAttribute(name = "Extension")
            protected boolean extension;
            @XmlAttribute(name = "Deprecated")
            protected boolean deprecated;
            @XmlElement(name = "Description")
            protected String description;
            @XmlElement(name = "Remarks")
            protected String remarks;

            public String getDescription() {
                return description;
            }

            public String getID() {
                return id;
            }

            public String getLabel() {
                return label;
            }

            public String getLabelAlias() {
                if (labelAlias == null) {
                    return "";
                } else {
                    return labelAlias;
                }
            }

            public Integer getMaxLength() {
                return maxLength;
            }

            public Integer getMinLength() {
                return minLength;
            }

            public String getNote() {
                return note;
            }

            public String getRemarks() {
                return remarks;
            }

            public AmplifierType getType() {
                if (type == null) {
                    return AmplifierType.ALPHA;
                } else {
                    return type;
                }
            }

            public List<Library.Amplifiers.Amplifier.Values> getValues() {
                if (values == null) {
                    values = new ArrayList<>();
                }
                return this.values;
            }

            public boolean isDeprecated() {
                return deprecated;
            }

            public boolean isExtension() {
                return extension;
            }

            public void setDeprecated(boolean deprecated) {
                this.deprecated = deprecated;
            }

            public void setDescription(String value) {
                this.description = value;
            }

            public void setExtension(boolean extension) {
                this.extension = extension;
            }

            public void setID(String value) {
                this.id = value;
            }

            public void setLabel(String value) {
                this.label = value;
            }

            public void setLabelAlias(String value) {
                this.labelAlias = value;
            }

            public void setMaxLength(Integer maxLength) {
                this.maxLength = maxLength;
            }

            public void setMinLength(Integer minLength) {
                this.minLength = minLength;
            }

            public void setNote(String value) {
                this.note = value;
            }

            public void setRemarks(String value) {
                this.remarks = value;
            }

            public void setType(AmplifierType value) {
                this.type = value;
            }

        }

        @XmlElement(name = "Amplifier", required = true)
        protected List<Library.Amplifiers.Amplifier> amplifier;

        public List<Library.Amplifiers.Amplifier> getAmplifier() {
            if (amplifier == null) {
                amplifier = new ArrayList<>();
            }
            return this.amplifier;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "sectorOneModifiers",
        "sectorTwoModifiers",
    })
    public static class CommonModifiers {

        @XmlElement(name = "SectorOneModifiers")
        protected ModifiersType sectorOneModifiers;
        @XmlElement(name = "SectorTwoModifiers")
        protected ModifiersType sectorTwoModifiers;

        public ModifiersType getSectorOneModifiers() {
            return sectorOneModifiers;
        }

        public ModifiersType getSectorTwoModifiers() {
            return sectorTwoModifiers;
        }

        public void setSectorOneModifiers(ModifiersType value) {
            this.sectorOneModifiers = value;
        }

        public void setSectorTwoModifiers(ModifiersType value) {
            this.sectorTwoModifiers = value;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "context"
    })
    public static class Contexts {

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "contextCode"
        })
        public static class Context {

            @XmlElement(name = "ContextCode")
            @XmlSchemaType(name = "unsignedShort")
            protected int contextCode;
            @XmlAttribute(name = "Extension")
            protected boolean extension;
            @XmlAttribute(name = "ID", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "Label")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String label;
            @XmlAttribute(name = "LabelAlias")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String labelAlias;
            @XmlAttribute(name = "Description")
            protected String description;
            @XmlAttribute(name = "Remarks")
            protected String remarks;

            public int getContextCode() {
                return contextCode;
            }

            public String getDescription() {
                return description;
            }

            public String getID() {
                return id;
            }

            public String getLabel() {
                return label;
            }

            public String getLabelAlias() {
                if (labelAlias == null) {
                    return "";
                } else {
                    return labelAlias;
                }
            }

            public String getRemarks() {
                return remarks;
            }

            public boolean isExtension() {
                return extension;
            }

            public void setContextCode(int value) {
                this.contextCode = value;
            }

            public void setDescription(String value) {
                this.description = value;
            }

            public void setExtension(boolean value) {
                this.extension = value;
            }

            public void setID(String value) {
                this.id = value;
            }

            public void setLabel(String value) {
                this.label = value;
            }

            public void setLabelAlias(String value) {
                this.labelAlias = value;
            }

            public void setRemarks(String value) {
                this.remarks = value;
            }

        }

        @XmlElement(name = "Context", required = true)
        protected List<Library.Contexts.Context> context;

        public List<Library.Contexts.Context> getContext() {
            if (context == null) {
                context = new ArrayList<>();
            }
            return this.context;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dimension"
    })
    public static class Dimensions {

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "dimensionCode",
            "fields",
            "symbolSets"
        })
        public static class Dimension {

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "symbolSetRef"
            })
            public static class SymbolSets {

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "symbolSetCode"
                })
                public static class SymbolSetRef {

                    @XmlElement(name = "SymbolSetCode", required = true)
                    protected DoubleDigitType symbolSetCode;
                    @XmlAttribute(name = "Instance")
                    @XmlSchemaType(name = "anyURI")
                    protected String instance;
                    @XmlAttribute(name = "ID", required = true)
                    @XmlID
                    @XmlSchemaType(name = "IDREF")
                    protected String id;
                    @XmlAttribute(name = "Label")
                    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                    @XmlSchemaType(name = "token")
                    protected String label;
                    @XmlAttribute(name = "Description")
                    protected String description;
                    @XmlAttribute(name = "Remarks")
                    protected String remarks;
                    @XmlAttribute(name = "Base", required = false)
                    protected String baseSymbolSet;

                    public String getDescription() {
                        return description;
                    }

                    public String getID() {
                        return id;
                    }

                    public String getInstance() {
                        return instance;
                    }

                    public String getLabel() {
                        return label;
                    }

                    public String getRemarks() {
                        return remarks;
                    }

                    public DoubleDigitType getSymbolSetCode() {
                        return symbolSetCode;
                    }

                    public void setDescription(String value) {
                        this.description = value;
                    }

                    public void setID(String value) {
                        this.id = value;
                    }

                    public void setInstance(String value) {
                        this.instance = value;
                    }

                    public void setLabel(String value) {
                        this.label = value;
                    }

                    public void setRemarks(String value) {
                        this.remarks = value;
                    }

                    public void setSymbolSetCode(DoubleDigitType value) {
                        this.symbolSetCode = value;
                    }

                    public String getBaseSymbolSet() {
                        return baseSymbolSet;
                    }

                    public void setBaseSymbolSet(String baseSymbolSet) {
                        this.baseSymbolSet = baseSymbolSet;
                    }

                }

                @XmlElement(name = "SymbolSetRef")
                protected List<Library.Dimensions.Dimension.SymbolSets.SymbolSetRef> symbolSetRef;

                public List<Library.Dimensions.Dimension.SymbolSets.SymbolSetRef> getSymbolSetRef() {
                    if (symbolSetRef == null) {
                        symbolSetRef = new ArrayList<>();
                    }
                    return this.symbolSetRef;
                }

            }
            @XmlElement(name = "DimensionCode", required = true)
            protected DoubleDigitType dimensionCode;
            @XmlElement(name = "Fields", required = true)
            protected FieldListType fields;
            @XmlElement(name = "SymbolSets", required = true)
            protected Library.Dimensions.Dimension.SymbolSets symbolSets;
            @XmlAttribute(name = "Geometry", required = true)
            protected GeometryType geometry;
            @XmlAttribute(name = "ID", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "Label")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String label;
            @XmlAttribute(name = "LabelAlias")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String labelAlias;
            @XmlAttribute(name = "Description")
            protected String description;

            @XmlAttribute(name = "Remarks")
            protected String remarks;

            public String getDescription() {
                return description;
            }

            public DoubleDigitType getDimensionCode() {
                return dimensionCode;
            }

            public FieldListType getFields() {
                return fields;
            }

            public GeometryType getGeometry() {
                return geometry;
            }

            public String getID() {
                return id;
            }

            public String getLabel() {
                return label;
            }

            public String getLabelAlias() {
                if (labelAlias == null) {
                    return "";
                } else {
                    return labelAlias;
                }
            }

            public String getRemarks() {
                return remarks;
            }

            public Library.Dimensions.Dimension.SymbolSets getSymbolSets() {
                return symbolSets;
            }

            public void setDescription(String value) {
                this.description = value;
            }

            public void setDimensionCode(DoubleDigitType value) {
                this.dimensionCode = value;
            }

            public void setFields(FieldListType value) {
                this.fields = value;
            }

            public void setGeometry(GeometryType value) {
                this.geometry = value;
            }

            public void setID(String value) {
                this.id = value;
            }

            public void setLabel(String value) {
                this.label = value;
            }

            public void setLabelAlias(String value) {
                this.labelAlias = value;
            }

            public void setRemarks(String value) {
                this.remarks = value;
            }

            public void setSymbolSets(Library.Dimensions.Dimension.SymbolSets value) {
                this.symbolSets = value;
            }

        }

        @XmlElement(name = "Dimension", required = true)
        protected List<Library.Dimensions.Dimension> dimension;

        public List<Library.Dimensions.Dimension> getDimension() {
            if (dimension == null) {
                dimension = new ArrayList<>();
            }
            return this.dimension;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "drawRule"
    })
    public static class DrawRules {

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DrawRule {

            @XmlAttribute(name = "ID", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "GeometryID", required = true)
            @XmlIDREF
            @XmlSchemaType(name = "IDREF")
            protected Object geometryID;
            @XmlAttribute(name = "AnchorPoints")
            protected String anchorPoints;
            @XmlAttribute(name = "SizeShape")
            protected String sizeShape;
            @XmlAttribute(name = "Orientation")
            protected String orientation;
            @XmlAttribute(name = "Ornamentation")
            protected String ornamentation;

            public String getAnchorPoints() {
                if (anchorPoints == null) {
                    return "Not Applicable";
                } else {
                    return anchorPoints;
                }
            }

            public Object getGeometryID() {
                return geometryID;
            }

            public String getID() {
                return id;
            }

            public String getOrientation() {
                if (orientation == null) {
                    return "Not Applicable";
                } else {
                    return orientation;
                }
            }

            public String getOrnamentation() {
                if (ornamentation == null) {
                    return "Not Applicable";
                } else {
                    return ornamentation;
                }
            }

            public String getSizeShape() {
                if (sizeShape == null) {
                    return "Not Applicable";
                } else {
                    return sizeShape;
                }
            }

            public void setAnchorPoints(String value) {
                this.anchorPoints = value;
            }

            public void setGeometryID(Object value) {
                this.geometryID = value;
            }

            public void setID(String value) {
                this.id = value;
            }

            public void setOrientation(String value) {
                this.orientation = value;
            }

            public void setOrnamentation(String value) {
                this.ornamentation = value;
            }

            public void setSizeShape(String value) {
                this.sizeShape = value;
            }

        }

        @XmlElement(name = "DrawRule", required = true)
        protected List<Library.DrawRules.DrawRule> drawRule;

        public List<Library.DrawRules.DrawRule> getDrawRule() {
            if (drawRule == null) {
                drawRule = new ArrayList<>();
            }
            return this.drawRule;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "geometry"
    })
    public static class Geometries {

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Geometry {

            @XmlAttribute(name = "ID", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "Label")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String label;
            @XmlAttribute(name = "LabelAlias")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String labelAlias;
            @XmlAttribute(name = "Description")
            protected String description;
            @XmlAttribute(name = "Remarks")
            protected String remarks;

            public String getDescription() {
                return description;
            }

            public String getID() {
                return id;
            }

            public String getLabel() {
                return label;
            }

            public String getLabelAlias() {
                if (labelAlias == null) {
                    return "";
                } else {
                    return labelAlias;
                }
            }

            public String getRemarks() {
                return remarks;
            }

            public void setDescription(String value) {
                this.description = value;
            }

            public void setID(String value) {
                this.id = value;
            }

            public void setLabel(String value) {
                this.label = value;
            }

            public void setLabelAlias(String value) {
                this.labelAlias = value;
            }

            public void setRemarks(String value) {
                this.remarks = value;
            }

        }

        @XmlElement(name = "Geometry", required = true)
        protected List<Library.Geometries.Geometry> geometry;

        public List<Library.Geometries.Geometry> getGeometry() {
            if (geometry == null) {
                geometry = new ArrayList<>();
            }
            return this.geometry;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "hqtfDummy"
    })
    public static class HQTFDummies {

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "hqtfDummyCode",
            "graphics"
        })
        public static class HQTFDummy {

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "graphic"
            })
            public static class Graphics {

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Graphic {

                    @XmlAttribute(name = "StandardIdentityGroup", required = true)
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREF")
                    protected Object standardIdentityGroup;
                    @XmlAttribute(name = "DimensionID", required = true)
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREF")
                    protected Object dimensionID;
                    @XmlAttribute(name = "Graphic", required = true)
                    @XmlSchemaType(name = "anyURI")
                    protected String graphic;

                    public Object getDimensionID() {
                        return dimensionID;
                    }

                    public String getGraphic() {
                        return graphic;
                    }

                    public Object getStandardIdentityGroup() {
                        return standardIdentityGroup;
                    }

                    public void setDimensionID(Object value) {
                        this.dimensionID = value;
                    }

                    public void setGraphic(String value) {
                        this.graphic = value;
                    }

                    public void setStandardIdentityGroup(Object value) {
                        this.standardIdentityGroup = value;
                    }

                }

                @XmlElement(name = "Graphic", required = true)
                protected List<Library.HQTFDummies.HQTFDummy.Graphics.Graphic> graphic;

                public List<Library.HQTFDummies.HQTFDummy.Graphics.Graphic> getGraphic() {
                    if (graphic == null) {
                        graphic = new ArrayList<>();
                    }
                    return this.graphic;
                }

            }
            @XmlElement(name = "HQTFDummyCode")
            @XmlSchemaType(name = "unsignedShort")
            protected int hqtfDummyCode;
            @XmlElement(name = "Graphics")
            protected Library.HQTFDummies.HQTFDummy.Graphics graphics;
            @XmlAttribute(name = "Extension")
            protected boolean extension;
            @XmlAttribute(name = "Name", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String name;
            @XmlAttribute(name = "Label")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String label;
            @XmlAttribute(name = "LabelAlias")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String labelAlias;
            @XmlAttribute(name = "Description")
            protected String description;

            @XmlAttribute(name = "Remarks")
            protected String remarks;

            public String getDescription() {
                return description;
            }

            public Library.HQTFDummies.HQTFDummy.Graphics getGraphics() {
                return graphics;
            }

            public int getHQTFDummyCode() {
                return hqtfDummyCode;
            }

            public String getLabel() {
                return label;
            }

            public String getLabelAlias() {
                if (labelAlias == null) {
                    return "";
                } else {
                    return labelAlias;
                }
            }

            public String getName() {
                return name;
            }

            public String getRemarks() {
                return remarks;
            }

            public boolean isExtension() {
                return extension;
            }

            public void setDescription(String value) {
                this.description = value;
            }

            public void setExtension(boolean value) {
                this.extension = value;
            }

            public void setGraphics(Library.HQTFDummies.HQTFDummy.Graphics value) {
                this.graphics = value;
            }

            public void setHQTFDummyCode(int value) {
                this.hqtfDummyCode = value;
            }

            public void setLabel(String value) {
                this.label = value;
            }

            public void setLabelAlias(String value) {
                this.labelAlias = value;
            }

            public void setName(String value) {
                this.name = value;
            }

            public void setRemarks(String value) {
                this.remarks = value;
            }

        }

        @XmlElement(name = "HQTFDummy", required = true)
        protected List<Library.HQTFDummies.HQTFDummy> hqtfDummy;

        public List<Library.HQTFDummies.HQTFDummy> getHQTFDummy() {
            if (hqtfDummy == null) {
                hqtfDummy = new ArrayList<>();
            }
            return this.hqtfDummy;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "labelRule"
    })
    public static class LabelRules {

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "expression",
            "offsetAlongLine"
        })
        public static class LabelRule {

            @XmlElement(name = "Expression", required = true)
            protected String expression;
            @XmlElement(name = "OffsetAlongLine")
            @XmlSchemaType(name = "token")
            protected OffsetAlongLinePlacementType offsetAlongLine;
            @XmlAttribute(name = "ID", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "Type", required = true)
            protected LabelRuleType type;
            @XmlAttribute(name = "PointLabelMethod")
            protected PointLabelMethodType pointLabelMethod;
            @XmlAttribute(name = "LineLabelMethod")
            protected LineLabelMethodType lineLabelMethod;
            @XmlAttribute(name = "AreaLabelMethod")
            protected AreaLabelMethodType areaLabelMethod;
            @XmlAttribute(name = "MultiPartOption")
            protected MultiPartOptionType multiPartOption;
            @XmlAttribute(name = "ConstrainOffset")
            protected ConstrainOffsetType constrainOffset;
            @XmlAttribute(name = "ExternalZone")
            protected LabelExternalZoneType externalZone;
            @XmlAttribute(name = "InternalZone")
            protected LabelInternalZoneType internalZone;
            @XmlAttribute(name = "Offset")
            protected Double offset;
            @XmlAttribute(name = "OffsetUnit")
            protected LabelUnitType offsetUnit;

            public AreaLabelMethodType getAreaLabelMethod() {
                if (areaLabelMethod == null) {
                    return AreaLabelMethodType.NA;
                } else {
                    return areaLabelMethod;
                }
            }

            public ConstrainOffsetType getConstrainOffset() {
                if (constrainOffset == null) {
                    return ConstrainOffsetType.NO_CONSTRAINT;
                } else {
                    return constrainOffset;
                }
            }

            public String getExpression() {
                return expression;
            }

            public LabelExternalZoneType getExternalZone() {
                if (externalZone == null) {
                    return LabelExternalZoneType.NA;
                } else {
                    return externalZone;
                }
            }

            public String getID() {
                return id;
            }

            public LabelInternalZoneType getInternalZone() {
                if (internalZone == null) {
                    return LabelInternalZoneType.NA;
                } else {
                    return internalZone;
                }
            }

            public LineLabelMethodType getLineLabelMethod() {
                if (lineLabelMethod == null) {
                    return LineLabelMethodType.NA;
                } else {
                    return lineLabelMethod;
                }
            }

            public MultiPartOptionType getMultiPartOption() {
                if (multiPartOption == null) {
                    return MultiPartOptionType.ONE_LABEL_PER_FEATURE;
                } else {
                    return multiPartOption;
                }
            }

            public double getOffset() {
                if (offset == null) {
                    return 0.0D;
                } else {
                    return offset;
                }
            }

            public OffsetAlongLinePlacementType getOffsetAlongLine() {
                return offsetAlongLine;
            }

            public LabelUnitType getOffsetUnit() {
                if (offsetUnit == null) {
                    return LabelUnitType.MAP;
                } else {
                    return offsetUnit;
                }
            }

            public PointLabelMethodType getPointLabelMethod() {
                if (pointLabelMethod == null) {
                    return PointLabelMethodType.NA;
                } else {
                    return pointLabelMethod;
                }
            }

            public LabelRuleType getType() {
                return type;
            }

            public void setAreaLabelMethod(AreaLabelMethodType value) {
                this.areaLabelMethod = value;
            }

            public void setConstrainOffset(ConstrainOffsetType value) {
                this.constrainOffset = value;
            }

            public void setExpression(String value) {
                this.expression = value;
            }

            public void setExternalZone(LabelExternalZoneType value) {
                this.externalZone = value;
            }

            public void setID(String value) {
                this.id = value;
            }

            public void setInternalZone(LabelInternalZoneType value) {
                this.internalZone = value;
            }

            public void setLineLabelMethod(LineLabelMethodType value) {
                this.lineLabelMethod = value;
            }

            public void setMultiPartOption(MultiPartOptionType value) {
                this.multiPartOption = value;
            }

            public void setOffset(Double value) {
                this.offset = value;
            }

            public void setOffsetAlongLine(OffsetAlongLinePlacementType value) {
                this.offsetAlongLine = value;
            }

            public void setOffsetUnit(LabelUnitType value) {
                this.offsetUnit = value;
            }

            public void setPointLabelMethod(PointLabelMethodType value) {
                this.pointLabelMethod = value;
            }

            public void setType(LabelRuleType value) {
                this.type = value;
            }

        }

        @XmlElement(name = "LabelRule", required = true)
        protected List<Library.LabelRules.LabelRule> labelRule;

        public List<Library.LabelRules.LabelRule> getLabelRule() {
            if (labelRule == null) {
                labelRule = new ArrayList<>();
            }
            return this.labelRule;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "standardIdentity"
    })
    public static class StandardIdentities {

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "standardIdentityCode"
        })
        public static class StandardIdentity {

            @XmlElement(name = "StandardIdentityCode")
            @XmlSchemaType(name = "unsignedShort")
            protected int standardIdentityCode;
            @XmlAttribute(name = "Extension")
            protected boolean extension;
            @XmlAttribute(name = "ID", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "Label")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String label;
            @XmlAttribute(name = "LabelAlias")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String labelAlias;
            @XmlAttribute(name = "Description")
            protected String description;
            @XmlAttribute(name = "Remarks")
            protected String remarks;

            public String getDescription() {
                return description;
            }

            public String getID() {
                return id;
            }

            public String getLabel() {
                return label;
            }

            public String getLabelAlias() {
                if (labelAlias == null) {
                    return "";
                } else {
                    return labelAlias;
                }
            }

            public String getRemarks() {
                return remarks;
            }

            public int getStandardIdentityCode() {
                return standardIdentityCode;
            }

            public boolean isExtension() {
                return extension;
            }

            public void setDescription(String value) {
                this.description = value;
            }

            public void setExtension(boolean value) {
                this.extension = value;
            }

            public void setID(String value) {
                this.id = value;
            }

            public void setLabel(String value) {
                this.label = value;
            }

            public void setLabelAlias(String value) {
                this.labelAlias = value;
            }

            public void setRemarks(String value) {
                this.remarks = value;
            }

            public void setStandardIdentityCode(int value) {
                this.standardIdentityCode = value;
            }

        }

        @XmlElement(name = "StandardIdentity", required = true)
        protected List<Library.StandardIdentities.StandardIdentity> standardIdentity;

        public List<Library.StandardIdentities.StandardIdentity> getStandardIdentity() {
            if (standardIdentity == null) {
                standardIdentity = new ArrayList<>();
            }
            return this.standardIdentity;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "standardIdentityGroup"
    })
    public static class StandardIdentityGroups {

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "standardIdentityGroupCode"
        })
        public static class StandardIdentityGroup {

            @XmlElement(name = "StandardIdentityGroupCode")
            @XmlSchemaType(name = "unsignedShort")
            protected int standardIdentityGroupCode;
            @XmlAttribute(name = "StandardIdentityIDs", required = true)
            @XmlIDREF
            @XmlSchemaType(name = "IDREFS")
            protected List<Object> standardIdentityIDs;
            @XmlAttribute(name = "GraphicSuffix", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String graphicSuffix;
            @XmlAttribute(name = "ID", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlID
            @XmlSchemaType(name = "ID")
            protected String id;
            @XmlAttribute(name = "Label")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String label;
            @XmlAttribute(name = "LabelAlias")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String labelAlias;
            @XmlAttribute(name = "Description")
            protected String description;
            @XmlAttribute(name = "Remarks")
            protected String remarks;

            public String getDescription() {
                return description;
            }

            public String getGraphicSuffix() {
                return graphicSuffix;
            }

            public String getID() {
                return id;
            }

            public String getLabel() {
                return label;
            }

            public String getLabelAlias() {
                if (labelAlias == null) {
                    return "";
                } else {
                    return labelAlias;
                }
            }

            public String getRemarks() {
                return remarks;
            }

            public int getStandardIdentityGroupCode() {
                return standardIdentityGroupCode;
            }

            public List<Object> getStandardIdentityIDs() {
                if (standardIdentityIDs == null) {
                    standardIdentityIDs = new ArrayList<>();
                }
                return this.standardIdentityIDs;
            }

            public void setDescription(String value) {
                this.description = value;
            }

            public void setGraphicSuffix(String value) {
                this.graphicSuffix = value;
            }

            public void setID(String value) {
                this.id = value;
            }

            public void setLabel(String value) {
                this.label = value;
            }

            public void setLabelAlias(String value) {
                this.labelAlias = value;
            }

            public void setRemarks(String value) {
                this.remarks = value;
            }

            public void setStandardIdentityGroupCode(int value) {
                this.standardIdentityGroupCode = value;
            }

        }

        @XmlElement(name = "StandardIdentityGroup", required = true)
        protected List<Library.StandardIdentityGroups.StandardIdentityGroup> standardIdentityGroup;

        public List<Library.StandardIdentityGroups.StandardIdentityGroup> getStandardIdentityGroup() {
            if (standardIdentityGroup == null) {
                standardIdentityGroup = new ArrayList<>();
            }
            return this.standardIdentityGroup;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "status"
    })
    public static class Statuses {

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "statusCode",
            "graphics"
        })
        public static class Status {

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "graphic"
            })
            public static class Graphics {

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Graphic {

                    @XmlAttribute(name = "StandardIdentityGroup", required = true)
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREF")
                    protected Object standardIdentityGroup;
                    @XmlAttribute(name = "DimensionID", required = true)
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREF")
                    protected Object dimensionID;
                    @XmlAttribute(name = "Graphic", required = true)
                    @XmlSchemaType(name = "anyURI")
                    protected String graphic;

                    public Object getDimensionID() {
                        return dimensionID;
                    }

                    public String getGraphic() {
                        return graphic;
                    }

                    public Object getStandardIdentityGroup() {
                        return standardIdentityGroup;
                    }

                    public void setDimensionID(Object value) {
                        this.dimensionID = value;
                    }

                    public void setGraphic(String value) {
                        this.graphic = value;
                    }

                    public void setStandardIdentityGroup(Object value) {
                        this.standardIdentityGroup = value;
                    }

                }

                @XmlElement(name = "Graphic", required = true)
                protected List<Library.Statuses.Status.Graphics.Graphic> graphic;

                public List<Library.Statuses.Status.Graphics.Graphic> getGraphic() {
                    if (graphic == null) {
                        graphic = new ArrayList<>();
                    }
                    return this.graphic;
                }

            }
            @XmlElement(name = "StatusCode")
            @XmlSchemaType(name = "unsignedShort")
            protected int statusCode;
            @XmlElement(name = "Graphics")
            protected Library.Statuses.Status.Graphics graphics;
            @XmlAttribute(name = "Extension")
            protected boolean extension;
            @XmlAttribute(name = "Name", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String name;
            @XmlAttribute(name = "Label")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String label;
            @XmlAttribute(name = "LabelAlias")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String labelAlias;
            @XmlAttribute(name = "Description")
            protected String description;
            @XmlAttribute(name = "Remarks")
            protected String remarks;

            @XmlAttribute(name = "Graphic")
            @XmlSchemaType(name = "anyURI")
            protected String graphic;

            public String getDescription() {
                return description;
            }

            public String getGraphic() {
                return graphic;
            }

            public Library.Statuses.Status.Graphics getGraphics() {
                return graphics;
            }

            public String getLabel() {
                return label;
            }

            public String getLabelAlias() {
                if (labelAlias == null) {
                    return "";
                } else {
                    return labelAlias;
                }
            }

            public String getName() {
                return name;
            }

            public String getRemarks() {
                return remarks;
            }

            public int getStatusCode() {
                return statusCode;
            }

            public boolean isExtension() {
                return extension;
            }

            public void setDescription(String value) {
                this.description = value;
            }

            public void setExtension(boolean value) {
                this.extension = value;
            }

            public void setGraphic(String value) {
                this.graphic = value;
            }

            public void setGraphics(Library.Statuses.Status.Graphics value) {
                this.graphics = value;
            }

            public void setLabel(String value) {
                this.label = value;
            }

            public void setLabelAlias(String value) {
                this.labelAlias = value;
            }

            public void setName(String value) {
                this.name = value;
            }

            public void setRemarks(String value) {
                this.remarks = value;
            }

            public void setStatusCode(int value) {
                this.statusCode = value;
            }

        }

        @XmlElement(name = "Status", required = true)
        protected List<Library.Statuses.Status> status;

        public List<Library.Statuses.Status> getStatus() {
            if (status == null) {
                status = new ArrayList<>();
            }
            return this.status;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "version"
    })
    public static class Versions {

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "versionCode"
        })
        public static class Version {

            @XmlElement(name = "VersionCode", required = true)
            protected DoubleDigitType versionCode;
            @XmlAttribute(name = "Name", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String name;
            @XmlAttribute(name = "Label")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String label;
            @XmlAttribute(name = "LabelAlias")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            @XmlSchemaType(name = "token")
            protected String labelAlias;
            @XmlAttribute(name = "Description")
            protected String description;
            @XmlAttribute(name = "Remarks")
            protected String remarks;

            public String getDescription() {
                return description;
            }

            public String getLabel() {
                return label;
            }

            public String getLabelAlias() {
                if (labelAlias == null) {
                    return "";
                } else {
                    return labelAlias;
                }
            }

            public String getName() {
                return name;
            }

            public String getRemarks() {
                return remarks;
            }

            public DoubleDigitType getVersionCode() {
                return versionCode;
            }

            public void setDescription(String value) {
                this.description = value;
            }

            public void setLabel(String value) {
                this.label = value;
            }

            public void setLabelAlias(String value) {
                this.labelAlias = value;
            }

            public void setName(String value) {
                this.name = value;
            }

            public void setRemarks(String value) {
                this.remarks = value;
            }

            public void setVersionCode(DoubleDigitType value) {
                this.versionCode = value;
            }

        }

        @XmlElement(name = "Version", required = true)
        protected List<Library.Versions.Version> version;

        public List<Library.Versions.Version> getVersion() {
            if (version == null) {
                version = new ArrayList<>();
            }
            return this.version;
        }

    }
    @XmlElement(name = "Geometries", required = true)
    protected Library.Geometries geometries;
    @XmlElement(name = "DrawRules", required = true)
    protected Library.DrawRules drawRules;
    @XmlElement(name = "LabelRules", required = true)
    protected Library.LabelRules labelRules;
    @XmlElement(name = "Amplifiers", required = true)
    protected Library.Amplifiers amplifiers;
    @XmlElement(name = "CommonModifiers", required = true)
    protected Library.CommonModifiers commonModifiers;

    @XmlElement(name = "Versions", required = true)
    protected Library.Versions versions;

    @XmlElement(name = "Contexts", required = true)
    protected Library.Contexts contexts;

    @XmlElement(name = "StandardIdentities", required = true)
    protected Library.StandardIdentities standardIdentities;

    @XmlElement(name = "StandardIdentityGroups", required = true)
    protected Library.StandardIdentityGroups standardIdentityGroups;

    @XmlElement(name = "Dimensions", required = true)
    protected Library.Dimensions dimensions;

    @XmlElement(name = "Statuses", required = true)
    protected Library.Statuses statuses;

    @XmlElement(name = "HQTFDummies", required = true)
    protected Library.HQTFDummies hqtfDummies;

    @XmlElement(name = "AmplifierGroups", required = true)
    protected Library.AmplifierGroups amplifierGroups;

    @XmlAttribute(name = "Name", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String name;

    @XmlAttribute(name = "Label")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String label;

    @XmlAttribute(name = "LabelAlias")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String labelAlias;

    @XmlAttribute(name = "Description")
    protected String description;

    @XmlAttribute(name = "Remarks")
    protected String remarks;

    public Library.AmplifierGroups getAmplifierGroups() {
        return amplifierGroups;
    }

    public Library.Amplifiers getAmplifiers() {
        return amplifiers;
    }

    public Library.CommonModifiers getCommonModifiers() {
        return commonModifiers;
    }

    public Library.Contexts getContexts() {
        return contexts;
    }

    public String getDescription() {
        return description;
    }

    public Library.Dimensions getDimensions() {
        return dimensions;
    }

    public Library.DrawRules getDrawRules() {
        return drawRules;
    }

    public Library.Geometries getGeometries() {
        return geometries;
    }

    public Library.HQTFDummies getHQTFDummies() {
        return hqtfDummies;
    }

    public String getLabel() {
        return label;
    }

    public String getLabelAlias() {
        if (labelAlias == null) {
            return "";
        } else {
            return labelAlias;
        }
    }

    public Library.LabelRules getLabelRules() {
        return labelRules;
    }

    public String getName() {
        return name;
    }

    public String getRemarks() {
        return remarks;
    }

    public Library.StandardIdentities getStandardIdentities() {
        return standardIdentities;
    }

    public Library.StandardIdentityGroups getStandardIdentityGroups() {
        return standardIdentityGroups;
    }

    public Library.Statuses getStatuses() {
        return statuses;
    }

    public Library.Versions getVersions() {
        return versions;
    }

    public void setAmplifierGroups(Library.AmplifierGroups value) {
        this.amplifierGroups = value;
    }

    public void setAmplifiers(Library.Amplifiers value) {
        this.amplifiers = value;
    }

    public void setCommonModifiers(Library.CommonModifiers commonModifiers) {
        this.commonModifiers = commonModifiers;
    }

    public void setContexts(Library.Contexts value) {
        this.contexts = value;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public void setDimensions(Library.Dimensions value) {
        this.dimensions = value;
    }

    public void setDrawRules(Library.DrawRules value) {
        this.drawRules = value;
    }

    public void setGeometries(Library.Geometries value) {
        this.geometries = value;
    }

    public void setHQTFDummies(Library.HQTFDummies value) {
        this.hqtfDummies = value;
    }

    public void setLabel(String value) {
        this.label = value;
    }

    public void setLabelAlias(String value) {
        this.labelAlias = value;
    }

    public void setLabelRules(Library.LabelRules value) {
        this.labelRules = value;
    }

    public void setName(String value) {
        this.name = value;
    }

    public void setRemarks(String value) {
        this.remarks = value;
    }

    public void setStandardIdentities(Library.StandardIdentities value) {
        this.standardIdentities = value;
    }

    public void setStandardIdentityGroups(Library.StandardIdentityGroups value) {
        this.standardIdentityGroups = value;
    }

    public void setStatuses(Library.Statuses value) {
        this.statuses = value;
    }

    public void setVersions(Library.Versions value) {
        this.versions = value;
    }

}
