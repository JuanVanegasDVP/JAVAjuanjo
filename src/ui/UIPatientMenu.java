package ui;

import model.Doctor;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class UIPatientMenu {
    public static void showPatientMenu() {
        int response = 0;
        do {
            System.out.println("\n");
            System.out.println("Patient Menu");
            System.out.println("Welcome" + UIMenu.loggedPatient.getName());
            System.out.println("1. Book an appointment");
            System.out.println("2. My appointments");
            System.out.println("0. Exit");

            Scanner sc = new Scanner(System.in);
            response = sc.nextInt();

            switch (response){
                case 1:
                    showBookAppointmentMenu();
                    break;
                    case 2:
                        showPatientMyAppointments();
                        break;
                        case 0:
                            UIMenu.showMenu();
                            break;
            }
        }while (response !=0);
    }

    private static void showBookAppointmentMenu(){
        int response = 0;
        do{
            System.out.println(":: book an appointment");
            System.out.println("Select a date");

            //mappear la lista de fechas de los doctores
            Map<Integer, Map<Integer, Doctor>> doctors = new TreeMap<>();
            int k = 0;
            for (int i = 0; i < UIDoctorMenu.doctorsAvailableAppointments.size() ; i++) {
                ArrayList<Doctor.AvailableAppointment> availableAppointments
                     = UIDoctorMenu.doctorsAvailableAppointments.get(i).getAvailableAppointments();

                Map<Integer, Doctor> doctorAppointments = new TreeMap<>();

                for (int j = 0; j < availableAppointments.size(); j++) {
                    k++;
                    System.out.println(k + ". " + availableAppointments.get(j).getDate());
                    doctorAppointments.put(Integer.valueOf(j), UIDoctorMenu.doctorsAvailableAppointments.get(j));
                    doctors.put(Integer.valueOf(k), doctorAppointments);
                }
            }
            Scanner sc = new Scanner(System.in);
            int responseDateSelected = Integer.valueOf(sc.nextLine());
            Map<Integer, Doctor> doctorAvailableSelected = doctors.get(responseDateSelected);
            Integer indexDate = 0;
            Doctor doctorSelected = new Doctor("", "");

            for (Map.Entry<Integer, Doctor> doc :doctorAvailableSelected.entrySet()){
                indexDate = doc.getKey();
                doctorSelected = doc.getValue();
            }

            System.out.println(doctorSelected.getName()
                    + ". Date" + doctorSelected.getAvailableAppointments().get(indexDate).getTime()
                    + ". Time" +
                    doctorSelected.getAvailableAppointments().get(indexDate).getTime());

            System.out.println("Confirm: \n1. yes\n2. Change data");
            response = sc.nextInt();

            if (response == 1){
                UIMenu.loggedPatient.addAppointmentDoctors(
                        doctorSelected,
                        doctorSelected.getAvailableAppointments().get(indexDate).getDate(null),
                        doctorSelected.getAvailableAppointments().get(indexDate).getTime());
                return;
            }

        }while (response !=0);
    }

    private static void showPatientMyAppointments(){
        int response = 0;
        do {
            System.out.println("::My appointments");
            if (UIMenu.loggedPatient.getAppointmentDoctors().size() == 0){
                System.out.println("::No appointments");
                break;
            }
            for (int i = 0; i < UIMenu.loggedPatient.getAppointmentDoctors().size(); i++) {
                int j = i + 1 ;
                System.out.println(j + ". "+
                        "DATE: " + UIMenu.loggedPatient.getAppointmentDoctors().get(i).getDate() +
                        "TIME: " + UIMenu.loggedPatient.getAppointmentDoctors().get(i).getTime() +
                        "\n Doctor: " + UIMenu.loggedPatient.getAppointmentDoctors().get(i).getDoctor());
            }
            System.out.println("0. Return");
        }while (response !=0);
    }

}
