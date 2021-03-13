package dataBaseConnection;

public class Players {


    private  int number;
    private String club;
    private String name;
    private String country;


    public Players(int number, String club, String name, String country) {
        number = number;
        club = club;
        name = name;
        country = country;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        number = number;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        club = club;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        country = country;
    }
}
