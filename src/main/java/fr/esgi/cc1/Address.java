package fr.esgi.cc1;

public class Address {

    private final int id;
    private final int number;
    private final String street;
    private final String city;


    private Address(int id, int number, String street, String city) {
        this.id = id;
        this.number = number;
        this.street = street;
        if (!checkCityPreconditions(city)) {
            throw new IllegalArgumentException("The city must be set.");
        }
        this.city = city;
    }

    public static Address of(int id, int number, String street, String city) {
        Address address = new Address(id, number, street,  city);
        if (ValidationAddressEngine.getInstance().test(address)) {
            return address;
        }
        throw new IllegalArgumentException("Illegal arguments");
    }

    private boolean checkCityPreconditions(String city) {
        if (city == null) {
            return false;
        }
        return true;
    }

    public int getId() {
        return id;
    }

    public String getCity() {
        return city;
    }
}
