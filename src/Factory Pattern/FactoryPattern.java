
public class FactoryPattern {
    public static void main(String[] args) {
        Animal animal = AnimalFactory.createAnimal(AnimalFactory.CAT);
        if (animal != null) {
            animal.speak();
        }
    }
}
