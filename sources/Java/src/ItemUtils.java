import lombok.Getter;

import java.util.List;

public class ItemUtils {

    private final Inventory inventory;
    @Getter
    private List<String> items;

    public ItemUtils(Inventory inventory) {
        this.inventory = inventory;
        items = inventory.getItems();
    }

    public void addItem(String name) {
        checkIsFull();

        if (inventory.isFull()) {
            System.out.println(inventory.getFullMessage());
            return;
        }

        assert items != null;
        items.add(name);
        inventory.setItems(items);
    }

    private void checkIsFull() {
        int maxSize = inventory.getInventorySize();
        int fullSize = inventory.getItems().size();

        if (fullSize >= maxSize) {
            inventory.setFull(true);
            return;
        }
        inventory.setFull(false);
    }

    public void removeItem(String name) {
        if (items == null) {
            return;
        }

        if (items.contains(name)) {
            items.remove(name);
            inventory.setItems(items);
        }
    }
}
