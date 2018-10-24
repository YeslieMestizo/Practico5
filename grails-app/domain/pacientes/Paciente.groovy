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
  static hasMany = [practicas: Practica, consultas: Consulta]

    static constraints = {
      nroDocumento(blank:false, unique:true)
      apellido(blank: false, maxSize:100)
      nombre(blank: false, maxSize:100)
      sexo (blank: false, inList:['F','M'])
      fechaNacimiento validator: {
        Date fechaActual = new Date();
          if(it>fechaActual) return ['anioIncorrecto'];
      }
      telefono(blank: false, matches:"[0-9]{3}-[0-9]{6}")
      email (nullable: true, email:true)
    }
}
