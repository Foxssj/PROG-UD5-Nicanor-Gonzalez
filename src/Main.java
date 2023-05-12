import com.duolingo.dictionary.Dictionary;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dictionary dictionary = new Dictionary();
        boolean exit = false;
        String option;
        String dictionaryMenu = "1.- Añadir palabra.\n" +
                "2.- Eliminar palabra.\n" +
                "3.- Existe palabra.\n" +
                "4.- Mostrar iniciales disponibles.\n" +
                "5.- Ver palabras por inicial.\n" +
                "Q Cerrar programa.";

        while (!exit) {
            System.out.println(dictionaryMenu);
            option = sc.nextLine();
            switch (option) {
                case "1":
                    System.out.println("What do you want to add to the dictionary?");
                    String word = sc.nextLine();
                    dictionary.addWord(word);
                    break;

                case "2":
                    System.out.println("What word do you want to erase?");
                    String deleteWord = sc.nextLine();
                    dictionary.deleteWord(deleteWord);
                    break;

                case "3":
                    System.out.println("What word do you want to search?");
                    String search = sc.nextLine();
                    dictionary.searchWord(search);
                    break;

                case "4":
                    dictionary.lettersUsed();
                    break;

                case "5":
                    System.out.println("What letter you want to check it's words?");
                    String letter = sc.nextLine();
                    dictionary.wordsByLetter(letter);
                    break;

                case "Q":
                case "q":
                    System.out.println("Saliendo . . .");
                    exit = true;

            }
        }


    }
}