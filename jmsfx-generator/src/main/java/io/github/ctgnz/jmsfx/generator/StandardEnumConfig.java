package io.github.ctgnz.jmsfx.generator;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.function.Function;

import io.github.ctgnz.jmsfx.generator.model.StandardEnumModel;
import io.github.ctgnz.jmsfx.generator.schema.Library;

public class StandardEnumConfig<E extends StandardEnumModel, V> {
    private String typeName;
    private String templateParameterName;
    private Class<E> enumType;
    private Class<V> valueType;
    private Function<Library, List<V>> valueFunction;

    public StandardEnumConfig(Class<E> enumType, Class<V> valueType, String typeName, String paramName, Function<Library, List<V>> valueFunction) {
        this.enumType = enumType;
        this.valueType = valueType;
        this.valueFunction = valueFunction;
        this.typeName = typeName;
        this.templateParameterName = paramName;
    }

    public E createEnumModel(V value) {
        try {
            return enumType.getConstructor(valueType).newInstance(value);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException | NoSuchMethodException | SecurityException e) {
            throw new IllegalArgumentException("Unable to create enum model");
        }
    }

    public Class<E> getEnumType() {
        return enumType;
    }

    public String getTemplateParameterName() {
        return templateParameterName;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTemplateParameterName(String templateListParameter) {
        this.templateParameterName = templateListParameter;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public List<V> getValues(Library library) {
        return valueFunction.apply(library);
    }
}
