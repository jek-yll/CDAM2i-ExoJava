package org.example.collections;

import java.util.*;

public class DemoCollections {
    public static void main(String[] args) {
        //Vector
        Vector<String> victor = new Vector<>();
        victor.add("Pomme");
        victor.add("Banane");
        victor.add("Orange");
        System.out.println(victor);

        //Méthode pour le vectore
        System.out.println("1. Taille du vector: " + victor.size());
        System.out.println("2. Element à l'index 1 du vector: " + victor.get(1));
        System.out.println("3. Est ce que Apple est présent dans le vector: " + victor.contains("Apple"));

        //Démo SortedSet (TreeSet)
        SortedSet<String> sortedSet = new TreeSet<>();
        sortedSet.add("Java");
        sortedSet.add("Python");
        // sortedSet.add("Python"); -> pas de doublon
        sortedSet.add("PHP");
        sortedSet.add("JavaScript");
        System.out.println("SortedSet : "+sortedSet);

        // Méthodes pour sortedset
        System.out.println("1. Premier element : "+ sortedSet.first());
        System.out.println("2. Dernier element : "+ sortedSet.last());
        SortedSet<String> headset = sortedSet.headSet("PHP");
        System.out.println("3. Sous-ensembre avant PHP : "+ headset);

        //Demo pour LinkedList
        LinkedList<Double> linkedList = new LinkedList<>();
        linkedList.add(3.14);
        linkedList.add(2.71);
        linkedList.add(1.80);
        linkedList.add(3.14);
        System.out.println("LinkedList : "+linkedList);

        //Methode pour LinkedList
        System.out.println("1. Premier element : "+ linkedList.getFirst());
        System.out.println("2. Dernier element : "+ linkedList.getLast());
        linkedList.removeFirst();
        System.out.println("3. Suppression premier element : "+ linkedList);

        //SortedMap (TreeMap)
        SortedMap<String, Integer> sortedMap= new TreeMap<>();
        sortedMap.put("01", 20);
        sortedMap.put("02", 25);
        sortedMap.put("05", 30);
        sortedMap.put("04", 15);
        System.out.println("SortedMap : "+ sortedMap);

        //Méthode pour sortedMap
        System.out.println("1. Clés de sortedMap : "+ sortedMap.keySet());
        System.out.println("2. Valeurs de sortedMap : "+ sortedMap.values());
        System.out.println("3. Supprimer l'entrée avec la clé 05 : " );
        sortedMap.remove("05");
        System.out.println("SortedMap apres suppression : "+ sortedMap);

        for (String k : sortedMap.keySet()) {
            System.out.println(sortedMap.get(k));
        }

        //HashMap
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("01", 15454);
        hashMap.put("02", 154877);
        hashMap.put("05", 2356);
        hashMap.put("04", 22);
        System.out.println(hashMap);

        //Méthode pour HashMap
        System.out.println("1. Taille du hashMap : "+hashMap.size());
        System.out.println("2. Valeur associé à la clé '02 : "+hashMap.get("02"));
        System.out.println("3. La clé 04 est elle présente : "+hashMap.containsKey("04"));
        hashMap.remove("05");
        System.out.println("Suppression de l'entree avec la clé 05 : "+ hashMap);
        System.out.println(hashMap.containsKey("05"));

    }
}
