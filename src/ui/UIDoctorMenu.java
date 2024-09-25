package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class UIDoctorMenu {

    public static ArrayList<Doctor> doctorsAvailableAppointments = new ArrayList<>();

    public static void showDoctorMenu(){
        int response = 0;

        do {
            System.out.println("\n\n");
            System.out.println("Doctor");
            System.out.println("Welcome to the Doctor Menu" + UIMenu.logged.getName());
            System.out.println("1. add available Appointment");
            System.out.println("2. my Scheduled appoinments");
            System.out.println("0. log out");

            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            switch (response){
                case 1:
                    break;

                    case 2:
                        break;

                    case 0:
                        UIMenu.showMenu();
                        break;
            }
        }while (response != 0);
    }
    private static void showAddAvailableAppointmentMenu(){
        int response = 0;
        do {
            System.out.println("\n\n");
            System.out.println("Add an available appointment");
            System.out.println("select a Month");

            for (int i = 0; i < 3; i++) {
                int j = i + 1;
                System.out.println(j + ". " + UIMenu.MONTHS[i]);
            }
            System.out.println("0. log out");
            Scanner sc = new Scanner(System.in);
            response = Integer.valueOf(sc.nextLine());

            if (response  > 0 && response < 4){
                int monthSelected = response;
                System.out.println(monthSelected + " . "+ UIMenu.MONTHS[monthSelected-1]);

                System.out.println("Insert the date available: {dd/mm/yyy}");
                String date = sc.nextLine();

                System.out.println("Your date is: " + date + "\n1. Correct \n2. Change Date");
                int responseData = Integer.valueOf(sc.nextLine());

                if (responseData == 2) continue;

                int responseTime = 0;
                String time = "";
                do {
                    System.out.println("Insert the time available for date: "+ date + "16:00");
                    time = sc.nextLine();
                    System.out.println("your time is: " + time + "\n1. Correct \n2. Change Time");
                    responseTime = Integer.valueOf(sc.nextLine());
                }while (responseTime == 2);

                UIMenu.logged.addAvailableAppointment(date, time);
                checkDoctorAvailableAppointments(UIMenu.logged);

            } else if (response == 0) {
                showDoctorMenu();

            }
        }while (response != 0);
    }

    private static void checkDoctorAvailableAppointments(Doctor doctor){
        if (doctor.getAvailableAppointments().size() > 0 &&  !doctorsAvailableAppointments.contains(doctor)){
            doctorsAvailableAppointments.add(doctor);

        }
    }
}
