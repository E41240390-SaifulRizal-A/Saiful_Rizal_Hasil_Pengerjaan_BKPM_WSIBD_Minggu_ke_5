package BKPM17_18_19_20;

public class Animal_New {

    public static void main(String[] args) {

        Animal_Tugas3 animal = new Animal_Tugas3();
        animal.makeNoise();
        Animal_Dog dog = new Animal_Dog();
        dog.makeNoise();
        Animal_Tugas3 animaldog = new Animal_Dog();
        animaldog.makeNoise();

        if (animal instanceof Animal_Tugas3) {
            System.out.println("animal is Animal");
        }
        if (dog instanceof Animal_Tugas3) {
            System.out.println("dog is Animal");
        }
        if (animaldog instanceof Animal_Tugas3) {
            System.out.println("animaldog is Animal");
        }
        if (animal instanceof Animal_Dog) {
            System.out.println("animal is Dog");
        }
    }
}