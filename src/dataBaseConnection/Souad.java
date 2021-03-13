package dataBaseConnection;

public class Souad {

    private String name;
    private String lastName;
    private String address;
    public int number;
    private String favourite;


    public Souad(String name, String lastName, String address, int number, String favourite){

        name=name;
        lastName=lastName;
        address=address;
      this.number=number;
        favourite=favourite;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getFavourite() {
        return favourite;
    }

    public void setFavourite(String favourite) {
        this.favourite = favourite;
    }
}
