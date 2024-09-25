package model;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        int i = 0;
        int b = 2;
        b = i;
        String name = "hj";

        User user = new Doctor("ipipra", "pipra@email.com");
        user.showDataUser();

        User userPa = new Patient("juan", "vanegas@email.com");
        userPa.showDataUser();

        User user1 = new User("samuelito", "samu@gmail.com") {
            @Override
            public void showDataUser() {
                System.out.println("Doctor");
                System.out.println("cruz azul");
                System.out.println("ojos");
            }
        };

        user1.showDataUser();

        ISchegulable iSchegulable = new ISchegulable() {
            @Override
            public void schedule(Date date, String time) {

            }
        };

/*
        Doctor myDoctor = new Doctor("Juan Jose", "pediatra");
        myDoctor.addAvailableAppointment(new Date(), "4pm");
        myDoctor.addAvailableAppointment(new Date(), "5pm");
        myDoctor.addAvailableAppointment(new Date(), "1pm");


        for (Doctor.AvailableAppointment availableAppointment: myDoctor.getAvailableAppointments()) {
            System.out.println(availableAppointment.getDate() +" " + availableAppointment.getTime());
        }


        Patient patient = new Patient("jujo", "pediatra@mail.com");


        System.out.println(patient);

 */
    }
}
