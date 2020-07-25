package ui;

import model.Doctor;
import model.Patient;

import javax.print.Doc;
import java.util.ArrayList;
import java.util.Scanner;

public class UIMenu {

    public static final  String[] MONTHS = {"Enero", "Febrero", "Marzo",
            "Abril", "Mayo", "Junio", "Julio",
            "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public static Doctor doctorLogged;
    public static Patient patientLogged;

    public static void showMenu(){
        System.out.println("Welcome to My Appointments");
        System.out.println("Selecciona la opcion deseada");
        int response = 0;
        do {
            System.out.println("1. model.Doctor");
            System.out.println("2. model.Patient");
            System.out.println("3. Salir");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response) {
                case 1:
                    System.out.println("model.Doctor");
                    response = 0;
                    authUser(1);
                    break;
                case 2:
                    response = 0;
                    showPatientMenu();
                    authUser(2);
                    break;
                case 0:
                    System.out.println("Thank you for your visit");
                    break;
                default:
                    System.out.println("Please select a correct answer");
            }
        } while (response != 0);
    }

    static void showPatientMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("model.Patient");
            System.out.println("1. Book an appointment");
            System.out.println("2. My Appointments");
            System.out.println("0. Return");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());
            switch (response){
                case 1:
                    System.out.println("::Book an appointment");
                    for (int i = 1; i < 4; i++) {
                        System.out.println(i+". "+MONTHS[i-1]);
                    }
                    break;
                case 2:
                    System.out.println("::My appointments");
                    break;
                case 0:
                    showMenu();
                    break;
            }
        }while (response != 0);
    }

    private static void authUser(int userType){
        //userType = 1 => Doctor
        // 2 => Paciente
        ArrayList<Doctor> doctors = new ArrayList<>();
        doctors.add(new Doctor("Alejandro Martinez", "alejandro@mail.com", "crdiology"));
        doctors.add(new Doctor("Karen Sosa", "kare@email.com", "healer"));
        doctors.add(new Doctor("Rocio Gomez", "rocio@mail.com", "sanadora angelical"));

        ArrayList<Patient> pacientes = new ArrayList<>();
        pacientes.add(new Patient("Anahi Salgado", "anahi@mail.com"));
        pacientes.add(new Patient("Roberto Rodriguez", "roberto@mail.com"));
        pacientes.add(new Patient("Carlos Sanchez", "carlos@mail.com"));

        boolean emailCorrect = false;
        do {
            System.out.println("Insert your email: [a@a.com]");
            Scanner sc = new Scanner(System.in);
            String email = sc.nextLine();
            if (userType == 1){
                for (Doctor d: doctors){
                    if (d.getEmail().equals(email)){
                        emailCorrect = true;
                        // Obtener el usuario logueado
                        doctorLogged = d;
                        //show doctor menu
                        UIDoctorMenu.showDoctorMenu();
                    }
                }
            } else if (userType == 2){
                for (Patient p: pacientes){
                    if (p.getEmail().equals(email)){
                        emailCorrect = true;
                        patientLogged = p;
                    }
                }
            }
        }while (!emailCorrect);
    }

}
