package org.example.collections;

import java.util.ArrayList;

public class Liste {

    public static void main(String[] args) {
        // ArrayList<type> nom =  new ArraylIst<type>();
        ArrayList<String> prenoms = new ArrayList<String>();

        // la méthode add() permet d'ajouter un élément.
        prenoms.add("toto");
        prenoms.add("tata");
        prenoms.add("titi");
        prenoms.add("tutu");
        // prenoms.add(42); -> Erreur

        // la methode get permet de récupérer un élément
        System.out.println(prenoms.get(0));
        System.out.println(prenoms.get(2));

        // la méthode set permet de modifier un élément
        prenoms.set(2, "grominet");
        System.out.println(prenoms.get(2));

        // la méthode remove permet de supprimer un élément
        // la méthode size permet de retourner la taille de la liste
        System.out.println(prenoms.size());
        prenoms.remove(2);
        System.out.println(prenoms.size());


        // Parcourir avec la boucle for
        for (int cpt = 0; cpt < prenoms.size(); cpt++) {
            System.out.println(prenoms.get(cpt));
        }

        // avec la boucle foreach
        for (String p : prenoms) {
            System.out.println(p);
        }
    }
}
