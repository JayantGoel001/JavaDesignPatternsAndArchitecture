public abstract class AnimalFactory {
    public static Animal createAnimal(int type){
        return switch (type) {
            case CAT -> new Cat();
            case DOG -> new Dog();
            default -> null;
        };
    }
    public static final int CAT = 0;
    public static final int DOG = 1;
}
