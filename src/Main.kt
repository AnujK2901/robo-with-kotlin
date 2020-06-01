fun main() {
    println("----------- Welcome ------------")
    val myRobot = Robot("Wall-E")
    println("--- Robot ${myRobot.name} initialized ---")

    val daysException = listOf("Sunday", "Saturday") //daysException
    val today = "Friday" //Today
    val whatToWear: (String) -> String = { whatDayIsIt: String ->
        when (whatDayIsIt) {
            "Sunday" -> "Long-Sleeved Shirt + Shorts"
            "Monday" -> "T-Shirt and Trousers"
            "Tuesday" -> "Leather Jacket + Tee + Jeans"
            "Wednesday" -> "Leather Jacket + Shirt + Trousers"
            "Thursday" -> "Crew Neck Jumper + Collared Shirt"
            "Friday" -> "Polo Shirt + Chinos"
            "Saturday" -> "Pea Coat + Chunky Jumper + Heavyweight Legwear"
            else -> "Long-Sleeved Shirt + Shorts"
        }
    }

    println("\n-------- Setting Alarm ---------")
    myRobot.ringAlarm(5, 30, daysException)
    println("---------- Alarm Set -----------")

    println("\n-------- Making Coffee ---------")
    myRobot.makeCoffee(5, today)
    println("--------- Coffee Made ----------")

    println("\n-------- Heating Water ---------")
    myRobot.heatWater(98.6f, daysException, today)
    println("-------- Water  Heated ---------")

    println("\n--------- Packing Bag ----------")
    myRobot.packBag(today)
    println("--------- Bag  Packed ----------")

    println("\n--------- Cooking Food ---------")
    myRobot.cookBreakfastAndLunch("Breakfast")
    println("--------- Bag  Packed ----------")

    println("\n--------- Ironing Food ---------")
    myRobot.ironClothes(whatToWear(today))
    println("------- Clothes  Ironed --------")

    println("\n----- Terminating Program ------")
    println("-- ${myRobot.name} has been shut down ---")
}