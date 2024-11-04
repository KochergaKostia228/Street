package src.com.company.model;

import com.company.server.residential_house.print.PrintResidentialHouseInterface;

public class ResidentialHouse extends House{
    private int numberOfResidents;
    private PrintResidentialHouseInterface print;

    public ResidentialHouse(String address, int numberOfResidents) {
        super(address);
        this.numberOfResidents = numberOfResidents;
    }

    public ResidentialHouse(String adress, int numberOfResidents, PrintResidentialHouseInterface print) {
        this(adress, numberOfResidents);
        this.print = print;
    }

    @Override
    public void print() {
        print.printResidentialHouse(this);
    }

    public int getNumberOfResidents() {
        return numberOfResidents;
    }

    public void setNumberOfResidents(int numberOfResidents) {
        this.numberOfResidents = numberOfResidents;
    }

    public PrintResidentialHouseInterface getPrint() {
        return print;
    }

    public void setPrint(PrintResidentialHouseInterface print) {
        this.print = print;
    }
}
