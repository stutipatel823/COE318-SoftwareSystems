class Animal {
    public static int count;

    public Animal() {
        count++;
        System.out.println("Animal constructor");
    }

    public void animalSound() {
        System.out.println("The animal makes a sound");
    }
}

class Pig extends Animal {

    public Pig() {
        count++;
        System.out.println("Pig constructor");

    }

    public void animalSound() {
        System.out.println("The Pig makes an oink sound");
    }

}

class Dog extends Animal {
    public Dog() {
        count++;
        System.out.println("Dog constructor");
    }

    public void animalSound() {
        System.out.println("The dog makes a woof sound");
    }
}
