public class Phone {
    private int phoneNumber;
    private String type;

    public Phone(int phoneNumber, String type) {
        this.phoneNumber = phoneNumber;
        this.type = type;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber=" + phoneNumber +
                ", type='" + type + '\'' +
                '}';
    }
}
