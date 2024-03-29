//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2020.04.03 at 04:45:07 PM NZDT
//


package nz.co.ctg.jmsfx.generator.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DoubleDigitType complex type.
 *
 * <p>The following schema fragment specifies the expected content contained within this class.
 *
 * <pre>
 * &lt;complexType name="DoubleDigitType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DigitOne" type="{http://disa.mil/JointMilSyML.xsd}SingleDigitType"/>
 *         &lt;element name="DigitTwo" type="{http://disa.mil/JointMilSyML.xsd}SingleDigitType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DoubleDigitType", propOrder = {
    "content"
})
public class DoubleDigitType {

    @XmlElementRefs({
        @XmlElementRef(name = "DigitOne", namespace = "http://disa.mil/JointMilSyML.xsd", type = JAXBElement.class),
        @XmlElementRef(name = "DigitTwo", namespace = "http://disa.mil/JointMilSyML.xsd", type = JAXBElement.class)
    })
    @XmlMixed
    protected List<Serializable> content;

    /**
     * Gets the value of the content property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * {@link String }
     *
     *
     */
    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<>();
        }
        return this.content;
    }

    @SuppressWarnings("unchecked")
    public String getCodeString() {
        List<Serializable> codeDigits = getContent();
        JAXBElement<Integer> firstDigit = (JAXBElement<Integer>) codeDigits.get(1);
        JAXBElement<Integer> secondDigit = (JAXBElement<Integer>) codeDigits.get(3);
        return String.format("%d%d", firstDigit.getValue(), secondDigit.getValue());
    }

}
