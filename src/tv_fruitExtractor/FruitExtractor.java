package tv_fruitExtractor;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FruitExtractor {

        List<Fruits> fruitBowl;

        public FruitExtractor() {
                fruitBowl = new ArrayList<>();
        }

        public void addFruit(Fruits fruit) {
                fruitBowl.add(fruit);
        }

        public int getCountOfFruits(){
               return fruitBowl.size();
        }
        public List<Fruits> getApples()
        {
                return fruitBowl.stream().filter(fruit -> fruit instanceof Apple).collect(Collectors.toList());
        }
        public List<Fruits> getOranges()
        {
                return fruitBowl.stream().filter(fruit -> fruit instanceof Orange).collect(Collectors.toList());
        }
        public List<Fruits> getBananas()
        {
                return fruitBowl.stream().filter(fruit -> fruit instanceof Banana).collect(Collectors.toList());
        }


    }


