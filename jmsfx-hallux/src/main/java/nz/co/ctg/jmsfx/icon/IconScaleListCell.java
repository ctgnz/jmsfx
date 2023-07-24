package nz.co.ctg.jmsfx.icon;

import javafx.scene.control.ListCell;

public class IconScaleListCell extends ListCell<IconScale> {

    @Override
    protected void updateItem(IconScale item, boolean empty) {
        super.updateItem(item, empty);
        if (item == null || empty) {
            setText("");
        } else {
            setText(item.getDescription());
        }
    }

}