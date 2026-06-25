/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author fzyynm
 */
class Pet {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String petName) {
        name = petName;
    }

    public String speak() {
        return ("I'm your cute pet");
    }
}

class Cat extends Pet {

    public String speak() {
        return ("I speak only when I want to");
    }
}

class Dog extends Pet {

    public String fetch() {
        return "Yes, master. Fetch I will.";
    }
}

 class LatihanHewanC {

    public static void main(String[] args) {
        Pet pet1 = new Pet();
        System.out.println(pet1.speak());
        Cat cat1 = new Cat();
        cat1.setName("joko");
        System.out.println("My name is " + cat1.getName());

    }
}
