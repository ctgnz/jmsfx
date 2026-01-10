package io.github.ctgnz.jmsfx.generator.yaml;

import java.io.IOException;
import java.util.Arrays;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.util.DefaultIndenter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;

public class JmsfxPrettyPrinter extends DefaultPrettyPrinter {

    private static final String[] MAP_FIELDS = { "namingAbbreviations", "idStrategies", "nameStrategies" };
    private static final String[] NEWLINE_FIELDS = { "hqUnit", "trades", "branchRoles", "primaryDomain", "echelonIndex", "country", "inventory", "catalog", "orbat", "unitParagraph" };
    private static final long serialVersionUID = 1L;
    private boolean mapElement;

    public JmsfxPrettyPrinter() {
        indentArraysWith(DefaultIndenter.SYSTEM_LINEFEED_INSTANCE);
        indentObjectsWith(FixedSpaceIndenter.instance);
    }

    @Override
    public void beforeArrayValues(JsonGenerator g) throws IOException {
        if (isPrimitiveArrayType(g)) {
            _objectIndenter.writeIndentation(g, _nesting);
        } else {
            super.beforeArrayValues(g);
        }
    }

    @Override
    public void beforeObjectEntries(JsonGenerator g) throws IOException {
        super.beforeObjectEntries(g);
    }



    @Override
    public DefaultPrettyPrinter createInstance() {
        return new JmsfxPrettyPrinter();
    }

    @Override
    public void writeArrayValueSeparator(JsonGenerator g) throws IOException {
        if (isPrimitiveArrayType(g)) {
            g.writeRaw(_separators.getArrayValueSeparator());
            _objectIndenter.writeIndentation(g, _nesting);
        } else {
            super.writeArrayValueSeparator(g);
        }
    }

    @Override
    public void writeEndArray(JsonGenerator g, int nrOfValues) throws IOException {
        if (isPrimitiveArrayType(g)) {
            _objectIndenter.writeIndentation(g, _nesting);
            g.writeRaw(']');
            --_nesting;
        } else {
            super.writeEndArray(g, nrOfValues);
        }
    }

    @Override
    public void writeEndObject(JsonGenerator g, int nrOfEntries) throws IOException {
        String fieldName = g.getOutputContext().getParent().getCurrentName();
        if (isMapElement(fieldName)) {
            this.mapElement = false;
            --_nesting;
        }
        if (isNewLineField(fieldName)) {
            _arrayIndenter.writeIndentation(g, _nesting);
            g.writeRaw('}');
            --_nesting;
        } else if (isMapElement(fieldName)) {
            _arrayIndenter.writeIndentation(g, _nesting);
            g.writeRaw('}');
        } else {
            super.writeEndObject(g, nrOfEntries);
        }
    }

    @Override
    public void writeObjectEntrySeparator(JsonGenerator g) throws IOException {
        String fieldName = g.getOutputContext().getCurrentName();
//        if (isMapElement(fieldName)) {
//            this.mapElement = true;
//            ++_nesting;
//        }
        if (isNewLineField(fieldName)) {
            g.writeRaw(_separators.getObjectEntrySeparator());
            ++_nesting;
            _arrayIndenter.writeIndentation(g, _nesting);
        } else if (mapElement) {
            g.writeRaw(_separators.getObjectEntrySeparator());
            _arrayIndenter.writeIndentation(g, _nesting);
        } else {
            super.writeObjectEntrySeparator(g);
        }
    }

    @Override
    public void writeStartObject(JsonGenerator g) throws IOException {
        super.writeStartObject(g);
        if (g.getOutputContext().getCurrentValue() instanceof Map<?, ?>) {
            String fieldName = g.getOutputContext().getParent().getCurrentName();
            if (isMapElement(fieldName)) {
                this.mapElement = true;
                ++_nesting;
                _arrayIndenter.writeIndentation(g, _nesting);
            }
        }
    }

    private boolean isMapElement(String fieldName) {
        return Arrays.stream(MAP_FIELDS).anyMatch(name -> name.equals(fieldName));
    }

    private boolean isNewLineField(String fieldName) {
        return Arrays.stream(NEWLINE_FIELDS).anyMatch(name -> name.equals(fieldName));
    }

    private boolean isPrimitiveArrayType(JsonGenerator g) {
        Object currentValue = g.getCurrentValue();
        if (currentValue instanceof List<?>) {
            List<?> list = (List<?>) currentValue;
            if (!list.isEmpty()) {
                Object firstValue = list.get(0);
                return list.get(0) instanceof String || firstValue instanceof Enum<?>;
            }
        }
        return currentValue instanceof EnumSet<?>;
    }

}
