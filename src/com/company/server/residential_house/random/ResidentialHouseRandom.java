package src.com.company.server.residential_house.random;

import src.com.company.model.ResidentialHouse;

import java.util.Random;

public class ResidentialHouseRandom implements ResidentialHouseRandomInterface{
    private static final String[] adress =
            new String[] {"Ivan", "Petr", "Pavel", "Andrey"};

    @Override
    public ResidentialHouse randomResidentialHouse() {
        Random rand = new Random();
        return new ResidentialHouse(adress[rand.nextInt(adress.length)],
                rand.nextInt(10));
    }
}
