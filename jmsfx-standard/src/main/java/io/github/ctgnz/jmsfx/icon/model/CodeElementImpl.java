package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.CodeElement;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CodeElementImpl {

    protected final StringProperty id = new SimpleStringProperty();
    protected final StringProperty label = new SimpleStringProperty();

    public CodeElementImpl() {
    }

    public CodeElementImpl(CodeElement element) {
        this.id.set(element.getId());
        this.label.set(element.getLabel());
    }

    public String getId() {
        return id.get();
    }

    public String getLabel() {
        return label.get();
    }

    public StringProperty idProperty() {
        return id;
    }

    public StringProperty labelProperty() {
        return label;
    }

    @Override
    public String toString() {
        return getLabel();
    }

}