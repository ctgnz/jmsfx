package nz.co.ctg.jmsfx.generator.schema;

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
@XmlType(name = "FieldListType", propOrder = {
    "field"
})
public class FieldListType {

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Field {

        @XmlAttribute(name = "Type")
        protected AttributeTypeType type;
        @XmlAttribute(name = "AmplifierID", required = true)
        @XmlIDREF
        @XmlSchemaType(name = "IDREF")
        protected Object amplifierID;
        @XmlAttribute(name = "X")
        protected Integer x;
        @XmlAttribute(name = "Y")
        protected Integer y;
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

        public Object getAmplifierID() {
            return amplifierID;
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

        public AttributeTypeType getType() {
            return type;
        }

        public int getX() {
            if (x == null) {
                return 0;
            } else {
                return x;
            }
        }

        public int getY() {
            if (y == null) {
                return 0;
            } else {
                return y;
            }
        }

        public void setAmplifierID(Object value) {
            this.amplifierID = value;
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

        public void setType(AttributeTypeType value) {
            this.type = value;
        }

        public void setX(Integer value) {
            this.x = value;
        }

        public void setY(Integer value) {
            this.y = value;
        }

    }

    @XmlElement(name = "Field")
    protected List<FieldListType.Field> field;

    public List<FieldListType.Field> getField() {
        if (field == null) {
            field = new ArrayList<>();
        }
        return this.field;
    }

}
