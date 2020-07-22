import ui.UIMenu;

import javax.print.Doc;

import java.util.Date;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        // showMenu();
        Doctor myDoctor = new Doctor("Anahi Salgado", "jose@email.com", "Pediatria");
        myDoctor.addAvaliableAppointmen(new Date(), "4pm");
        myDoctor.addAvaliableAppointmen(new Date(), "10pm");
        for (Doctor.AvailableApointment cita: myDoctor.getAvailableApointments()){
            System.out.println(cita.getDate() + "  " + cita.getTime());
        }
        //System.out.println(myDoctor.speciality);

        Patient patient = new Patient("Alejandra", "alejandra@mail.com");
        System.out.println(patient.toString());

    }
}
