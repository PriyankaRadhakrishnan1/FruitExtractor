package practiceCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Apple implements Fruits {

    @Override
    public String getColor() {
        List<String> colorList = new ArrayList<>(Arrays.asList("red", "green"));
        Random random = new Random();
        int randomNumber = random.nextInt(colorList.size());
        return colorList.get(randomNumber);
    }

    @Override
    public String getSurface() {
        return "Smooth";
    }

    @Override
    public String getShape() {
        return "Round";
    }
}
