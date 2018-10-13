package pacientes

class Practica {
    Date fechaPrescripcion
    Date fechaRealizacion
    String resultado
    static belongsTo = [paciente: Paciente]

    static constraints = {
        fechaPrescripcion (blank:false)
        //fechaRealizacion (blank:false, validator: {fechaPrescripcion-> if (it < fechaPrescripcion) return [‘fechaRealizacioInvalida’]} )
        resultado (maxSize : 500)
    }
}
