package pacientes

class Paciente {
  BigInteger nroDocumento
  String apellido
  String nombre
  String sexo
  Date fechaNacimiento
  String telefono
  String email
<<<<<<< HEAD
  //static hasMany = [consultas: Consulta]
  static hasMany = [practicas: Practica, consultas: Consulta]
=======
  static hasMany = [consultas: Consulta]
>>>>>>> 5a96dfefa37449cb7c52757a97e58f60364861cb

    static constraints = {
      nroDocumento(blank:false, unique:true)
      apellido(blank: false, maxSize:100)
      nombre(blank: false, maxSize:100)
      sexo (blank: false, inList:['F','M'])
      //fechaNacimiento (blank:false,validator: (it.year >2018))
      //fechaNacimiento (blank:false,validator: { if ( it.year >2018) return ['anioIncorrecto'] } )
      fechaNacimiento (blank:false)
      telefono(blank: false, matches:"[0-9]{3}-[1-9]{6}")
      telefono(blank: false, matches:"[0-9]{3}-[0-9]{6}")
      email (nullable: true, email:true)
    }
}
