package nz.co.ctg.jmsfx.icon;

import javafx.scene.control.ListCell;
import nz.co.ctg.jmsfx.model.SymbolIdentificationCodeElement;

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