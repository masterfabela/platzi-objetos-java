import ui.UIMenu;

public class Doctor {
    static int id = 0; //AutoIncrementable
    String name;
    String speciality;

    Doctor(){
        System.out.println("Construyendo el objeto Doctor");
        id++;
    }

    Doctor(String name){
        System.out.println("El nombre del Doctor construyendose es "+name);
        this.name = name;
    }

    // Comportamientos
    public void showName(){
        System.out.println(name);
    }

    public void showId(){
        System.out.println("ID Doctor: "+id);
    }
    
}
