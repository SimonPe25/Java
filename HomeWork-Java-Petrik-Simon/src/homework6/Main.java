package homework6;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        DomesticCat domesticCat = new DomesticCat();

        Fish fish = new Fish();
        RoboCat roboCat = new RoboCat();

        System.out.println(dog);
        System.out.println(domesticCat);
        System.out.println(fish);
        System.out.println(roboCat);
        dog.eat();
        fish.eat();
        dog.foul();
        domesticCat.foul();
        Dog dog1 = new Dog();
        System.out.println(dog1);
        Fish fish3 = new Fish();
        System.out.println(fish3);
        Fish fish1 = new Fish();
        fish1.eat();
        Man man = new Man();
        man.greetPet();
        Woman woman = new Woman();
        woman.greetPet();
        //опишите у каждого подкласса уникальный ему метод на свое усмотрение
        woman.makeup();
        man.repairCar();

    }
}