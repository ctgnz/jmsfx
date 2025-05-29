package io.github.ctgnz.jmsfx.icon.preview;

import io.github.ctgnz.jmsfx.icon.SymbolIdentificationCodeElement;
import javafx.scene.control.ListCell;

public class SymbolIdentificationCodeElementListCell<E extends SymbolIdentificationCodeElement> extends ListCell<E> {
    @Override
    protected void updateItem(E item, boolean empty) {
        super.updateItem(item, empty);
        if (item == null || empty) {
            setText("");
        } else {
            setText(item.getLabel());
        }
    }
}