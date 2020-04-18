package com.text;

import java.util.HashSet;
import java.util.Set;

public class Example3CollectionSet {

    public static void main(String[] args) {
        //dodanie elemntów do kolekcji
        Set<String> strings = new HashSet<>();
        strings.add("Jeden");
        strings.add("Dwa");
        strings.add("Dwa");
        strings.add("Trzy");
        strings.add("Cztery");
        strings.add("Cztery");

        //wyświetlenie zawartości kolekcji
        for (String stringS:strings) {
            System.out.println(stringS);
        }

        //wyświeylenie wielkości kolekcji
        System.out.println("Amount collection is: --> " + strings.size());

        System.out.println(("Is in collection number: 2 ? --> " + strings.contains("Dwa")));

        //usunięcie z kolekcji wyrazu "Dwa"
        strings.remove("Dwa");
        System.out.println("Is in collection number: 2 ? --> " + strings.contains("Dwa"));

        System.out.println("Is in collection world 'Adam'? --> " + strings.contains("Adam"));

        //sprawdzenie czy kolekcja jest pusta
        System.out.println("Is collection empty? --> " + strings.isEmpty());

        //wyczyszczenie kolekcji
        strings.clear();
        System.out.println("Is collection epmty? After method clear(). --> " + strings.isEmpty());

    }
}
