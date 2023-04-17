package groceryStore;

public class Customer {

    private String name;
    private String address;
    private String phoneNumber;
    private String mail;
    
    public Customer(String name, String address, String phoneNumber, String mail) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
    }
    
    public String getName() {
        return name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public String getPhoneNumber() {
        return phoneNumber;
    }
    
    public String getMail() {
        return mail;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void setMail(String mail) {
        this.mail = mail;
    }
    
}
