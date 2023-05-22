package trabajogrupal_poo;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Estudiante {
    private String nombre;
    private int edad;
    private List<Materia> materias;

    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.materias = new ArrayList<>();
    }
    public void agregarMateria(Materia materia) {
        materias.add(materia);
    }
    public void evaluarMaterias() {
        Scanner entrada = new Scanner(System.in);
        for (Materia materia : materias) {
            System.out.println("Evaluando materia: " + materia.getNombre());
            boolean aprobada = materia.aprobada();
            System.out.println("Estado: " + (aprobada ? "Aprobada" : "Reprobada"));            
            if (!aprobada) {
                System.out.println("Debe rendir un examen de recuperación");
                materia.rendirRecuperacion(3.5);
                System.out.println("Nota del examen de recuperación: " + materia.getRecuperacion());
                boolean aprobadaRecuperacion = materia.aprobada();
                System.out.println("Estado después del examen de recuperación: " +
                        (aprobadaRecuperacion ? "Aprobada" : "Reprobada"));
                System.out.println("\t");
            }
            if (aprobada == false) {
                System.out.println("El estudiante ha reprobadola materia");
                System.out.println("¿DESEA REALIZAR EL EXAMEN DE CONVALIDACION?(Y/N)");
                String opcion = entrada.nextLine();
                if (opcion.equalsIgnoreCase("Y")) {
                    System.out.println("El estudiante ha optado por dar un examen de convalidación");
                    System.out.println("Ha aprobado la materia");    
                }else{
                    System.out.println("El estudiante no dará un examen de convalidación.");
                    System.out.println("Ha reprobado la materia");
                }
            }else{
                System.out.println("Ha aprobado la materia");
            }
            }
            System.out.println();
        }
}
class Materia {
    private String nombre;
    private double acd;
    private double ape;
    private double aa;
    private double notaTotal;
    private double recuperacion;

    public Materia(String nombre, double acd, double ape, double aa) {
        this.nombre = nombre;
        this.acd = acd;
        this.ape = ape;
        this.aa = aa;
    }
    public String getNombre() {
        return nombre;
    }
    public double getRecuperacion() {
        return recuperacion;
    }
    public boolean aprobada() {
        double sumatoria = acd + ape + aa;
        double porcentaje = (sumatoria / 10) * 100;
        return porcentaje >= 70;
        
    }
    public void rendirRecuperacion(double nota) {
        recuperacion = nota;
    } 

    public double getNotaTotal() {
        return notaTotal;
    }

    public void setNotaTotal(double notaTotal) {
        this.notaTotal = notaTotal;
    }
    
}
