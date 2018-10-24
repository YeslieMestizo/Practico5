package pacientes

class Consulta {
    Date fecha
    String hora
    String motivo
    String diagnostico
    String tratamiento
    Paciente paciente
    
    static belongsTo = [paciente :Paciente]
    
    static constraints = {
      fecha (blank:false )
      hora(blank: false, matches:"[0-9]{2}:[0-9]{2}")
      motivo (blank: false,maxSize:500)
      diagnostico (blank: false,maxSize:500)
      tratamiento (blank: false,maxSize:500)
    }
}
