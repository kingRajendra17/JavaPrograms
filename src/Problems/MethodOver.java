package Problems;

class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
    //protected void makeSound() {
        System.out.println("The cat meows");
    }
}

public class MethodOver {
    public static void main(String[] args) {
    	
        Animal animal = new Animal();
        animal.makeSound(); // "The animal makes a sound"

        Cat cat = new Cat();
        cat.makeSound(); // "The cat meows"
    }
}
