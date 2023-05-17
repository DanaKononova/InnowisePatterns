package com.example.innowisepatterns.coffe_builder

class CoffeeBuilder : Builder {

    private val components = mutableListOf<String>()

    override fun reset(): Builder {
        components.clear()
        return this
    }

    override fun addCoffee(): Builder {
        components.add("Coffee")
        return this
    }

    override fun addDoubleCoffee(): Builder {
        components.add("Double Coffee")
        return this
    }

    override fun addMilk(): Builder {
        components.add("Milk")
        return this
    }

    override fun addCream(): Builder {
        components.add("Cream")
        return this
    }

    override fun addSugar(): Builder {
        components.add("Sugar")
        return this
    }

    override fun addCinnamon(): Builder {
        components.add("Cinnamon")
        return this
    }

    override fun addSyrup(): Builder {
        components.add("Syrup")
        return this
    }

    override fun build(): Coffee {
        return Coffee(components)
    }

}