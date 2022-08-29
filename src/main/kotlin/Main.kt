fun main(args: Array<String>) {
    val minCommission = 35
    val commission = 0.75
    val coins = 0.01
    val amount = 100_59
    val rubSymbol = "\u20BD"
    if (amount - (amount*commission) < minCommission/coins)
        println("Сумма перевода составит: ${(amount + (minCommission/coins)) * coins}$rubSymbol")
    else
        println("Сумма перевода составит: ${((amount + (amount*commission)).toInt()) * coins}$rubSymbol")
}