using System;
using System.Drawing;
using System.Runtime.ConstrainedExecution;

class Inventory {

    private static List<String> inventario = new List<string>();
    private int size;
    private Boolean isFull = false;
    private String fullMessage;

    public Inventory(int size, String fullMessage) {
        this.size = size;
        this.fullMessage = fullMessage;
    }


    public void addItem(String name) {
        checkIfFull();

        if (isFull) {
            Console.WriteLine(fullMessage);
            return;
        }

        inventario.Add(name);
    }

    public void checkIfFull() {
        isFull = inventario.Count >= size;
    }

    public void removeItem(String name) {
        if (inventario.Contains(name)) {
            inventario.Remove(name);
        }
    }

    public List<String> getInventory() {
        return inventario;
    }
}