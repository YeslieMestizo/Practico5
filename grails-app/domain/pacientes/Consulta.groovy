package pacientes

class Consulta {
<<<<<<< HEAD

=======
>>>>>>> 24910d619bf98bf8c198c3bed3e40d3d7ac0467b
    Date fecha
    String hora
    String motivo
    String diagnostico
    String tratamiento
    static constraints = {
      fecha (blank:false )
      hora(blank: false, matches:"[0-9]{2}:[0-9]{2}")
      motivo (blank: false,maxSize:500)
      diagnostico (blank: false,maxSize:500)
      tratamiento (blank: false,maxSize:500)
    }
}
