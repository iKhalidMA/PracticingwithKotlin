// practicing makes you perfect

fun main(args: Array<String>) {
    //Salary Tasks

    var baseSlary = 50000.0;
    var taxPercent = 0.2;

    if (baseSlary >= 30000) {
        taxPercent = 0.5
    }
    var hours = 20
    var incentive = 700.0;

    if (hours >= 15) {
        incentive += 500
    }
    println("Salary_Details\n----------------")

    print("Your Salary After incenives and Taxaion is Equal: ${baseSlary - (baseSlary * taxPercent) + incentive} \n \n Target_Details :- \n \n  ")

    // Target task

    var RevenueOfMonths = 20000.0
    var targetPercent = 0.05
    var salesTargets = RevenueOfMonths

    for (months in 1..12) {
        println("Month " + months + ": " + salesTargets.toInt())
        salesTargets = RevenueOfMonths + (RevenueOfMonths * targetPercent)
        RevenueOfMonths = salesTargets
    }

    // Bill Design Task - Calling methods to passing parametrs
    order1("pizza", 3, 22)
    order2("Cola", 3, 5)
    order3("water", 3, 2)
    total(66, 15, 6)
}





// Bill Design Task - order1

fun order1(name: String, amount: Byte, price: Int) {
    var total = amount * price
    println("1: $name = $amount X $price  -> =${total} & ")

}

fun order2(name: String, amount: Byte, price: Int) {
    var total = amount * price

    println("2: $name = $amount X $price    -> =${total} & ")

}

fun order3(name: String, amount: Byte, price: Int) {
    var total = amount * price

    println("3: $name = $amount X $price   -> =${total} & ")

}

fun total(total1: Int, total2: Int, total3: Int) {

    println("-------------------\nTotal = ${total2 + total1 + total3}")

}