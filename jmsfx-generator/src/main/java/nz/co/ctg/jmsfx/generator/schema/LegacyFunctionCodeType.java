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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for LegacyFunctionCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LegacyFunctionCodeType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://disa.mil/JointMilSyML.xsd>LegacyTokenType">
 *       &lt;attGroup ref="{http://disa.mil/JointMilSyML.xsd}NameAttributeGroup"/>
 *       &lt;attribute name="SchemaOverride" type="{http://www.w3.org/2001/XMLSchema}token" default="" />
 *       &lt;attribute name="DimensionOverride" type="{http://www.w3.org/2001/XMLSchema}token" default="" />
 *       &lt;attribute name="StandardIdentityOverride" type="{http://www.w3.org/2001/XMLSchema}token" default="" />
 *       &lt;attribute name="StatusOverride" type="{http://www.w3.org/2001/XMLSchema}token" default="" />
 *       &lt;attribute name="HQTFFDOverride" type="{http://www.w3.org/2001/XMLSchema}token" default="" />
 *       &lt;attribute name="AmplifierOverride" type="{http://www.w3.org/2001/XMLSchema}token" default="" />
 *       &lt;attribute name="TailOverride" type="{http://www.w3.org/2001/XMLSchema}token" default="" />
 *       &lt;attribute name="LimitUseTo" type="{http://www.w3.org/2001/XMLSchema}token" default="" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LegacyFunctionCodeType", propOrder = {
    "value"
})
public class LegacyFunctionCodeType {

    @XmlValue
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String value;
    @XmlAttribute(name = "SchemaOverride")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String schemaOverride;
    @XmlAttribute(name = "DimensionOverride")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String dimensionOverride;
    @XmlAttribute(name = "StandardIdentityOverride")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String standardIdentityOverride;
    @XmlAttribute(name = "StatusOverride")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String statusOverride;
    @XmlAttribute(name = "HQTFFDOverride")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String hqtffdOverride;
    @XmlAttribute(name = "AmplifierOverride")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String amplifierOverride;
    @XmlAttribute(name = "TailOverride")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String tailOverride;
    @XmlAttribute(name = "LimitUseTo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String limitUseTo;
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

    /**
     * Gets the value of the value property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Gets the value of the schemaOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchemaOverride() {
        if (schemaOverride == null) {
            return "";
        } else {
            return schemaOverride;
        }
    }

    /**
     * Sets the value of the schemaOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchemaOverride(String value) {
        this.schemaOverride = value;
    }

    /**
     * Gets the value of the dimensionOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDimensionOverride() {
        if (dimensionOverride == null) {
            return "";
        } else {
            return dimensionOverride;
        }
    }

    /**
     * Sets the value of the dimensionOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDimensionOverride(String value) {
        this.dimensionOverride = value;
    }

    /**
     * Gets the value of the standardIdentityOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStandardIdentityOverride() {
        if (standardIdentityOverride == null) {
            return "";
        } else {
            return standardIdentityOverride;
        }
    }

    /**
     * Sets the value of the standardIdentityOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStandardIdentityOverride(String value) {
        this.standardIdentityOverride = value;
    }

    /**
     * Gets the value of the statusOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatusOverride() {
        if (statusOverride == null) {
            return "";
        } else {
            return statusOverride;
        }
    }

    /**
     * Sets the value of the statusOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatusOverride(String value) {
        this.statusOverride = value;
    }

    /**
     * Gets the value of the hqtffdOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHQTFFDOverride() {
        if (hqtffdOverride == null) {
            return "";
        } else {
            return hqtffdOverride;
        }
    }

    /**
     * Sets the value of the hqtffdOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHQTFFDOverride(String value) {
        this.hqtffdOverride = value;
    }

    /**
     * Gets the value of the amplifierOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAmplifierOverride() {
        if (amplifierOverride == null) {
            return "";
        } else {
            return amplifierOverride;
        }
    }

    /**
     * Sets the value of the amplifierOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAmplifierOverride(String value) {
        this.amplifierOverride = value;
    }

    /**
     * Gets the value of the tailOverride property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTailOverride() {
        if (tailOverride == null) {
            return "";
        } else {
            return tailOverride;
        }
    }

    /**
     * Sets the value of the tailOverride property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTailOverride(String value) {
        this.tailOverride = value;
    }

    /**
     * Gets the value of the limitUseTo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLimitUseTo() {
        if (limitUseTo == null) {
            return "";
        } else {
            return limitUseTo;
        }
    }

    /**
     * Sets the value of the limitUseTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLimitUseTo(String value) {
        this.limitUseTo = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
        return label;
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
        return description;
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
        return remarks;
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

}
