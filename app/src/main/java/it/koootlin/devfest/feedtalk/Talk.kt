package it.koootlin.devfest.feedtalk

data class Talk(var id: String = "", var title: String = "", var speaker: String = "") {
    var feedback: String = ""
    var rating: Float = -1f
}