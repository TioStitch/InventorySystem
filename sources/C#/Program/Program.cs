using System;

class MinhaClasseBase
{

    private static Inventory inventory = new Inventory(9, "[InventoryAPI] O inventário está cheio!");

    static void Main()
    {
        inventory.addItem("Espada do Golem");
        for (int i = 0; i < inventory.getInventory().Count; i++) {
            Console.WriteLine("[InventoryAPI] Slot " + i + " -> " + inventory.getInventory()[i]);
        }
    }


    


}
