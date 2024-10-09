package com.ejemplomvvm.camilotaller4.model

class QuoteProvider {
    companion object {
        fun random(): QuoteModel {
        val position = (0..10).random()
            return quote[position]
        }

       private val quote = listOf<QuoteModel>(
            QuoteModel(
                quote = "El éxito no es la clave de la felicidad. La felicidad es la clave del éxito. Si amas lo que haces, tendrás éxito.",
                author = "Albert Einstein"
            ),
            QuoteModel(
                quote = "El único modo de hacer un gran trabajo es amar lo que haces.",
                author = "Steve Jobs"
            ),
            QuoteModel(
                quote = "No importa lo fuerte que golpeas sino lo fuerte que eres cuando te golpean",
                author = "Rocky Balboa"
            ),
            QuoteModel(
                quote = "El éxito es la suma de pequeños esfuerzos repetidos día tras día.",
                author = "Robert Collier"
            ),
            QuoteModel(
                quote = "Hay que trabajar, hay que aprender, hay que comer, hay que descansar y también hay que jugar",
                author = "Maestro Roshi"
            ),
            QuoteModel(
                quote = "Software Developer-An organism that turns caffeine into software",
                author = "Anonymous"
            ),
            QuoteModel(
                quote = "No hay caminos para la paz; la paz es el camino.",
                author = "Mahatma Gandhi"
            ),
            QuoteModel(quote = "Things arent always #000000 and #FFFFFF", author = "Anonymous"),
            QuoteModel(quote = "Talk is cheap.show me the code", author = "Linus Torvalds"),
            QuoteModel(
                quote = "Software and cathedrals are much the same — first we build them, then we pray.",
                author = "Anonymous"
            ),
            QuoteModel(
                quote = "The secret of getting ahead is getting started.",
                author = "Mark Twain"
            )
        )

    }
}
