package fr.esgi.cc1;

public final class User {

    private final int id;
    private final String lastname;
    private final String firstname;
    private Address address;
    private String password;

    public User(int id, String lastname, String firstname, Address address, String password) {
        this.id = id;
        this.lastname = lastname;
        this.firstname = firstname;
        this.address = address;
        this.password = password;
    }

    public void changeAddress(Address newAddress) {
        this.address = newAddress;
    }

    public int getId() {
        return id;
    }

    public String getLastname() {
        return lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getPassword() {
        return password;
    }

    public void changePassword(String newPassword) {
        this.password = newPassword;
    }


}
