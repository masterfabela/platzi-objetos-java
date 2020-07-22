import ui.UIMenu;

import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User{

    private String speciality;
    private int id_avaliamentAppointment;
    private Date date;
    private String time;


    Doctor(String name,String email, String speciality){
        super(name, email);
        this.speciality = speciality;
    }

    ArrayList<AvailableApointment> availableApointments = new ArrayList<>();
    public void addAvaliableAppointmen(Date date, String time){
        availableApointments.add(new AvailableApointment(date, time));
    }

    public ArrayList<AvailableApointment> getAvailableApointments(){
        return availableApointments;
    }

    // Comportamientos
    public void showName(){
        System.out.println(this.getName());
    }

    public void showId(){
        System.out.println("ID Doctor: "+super.getId());
    }

    public String getSpeciality() {
        return speciality;
    }

    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public static class AvailableApointment {
        private int id;
        private Date date;
        private String time;

        public AvailableApointment(Date date, String time){
            this.date = date;
            this.time = time;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public Date getDate() {
            return date;
        }

        public String getTime() {
            return time;
        }
    }

}
