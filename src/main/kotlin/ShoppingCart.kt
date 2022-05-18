//AUFGABE 4 Polymorphie


//AUFGABE 4.1
class ShoppingCart {
val warenkorb = mutableListOf<Product>()

    fun add(product: Product) {
        warenkorb.add(product)
    }

    fun totalPrice() = warenkorb.sumOf { product: Product -> product.salesPrice() }

    fun hasFreeShipping() = if (totalPrice() > 30) "Versand kostenlos" else "Versand kostenpflichtig"

    fun getPoductByName(productName: String): Product? {
        for (products in warenkorb) {
            if (products.name == productName)
                return products
        }
            return null
    }

    fun reviewTextForProduct(productName: String) = getPoductByName(productName)?.reviews

    fun removeProductsBelowReviewScore(score: Int) {
        for (products in warenkorb) {
            if (products.meanScore() < score)
                warenkorb.remove(products)
        }
    }

    fun savedMoney(): Double {
        var savedMoney : Double = 0.0
        for (products in warenkorb) {
            if (products::class == DiscountedProduct::class || products::class == RefurbishedProduct::class) {
                products as DiscountedProduct
                savedMoney += products.moneySaved()
            }
        }
        return savedMoney
    }

    fun show() {
        println("${totalPrice().format(2)} Euro (${savedMoney().format(2)} Euro gespart)")
        for (products in warenkorb)
            println(products)
    }

}


//AUFGABE 4.2
// TODO()