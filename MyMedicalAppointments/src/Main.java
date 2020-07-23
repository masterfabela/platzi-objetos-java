import model.Doctor;
import model.Patient;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // showMenu();
        Doctor myDoctor = new Doctor("Anahi Salgado", "jose@email.com", "Pediatria");
        myDoctor.addAvaliableAppointmen(new Date(), "4pm");
        myDoctor.addAvaliableAppointmen(new Date(), "10pm");
        System.out.println(myDoctor);
        //System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient.toString());

    }
}
