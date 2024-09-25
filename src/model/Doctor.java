package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends User {
    private String speciality;


    public String getSpeciality() {
        return speciality;
    }
    public void setSpeciality(String speciality) {
        this.speciality = speciality;
    }

    public Doctor(String name, String email){
    super(name, email);
    this.speciality = speciality;
}

    //Comportamientos
    public void showName(){
        System.out.println("el nombre del doctro es: " );
    }

    public void showId(){
        System.out.println("el id es:" );
    }

    ArrayList<AvailableAppointment> availableAppointments = new ArrayList();
    public void addAvailableAppointment(String date, String time) {
        try {
            availableAppointments.add(new AvailableAppointment(date, time));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public ArrayList<AvailableAppointment> getAvailableAppointments(){
        return availableAppointments;
    }

    @Override
    public String toString() {
        return super.toString() + "Doctor{" + "speciality=" + speciality
                + " Available: "+ availableAppointments.toString()+ '}';
    }

    @Override
    public void showDataUser() {
        System.out.println("Cruz Roja");
        System.out.println("Cancerología");
        System.out.println("Locura");
    }

    public static class  AvailableAppointment{
        private int id;
        private Date date;
        private String time;
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        public AvailableAppointment(String date, String time) throws ParseException {
            try {
                this.date = format.parse(date);
            } catch (ParseException e) {
                e.printStackTrace();
            }
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
        public String getDate(String DATE){
            return format.format(date);
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }



        @Override
        public String toString() {
            return "AvailableAppointment{" +
                    ", date=" + date +
                    ", time='" + time + '\'' +
                    '}';
        }
    }
}
