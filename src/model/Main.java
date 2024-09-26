package model;
import static ui.UIMenu.*;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        showMenu();
        Doctor myDoctor = new Doctor("Anahí Salgado", "anahi@anahi.com");
        myDoctor.addAvailableAppointment(String.valueOf(new Date()), "4pm");

        System.out.println(myDoctor);
    }
}
