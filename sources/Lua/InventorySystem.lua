local InventorySystem = {
    inventory = {},
    inventorySize = 15,
    usedSlots = 0,
    isFull = false
}

function InventorySystem:isFull()
    if self.usedSlots <= self.inventorySize then
        self.isFull = true;
    else
        self.isFull = false;
    end
end

function InventorySystem:addItem(name)
    if self.usedSlots <= self.inventorySize then
        table.insert(self.inventory, self.usedSlots + 1, name)
        self.usedSlots = self.usedSlots +1;
    else
        self.isFull = true;
    end
end

function InventorySystem:getInventory()
    for k, v in pairs(self.inventory) do
        print("Slot " .. k .. " -> " .. v)
    end
  end

return InventorySystem