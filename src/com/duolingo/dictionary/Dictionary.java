package com.duolingo.dictionary;

import java.util.*;

public class Dictionary {
//2. Desarrolla una clase que almacene palabras clasificándolas por la inicial. Por ejemplo,
    //las palabras “party”, “pond”, “pee” deberán agruparse en una colección por la letra “p”.
    //Esta clase debe contener los métodos necesarios para las interacciones con el menú,
    //de manera que el menú quede con las menores líneas de código posible.
    //3. Las palabras agrupadas por letra deberán ser únicas y no podrán repetirse dentro de
    //la colección.
    //4. En todo momento, las palabras introducidas por el usuario deben ser sanitanizadas,
    //para su comparación o almacenamiento sin tener en cuenta el uso de mayúsculas o
    //espacios, es decir, “ ProgrammING ” se considerará igual que “programming”.
    //. Añadir palabra: Permite al usuario introducir una palabra que se almacenará en el
    //diccionario. Se mostrará por pantalla un mensaje indicando si la palabra se ha
    //guardado correctamente.
    //• Eliminar palabra: Solicita al usuario la palabra que será eliminada del diccionario,
    //mostrando por pantalla un mensaje indicando si la palabra se ha eliminado o si no
    //estaba almacenada.
    //• Existe palabra: Solicita al usuario la palabra que se buscará en el diccionario,
    //mostrando por pantalla un mensaje indicando si la palabra se ha encontrado.
    //• Mostrar iniciales disponibles: Muestra una lista con todas las iniciales que tienen
    //alguna palabra almacenada.
    //• Ver palabras por inicial: Tras solicitar una letra al usuario, muestra todas las
    //palabras almacenadas que empiecen por dicha letra.
    //• Cerrar programa: Esta opción permite salir del programa.

    Map<String, Set<String>> words = new HashMap<>();

    public Dictionary() {
    }



    public void addWord(String newWord) {
        String word = newWord.toLowerCase();
        String letter = String.valueOf(word.charAt(0));

        Set<String> list = this.words.get(letter);

        if (list == null) {
            list = new HashSet<>();
        }

        list.add(word);
        this.words.put(letter, list);

    }

    public void deleteWord(String deleteWord) {
        String word = deleteWord.toLowerCase();
        String letter = String.valueOf(word.charAt(0));
        Set<String> list = this.words.get(letter);

        if (words.containsKey(letter) && list.contains(word)) {
            list.remove(word);
            System.out.println("Word deleted succesfully");
            if (list.size() == 0) {
                words.remove(letter);
            }
        } else {
            System.out.println("Error: word not found");
        }
    }

    public void searchWord(String newWord) {
        String word = newWord.toLowerCase();
        String letter = String.valueOf(word.charAt(0));
        Set<String> list = this.words.get(letter);

        if (words.containsKey(letter) && list.contains(word)) {
            System.out.println("The word: " + word + " has been found");
        } else {
            System.out.println("Error: word not found");
        }
    }

    public void lettersUsed() {
            System.out.println("Letters which contain words" + words.keySet());
    }

    public void wordsByLetter(String letter) {
        Set<String> list = this.words.get(letter);

        if (words.containsKey(letter)) {
            System.out.println(list);
        }
    }
}
