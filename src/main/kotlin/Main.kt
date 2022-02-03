class VendingMachine {
    var snack = ""
    var price = 0.0
    var location = ""

    //Print Snack name
    fun printSnack(){
        print(this.snack + "   ")
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

    //print the vending machine
    //Print the object variables
    println("\n-----------------------------")
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
    println("\n-----------------------------")
}