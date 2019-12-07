import java.io.BufferedReader
import java.io.FileReader

class Mcdonald {
    private val menu = mutableMapOf<String, Item>()
    init {
        val file = BufferedReader(FileReader("mcdonald.txt"))
        var line = file.readLine()
        while (line != null) {
            val token = line.split(",")
            val item = Item(
                token[0],
                token[1],
                token[2].toInt(),
                token[3].toInt()
            )
            menu[item.id] = item
            line = file.readLine()
        }
    }

    fun printMenu() {
        for (entry in menu.entries) {
            println(entry.value)
        }
    }

    fun equalMenu(id: String): String {
        var result = ""
        for (entry in menu.entries) {
            if (id == entry.key) {
                result = "${entry.value.name} ${entry.value.price}元 "
                break
            } else {
                result = "沒有這個餐點,請重新選擇"
            }
        }
        return result
    }
}

data class Item(
    val id: String,
    val name: String,
    val calorie: Int,
    val price: Int
) {
    override fun toString(): String {
        return "$id  $name  $calorie  $price"
    }
}