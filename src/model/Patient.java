package model;

import java.util.ArrayList;
import java.util.Date;

public class Patient extends User {
    private String birthDay;
    private Double weight;
    private Double height;
    private String blood;

    private ArrayList<AppointmentDoctor> appointmentDoctors = new ArrayList<>();
    private ArrayList<AppointmentNurse> appointmentsNurses = new ArrayList<>();

    public ArrayList<AppointmentDoctor> getAppointmentDoctors() {
        return appointmentDoctors;
    }

    public void addAppointmentDoctors(Doctor doctor, Date date, String time) {
        AppointmentDoctor appointmentDoctor = new AppointmentDoctor(this, doctor);
        appointmentDoctor.schedule(date, time);
        appointmentDoctors.add(appointmentDoctor);
    }

    public ArrayList<AppointmentNurse> getAppointmentsNurses() {
        return appointmentsNurses;
    }

    public void AppointmentsNurses(ArrayList<AppointmentNurse> appointmentsNurses) {
        this.appointmentsNurses = appointmentsNurses;
    }

    public Patient(String name, String email){
        super(name, email);

    }

    public String getWeight() {
        return this.weight + " .kg";
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }


    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getHeight() {
        return height + " .Mts.";
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAge: " + birthDay + "\nWeight: " + getWeight()
                + "\nHeight: " + getHeight() + "\nBlood: " + blood;
    }

    @Override
    public void showDataUser() {
        System.out.println("paciente");
        System.out.println("Historial completo");
    }
}
