package io.github.ctgnz.jmsfx.generator.schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlAttribute;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlID;
import jakarta.xml.bind.annotation.XmlIDREF;
import jakarta.xml.bind.annotation.XmlSchemaType;
import jakarta.xml.bind.annotation.XmlType;
import jakarta.xml.bind.annotation.adapters.CollapsedStringAdapter;
import jakarta.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntitySubTypeType", propOrder = {
    "entitySubTypeCode",
    "tags"
})
public class EntitySubTypeType {

    @XmlElement(name = "EntitySubTypeCode", required = true)
    protected DoubleDigitType entitySubTypeCode;
    @XmlElement(name = "Tags")
    protected Tags tags;
    @XmlAttribute(name = "GeometryType")
    protected GeometryType geometryType;
    @XmlAttribute(name = "EntityCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String entityCode;
    @XmlAttribute(name = "EntityTypeCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String entityTypeCode;
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

    public String getEntityCode() {
        if (entityCode == null) {
            return "00";
        } else {
            return entityCode;
        }
    }

    public DoubleDigitType getEntitySubTypeCode() {
        return entitySubTypeCode;
    }

    public String getEntityTypeCode() {
        if (entityTypeCode == null) {
            return "00";
        } else {
            return entityTypeCode;
        }
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

    public void setEntityCode(String value) {
        this.entityCode = value;
    }

    public void setEntitySubTypeCode(DoubleDigitType value) {
        this.entitySubTypeCode = value;
    }

    public void setEntityTypeCode(String value) {
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
