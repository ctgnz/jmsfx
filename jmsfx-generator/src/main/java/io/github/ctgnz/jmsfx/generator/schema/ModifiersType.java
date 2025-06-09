package io.github.ctgnz.jmsfx.generator.schema;

import java.util.ArrayList;
import java.util.List;

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
@XmlType(name = "ModifiersType", propOrder = {
    "modifier"
})
public class ModifiersType {

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "extensionCode", "modifierCode"
    })
    public static class Modifier {

        @XmlElement(name = "ExtensionCode")
        protected String extensionCode;
        @XmlElement(name = "ModifierCode", required = true)
        protected DoubleDigitType modifierCode;
        @XmlAttribute(name = "Category")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String category;
        @XmlAttribute(name = "CategoryAlias")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "token")
        protected String categoryAlias;
        @XmlAttribute(name = "LimitUseTo")
        @XmlIDREF
        @XmlSchemaType(name = "IDREFS")
        protected List<Object> limitUseTo;
        @XmlAttribute(name = "Standard")
        protected StandardType standard;
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

        public String getCategory() {
            if (category == null) {
                return "";
            } else {
                return category;
            }
        }

        public String getCategoryAlias() {
            if (categoryAlias == null) {
                return "";
            } else {
                return categoryAlias;
            }
        }

        public String getDescription() {
            return description;
        }

        public String getGraphic() {
            return graphic;
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

        public List<Object> getLimitUseTo() {
            if (limitUseTo == null) {
                limitUseTo = new ArrayList<>();
            }
            return this.limitUseTo;
        }

        public DoubleDigitType getModifierCode() {
            return modifierCode;
        }

        public String getRemarks() {
            return remarks;
        }

        public StandardType getStandard() {
            if (standard == null) {
                return StandardType.ALL;
            } else {
                return standard;
            }
        }

        public void setCategory(String value) {
            this.category = value;
        }

        public void setCategoryAlias(String value) {
            this.categoryAlias = value;
        }

        public void setDescription(String value) {
            this.description = value;
        }

        public void setGraphic(String value) {
            this.graphic = value;
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

        public void setModifierCode(DoubleDigitType value) {
            this.modifierCode = value;
        }

        public void setRemarks(String value) {
            this.remarks = value;
        }

        public void setStandard(StandardType value) {
            this.standard = value;
        }

        public String getExtensionCode() {
            return extensionCode;
        }

        public void setExtensionCode(String extensionCode) {
            this.extensionCode = extensionCode;
        }

    }

    @XmlElement(name = "Modifier", required = true)
    protected List<ModifiersType.Modifier> modifier;

    public List<ModifiersType.Modifier> getModifier() {
        if (modifier == null) {
            modifier = new ArrayList<>();
        }
        return this.modifier;
    }

}
