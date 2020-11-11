package model

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