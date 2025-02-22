class Estudiante(nombre: String, edad: Int, private val calificacionPromedio: Double): Persona(nombre, edad) {
    override fun mostrarRol() {
        println("Estudiante")
    }

    fun mostraCalificacion(){
        println("Calificacion Promedio: $calificacionPromedio")
    }
}