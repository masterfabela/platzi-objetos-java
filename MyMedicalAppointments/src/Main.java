import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {
        Doctor myDoctor = new Doctor();
        myDoctor.name = "Pepe";
        myDoctor.showName();
        myDoctor.showId();
        //System.out.println(Doctor.id);

        //Doctor.id++;

        Doctor myDoctorFran = new Doctor();
        myDoctorFran.showId();
        //System.out.println(Doctor.id);

        showMenu();

    }
}
