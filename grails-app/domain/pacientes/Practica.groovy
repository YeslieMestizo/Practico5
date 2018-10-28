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
      fechaPrescripcion validator: {
        Date fechaActual = new Date();
          if(it>fechaActual) return ['prescripcionIncorrecta'];
        }
      fechaRealizacion validator: {fechaRealizacion,obj ->
          if(fechaRealizacion<obj.fechaPrescripcion) return ['realizacioInvalida'];
        }
      resultado (maxSize:500)
      consulta(nullable:true)
    }
}
