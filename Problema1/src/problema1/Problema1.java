package problema1;
import java.util.Scanner;
public class Problema1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreHospital, direccionn, ciudadd, prov;
        int  esp;
        System.out.print("Ingrese nombre del Hospital: ");
        nombreHospital = sc.nextLine();
        
        System.out.print("Ingrese direccion del Hospital: ");
        direccionn = sc.nextLine();
        
        System.out.print("Ingrese el nombre de la Ciudad en donde se encuentre el Hospital: ");
        ciudadd = sc.nextLine();
        
        System.out.print("Ingrese el nombre de la Provincia: ");
        prov = sc.nextLine();
        
        System.out.print("Ingrese el numero de especialidades: ");
        esp = sc.nextInt();
        
        Ciudad ciudad = new Ciudad(ciudadd,prov,esp);
        EntidadHospitalaria hospital = new EntidadHospitalaria(nombreHospital, direccionn, ciudad, esp);
        
        System.out.print("\nIngrese el numero de doctores: ");
        int nDoc = sc.nextInt();
        
        for(int i = 0; i<nDoc; i++){
            System.out.print("\nIngrese el nombre del doctor " + (i+1) + " : ");
            sc.nextLine();
            String nombreDoc = sc.nextLine();
            System.out.print("Ingrese la especialidad: ");
            String espe = sc.nextLine();
            System.out.print("Sueldo mensual: ");
            double sueldoDoc = sc.nextDouble();
            Medico medico = new Medico(nombreDoc, espe, sueldoDoc);
            hospital.agregarMedico(medico);
        }
        
        
        System.out.print("\nIngrese el numero de enfermeros: ");
        int nEnf = sc.nextInt();
        for(int i = 0; i<nEnf; i++){
            System.out.print("\nIngrese el nombre del enfermero " + (i+1) + " : ");
            sc.nextLine();
            String nombreEnf = sc.nextLine(); 
            System.out.print("Tipo (nombramiento/contrato): ");
            String nombCon = sc.nextLine();
            System.out.print("Sueldo mensual: ");
            double sueldoEnf = sc.nextDouble();
            Enfermero enfermero = new Enfermero(nombreEnf, nombCon, sueldoEnf);
            hospital.agregarEnfermero(enfermero);   
        }
        
            System.out.println(hospital);  
            
         
    }
    
}
