package io.github.ctgnz.jmsfx.icon.model;

import io.github.ctgnz.jmsfx.ICodeElement;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

public class CodeElementAdapter {

    protected final StringProperty id = new SimpleStringProperty();
    protected final StringProperty label = new SimpleStringProperty();

    public CodeElementAdapter() {
    }

    public CodeElementAdapter(ICodeElement element) {
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

}