package src.com.company.model;

public class Street {
    private String name;
    private House[] houses;

    public Street(String name, int size) {
        this.name = name;
        this.houses = new House[size];
    }
}
