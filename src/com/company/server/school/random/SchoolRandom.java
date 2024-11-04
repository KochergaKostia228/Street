package src.com.company.server.school.random;

import src.com.company.model.ResidentialHouse;

import java.util.Random;

public class SchoolRandom implements SchoolRandomInterface{
    private static final String[] adress =
            new String[] {"Ivan", "Petr", "Pavel", "Andrey"};

    @Override
    public ResidentialHouse randomSchool() {
        Random rand = new Random();
        return new ResidentialHouse(adress[rand.nextInt(adress.length)],
                rand.nextInt(10));
    }
}
