import kotlin.math.round

class VendingMachine {
    var snack = ""
    var price = 0.0
    var location = ""

    //Print Snack name
    fun printSnack(){
        if (this.snack.length < 11){
            val space = 11 - this.snack.length
            print(this.snack + " ".repeat(space))
        } else {
            print(this.snack)
        }
    }
    //Print Snack Price
    fun printPrice(){
        print(" $" + this.price + "     ")
    }

    //Print the location of the snack
    fun printLocation(){
        print("  " + this.location + "       ")
    }
}

fun main() {
    // Create VendingMachine objects
val snack1 = VendingMachine()
    snack1.snack = "Doritos"
    snack1.price = 2.41
    snack1.location = "A1"

val snack2 = VendingMachine()
    snack2.snack = "Skittles"
    snack2.price = 1.75
    snack2.location = "A2"

val snack3 = VendingMachine()
    snack3.snack = "Snickers"
    snack3.price = 1.75
    snack3.location = "A3"

val snack4 = VendingMachine()
    snack4.snack = "Starburst"
    snack4.price = 1.75
    snack4.location = "B1"

val snack5 = VendingMachine()
    snack5.snack = "Cheezits"
    snack5.price = 1.75
    snack5.location = "B2"

val snack6 = VendingMachine()
    snack6.snack = "Oreo-Cookie"
    snack6.price = 2.25
    snack6.location = "B3"

val snack7 = VendingMachine()
    snack7.snack = "Reese's"
    snack7.price = 1.55
    snack7.location = "C1"

val snack8 = VendingMachine()
    snack8.snack = "Twix-Bar"
    snack8.price = 1.55
    snack8.location = "C2"

val snack9 = VendingMachine()
    snack9.snack = "Lays-Chips"
    snack9.price = 2.41
    snack9.location = "C3"

    //print the vending machine
    //Print the object variables
    println("\n----------------------------------")
    snack1.printSnack()
    snack2.printSnack()
    snack3.printSnack()
    print("\n")
    snack1.printPrice()
    snack2.printPrice()
    snack3.printPrice()
    print("\n")
    snack1.printLocation()
    snack2.printLocation()
    snack3.printLocation()
    print("\n\n")
    snack4.printSnack()
    snack5.printSnack()
    snack6.printSnack()
    print("\n")
    snack4.printPrice()
    snack5.printPrice()
    snack6.printPrice()
    print("\n")
    snack4.printLocation()
    snack5.printLocation()
    snack6.printLocation()
    print("\n\n")
    snack7.printSnack()
    snack8.printSnack()
    snack9.printSnack()
    print("\n")
    snack7.printPrice()
    snack8.printPrice()
    snack9.printPrice()
    print("\n")
    snack7.printLocation()
    snack8.printLocation()
    snack9.printLocation()
    println("\n----------------------------------")

    //Asking for and paying for items in the vending machine
    //------------------------------------------------------
    print("How much money would you like to insert? ")
    val userMoney = readLine()!!.toDouble()
    println("You have inserted $$userMoney\n")
    println("type the location of the item you would like to buy? ")
    val itemLocation = readLine()
    
    val snack = when (itemLocation){
        "A1" -> snack1.snack
        "A2" -> snack2.snack
        "A3" -> snack3.snack
        "B1" -> snack4.snack
        "B2" -> snack5.snack
        "B3" -> snack6.snack
        "C1" -> snack7.snack
        "C2" -> snack8.snack
        "C3" -> snack9.snack
        else -> "Nothing"
    }
    val price: Double = when (itemLocation) {
        "A1" -> snack1.price
        "A2" -> snack2.price
        "A3" -> snack3.price
        "B1" -> snack4.price
        "B2" -> snack5.price
        "B3" -> snack6.price
        "C1" -> snack7.price
        "C2" -> snack8.price
        "C3" -> snack9.price
        else -> 0.0
    }
    if (userMoney < price){
        println("Not enough money inserted")
    } else{
        println("You received $snack")
        val change = userMoney - price
        round(change * 100) / 100
        println("Your change is $$change")
    }

}