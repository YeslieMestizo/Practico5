package pacientes

class Practica {
    Date fechaPrescripcion
    Date fechaRealizacion
    String resultado
    Paciente paciente
    //static belongsTo = [paciente: Paciente]
    static belongsTo = [tipoPractica: TipoPractica, paciente: Paciente]
    Consulta consulta
    TipoPractica tipoPractica

    static constraints = {
        fechaPrescripcion (blank:false)
        //fechaRealizacion (blank:false, validator: {fechaPrescripcion-> if (it < fechaPrescripcion) return [‘fechaRealizacioInvalida’]} )
        resultado (maxSize:500)
        consulta(nullable:true)
    }
}
