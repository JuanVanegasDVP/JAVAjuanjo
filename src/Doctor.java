public class Doctor {
     static int id;
    String name;
    String email;
    String speciality;

public Doctor() {

}

public Doctor(String name, String speciality) {
    id++;
    this.name = name;
    this.speciality = speciality;


}

    //Comportamientos
    public void showName(){
        System.out.println("el nombre del doctro es: " + name);
    }

    public void showId(){
        System.out.println("el id es:" + id);
    }
}
