fun main() {
    var sum = 0
    var sig = readln().toInt()
    while (sig > 0) {
        sum = sum + sig
        sig = readln().toInt()
    }
    print(sum)
}