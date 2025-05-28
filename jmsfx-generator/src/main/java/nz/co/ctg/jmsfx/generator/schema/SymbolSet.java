package nz.co.ctg.jmsfx.generator.schema;

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
    "symbolSetCode",
    "amplifiers",
    "entities",
    "sectorOneModifiers",
    "sectorTwoModifiers"
})
@XmlRootElement(name = "SymbolSet")
public class SymbolSet {

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "amplifierRef"
    })
    public static class Amplifiers {

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AmplifierRef {

            @XmlAttribute(name = "ID", required = true)
            @XmlID
            @XmlSchemaType(name = "IDREF")
            protected String id;
            @XmlAttribute(name = "Type", required = true)
            protected GuideType type;
            @XmlAttribute(name = "Points", required = false)
            protected List<Double> points;

            public String getID() {
                return id;
            }

            public List<Double> getPoints() {
                return points;
            }

            public GuideType getType() {
                return type;
            }

            public void setID(String value) {
                this.id = value;
            }

            public void setPoints(List<Double> points) {
                this.points = points;
            }

            public void setType(GuideType type) {
                this.type = type;
            }

        }

        @XmlElement(name = "AmplifierRef")
        protected List<SymbolSet.Amplifiers.AmplifierRef> amplifierRef;

        public List<SymbolSet.Amplifiers.AmplifierRef> getAmplifierRef() {
            if (amplifierRef == null) {
                amplifierRef = new ArrayList<>();
            }
            return this.amplifierRef;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entity"
    })
    public static class Entities {

        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "entityCode",
            "tags",
            "entityTypes"
        })
        public static class Entity {

            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "entityType"
            })
            public static class EntityTypes {

                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "entityTypeCode",
                    "tags",
                    "entitySubTypes"
                })
                public static class EntityType {

                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "entitySubType"
                    })
                    public static class EntitySubTypes {

                        @XmlElement(name = "EntitySubType", required = true)
                        protected List<EntitySubTypeType> entitySubType;

                        public List<EntitySubTypeType> getEntitySubType() {
                            if (entitySubType == null) {
                                entitySubType = new ArrayList<>();
                            }
                            return this.entitySubType;
                        }

                    }
                    @XmlElement(name = "EntityTypeCode", required = true)
                    protected DoubleDigitType entityTypeCode;
                    @XmlElement(name = "Tags")
                    protected Tags tags;
                    @XmlElement(name = "EntitySubTypes")
                    protected SymbolSet.Entities.Entity.EntityTypes.EntityType.EntitySubTypes entitySubTypes;
                    @XmlAttribute(name = "GeometryType")
                    protected GeometryType geometryType;
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
                    @XmlAttribute(name = "Graphic")
                    @XmlSchemaType(name = "anyURI")
                    protected String graphic;
                    @XmlAttribute(name = "AlternativeGraphic")
                    @XmlSchemaType(name = "anyURI")
                    protected String alternativeGraphic;
                    @XmlAttribute(name = "CircleGraphic")
                    @XmlSchemaType(name = "anyURI")
                    protected String circleGraphic;
                    @XmlAttribute(name = "CloverGraphic")
                    @XmlSchemaType(name = "anyURI")
                    protected String cloverGraphic;
                    @XmlAttribute(name = "CurveGraphic")
                    @XmlSchemaType(name = "anyURI")
                    protected String curveGraphic;
                    @XmlAttribute(name = "DiamondGraphic")
                    @XmlSchemaType(name = "anyURI")
                    protected String diamondGraphic;
                    @XmlAttribute(name = "RectangleGraphic")
                    @XmlSchemaType(name = "anyURI")
                    protected String rectangleGraphic;
                    @XmlAttribute(name = "SquareGraphic")
                    @XmlSchemaType(name = "anyURI")
                    protected String squareGraphic;
                    @XmlAttribute(name = "DrawRuleID")
                    @XmlIDREF
                    @XmlSchemaType(name = "IDREF")
                    protected Object drawRuleID;
                    @XmlAttribute(name = "DrawNote")
                    protected String drawNote;
                    @XmlAttribute(name = "Standard")
                    protected StandardType standard;
                    @XmlAttribute(name = "Icon")
                    protected IconType icon;
                    @XmlAttribute(name = "IsCivilian")
                    protected Boolean isCivilian;

                    @XmlAttribute(name = "IsAlignable")
                    protected Boolean isAlignable;

                    public String getAlternativeGraphic() {
                        if (alternativeGraphic == null) {
                            return "";
                        } else {
                            return alternativeGraphic;
                        }
                    }

                    public String getCircleGraphic() {
                        if (circleGraphic == null) {
                            return "";
                        } else {
                            return circleGraphic;
                        }
                    }

                    public String getCloverGraphic() {
                        if (cloverGraphic == null) {
                            return "";
                        } else {
                            return cloverGraphic;
                        }
                    }

                    public String getCurveGraphic() {
                        if (curveGraphic == null) {
                            return "";
                        } else {
                            return curveGraphic;
                        }
                    }

                    public String getDescription() {
                        if (description == null) {
                            return "";
                        } else {
                            return description;
                        }
                    }

                    public String getDiamondGraphic() {
                        if (diamondGraphic == null) {
                            return "";
                        } else {
                            return diamondGraphic;
                        }
                    }

                    public String getDrawNote() {
                        if (drawNote == null) {
                            return "Not Applicable";
                        } else {
                            return drawNote;
                        }
                    }

                    public Object getDrawRuleID() {
                        return drawRuleID;
                    }

                    public SymbolSet.Entities.Entity.EntityTypes.EntityType.EntitySubTypes getEntitySubTypes() {
                        return entitySubTypes;
                    }

                    public DoubleDigitType getEntityTypeCode() {
                        return entityTypeCode;
                    }

                    public GeometryType getGeometryType() {
                        if (geometryType == null) {
                            return GeometryType.POINT;
                        } else {
                            return geometryType;
                        }
                    }

                    public String getGraphic() {
                        if (graphic == null) {
                            return "";
                        } else {
                            return graphic;
                        }
                    }

                    public IconType getIcon() {
                        if (icon == null) {
                            return IconType.MAIN;
                        } else {
                            return icon;
                        }
                    }

                    public String getID() {
                        return id;
                    }

                    public String getLabel() {
                        if (label == null) {
                            return "";
                        } else {
                            return label;
                        }
                    }

                    public String getLabelAlias() {
                        if (labelAlias == null) {
                            return "";
                        } else {
                            return labelAlias;
                        }
                    }

                    public String getRectangleGraphic() {
                        if (rectangleGraphic == null) {
                            return "";
                        } else {
                            return rectangleGraphic;
                        }
                    }

                    public String getRemarks() {
                        if (remarks == null) {
                            return "";
                        } else {
                            return remarks;
                        }
                    }

                    public String getSquareGraphic() {
                        if (squareGraphic == null) {
                            return "";
                        } else {
                            return squareGraphic;
                        }
                    }

                    public StandardType getStandard() {
                        if (standard == null) {
                            return StandardType.ALL;
                        } else {
                            return standard;
                        }
                    }

                    public Tags getTags() {
                        return tags;
                    }

                    public boolean isIsAlignable() {
                        if (isAlignable == null) {
                            return false;
                        } else {
                            return isAlignable;
                        }
                    }

                    public boolean isIsCivilian() {
                        if (isCivilian == null) {
                            return false;
                        } else {
                            return isCivilian;
                        }
                    }

                    public void setAlternativeGraphic(String value) {
                        this.alternativeGraphic = value;
                    }

                    public void setCircleGraphic(String value) {
                        this.circleGraphic = value;
                    }

                    public void setCloverGraphic(String value) {
                        this.cloverGraphic = value;
                    }

                    public void setCurveGraphic(String value) {
                        this.curveGraphic = value;
                    }

                    public void setDescription(String value) {
                        this.description = value;
                    }

                    public void setDiamondGraphic(String value) {
                        this.diamondGraphic = value;
                    }

                    public void setDrawNote(String value) {
                        this.drawNote = value;
                    }

                    public void setDrawRuleID(Object value) {
                        this.drawRuleID = value;
                    }

                    public void setEntitySubTypes(SymbolSet.Entities.Entity.EntityTypes.EntityType.EntitySubTypes value) {
                        this.entitySubTypes = value;
                    }

                    public void setEntityTypeCode(DoubleDigitType value) {
                        this.entityTypeCode = value;
                    }

                    public void setGeometryType(GeometryType value) {
                        this.geometryType = value;
                    }

                    public void setGraphic(String value) {
                        this.graphic = value;
                    }

                    public void setIcon(IconType value) {
                        this.icon = value;
                    }

                    public void setID(String value) {
                        this.id = value;
                    }

                    public void setIsAlignable(Boolean value) {
                        this.isAlignable = value;
                    }

                    public void setIsCivilian(Boolean value) {
                        this.isCivilian = value;
                    }

                    public void setLabel(String value) {
                        this.label = value;
                    }

                    public void setLabelAlias(String value) {
                        this.labelAlias = value;
                    }

                    public void setRectangleGraphic(String value) {
                        this.rectangleGraphic = value;
                    }

                    public void setRemarks(String value) {
                        this.remarks = value;
                    }

                    public void setSquareGraphic(String value) {
                        this.squareGraphic = value;
                    }

                    public void setStandard(StandardType value) {
                        this.standard = value;
                    }

                    public void setTags(Tags value) {
                        this.tags = value;
                    }

                }

                @XmlElement(name = "EntityType", required = true)
                protected List<SymbolSet.Entities.Entity.EntityTypes.EntityType> entityType;

                public List<SymbolSet.Entities.Entity.EntityTypes.EntityType> getEntityType() {
                    if (entityType == null) {
                        entityType = new ArrayList<>();
                    }
                    return this.entityType;
                }

            }
            @XmlElement(name = "EntityCode", required = true)
            protected DoubleDigitType entityCode;
            @XmlElement(name = "Tags")
            protected Tags tags;
            @XmlElement(name = "EntityTypes")
            protected SymbolSet.Entities.Entity.EntityTypes entityTypes;
            @XmlAttribute(name = "GeometryType")
            protected GeometryType geometryType;
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
            @XmlAttribute(name = "Graphic")
            @XmlSchemaType(name = "anyURI")
            protected String graphic;
            @XmlAttribute(name = "AlternativeGraphic")
            @XmlSchemaType(name = "anyURI")
            protected String alternativeGraphic;
            @XmlAttribute(name = "CircleGraphic")
            @XmlSchemaType(name = "anyURI")
            protected String circleGraphic;
            @XmlAttribute(name = "CloverGraphic")
            @XmlSchemaType(name = "anyURI")
            protected String cloverGraphic;
            @XmlAttribute(name = "CurveGraphic")
            @XmlSchemaType(name = "anyURI")
            protected String curveGraphic;
            @XmlAttribute(name = "DiamondGraphic")
            @XmlSchemaType(name = "anyURI")
            protected String diamondGraphic;
            @XmlAttribute(name = "RectangleGraphic")
            @XmlSchemaType(name = "anyURI")
            protected String rectangleGraphic;
            @XmlAttribute(name = "SquareGraphic")
            @XmlSchemaType(name = "anyURI")
            protected String squareGraphic;
            @XmlAttribute(name = "DrawRuleID")
            @XmlIDREF
            @XmlSchemaType(name = "IDREF")
            protected Object drawRuleID;
            @XmlAttribute(name = "DrawNote")
            protected String drawNote;
            @XmlAttribute(name = "Standard")
            protected StandardType standard;
            @XmlAttribute(name = "Icon")
            protected IconType icon;
            @XmlAttribute(name = "IsCivilian")
            protected Boolean isCivilian;

            @XmlAttribute(name = "IsAlignable")
            protected Boolean isAlignable;

            public String getAlternativeGraphic() {
                if (alternativeGraphic == null) {
                    return "";
                } else {
                    return alternativeGraphic;
                }
            }

            public String getCircleGraphic() {
                if (circleGraphic == null) {
                    return "";
                } else {
                    return circleGraphic;
                }
            }

            public String getCloverGraphic() {
                if (cloverGraphic == null) {
                    return "";
                } else {
                    return cloverGraphic;
                }
            }

            public String getCurveGraphic() {
                if (curveGraphic == null) {
                    return "";
                } else {
                    return curveGraphic;
                }
            }

            public String getDescription() {
                if (description == null) {
                    return "";
                } else {
                    return description;
                }
            }

            public String getDiamondGraphic() {
                if (diamondGraphic == null) {
                    return "";
                } else {
                    return diamondGraphic;
                }
            }

            public String getDrawNote() {
                if (drawNote == null) {
                    return "Not Applicable";
                } else {
                    return drawNote;
                }
            }

            public Object getDrawRuleID() {
                return drawRuleID;
            }

            public DoubleDigitType getEntityCode() {
                return entityCode;
            }

            public SymbolSet.Entities.Entity.EntityTypes getEntityTypes() {
                return entityTypes;
            }

            public GeometryType getGeometryType() {
                if (geometryType == null) {
                    return GeometryType.POINT;
                } else {
                    return geometryType;
                }
            }

            public String getGraphic() {
                if (graphic == null) {
                    return "";
                } else {
                    return graphic;
                }
            }

            public IconType getIcon() {
                if (icon == null) {
                    return IconType.MAIN;
                } else {
                    return icon;
                }
            }

            public String getID() {
                return id;
            }

            public String getLabel() {
                if (label == null) {
                    return "";
                } else {
                    return label;
                }
            }

            public String getLabelAlias() {
                if (labelAlias == null) {
                    return "";
                } else {
                    return labelAlias;
                }
            }

            public String getRectangleGraphic() {
                if (rectangleGraphic == null) {
                    return "";
                } else {
                    return rectangleGraphic;
                }
            }

            public String getRemarks() {
                if (remarks == null) {
                    return "";
                } else {
                    return remarks;
                }
            }

            public String getSquareGraphic() {
                if (squareGraphic == null) {
                    return "";
                } else {
                    return squareGraphic;
                }
            }

            public StandardType getStandard() {
                if (standard == null) {
                    return StandardType.ALL;
                } else {
                    return standard;
                }
            }

            public Tags getTags() {
                return tags;
            }

            public boolean isIsAlignable() {
                if (isAlignable == null) {
                    return false;
                } else {
                    return isAlignable;
                }
            }

            public boolean isIsCivilian() {
                if (isCivilian == null) {
                    return false;
                } else {
                    return isCivilian;
                }
            }

            public void setAlternativeGraphic(String value) {
                this.alternativeGraphic = value;
            }

            public void setCircleGraphic(String value) {
                this.circleGraphic = value;
            }

            public void setCloverGraphic(String value) {
                this.cloverGraphic = value;
            }

            public void setCurveGraphic(String value) {
                this.curveGraphic = value;
            }

            public void setDescription(String value) {
                this.description = value;
            }

            public void setDiamondGraphic(String value) {
                this.diamondGraphic = value;
            }

            public void setDrawNote(String value) {
                this.drawNote = value;
            }

            public void setDrawRuleID(Object value) {
                this.drawRuleID = value;
            }

            public void setEntityCode(DoubleDigitType value) {
                this.entityCode = value;
            }

            public void setEntityTypes(SymbolSet.Entities.Entity.EntityTypes value) {
                this.entityTypes = value;
            }

            public void setGeometryType(GeometryType value) {
                this.geometryType = value;
            }

            public void setGraphic(String value) {
                this.graphic = value;
            }

            public void setIcon(IconType value) {
                this.icon = value;
            }

            public void setID(String value) {
                this.id = value;
            }

            public void setIsAlignable(Boolean value) {
                this.isAlignable = value;
            }

            public void setIsCivilian(Boolean value) {
                this.isCivilian = value;
            }

            public void setLabel(String value) {
                this.label = value;
            }

            public void setLabelAlias(String value) {
                this.labelAlias = value;
            }

            public void setRectangleGraphic(String value) {
                this.rectangleGraphic = value;
            }

            public void setRemarks(String value) {
                this.remarks = value;
            }

            public void setSquareGraphic(String value) {
                this.squareGraphic = value;
            }

            public void setStandard(StandardType value) {
                this.standard = value;
            }

            public void setTags(Tags value) {
                this.tags = value;
            }

        }

        @XmlElement(name = "Entity", required = true)
        protected List<SymbolSet.Entities.Entity> entity;

        public List<SymbolSet.Entities.Entity> getEntity() {
            if (entity == null) {
                entity = new ArrayList<>();
            }
            return this.entity;
        }

    }

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "entitySubType"
    })
    public static class SpecialEntitySubTypes {

        @XmlElement(name = "EntitySubType", required = true)
        protected List<EntitySubTypeType> entitySubType;

        public List<EntitySubTypeType> getEntitySubType() {
            if (entitySubType == null) {
                entitySubType = new ArrayList<>();
            }
            return this.entitySubType;
        }

    }
    @XmlElement(name = "SymbolSetCode", required = true)
    protected DoubleDigitType symbolSetCode;
    @XmlElement(name = "Amplifiers", required = true)
    protected SymbolSet.Amplifiers amplifiers;
    @XmlElement(name = "Entities", required = true)
    protected SymbolSet.Entities entities;
    @XmlElement(name = "SectorOneModifiers")
    protected ModifiersType sectorOneModifiers;
    @XmlElement(name = "SectorTwoModifiers")
    protected ModifiersType sectorTwoModifiers;
    @XmlAttribute(name = "DimensionID", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREFS")
    protected List<Object> dimensionID;
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

    public SymbolSet.Amplifiers getAmplifiers() {
        return amplifiers;
    }

    public String getDescription() {
        return description;
    }

    public List<Object> getDimensionID() {
        if (dimensionID == null) {
            dimensionID = new ArrayList<>();
        }
        return this.dimensionID;
    }

    public SymbolSet.Entities getEntities() {
        return entities;
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

    public ModifiersType getSectorOneModifiers() {
        return sectorOneModifiers;
    }

    public ModifiersType getSectorTwoModifiers() {
        return sectorTwoModifiers;
    }

    public DoubleDigitType getSymbolSetCode() {
        return symbolSetCode;
    }

    public void setAmplifiers(SymbolSet.Amplifiers amplifiers) {
        this.amplifiers = amplifiers;
    }

    public void setDescription(String value) {
        this.description = value;
    }

    public void setEntities(SymbolSet.Entities value) {
        this.entities = value;
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

    public void setSectorOneModifiers(ModifiersType value) {
        this.sectorOneModifiers = value;
    }

    public void setSectorTwoModifiers(ModifiersType value) {
        this.sectorTwoModifiers = value;
    }

    public void setSymbolSetCode(DoubleDigitType value) {
        this.symbolSetCode = value;
    }

}
