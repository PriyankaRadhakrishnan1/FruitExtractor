package practiceCode;

import java.util.*;


public class FruitExtractor {

    private  List<Fruits> getRandomCountsFruit(int noOfFruit, int fruitCode){
        List<Fruits> fruitBlow = new ArrayList<>();
        for (int i = 0; i < noOfFruit; i++) {
            if (fruitCode == 3) {
                Apple apple = new Apple();
                fruitBlow.add(apple);
            }else if(fruitCode == 2){
                Orange orange = new Orange();
                fruitBlow.add(orange);
            }else if (fruitCode == 1){
                Banana banana = new Banana();
                fruitBlow.add(banana);
            }
        }
        return fruitBlow;
    }
    public static void main(String[] args) {
        List<Fruits> fruitsList = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number fruits in the Bowl:\t");
        int noOfFuits = sc.nextInt();
        int n = 3,x, unExecptedFruitsCount = 0;
        Random random = new Random();
        System.out.println("Does Bowl only contains expected fruits?[y/n]:\t");
        char condition = sc.next().charAt(0);
        if (condition == 'y') {
            while (n != 1) {
                x = random.nextInt(noOfFuits);
                fruitsList.addAll(new FruitExtractor().getRandomCountsFruit(x, n));
                noOfFuits -= x;
                n--;
            }
        } else if (condition == 'n') {
            while (n != 0) {
                x = random.nextInt(noOfFuits);
                fruitsList.addAll(new FruitExtractor().getRandomCountsFruit(x, n));
                noOfFuits -= x;
                n--;
                unExecptedFruitsCount = noOfFuits;
            }

        } else {
            System.out.println("Invalid Option");
        }
        fruitsList.addAll(new FruitExtractor().getRandomCountsFruit(noOfFuits, n));
        new FruitExtractor().extractFruits(fruitsList);
        if (unExecptedFruitsCount != 0) {
            System.out.println("UnExpected Fruits: " + unExecptedFruitsCount);
        }

    }

    private  void extractFruits(List<Fruits> fruitsBowl) {
        List<Apple> appleBowl = new ArrayList<>();
        List<Orange> orangeBowl = new ArrayList<>();
        List<Banana> bananaBowl = new ArrayList<>();
        for (Fruits fruit : fruitsBowl) {
            switch (fruit.getColor()) {
                case "red":
                    if (fruit.getShape().equals("Round")) {
                        appleBowl.add((Apple) fruit);
                    } else if (fruit.getShape().equals("curved")) {
                        bananaBowl.add((Banana) fruit);
                    }
                    break;
                case "yellow":
                    bananaBowl.add((Banana) fruit);
                    break;
                case "orange":
                    orangeBowl.add((Orange) fruit);
                    break;
                case "green":
                    if (fruit.getShape().equals("Round")) {
                        if (fruit.getSurface().equals("Smooth")) {
                            appleBowl.add((Apple) fruit);
                        } else if (fruit.getSurface().equals("Rough")) {
                            orangeBowl.add((Orange) fruit);
                        }
                    } else if (fruit.getShape().equals("curved")) {
                        bananaBowl.add((Banana) fruit);
                    }
                    break;
            }

        }

        System.out.println("Extracted Fruits count:");
        System.out.println("No of Apple :"+appleBowl.size());
        System.out.println("No of Banana :"+bananaBowl.size());
        System.out.println("No of Orange :"+orangeBowl.size());

    }

}
