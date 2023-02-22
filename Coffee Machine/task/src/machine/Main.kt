package machine

fun tiposcoffee(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:")
    val command2 = readln().toString()
    when (command2) {
        "1" -> espresso(water, milk, coffee, cups, money)
        "2" -> latte(water, milk, coffee, cups, money)
        "3" -> cappuccino(water, milk, coffee, cups, money)
    }
}

fun espresso(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {
    println("The coffee machine has:")
    // println(" ml of water")
    print(water - 250)
    print(" ml of water")
    println("")
    //println("Write how many ml of milk the coffee machine has:")
    print(milk - 0)
    print(" ml of milk")
    println("")
    // println("Write how many grams of coffee beans the coffee machine has:")
    print(coffee - 16)
    print(" g of coffee beans")
    println("")
    // println("Write how many cups of coffee you will need:")
    print(cups - 1)
    print(" disposable cups")
    println("")
    print('$')
    print(money + 4)
    print(" of money")
}

fun latte(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {
    println("The coffee machine has:")
    // println(" ml of water")
    print(water - 350)
    print(" ml of water")
    println("")
    //println("Write how many ml of milk the coffee machine has:")
    print(milk - 75)
    print(" ml of milk")
    println("")
    // println("Write how many grams of coffee beans the coffee machine has:")
    print(coffee - 20)
    print(" g of coffee beans")
    println("")
    // println("Write how many cups of coffee you will need:")
    print(cups - 1)
    print(" disposable cups")
    println("")
    print('$')
    print(money + 7)
    print(" of money")
}

fun cappuccino(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {
    println("The coffee machine has:")
    // println(" ml of water")
    print(water - 200)
    print(" ml of water")
    println("")
    //println("Write how many ml of milk the coffee machine has:")
    print(milk - 100)
    print(" ml of milk")
    println("")
    // println("Write how many grams of coffee beans the coffee machine has:")
    print(coffee - 12)
    print(" g of coffee beans")
    println("")
    // println("Write how many cups of coffee you will need:")
    print(cups - 1)
    print(" disposable cups")
    println("")
    print('$')
    print(money + 6)
    print(" of money")
}

fun fillear(water: Int, milk: Int, coffee: Int, cups: Int, money: Int){
    println("Write how many ml of water you want to add:")
    val totwater = water + readln().toInt()
    println("Write how many ml of milk you want to add:")
    val totmilk = milk + readln().toInt()
    println("Write how many grams of coffee beans you want to add:")
    val totcoffee = coffee + readln().toInt()
    println("Write how many disposable cups you want to add:")
    val totcups = cups + readln().toInt()

    println("The coffee machine has:")
    // println(" ml of water")
    print(totwater)
    print(" ml of water")
    println("")
    //println("Write how many ml of milk the coffee machine has:")
    print(totmilk)
    print(" ml of milk")
    println("")
    // println("Write how many grams of coffee beans the coffee machine has:")
    print(totcoffee)
    print(" g of coffee beans")
    println("")
    // println("Write how many cups of coffee you will need:")
    print(totcups)
    print(" disposable cups")
    println("")
    print('$')
    print(money)
    print(" of money")
}

fun takear(water: Int, milk: Int, coffee: Int, cups: Int, money: Int) {
    println("I gave you $${money}")
    val totmoney = 0
    println("")
    println("The coffee machine has:")
    // println(" ml of water")
    print(water)
    print(" ml of water")
    println("")
    //println("Write how many ml of milk the coffee machine has:")
    print(milk)
    print(" ml of milk")
    println("")
    // println("Write how many grams of coffee beans the coffee machine has:")
    print(coffee)
    print(" g of coffee beans")
    println("")
    // println("Write how many cups of coffee you will need:")
    print(cups)
    print(" disposable cups")
    println("")
    print('$')
    print(totmoney)
    print(" of money")
}

fun main() {

    println("The coffee machine has:")
    // println(" ml of water")
    val totwater = 400
    print(totwater)
    print(" ml of water")
    println("")
    //println("Write how many ml of milk the coffee machine has:")
    val totmilk = 540
    print(totmilk)
    print(" ml of milk")
    println("")
    // println("Write how many grams of coffee beans the coffee machine has:")
    val totcoffee = 120
    print(totcoffee)
    print(" g of coffee beans")
    println("")
    // println("Write how many cups of coffee you will need:")
    val totcups = 9
    print(totcups)
    print(" disposable cups")
    println("")
    val totmoney = 550
    print('$')
    print(totmoney)
    print(" of money")

    println("")

    println("Write action (buy, fill, take):")

    val command = readln().toString()

    when (command) {
        "buy" -> tiposcoffee(totwater, totmilk, totcoffee, totcups, totmoney)
        "fill" -> fillear(totwater, totmilk, totcoffee, totcups, totmoney)
        "take" -> takear(totwater, totmilk, totcoffee, totcups, totmoney)
    }

    //val rqcups = readln().toInt()

    /*println("Starting to make a coffee")
    println("Grinding coffee beans")
    println("Boiling water")
    println("Mixing boiled water with crushed coffee beans")
    println("Pouring coffee into the cup")
    println("Pouring some milk into the cup")
    println("Coffee is ready!")
    */
    


/*
    val water : Int = rqcups * 200
    val milk : Int = rqcups * 50
    val coffee : Int = rqcups * 15

    print(milk)
    print(" ml of milk")
    println("")
    print(water)
    print(" ml of water")
    println("")
    print(coffee)
    print(" g of coffee beans")

    val rewater = totwater / 200
    val remilk = totmilk / 50
    val recoffee = totcoffee / 15
    
    //puede que falte <=
    
    /*val recupsmax =
    if (rewater < remilk && rewater < recoffee) {
    rewater
    } else if (remilk < rewater && remilk < recoffee) {
    remilk
    } else {
    recoffee
    }
 */

    val recupstot = recupsmax - rqcups
    
    println(
        if (totwater == water && totmilk == milk && totcoffee == coffee) {
            "Yes, I can make that amount of coffee" 
        } else if ( totwater >= water && totmilk >= milk && totcoffee >= coffee ) {
            "Yes, I can make that amount of coffee (and even $recupstot more than that)"
        } else {
            "No, I can make only $recupsmax cups of coffee"
        }
    )
*/
}

