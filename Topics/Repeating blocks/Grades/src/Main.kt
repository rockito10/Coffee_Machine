/*fun elif(num) {
    if (2) { }
    else if () { }
    else if () { }
    else {}
}*/

fun main() {
    var stu = readln().toInt()
    var D = 0
    var C = 0
    var B = 0
    var A = 0
    repeat(stu) {
        var num = readln().toInt()
        when (num) {
            2 -> D++
            3 -> C++
            4 -> B++
            5 -> A++
        }
    }
    print("$D ")
    print("$C ")
    print("$B ")
    print("$A")
}