
import static ui.UIMenu.*;

public class Main {
    public static void main(String[] args) {

        Doctor myDoctor = new Doctor("jj", "pediatra");
        System.out.println(myDoctor.name);
        System.out.println(myDoctor.speciality);

        int i = 0;
        int b = 2;
        b = i;
        String name = "hj";

        Patient patient = new Patient("jujo", "pediatra@mail.com");
        Patient patient2  = new Patient("jj", "jjemail.com");

        System.out.println(patient.getName());
        System.out.println(patient2.getName());
        patient2 = patient;

        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        patient2.setName("manuel");
        System.out.println(patient.getName());
        System.out.println(patient2.getName());

        /*patient.setWeight(54.7);
        System.out.println(patient.getWeight());

        patient.setPhoneNumber("12345678");
        System.out.println(patient.getPhoneNumber());

         */


    }
}
