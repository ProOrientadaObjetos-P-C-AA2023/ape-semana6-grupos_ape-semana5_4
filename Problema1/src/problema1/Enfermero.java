package problema1;
public class Enfermero {
    private String nombre;
    private String tipo;
    private double sueldo;

    public Enfermero(String nombre, String tipo, double sueldo) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
       String msj = String.format("\n - %s " 
               +" - sueldo:%.2f"
               +" - %s "
               , getNombre(),getSueldo(),getTipo());
       return msj;
    }
   
    
}
