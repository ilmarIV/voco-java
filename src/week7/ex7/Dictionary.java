package week7.ex7;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> dictionaryHash;

    public Dictionary() {
        this.dictionaryHash = new HashMap<>();
    }

    public String translate(String word) {
        return this.dictionaryHash.get(word);
    }

    public void add(String word, String translation) {
        this.dictionaryHash.put(word, translation);
    }

    public int amountOfWords() {
        return this.dictionaryHash.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> wordPairs = new ArrayList<>();

        for (String word : this.dictionaryHash.keySet()) {
            wordPairs.add(word + " = " + translate(word));
        }

        return wordPairs;
    }


}
