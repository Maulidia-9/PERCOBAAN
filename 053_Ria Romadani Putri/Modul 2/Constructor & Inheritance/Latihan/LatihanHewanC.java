/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riaa
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
        cat1.setName("kitty");
        System.out.println("My name is " + cat1.getName());

    }
}


   
