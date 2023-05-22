package problema1;
public class Ciudad {
    private String nombreCiudad;
    private String nombreProvincia;


    public Ciudad(String nombreCiudad, String nombreProvincia, int nEspecialidades) {
        this.nombreCiudad = nombreCiudad;
        this.nombreProvincia = nombreProvincia;

    }

    public void setNombreCiudad(String nombreCiudad) {
        this.nombreCiudad = nombreCiudad;
    }

    public void setNombreProvincia(String nombreProvincia) {
        this.nombreProvincia = nombreProvincia;
    }


    public String getNombreCiudad() {
        return nombreCiudad;
    }

    public String getNombreProvincia() {
        return nombreProvincia;
    }

   

    @Override
    public String toString() {
       String msj = String.format("Ciudad: %s " 
               +"Provincia: %s"
               , getNombreCiudad(),getNombreProvincia());
       return msj;
    }
    
}
