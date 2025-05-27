package nz.co.ctg.jmsfx.generator.schema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlElementRefs;
import jakarta.xml.bind.annotation.XmlMixed;
import jakarta.xml.bind.annotation.XmlType;

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

    public DoubleDigitType() {
    }

    public DoubleDigitType(Integer digitOne, Integer digitTwo) {
        getContent().add("DigitOne");
        getContent().add(digitOne);
        getContent().add("DigitTwo");
        getContent().add(digitTwo);
    }

    @SuppressWarnings("unchecked")
    public String getCodeString() {
        List<Serializable> codeDigits = getContent();
        JAXBElement<Integer> firstDigit = (JAXBElement<Integer>) codeDigits.get(1);
        JAXBElement<Integer> secondDigit = (JAXBElement<Integer>) codeDigits.get(3);
        return String.format("%d%d", firstDigit.getValue(), secondDigit.getValue());
    }

    public List<Serializable> getContent() {
        if (content == null) {
            content = new ArrayList<>();
        }
        return this.content;
    }

}
