package model;

public class Patient extends User {
    private String birthday;
    private double weight;
    private double height;
    private String blood;

    public Patient(String name, String email) {
        super(name, email);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getWeight() {
        return weight + " Kg";
    }

    public double getHeight() {
        return height;
    }


    public String getPhoneNumber() {
        return phoneNumber;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthday + "\n Weight: " + getWeight() + "\n Height: " + getHeight()+ "\nBlood: "+blood;
    }
}
