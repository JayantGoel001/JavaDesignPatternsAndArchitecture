public abstract class AnimalFactory {
    public static Animal createAnimal(int type){
        switch (type){
            case CAT:
                return new Cat();
            case DOG:
                return new Dog();
        }
        return null;
    }
    public static final int CAT = 0;
    public static final int DOG = 1;
}
