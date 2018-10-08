package pacientes

class Paciente {
    BigInteger nroDocumento
    String apellido
    String sexo
    Date fechaNacimiento

    static constraints = {
        nroDocumento (blank: false, unique: true)
        apellido (blank: false, maxSize:100)
        sexo (blank: false, inList:['F','M'])
        fechaNacimiento (blank: false)
    }
}
