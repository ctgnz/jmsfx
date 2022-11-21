//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.04.03 at 04:45:07 PM NZDT 
//


package nz.co.ctg.jmsfx.generator.schema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for EntityType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EntityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://disa.mil/JointMilSyML.xsd}Tags" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://disa.mil/JointMilSyML.xsd}FramedGraphicIdentifierAttributeGroup"/>
 *       &lt;attribute name="GeometryType" type="{http://disa.mil/JointMilSyML.xsd}GeometryType" default="POINT" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EntityType", propOrder = {
    "tags"
})
@XmlSeeAlso({
    LegacyEntityType.class
})
public class EntityType {

    @XmlElement(name = "Tags")
    protected Tags tags;
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

    /**
     * Custom tags, often used for searching information in user interfaces.
     * 
     * @return
     *     possible object is
     *     {@link Tags }
     *     
     */
    public Tags getTags() {
        return tags;
    }

    /**
     * Sets the value of the tags property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tags }
     *     
     */
    public void setTags(Tags value) {
        this.tags = value;
    }

    /**
     * Gets the value of the geometryType property.
     * 
     * @return
     *     possible object is
     *     {@link GeometryType }
     *     
     */
    public GeometryType getGeometryType() {
        if (geometryType == null) {
            return GeometryType.POINT;
        } else {
            return geometryType;
        }
    }

    /**
     * Sets the value of the geometryType property.
     * 
     * @param value
     *     allowed object is
     *     {@link GeometryType }
     *     
     */
    public void setGeometryType(GeometryType value) {
        this.geometryType = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        if (label == null) {
            return "";
        } else {
            return label;
        }
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the labelAlias property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabelAlias() {
        if (labelAlias == null) {
            return "";
        } else {
            return labelAlias;
        }
    }

    /**
     * Sets the value of the labelAlias property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabelAlias(String value) {
        this.labelAlias = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        if (description == null) {
            return "";
        } else {
            return description;
        }
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the remarks property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemarks() {
        if (remarks == null) {
            return "";
        } else {
            return remarks;
        }
    }

    /**
     * Sets the value of the remarks property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemarks(String value) {
        this.remarks = value;
    }

    /**
     * Gets the value of the graphic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGraphic() {
        if (graphic == null) {
            return "";
        } else {
            return graphic;
        }
    }

    /**
     * Sets the value of the graphic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGraphic(String value) {
        this.graphic = value;
    }

    /**
     * Gets the value of the alternativeGraphic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAlternativeGraphic() {
        if (alternativeGraphic == null) {
            return "";
        } else {
            return alternativeGraphic;
        }
    }

    /**
     * Sets the value of the alternativeGraphic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAlternativeGraphic(String value) {
        this.alternativeGraphic = value;
    }

    /**
     * Gets the value of the circleGraphic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCircleGraphic() {
        if (circleGraphic == null) {
            return "";
        } else {
            return circleGraphic;
        }
    }

    /**
     * Sets the value of the circleGraphic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCircleGraphic(String value) {
        this.circleGraphic = value;
    }

    /**
     * Gets the value of the cloverGraphic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCloverGraphic() {
        if (cloverGraphic == null) {
            return "";
        } else {
            return cloverGraphic;
        }
    }

    /**
     * Sets the value of the cloverGraphic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCloverGraphic(String value) {
        this.cloverGraphic = value;
    }

    /**
     * Gets the value of the curveGraphic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurveGraphic() {
        if (curveGraphic == null) {
            return "";
        } else {
            return curveGraphic;
        }
    }

    /**
     * Sets the value of the curveGraphic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurveGraphic(String value) {
        this.curveGraphic = value;
    }

    /**
     * Gets the value of the diamondGraphic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDiamondGraphic() {
        if (diamondGraphic == null) {
            return "";
        } else {
            return diamondGraphic;
        }
    }

    /**
     * Sets the value of the diamondGraphic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDiamondGraphic(String value) {
        this.diamondGraphic = value;
    }

    /**
     * Gets the value of the rectangleGraphic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRectangleGraphic() {
        if (rectangleGraphic == null) {
            return "";
        } else {
            return rectangleGraphic;
        }
    }

    /**
     * Sets the value of the rectangleGraphic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRectangleGraphic(String value) {
        this.rectangleGraphic = value;
    }

    /**
     * Gets the value of the squareGraphic property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSquareGraphic() {
        if (squareGraphic == null) {
            return "";
        } else {
            return squareGraphic;
        }
    }

    /**
     * Sets the value of the squareGraphic property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSquareGraphic(String value) {
        this.squareGraphic = value;
    }

    /**
     * Gets the value of the drawRuleID property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getDrawRuleID() {
        return drawRuleID;
    }

    /**
     * Sets the value of the drawRuleID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setDrawRuleID(Object value) {
        this.drawRuleID = value;
    }

    /**
     * Gets the value of the drawNote property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDrawNote() {
        if (drawNote == null) {
            return "Not Applicable";
        } else {
            return drawNote;
        }
    }

    /**
     * Sets the value of the drawNote property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDrawNote(String value) {
        this.drawNote = value;
    }

    /**
     * Gets the value of the standard property.
     * 
     * @return
     *     possible object is
     *     {@link StandardType }
     *     
     */
    public StandardType getStandard() {
        if (standard == null) {
            return StandardType.ALL;
        } else {
            return standard;
        }
    }

    /**
     * Sets the value of the standard property.
     * 
     * @param value
     *     allowed object is
     *     {@link StandardType }
     *     
     */
    public void setStandard(StandardType value) {
        this.standard = value;
    }

    /**
     * Gets the value of the icon property.
     * 
     * @return
     *     possible object is
     *     {@link IconType }
     *     
     */
    public IconType getIcon() {
        if (icon == null) {
            return IconType.MAIN;
        } else {
            return icon;
        }
    }

    /**
     * Sets the value of the icon property.
     * 
     * @param value
     *     allowed object is
     *     {@link IconType }
     *     
     */
    public void setIcon(IconType value) {
        this.icon = value;
    }

    /**
     * Gets the value of the isCivilian property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsCivilian() {
        if (isCivilian == null) {
            return false;
        } else {
            return isCivilian;
        }
    }

    /**
     * Sets the value of the isCivilian property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsCivilian(Boolean value) {
        this.isCivilian = value;
    }

    /**
     * Gets the value of the isAlignable property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isIsAlignable() {
        if (isAlignable == null) {
            return false;
        } else {
            return isAlignable;
        }
    }

    /**
     * Sets the value of the isAlignable property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsAlignable(Boolean value) {
        this.isAlignable = value;
    }

}
