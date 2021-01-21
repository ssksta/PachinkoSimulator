package sim.logic;

import java.util.Random;

public class SimLogic {

    private static final Random random = new Random();

    public static int randomNumber(int bound){
        return random.nextInt(bound);
    }

    public static int rm_65536(){
        return randomNumber(65536);
    }

    public static int rm_1000(){
        return randomNumber(1000);
    }


}
