package Studying_Interface;

public class Dog extends Animal implements Sound {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
