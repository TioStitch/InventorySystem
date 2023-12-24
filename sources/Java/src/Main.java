import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Inventory gameInventory = new Inventory();
        gameInventory.setInventorySize((byte) 9);
        gameInventory.setItems(new ArrayList<>());
        gameInventory.setFull(false);
        gameInventory.setFullMessage("[InventoryAPI] O inventário está cheio!");

        ItemUtils itemUtils = new ItemUtils(gameInventory);

        itemUtils.addItem("Capacete do Dragão Original");
        itemUtils.addItem("Peitoral do Dragão Original");
        itemUtils.addItem("Calças do Dragão Original");
        itemUtils.addItem("Botas do Dragão Original");

        itemUtils.addItem("Espada Assasina Furíosa");
        itemUtils.addItem("Arco de Magma Bolífico");
        itemUtils.addItem("Talismã da Ilusão Dimensional");
        itemUtils.addItem("Cabeça de Troll Infértil");
        itemUtils.addItem("Lógrificador Quântico");
        itemUtils.addItem("Projetor Bidimensional");

        System.out.println("[InventoryAPI] Inventário carregado:");
        for (int i = 0; i < itemUtils.getItems().size(); i++) {
            printar(i, itemUtils.getItems().get(i));
        }

        itemUtils.addItem("Bolsa de Acessor Quaternion");
    }

    private static void printar(int slot, String message) {
        System.out.println("[InventoryAPI] Slot " + slot + " -> " + message);
    }
}