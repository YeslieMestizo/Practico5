package pacientes

class TipoPractica {
    int codigo
    String nombre


    static constraints = {
        codigo (size: 6, blank:false, unique:true)
        nombre (blank:false, maxSize:100)
    }

    
}
