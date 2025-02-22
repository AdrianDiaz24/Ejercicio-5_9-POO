class Profesor(nombre: String, edad: Int, private val aniosExperiencia: Int): Persona(nombre, edad) {

    override fun mostrarRol() {
        println("Profesor")
    }

    fun mostrarExperiencia(){
        println("Años de Experiencia: $aniosExperiencia")
    }

}