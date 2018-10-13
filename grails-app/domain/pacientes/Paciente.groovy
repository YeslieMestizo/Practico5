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
      apellido(blank: false, maxSize:100)
      nombre(blank: false, maxSize:100)
      sexo (blank: false, inList:['F','M'])
      //fechaNacimiento (blank:false,validator: { if ( it >2018) return [‘anioIncorrecto’] } )
      fechaNacimiento (blank:false)
        telefono(blank: false)
      email (nullable: true, email:true)
    }

}
