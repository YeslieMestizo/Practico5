package pacientes
import pacientes.Paciente
import grails.validation.ValidationException

class BootStrap {
    def init = { servletContext ->
        /*Ejercicio 1
        Crear 2 instancias de la clase Paciente(paciente1 y paciente2),1 con todas sus
        propiedades correctas y otra instancia con algún atributo incorrecto*/
        Paciente paciente1 = new Paciente(nroDocumento:22137612, apellido:'LOPEZ',nombre:'LUIS',sexo:'M', fechaNacimiento:Date.parse('yyyy-mm-dd','1998-04-23'), telefono:30813221123, email:'lulo@gmail.com')
        Paciente paciente2 = new Paciente(nroDocumento:22134612, apellido:'CANO',nombre:'MATHIAS',sexo:'M', fechaNacimiento:Date.parse('yyyy-mm-dd','1995-11-14'), telefono:33233476688, email:'maty@gmail.com')
        paciente1.save()
        paciente2.save()
        if(paciente1.equals(paciente2)){
            println "ERROR"
        }
        def listaPaciente= Paciente.findAll("from Paciente")
        println listaPaciente.nombre


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

        /*Ejercicio 4
        Crear y guardar tres instancias de la clase “Practica”, donde dos de ellas correspondan al
        “TipoPractica” con código igual a “231265”*/
        Paciente paciente3 = new Paciente(nroDocumento:22538692, apellido:'MONO',nombre:'LEO',sexo:'M', fechaNacimiento:Date.parse('yyyy-mm-dd','1981-02-03'), telefono:332-546285, email:'leo@gmail.com')
        Practica practica1 = new Practica (fechaPrescripcion:Date.parse('yyyy-MM-dd','2018-10-13'),fechaRealizacion:Date.parse('yyyy-MM-dd','2018-10-23'),resultado:'bueno',paciente:paciente1, tipoPractica:tipo1)
        Practica practica2 = new Practica (fechaPrescripcion:Date.parse('yyyy-MM-dd','2018-11-12'),fechaRealizacion:Date.parse('yyyy-MM-dd','2018-11-28'),resultado:'medio',paciente:paciente2, tipoPractica:tipo1)
        Practica practica3 = new Practica (fechaPrescripcion:Date.parse('yyyy-MM-dd','2018-12-05'),fechaRealizacion:Date.parse('yyyy-MM-dd','2018-12-30'),resultado:'bueno',paciente:paciente3, tipoPractica:tipo2)
        paciente3.save()
        practica1.save()
        practica2.save()
        practica3.save()

        /*Ejercicio 5
        Obtener e imprimir por consola una colección de todas las consultas dentro de un rango
        de fechas determinado.*/
        //lista [] = lista.add(consulta1)
        //println lista.get[0]

        /*Ejercicio 6
        Obtener e imprimir por consola una colección todas las practicas pertenecientes al
        “paciente1” cuyo código de “TipoPractica” sea igual a “231265”.*/

    }
    def destroy = {
    }
}
