package trabajogrupal_poo;
import java.util.Random;
import java.util.Scanner;
public class Ejecutor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del estudiante: ");
        String nombreEstudiante = scanner.nextLine();
        System.out.print("Ingrese la edad del estudiante: ");
        int edadEstudiante = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Ingrese la cantidad de materias: ");
        int cantidadMaterias = scanner.nextInt();
        scanner.nextLine();
        Estudiante estudiante = new Estudiante(nombreEstudiante, edadEstudiante);
        Random random = new Random();
        for (int i = 0; i < cantidadMaterias; i++) {
            System.out.print("Ingrese el nombre de la materia " + (i + 1) + ": ");
            String nombreMateria = scanner.nextLine();

            double acd = random.nextDouble() * 3.5;
            double ape = random.nextDouble() * 3.5;
            double aa = random.nextDouble() * 10;

            Materia materia = new Materia(nombreMateria, acd, ape, aa);
            estudiante.agregarMateria(materia);
        }
        estudiante.evaluarMaterias();
    }
}

