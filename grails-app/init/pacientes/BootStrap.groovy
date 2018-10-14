package pacientes
import pacientes.Paciente
import grails.validation.ValidationException

class BootStrap {
    def init = { servletContext ->
        /*Ejercicio 1
        Crear 2 instancias de la clase Paciente(paciente1 y paciente2),1 con todas sus
        propiedades correctas y otra instancia con algún atributo incorrecto*/
        Paciente paciente1 = new Paciente(nroDocumento:22137612,apellido:'LOPEZ',nombre:'LUIS',sexo:'M',fechaNacimiento:Date.parse('yyyy-MM-dd','1998-04-23'),telefono:30813221123,email:'lulo@gmail.com')
        Paciente paciente2 = new Paciente(nroDocumento:22134612,apellido:'CANO',nombre:'MATHIAS',sexo:'M',fechaNacimiento:Date.parse('yyyy-MM-dd','1995-11-14'),telefono:33233476688,email:'maty@gmail.com')
        paciente1.save()
        paciente2.save()
        if(!paciente1.save(flush:true)){
          paciente1.errors.allErrors.each{
            println it
          }
        }
        if(paciente1.equals(paciente2)){
            println "ERROR"
        }
        def listaPaciente = Paciente.findAll("from Paciente")
        def listaPacs = [paciente1,paciente2]
        //def listaPacs = [listaPaciente]
        //println listaPaciente
        for(pac in listaPacs) {
            println "DNI "+pac.nroDocumento+", Apellido: "+pac.apellido+", Nombre: "+pac.nombre+", Sexo: "+pac.sexo+", Fecha nacimiento: "+pac.fechaNacimiento
        }
    
        /*Ejercicio 2
        Crear y guardar dos instancias de la clase “Consulta” correspondientes al “paciente1”.*/
        Consulta consulta1 = new Consulta (fecha:Date.parse('yyyy-MM-dd','2015-10-13'),hora:'12:12',motivo:'consulta',diagnostico:'Nada complicado',tratamiento:'reposo',paciente:paciente1)
        Consulta consulta2 = new Consulta (fecha:Date.parse('yyyy-MM-dd','2015-10-15'),hora:'10:12',motivo:'consulta',diagnostico:'grave',tratamiento:'pastilla xx',paciente:paciente2)
        
        /*Ejercicio 3
        Crear y guardar dos instancias de la clase “TipoPractica”, donde una contenga el 
        atributo codigo=231265 y otra instancia con cualquier otro dato.*/
        TipoPractica tipo1 = new TipoPractica (codigo:231265, nombre:'Ejercicio')
        TipoPractica tipo2 = new TipoPractica (codigo:3456, nombre:'Fisioterapia')
        consulta1.save()
        consulta2.save()
        tipo1.save()
        tipo2.save()

        
        /*Ejercicio 5
        Obtener e imprimir por consola una colección de todas las consultas dentro de un rango
        de fechas determinado.*/
        if(!consulta1.save(flush:true)){
            consulta1.errors.allErrors.each{
            println it
          }
        }

        def fechaFin = Date.parse('yyyy-MM-dd','2018-12-21')
        def fechaIni = Date.parse('yyyy-MM-dd','2015-10-15')
        def listaConsultas = Consulta.findAll("from Consulta as c where c.fecha>=? and c.fecha<=?", [fechaIni,fechaFin])
        //def listaD = [listaConsultas]
        println listaConsultas
        //println listaD 

        /*def lista = [consulta1, consulta2]
        println lista.size()
        for(consulta in lista) {
            println consulta
        }*/
        //println lista.get[0]
    }
    def destroy = {
    }
}
