import java.io.File

fun main() {
    val menu = File("mcdonald.txt")
    print(menu.readText())
}




data class Item(val id: String,
                val name: String,
                val calorie: Int,
                val price: Int)