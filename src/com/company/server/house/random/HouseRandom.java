package src.com.company.server.house.random;

import com.company.model.HouseInterface;

import java.util.Random;

public class HouseRandom implements HouseRandomInterface{
    @Override
    public HouseInterface randomHouse() {
        Random random = new Random();
        if (random.nextInt(2) == 0 ) {
            return randomAspirant.getRandomAspirant();
        }
        else {
            return randomTeacher.getRandomTeacher();
        }
    }
}
