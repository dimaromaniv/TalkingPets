package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MainApplication {

    public static void main(String[] args) {
        Cat cat = new Cat();
        Dog dog = new Dog();
        Pokemon pokemon = new Pokemon();

        ArrayList<String> listOfPets = new ArrayList<>();

        boolean askingAboutPets = true;
        Scanner scanner = new Scanner(System.in);

        String petType;
        String petType2;
        String petType3;

        String nameOfFirstPet;
        String nameOfSecondPet;
        String nameOfThreesPet;

        while (askingAboutPets) {
            askingAboutPets();

            try {
                int numberOfPets = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character

                switch (numberOfPets) {
                    case 0:
                        dontHavePets();
                        break;

                    case 1:
                        System.out.println("Enter the type of your first pet (dog , cat or pokemon):");
                        petType = scanner.nextLine();
                        System.out.println("Enter the name of your " + petType + ":");
                        String nameOfFirstPe = scanner.nextLine();
                        firstPet(petType, nameOfFirstPe);
                        listOfPets.add(generatePetDescription(petType, nameOfFirstPe, cat, dog,pokemon));
                        break;

                    case 2:
                        System.out.println("Enter the type of your first pet (dog , cat or pokemon):");
                        petType = scanner.nextLine();
                        System.out.println("Enter the name of your " + petType + ":");
                        nameOfFirstPet = scanner.nextLine();

                        System.out.println("Enter the type of your second pet (dog , cat or pokemon):");
                        petType2 = scanner.nextLine();
                        System.out.println("Enter the name of your " + petType2 + ":");
                        nameOfSecondPet = scanner.nextLine();

                        twoPets(petType, petType2, nameOfFirstPet, nameOfSecondPet);
                        listOfPets.add(generatePetDescription(petType, nameOfFirstPet, cat, dog,pokemon));
                        listOfPets.add(generatePetDescription(petType2, nameOfSecondPet, cat, dog,pokemon));
                        break;
                    case 3:
                        System.out.println("Enter the type of your first pet (dog , cat or pokemon):");
                        petType = scanner.nextLine();
                        System.out.println("Enter the name of your " + petType + ":");
                        nameOfFirstPet = scanner.nextLine();

                        System.out.println("Enter the type of your second pet (dog , cat or pokemon):");
                        petType2 = scanner.nextLine();
                        System.out.println("Enter the name of your " + petType2 + ":");
                        nameOfSecondPet = scanner.nextLine();

                        System.out.println("Enter the type of your pet #3 (dog , cat or pokemon):");
                        petType3 = scanner.nextLine();
                        System.out.println("Enter the name of your " + petType3 + ":");
                        nameOfThreesPet = scanner.nextLine();





                        threePets(petType, petType2,petType3, nameOfFirstPet, nameOfSecondPet,nameOfThreesPet);
                        listOfPets.add(generatePetDescription(petType, nameOfFirstPet, cat, dog,pokemon));
                        listOfPets.add(generatePetDescription(petType2, nameOfSecondPet, cat, dog,pokemon));
                        listOfPets.add(generatePetDescription(petType3, nameOfThreesPet, cat, dog,pokemon));




                    default:
                        System.out.println("Invalid number of pets!");
                        break;
                }

                System.out.println("Do you have more pets? (yes/no)");
                String morePets = scanner.nextLine();

                if (morePets.equalsIgnoreCase("no")) {
                    askingAboutPets = false;
                }

                System.out.println("\nYour pet list:");
                for (String petDescription : listOfPets) {
                    System.out.println(petDescription);
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a number.");
                scanner.nextLine(); // Clear the input buffer
            }
        }

        scanner.close();
    }

    public static void askingAboutPets() {
        System.out.println("Hello User!\nHow many pets do you have?");
    }

    public static void firstPet(String petType, String nameOfFirstPet) {
        System.out.println("Oh, you have a " + petType);
        System.out.println("Oh, it's so sweet! The name of your " + petType + " is " + nameOfFirstPet);
    }

    public static void twoPets(String firstPetType, String secondPetType, String firstPetName, String secondPetName) {
        System.out.println("Oh, you have a " + firstPetType + " and a " + secondPetType);
        System.out.println("So, your " + firstPetType + "'s name is " + firstPetName);
        System.out.println("And your " + secondPetType + "'s name is " + secondPetName);
    }


    public static void threePets(String firstPetType, String secondPetType,String typePokemon , String firstPetName, String secondPetName,String nameofPokemopn ) {
        System.out.println("Oh, you have a " + firstPetType + " and a " + secondPetType);
        System.out.println("So, your " + firstPetType + "'s name is " + firstPetName);
        System.out.println("And your " + secondPetType + "'s name is " + secondPetName);
        System.out.println("And your " + typePokemon + "'s name is " + nameofPokemopn);
    }



    public static void dontHavePets() {
        System.out.println("Oh, it's so sad that you don't have any pets.");
    }

    public static String generatePetDescription(String petType, String petName, Cat cat, Dog dog , Pokemon pokemon) {
        String description = "Your pet is a " + petType + " named " + petName;

        if (petType.equalsIgnoreCase("Dog")) {
            description += " and it can " + dog.speak();
        } else if (petType.equalsIgnoreCase("Cat")) {
            description += " and it can " + cat.speak();
        } else if (petType.equalsIgnoreCase("Pokemon")) {
            description += " and it can " + pokemon.speak()  ;

        }

        return description;
    }
}
