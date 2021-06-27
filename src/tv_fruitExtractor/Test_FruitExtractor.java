package tv_fruitExtractor;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Test_FruitExtractor {

    FruitExtractor fruitExtractor;

    @BeforeClass
    public void createFruitBowl(){
        fruitExtractor = new FruitExtractor();
        fruitExtractor.addFruit(new Apple());
        fruitExtractor.addFruit(new Orange());
        fruitExtractor.addFruit(new Banana());
        fruitExtractor.addFruit(new Banana());
        fruitExtractor.addFruit(new Banana());
    }

    @Test
    public void Test_001_verify_FruitBowl_size(){
        Assert.assertEquals(fruitExtractor.getCountOfFruits(),5);
        Reporter.log("Fruit Bowl contains "+ fruitExtractor.getCountOfFruits()+" fruits", true);
    }

    @Test
    public void Test_002_verify_Apples_Count() {
        Assert.assertEquals(fruitExtractor.getApples().size(),1);
        Reporter.log("Fruit Bowl contains "+ fruitExtractor.getApples().size()+" Apples", true);
    }

    @Test
    public void Test_003_verify_Orange_Count() {
        Assert.assertEquals(fruitExtractor.getOranges().size(),1);
        Reporter.log("Fruit Bowl contains "+ fruitExtractor.getOranges().size()+" Orange", true);
    }

    @Test
    public void Test_004_verify_Banana_Count() {
        Assert.assertEquals(fruitExtractor.getBananas().size(),3);
        Reporter.log("Fruit Bowl contains "+ fruitExtractor.getBananas().size()+" Bananas", true);
    }


}
