package src.com.company.server.residential_house.print;

import src.com.company.model.ResidentialHouse;

public class PrintResidentialHouse implements PrintResidentialHouseInterface{
    @Override
    public void printResidentialHouse(ResidentialHouse house) {
        System.out.println("--------------------School-------------------------");
        System.out.println("Adress: " + house.getAdress());
        System.out.println("Number residents: " + house.getNumberOfResidents());
    }
}
