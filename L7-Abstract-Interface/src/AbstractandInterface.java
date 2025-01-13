import animals.Animals;
import animals.Chicken;
import animals.Tiger;
import edible.Edible;
import fruit.Fruit;
import fruit.Orange;
import fruit.Apple;


public class AbstractandInterface {
    public static void main(String[] args) {
        Animals[] animals = new Animals[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animals animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edible = (Edible) animal;
                System.out.println(edible.howToEat());
            }
        }

        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
