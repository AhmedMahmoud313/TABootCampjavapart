package com.bootcampexercies.module6.activity;

public class AnimalActivity {
    public static void main(String arg[]) {

        Animal cat = new Cat();

        Mammal mammal = new Mammal("Flex");
        Animal dog = new dog();
        mammal.setAnimal(cat);
        mammal.animalIsSleeping();
        mammal.animalIsSpeaking();
        mammal.setAnimal(dog);
        mammal.animalIsSleeping();
        mammal.animalIsSpeaking();
    }
}
