fun main() {


    //AUFGABE 1.4 Implementierung testen
//    val book = Product("Buch", 9.99, 30)
//    println(book.salesPrice()) //12.987
//    println(book.toString()) //Buch für 12,99 Euro
//
//    val ball = Product("Ball", 4.99, 100)
//    println(ball.salesPrice()) //9.98
//    println(ball.toString()) //Ball für 9,98 Euro
//
//    val candy = DiscountedProduct("Suessigkeiten", 1.99, 30, 20)
//    println(candy.salesPrice()) //2.0696000000000003
//    println(candy.moneySaved()) //0.5173999999999999
//    println(candy.toString()) //Süßigkeiten für 2,07 Euro (0,52 Euro gespart )
//
//
//    val phone = RefurbishedProduct("Handy", 299.99, 20, 20, Quality.USED)
//    println(phone.salesPrice()) //287.9904
//    println(phone.moneySaved()) //71.99759999999999
//    println(phone.toString()) //Handy für 287,99 Euro (72,00 Euro gespart ) ( Gebraucht )
//
//    val picture = LimitedProduct("Bild", 49.99, 150, 10)
//    println(picture.salesPrice()) //237.45250000000001
//    println(picture.toString()) //Bild für 237,45 Euro (nur 10 Exemplare verfügbar)


    //AUFGABE 2 Dynamische Bindung

    //AUFGABE 2.1 Begriffsdefinition
//    TODO() Was ist Dynamische Bindung? Geben Sie ein Beispiel


    //AUFGABE 2.2 Typkompatibilität

//    val p1: Product = Product("Buch", 9.99, 30)
//    val p2: Product = DiscountedProduct("Süßigkeiten ", 1.99, 30, 20)
//    val p3: Product = RefurbishedProduct("Handy", 299.99, 20, 20, Quality.USED)
////    val p4: DiscountedProduct = p1 //Compilezeitfehler
//    val p5: DiscountedProduct = p3 as RefurbishedProduct
////    val p6: DiscountedProduct = p2 as RefurbishedProduct //Laufzeitfehler
////    val p7: RefurbishedProduct = DiscountedProduct ("Süßigkeiten", 1.99, 30, 20) //Compilezeitfehler
////    val p8: Product = p1 as Any //Compilezeitfehler
//    val p9: Any = p1

    //AUFGABE 3.4 Interface Implementierungen testen
//    val book = Product("Buch", 9.99, 30)
//    book.addReview(StarReview(5))
//    book.addReview(StarReview(0))
//    book.addReview(StarReview(1))
//    book.addReview(StarReview(2))
//    book.addReview(StarReview(4))
//    book.addReview(StarReview(-2))
//    book.addReview(StarReview(8))
//    book.addReview(ThumbBasedReview(false))
//
//
//    val picture = LimitedProduct("Bild", 49.99, 150, 10)
//    picture.addReview(ThumbBasedReview(true))
//    picture.addReview(ThumbBasedReview(false))
//    picture.addReview(ThumbBasedReview(false))
//    picture.addReview(ThumbBasedReview(true))
//
//    println("infoText() for book.reviews")
//    for (review in book.reviews)
//        println(review.infoText())
//    println()
//
//    println("score() for book.reviews")
//    for (review in book.reviews)
//        println(review.score())
//    println()
//
//
//    println("infoText() for picture.reviews")
//    for (review in picture.reviews)
//        println(review.infoText())
//    println()
//
//
//    println("score() for picture.reviews")
//    for (review in picture.reviews)
//        println(review.score())


    //AUFGABE 4.4 Polymorphie Implementierung testen
    val cart = ShoppingCart()
    cart.add(Product("Buch", 9.99, 30))
    cart.add(Product("Ball", 4.99, 100))
    cart.add(DiscountedProduct("Suessigkeiten", 1.99, 30, 20))
    cart.add(RefurbishedProduct("Handy", 299.99, 20, 20, Quality.USED))
    cart.add(LimitedProduct("Bild", 49.99, 150, 10))
    cart.show()



}

