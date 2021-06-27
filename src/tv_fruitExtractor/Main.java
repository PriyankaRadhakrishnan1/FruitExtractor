package tv_fruitExtractor;

public class Main {
    public static void main(String[] args) {
        FruitExtractor fruitExtractor = new FruitExtractor();
        fruitExtractor.addFruit(new Apple());
        fruitExtractor.addFruit(new Orange());
        fruitExtractor.addFruit(new Apple());
        fruitExtractor.addFruit(new Banana());
        fruitExtractor.addFruit(new Banana());
        fruitExtractor.addFruit(new Banana());

        System.out.println("Total number of Fruits in the bowl is "+ fruitExtractor.getCountOfFruits()
                + ". It contains \n"+ fruitExtractor.getApples().size()+ " Apple\n" + fruitExtractor.getOranges().size()
                + " Orange\n" + fruitExtractor.getBananas().size()+ " Banana");

    }

}
