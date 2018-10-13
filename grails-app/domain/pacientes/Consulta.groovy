package pacientes

class Consulta {
    Date fecha
    String hora
    String motivo
    String diagnostico
    String tratamiento
    static constraints = {
      fecha (blank:false )
      hora(blank: false)
      motivo (blank: false,maxSize:500)
      diagnostico (blank: false,maxSize:500)
      tratamiento (blank: false,maxSize:500)
    }
}
