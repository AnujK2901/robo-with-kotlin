sealed class Food {
    abstract val time: String
    abstract val foodChoices: List<String>
}

class Breakfast : Food() {
    override val time = "Morning"
    override val foodChoices: List<String> = listOf("Eggs", "Sandwich", "Milkshake", "Noodles", "Corn Flakes")
}

class Lunch : Food() {
    override val time = "Afternoon"
    override val foodChoices: List<String> = listOf("Rice and Vegetables", "Omelette", "Cheese Pizza", "Ratatouille")
}