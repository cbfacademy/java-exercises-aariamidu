package com.cbfacademy;

public class StringExercises {

    public String fromCharacters(char[] characters) {
        // TODO - Write code that creates a String from the input array of characters
        String result = new String(characters);
        return result;
    }

    public Long howMany(String text, Character character) {
        // TODO - Write code to determine how many of the input ${character} are
        // contained in the input ${text}
        long characterCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == character) {
                characterCount++;
            }
        }
        return characterCount;
    }

    public Boolean isPalindrome(String word) {
        // TODO - Write code to determine whether the input ${word} is a palindrome
        int wordStart = 0;
        int wordEnd = word.length() - 1;
        while (wordStart < wordEnd) {
            if (word.charAt(wordStart) != word.charAt(wordEnd)) {
                return false;
            }
            wordStart++;
            wordEnd--;
        }
        return true;
    }

    public String getName() {
        return "String Exercises";
    }
}
