package org.example.exercices;

import java.util.Arrays;

public class ExerciceString1 {

    public static void ComptageDeMot(String arg) {
        System.out.printf("La chaine \"%s",arg + "\" contient " + arg.length()+ " charactères");
    }

    public static void ComptageOccurence(String monMot, char maLettre) {

        int occurence = 0;

        for (int i = 0; i < monMot.length(); i++) {
            if (monMot.toLowerCase().charAt(i) == maLettre) {
                occurence++;
            }
        }
        System.out.printf("il y a %d occurences du charactère %c dans le mot %s",occurence,maLettre,monMot);
    }

    public static void Anagramme(String mot1, String mot2) {

        char[] charTab1 = mot1.toCharArray();
        char[] charTab2 = mot2.toCharArray();
        char test = ' ';
        boolean isAnagramme = true;

        if (charTab1.length == charTab2.length) {
            Arrays.sort(charTab1);
            Arrays.sort(charTab2);
            for (int i = 0; i < charTab1.length; i++) {
                if (charTab1[i] != charTab2[i]) {
                    isAnagramme = false;
                    break;
                }
            }
        } else {
            isAnagramme = false;
        }

        if (isAnagramme) {
            System.out.printf(" %s et %s sont des anagrammes ",mot1,mot2);
        } else {
            System.out.printf(" %s et %s ne sont pas des anagrammes ",mot1,mot2);
        }
    }

    public static void Palindrome(String mot1) {
        char[] charTab1 = mot1.toCharArray();
        char[] charTabCompare = new char[mot1.length()];
        boolean isPalindrome = true;

        for (int i = 0, j = charTab1.length - 1; i < charTabCompare.length; i++, j--) {
            charTabCompare[i] = charTab1[j];
        }

        if (charTab1.length == charTab1.length) {
            for (int i = 0; i < charTab1.length; i++) {
                if (charTab1[i] != charTabCompare[i]) {
                    isPalindrome = false;
                    break;
                }
            }
        } else {
            isPalindrome = false;
        }

        if (isPalindrome) {
            System.out.printf("%s est un palidrome",mot1);
        } else {
            System.out.printf("%s n'est pas un palidrome",mot1);
        }
    }

    public static void Pyramide(int hauteur) {

        String display = "";

        for (int i = 1; i < hauteur * 2 ; i++) {
            if (i <= hauteur) {
                System.out.println(display += "*");
            } else {
                System.out.println(display.substring(0, hauteur * 2 - i));
            }
        }
    }

    public static void Pyramide2(int hauteur) {

        StringBuilder display = new StringBuilder();

        for (int i = 1; i < hauteur * 2 ; i++) {
            if (i <= hauteur) {
                System.out.println(display.append("*"));
            } else {
                System.out.println(display.deleteCharAt( hauteur * 2 - i));
            }
        }
    }

}
