package pacientes
import pacientes.Paciente
import grails.validation.ValidationException

class BootStrap {

    def init = { servletContext ->
    def paciente1 = new Paciente(fechaNacimiento:Date.parse('yyyy-MM-dd','2015-10-20'),nroDocumento:39805642,apellido:'MIRANDA',sexo:'M')
    if(!paciente1.save(flush:true)){
      paciente1.errors.allErrors.each{
        println it
      }
    }

    def fechaD = Date.parse('yyyy-MM-dd','2014-09-01')
    def fechaH = Date.parse('yyyy-MM-dd','2016-08-30')
    def listaPaciente= Paciente.findAll("from Paciente as p where p.fechaNacimiento >= ? and p.fechaNacimiento<=?",[fechaD,fechaH])
    println listaPaciente


    }
    def destroy = {
    }
}
