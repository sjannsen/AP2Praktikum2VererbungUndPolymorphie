//AUFGABE 3 Interface

//AUFGABE 3.1 Begriffsdefinition
// TODO() Begriffsdefinition
//Was ist ein Interface? Worin unterscheidet sich ein Interface zu einer Oberklasse?


//AUFGABE 3.2 Reviews implementieren
interface Review {
    fun score(): Int
    fun infoText(): String
}

class StarReview(val score: Int) : Review  {
    override fun score() = if (score < 0) 0 else if (score > 5) 5 else score

    override fun infoText(): String {
//        if (score == 0)
//            return "Schlechtes Produkt"
//        else if (score == 1)
//            return ""
//        else if (score == 2)
//            return  ""
//        else if (score == 3)
//            return "Brauchbares Produkt"
//        else if (score == 4)
//            return ""
//        else
//            return "Super Produkt"
        return when (score()) {
            0 -> "Katastrophales Produkt"
            1 -> "Schlechtes Produkt"
            2 -> "Fast schlecht"
            3 -> "Brauchbares Produkt"
            4 -> "Gutes Produkt"
            5 -> "Super Produkt"
            else -> ""
        }
    }
}

class ThumbBasedReview(val thumbsUp : Boolean) : Review {
    override fun score() = if (thumbsUp) 5 else 0
    override fun infoText() = if (thumbsUp) "Daumen hoch" else "Daumen runter"
}