package pacientes

class Paciente {
  BigInteger nroDocumento
  String apellido
  String nombre
  String sexo
  Date fechaNacimiento
  String telefono
  String email
  //static hasMany = [consultas: Consulta]
  static hasMany = [practicas: Practica]

    static constraints = {
      nroDocumento(blank:false, unique:true)
<<<<<<< HEAD
      apellido(blank: false, maxSize:100)
      nombre(blank: false, maxSize:100)
      sexo (blank: false, inList:['F','M'])
      //fechaNacimiento (blank:false,validator: (it.year >2018))
      //fechaNacimiento (blank:false,validator: { if ( it.year >2018) return ['anioIncorrecto'] } )
      fechaNacimiento (blank:false)
      telefono(blank: false, matches:"[1-9]{3}-[1-9]{6}")
      email (nullable: true, email:true)
=======
      apellido(blank:false, maxSize:100)
      nombre(blank:false, maxSize:100)
      sexo (blank:false, inList:['F','M'])
      //fechaNacimiento (blank:false,validator: { if ( it >2018) return [‘anioIncorrecto’] } )
      fechaNacimiento (blank:false)
      telefono (blank:false)
      email (nullable:true, email:true)
>>>>>>> 24910d619bf98bf8c198c3bed3e40d3d7ac0467b
    }
}
