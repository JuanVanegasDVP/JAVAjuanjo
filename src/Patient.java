public class Patient {

    private String name;
    private String email;
    private String address;
    private String phoneNumber;
    private String birthDay;
    private Double weight;
    private Double height;
    private String blood;


    public String getWeight() {
        return this.weight + "kg";
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
            System.out.println("el nùmero no debe pasar de 8 dìgitos ");
        } else if (phoneNumber.length() == 8) {
        this.phoneNumber = phoneNumber;
        }
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
        return height + "Mts.";
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    Patient(String name, String email) {
        this.name = name;
        this.email = email;

    }
}
