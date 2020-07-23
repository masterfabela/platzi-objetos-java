package model;

public class User {
    private int id;
    private String email;
    private String name;
    String address;
    String phoneNumber;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 8){
            System.out.println("El numero debe ser de 8 digitos maximo");
        } else {
            this.phoneNumber = phoneNumber;
        }
    }

    @Override
    public String toString() {
        return "model.User: " + name + "Email: "+email+
                "\nAddress: "+address+". Phone: "+phoneNumber;
    }
}
