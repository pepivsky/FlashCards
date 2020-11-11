import model.Collecion
import model.Tarjeta

fun main() {
    val listaColecciones = mutableListOf<Collecion>() //lista mutable vacia
    val listaTarjetas = mutableListOf<Tarjeta>()
    val input: String

    val pepe = Usuario("pepe", "manuel", listaColecciones)
    println("1.ver mis colecciones/0.Salir")
    input = getUInput()

    when (input) {
        "1" -> {
            println("Viendo colecciones")
            if (listaColecciones.isEmpty()) {
                println("No hay colecciones")
                println("Creando una...")
                println("Ingresa el titulo de la coleccion")
                val titulo = readLine().toString()
                listaColecciones.add(Collecion(titulo, listaTarjetas))
                println("Bien, ahora crea una tarjeta :)")
                var crearOtra: String
                do {
                    println("Ingresa el concepto")
                    val concepto = readLine().toString()
                    println("Ingresa su definicion")
                    val definicion = readLine().toString()
                    listaTarjetas.add(Tarjeta(concepto, definicion))
                    println(listaTarjetas)
                    println("Deseas crear otra?(Y/N)")
                    crearOtra = readLine().toString()
                } while (crearOtra != "N")

                println("Mostrando las tarjetas")
                println(listaColecciones)

            } else {

                for ((index, element) in listaColecciones.withIndex()) {
                    println("${index + 1} = $element ")
                }
            }
        }
    }

}

fun getUInput(): String {
    val userInput: String = readLine()?.trim() ?: "0"
    return userInput
}

fun verColecciones() {

}

data class Usuario(val username: String, val password: String, val listaColecciones: MutableList<Collecion>) {
    fun crearColeccion(coleccion: Collecion) { //crea la coleccion
        listaColecciones.add(coleccion)
    }

    fun getColeccion(): List<Collecion> {
        return this.listaColecciones
    }

    fun eliminarColeccion() {

    }

    fun crearTarjeta() {

    }

    fun eliminarTarjeta() {

    }


}




