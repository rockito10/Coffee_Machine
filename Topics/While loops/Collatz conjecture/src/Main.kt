fun main() {
    var prin = readln().toInt()
    while (prin !== 1) {
        print("$prin ")
        when (prin%2) {
            0 -> prin /= 2
            else -> prin = prin * 3 + 1
        }
    }
    print("$prin")
}