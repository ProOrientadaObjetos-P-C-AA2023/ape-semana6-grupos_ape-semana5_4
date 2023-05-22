package problema1;
public class EntidadHospitalaria {
   private String nombre; 
   private String direccion;
   private Ciudad ciudad;
   private int numEspe;
   private Medico[] medicos;
   private Enfermero[] enfermeros;
   private int contadorMed;
   private int contadorEnf;

    public EntidadHospitalaria(String nombre, String direccion, Ciudad ciudad, int numEspe) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.numEspe = numEspe;
        this.contadorMed = 0;
        this.contadorEnf = 0;
        this.medicos = new Medico[100]; // Suponemos un máximo de 100 médicos
        this.enfermeros = new Enfermero[100]; // Suponemos un máximo d
    }
    

    public void agregarMedico(Medico medico) {
        medicos[contadorMed] = medico;
        contadorMed++;
    }

    public void agregarEnfermero(Enfermero enfermero) {
        enfermeros[contadorEnf] = enfermero;
        contadorEnf++;
    }

    public double calcularTotalSueldos() {
        double totalSueldos = 0;
        for (int i = 0; i < contadorMed; i++) {
            totalSueldos = totalSueldos + medicos[i].getSueldo();
        }
        for (int i = 0; i < contadorEnf; i++) {
            totalSueldos = totalSueldos + enfermeros[i].getSueldo();
        }
        return totalSueldos;
    }
    
   @Override
    public String toString(){
        String msj;
        msj = String.format("\nHOSPITAL %s" 
                +"\nDireccion: %s" 
                +"\nCiudad: %s"
                +"\nNumero de Especialidades: %d"
                , nombre
                ,direccion
                ,ciudad
                ,numEspe);
        
        msj+="\nLista de medicos";
        for (int i = 0; i < contadorMed; i++) {
           msj += medicos[i].toString();
        }
        
        msj+="\nLista de Enfermeros";
        for (int i = 0; i < contadorEnf; i++) {
           msj += enfermeros[i].toString();
        }
        
        msj += String.format("\nTotal de sueldos a pagar por mes:%.2f", calcularTotalSueldos());
        
        return msj;
    }

 
   
}
