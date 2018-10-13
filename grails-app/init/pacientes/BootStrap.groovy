package pacientes
import pacientes.Paciente
import grails.validation.ValidationException

class BootStrap {
    def init = { servletContext ->
        /*Ejercicio 1
        Crear 2 instancias de la clase Paciente(paciente1 y paciente2),1 con todas sus
        propiedades correctas y otra instancia con algún atributo incorrecto*/
        def paciente1 = new Paciente(nroDocumento:22137612, apellido:'LOPEZ',nombre:'LUIS',sexo:'M', fechaNacimiento:Date.parse('yyyy-mm-dd','1998-04-23'), telefono:30813221123, email:'lulo@gmail.com')
        def paciente2 = new Paciente(nroDocumento:22134612, apellido:'CANO',nombre:'MATHIAS',sexo:'M', fechaNacimiento:Date.parse('yyyy-mm-dd','1995-11-14'), telefono:33233476688, email:'maty@gmail.com')
        paciente1.save()
        paciente2.save()
        if(paciente1.equals(paciente2)){
            println "ERROR"
        }
        //def fechaD = Date.parse('yyyy-MM-dd','2014-09-01')
        //def fechaH = Date.parse('yyyy-MM-dd','2016-08-30')
        def listaPaciente= Paciente.findAll("from Paciente")// as p where p.fechaNacimiento>=? and p.fechaNacimiento<=?",[fechaD,fechaH])
        println listaPaciente
    }
    def destroy = {
    }
}
