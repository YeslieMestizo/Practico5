package pacientes

class Practica {
    Date fechaPrescripcion
    Date fechaRealizacion
    String resultado
    Paciente paciente
    //static belongsTo = [paciente: Paciente]
<<<<<<< HEAD
    static belongsTo = [tipoPractica: TipoPractica, paciente: Paciente]
=======
    Consulta consulta
    TipoPractica tipoPractica
>>>>>>> 5a96dfefa37449cb7c52757a97e58f60364861cb

    static constraints = {
        fechaPrescripcion (blank:false)
        //fechaRealizacion (blank:false, validator: {fechaPrescripcion-> if (it < fechaPrescripcion) return [‘fechaRealizacioInvalida’]} )
        resultado (maxSize:500)
        consulta(nullable:true)
    }
}
