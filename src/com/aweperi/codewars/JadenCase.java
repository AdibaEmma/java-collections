package com.aweperi.codewars;

public class JadenCase {
    public static String toJadenCase(String phrase){
        if(phrase.isEmpty()){
            return  null;
        }

        //Get the various digits from the words
        char[] characters = phrase.toCharArray();
        boolean IsSpaceFound = true;

        //loop through the characters
        for(int i = 0; i < characters.length; i++){

            if(Character.isLetter(characters[i])){
                //Check to see if there is a space
                if(IsSpaceFound){

                    characters[i] = Character.toUpperCase(characters[i]);
                    IsSpaceFound = false;
                }
            }  else{
                IsSpaceFound = true;
            }
        }

        phrase = String.valueOf(characters);
        return  phrase;
    }
}
