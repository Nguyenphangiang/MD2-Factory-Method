public class FactoryDemo {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        Animal a1 = animalFactory.getAnimal("canine");
        Animal a2 = animalFactory.getAnimal("feline");
        System.out.println(a1.makeSound());
        System.out.println(a2.makeSound());
    }
}
