package problema1;
public class Medico {
    private String nombre;
    private String especialidad;
    private double sueldo;

    public Medico(String nombre, String especialidad, double sueldo) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.sueldo = sueldo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public double getSueldo() {
        return sueldo;
    }

    @Override
    public String toString() {
       String msj = String.format(" \n- %s " 
               +" - sueldo:%.2f"
               +" - %s "
               , getNombre(),getSueldo(),getEspecialidad());
       return msj;
    }
    
    
    
}
