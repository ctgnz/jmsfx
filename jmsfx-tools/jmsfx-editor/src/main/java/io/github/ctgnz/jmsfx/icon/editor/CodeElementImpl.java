package io.github.ctgnz.jmsfx.icon.editor;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import io.github.ctgnz.jmsfx.CodeElement;

public class CodeElementImpl {

    protected final StringProperty id = new SimpleStringProperty();
    protected final StringProperty label = new SimpleStringProperty();
    protected final StringProperty name = new SimpleStringProperty();

    public CodeElementImpl() {
    }

    public CodeElementImpl(CodeElement element) {
        this.id.set(element.getId());
        this.label.set(element.getLabel());
        this.name.set(element.getName());
    }

    public String getId() {
        return id.get();
    }

    public String getLabel() {
        return label.get();
    }

    /** Carried from the element this was adapted from - a model being edited has no constant of its own to name. */
    public String getName() {
        return name.get();
    }

    public StringProperty nameProperty() {
        return name;
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