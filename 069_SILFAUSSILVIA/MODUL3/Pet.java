public class Pet { 
    private String name;

    public String getName() {
        return name;
    }
    public void setName(String petName) {
        name = petName;
    }
    public String speak() {
        return "I'm your cute pet";
    }
}
class Cat extends Pet {
    public String speak() {
        return "I speak only when I want to";
    }
}
class Dog extends Pet {
    public String fetch() {
        return "Yes, master. Fetch I will.";
    }
}
class Latihan {
    public static void main(String[] args) {
        Pet pet1 = new Pet();
        System.out.println(pet1.speak());

        Cat cat1 = new Cat();
        cat1.setName("Kitty");
        System.out.println("My name is " + cat1.getName());
        System.out.println(cat1.speak());

        Dog dog1 = new Dog();
        dog1.setName("Buddy");
        System.out.println("My name is " + dog1.getName());
        System.out.println(dog1.fetch());
    }
}