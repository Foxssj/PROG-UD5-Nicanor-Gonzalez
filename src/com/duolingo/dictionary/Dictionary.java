package com.duolingo.dictionary;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

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

    Set<String> letters = new HashSet<>();
    Set<String> words = new HashSet<>();

    public void addWord(String newWord) {
        String word = newWord.toLowerCase();
        if (letters.contains(word.charAt(0))) {
            words.add(word);
        } else {
            letters.add(String.valueOf(word.charAt(0)));
            words.add(word);
        }
    }

}
