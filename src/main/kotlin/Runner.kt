fun main() {
    val mcdonald = Mcdonald()
    mcdonald.printMenu()

    var flag = true
    while (flag) {
        println("要選幾號")
        var buy = readLine()
        var result = mcdonald.equalMenu(buy!!)
        println(result)
        if (result != "沒有這個餐點,請重新選擇") {
            flag = false
        }
    }
}