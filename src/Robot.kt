class Robot(var name: String) {

    fun ringAlarm(hour: Int, minute: Int, daysExcept: List<String>) {
        println("Alarm will ring at $hour:$minute each day except on ${daysExcept.joinToString()}")
    }

    fun makeCoffee(sugarAmount: Int, today: String) {
        val type: String = when (today) {
            "Sunday" -> "With Milk"
            "Monday" -> "Black"
            "Tuesday" -> "With Milk"
            "Wednesday" -> "Black"
            "Thursday" -> "Black"
            "Friday" -> "With Milk"
            "Saturday" -> "Black"
            else -> "Null"
        }

        val coffee: Coffee = Coffee(type, sugarAmount)

        when (coffee.type) {
            "With Milk" -> {
                println("Coffee ${coffee.type} has been prepared with ${coffee.sugarAmount} amounts of sugar.")
            }
            "Black" -> {
                println(("${coffee.type} Coffee has been prepared with ${coffee.sugarAmount} amounts of sugar."))
            }
            else -> {
                println(("Unknown Coffee has been prepared with ${coffee.sugarAmount} amounts of sugar."))
            }
        }
    }

    fun heatWater(temperature: Float, daysExcept: List<String>, today: String) {
        if (daysExcept.contains(today)) {
            println("Water has not been heated today.")
        } else {
            println("Water has been heated at $temperature today.")
        }
    }

    fun packBag(today: String) {
        val booksList: List<String> = when (today) {
            "Sunday" -> listOf("Science", "Maths")
            "Monday" -> listOf("History", "Economics")
            "Tuesday" -> listOf("Mathematics", "Physics")
            "Wednesday" -> listOf("Chemistry", "Computer Science")
            "Thursday" -> listOf("Physics", "Chemistry")
            "Friday" -> listOf("Computer Science", "Electronics")
            "Saturday" -> listOf("Biotechnology", "Biology")
            else -> listOf("Null")
        }
        println("I have packed books of ${booksList.joinToString()} in your bag. Go break Eggs :)")

    }

    fun cookBreakfastAndLunch(whatToPrepare: String) {
        if (whatToPrepare == "Breakfast") {
            println("I have prepared ${Breakfast().foodChoices.random()} in Breakfast.")
        } else if (whatToPrepare == "Lunch") {
            println("I have prepared ${Lunch().foodChoices.random()} in Lunch.")
        }
    }

    fun ironClothes(whatToPrepare: String) {
        println("I have ironed and readied $whatToPrepare for you to wear. You will look gorgeous.")
    }

}
