import ui.UIMenu;

import javax.print.Doc;

import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        // showMenu();
        Doctor myDoctor = new Doctor("Anahi Salgado", "Pediatria");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);
    }
}
