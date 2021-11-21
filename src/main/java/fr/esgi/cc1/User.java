package fr.esgi.cc1;

public final class User {

    private final int id;
    private String firstName;
    private String lastName;
    private String mail;
    private String password;
    private Type type;
    private Address address;
    private StatePaiement statePaiement;



    public User(int id, String firstName, String lastName, String mail, String password, Type type, Address address){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.mail = mail;
        this.password = password;
        this.type = type;
        this.address = address;
        this.statePaiement = StatePaiement.not_ok;
    }


    public void updateUserPaiment() {this.statePaiement = StatePaiement.ok;}

    public void setStatePaiement(StatePaiement statePaiement) {this.statePaiement = statePaiement;}

    public StatePaiement getStatePaiement() {return this.statePaiement;}

    public String getLastName() {return this.lastName;}

    public int getId() {return this.id;}

    public String getFirstName() {return this.firstName;}

    public String getMail() {return this.mail;}

    public String getPassword() {return password;}

    public Type getTypeUser() {return this.type;}

    public Address getAddress() {return this.address;}

    public void changePassword(String newPassword) {this.password = newPassword;}

    public void setFirstName(String firstName) {this.firstName = firstName;}

    public void setLastName(String lastName) {this.lastName = lastName;}

    public void setMail(String mail) {this.mail = mail;}

    public void setPassword(String password) {this.password = password;}

    public void setTypeUser(Type type) {this.type = type;}

    public void setAddress(Address address) {this.address = address;}

}
