//AUFGABE 1 Vererbung

fun Double.format(digits: Int) = "%.${digits}f".format(this)

open class Product(val name: String, val basePrice: Double, val margin: Int) {
    open fun salesPrice(): Double = basePrice + basePrice * (margin.toDouble() / 100)
    override fun toString(): String = "$name fuer ${salesPrice().format(2)} Euro"

    //AUFGABE 3.3 Produkte um Reviews erweitern
    val reviews = mutableListOf<Review>()

    fun addReview(review: Review) {
        reviews.add(review)
    }

    fun meanScore(): Double {
        var meanScore = 0.0
        for (review in reviews)
            meanScore += review.score()
        return meanScore / reviews.count()
    }
}

open class DiscountedProduct(name: String, basePrice: Double, margin: Int, val discount: Int) : Product(name, basePrice, margin) {
    override fun salesPrice(): Double = super.salesPrice() - super.salesPrice() * (discount.toDouble() / 100)
    fun moneySaved(): Double = super.salesPrice() * (discount.toDouble() / 100)
    override fun toString(): String = super.toString() + " (${moneySaved().format(2)} Euro gespart)"
}

enum class Quality {
    GOOD { override fun toString() = "Gut"},
    USED { override fun toString() = "Gebraucht"},
    BAD { override fun toString() = "Schlecht"};
    abstract override fun toString(): String
}

class RefurbishedProduct(name: String, basePrice: Double, margin: Int, discount: Int, val quality: Quality) :
    DiscountedProduct(name, basePrice, margin, discount) {
    override fun toString(): String = super.toString() + " (${this.quality})"
}

class LimitedProduct(name: String, basePrice: Double, margin: Int, val totalNumberOfProducts: Int) :
    Product(name, basePrice, margin) {
    override fun salesPrice(): Double = super.salesPrice() * (1 + (100 - totalNumberOfProducts).toDouble() / 100)
    override fun toString(): String = super.toString() + " (nur $totalNumberOfProducts Exemplare verfuegbar)"
}

