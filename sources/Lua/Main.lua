local invSystem = require("Lua.InventorySystem")

local function loadInventory()

    invSystem:addItem("Espada do Golem")
    invSystem:addItem("Escudo de Esmeralda")
    invSystem:addItem("Capacete do Protetor")
    invSystem:addItem("Peitoral do Protetor")
    invSystem:addItem("Calcas do Protetor")
    invSystem:addItem("Botas do Protetor")
    invSystem:addItem("Talisma Magnetico")
    invSystem:addItem("Talisma Eletrocutado")
 end

loadInventory()

invSystem:getInventory()
