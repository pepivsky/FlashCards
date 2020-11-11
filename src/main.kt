import kotlin.math.log

fun main() {
    showBienvenida()

    when(getInput()) {
        "1" -> login()
        "2" -> println("registrarse")
    }
}

fun showBienvenida() {
    println("""
        *******Flashcards******* 
        bienvenido! :)
        Selecciona una opcion (1.Iniciar sesion/2.registrarse/0.Salir)
    """.trimIndent())

}
fun getInput(): String {
    val userInput: String = readLine()?.trim() ?: "0"
    return userInput
}
fun login() {
    println("Iniciar sesion")
    println("ingresa tu username y password :)")
    val userName = getInput()
    val password = getInput()
    if (userName == "pepe" && password == "pepe1997") {
        //TODO poner un delay de 2 segundos con coroutines
        println("login exitoso!")
        showMenuPrincipal()
    } else {
        println("Algo ha salido mal :( revisa tus datos")
    }
}

fun showMenuPrincipal() {
    println("""
        *****Menu principal*****
        selecciona una opcion(1.Crear una coleccion/2.Ver mis colecciones/0.Salir)
    """.trimIndent())
    val opcion = getInput()
}
