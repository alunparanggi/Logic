/**
 1. Find items in the Meeting Room.
 2. Find all electronic devices.
 3. Find all the furniture.
 4. Find all items were purchased on 16 Januari 2020.
 5. Find all items with brown color.
 */

//first step is making the data class to hold the data from json

data class Inventory (
    var inventory_id : Int,
    var name : String,
    var type : String,
    var tags : List<String>,
    var purchased_at : Int,
    var placement : Placement
)

data class Placement(
    var room_id : Int,
    var name : String
)


// next step is making the function

/**
 * to find items in the Meeting Room we just need to call findItemsByPlacement("Meeting Room", ListOfInventory)
 */
fun findItemsByPlacement(roomsName: String, inventories: List<Inventory>): List<Inventory> {
    return inventories.filter {
        it.placement.name == roomsName
    }
}

/**
 * to find all electronic devices we just need to call findItemsByType("electronic", ListOfInventory)
 * to find all furniture devices we just need to call findItemsByType("furniture", ListOfInventory)
 */
fun findItemsByType(type: String, inventories: List<Inventory>): List<Inventory> {
    return inventories.filter {
        it.type == type
    }
}

/**
 * to find all items with brown color we just need to call findItemsByTag("brown", ListOfInventory)
 */
fun findItemsByTag(tag: String, inventories: List<Inventory>): List<Inventory> {
    return inventories.filter {
        it.tags.contains(tag)
    }
}