package se.systementor;

import java.util.ArrayList;
import java.util.Arrays;

public class Person {

    private String namn;
    private int age;

    public Person(String namn, int age) {
        this.namn = namn;
        this.age = age;
    }

    public boolean isAdult() {
        return age > 18;
    }

    public String greetAsRovarSprak() {
        String s = "Hej " + namn;
        return rovarSprak(s);
    }

    private String rovarSprak(String mening) {
        String result = "";
        for(int i = 0; i < mening.length();i++){
            char ch = mening.charAt(i);

            //Går raden under att förbättra? Japp, isConsonant
            if(Character.isLetter(ch) && isVowel(ch) == false  ){
                result = result + ch + 'o' + ch;
            }
            else
                result = result + ch;

        }
        return result;
    }    
    
    
    public boolean isVowel(char ch) {
        char lower = Character.toLowerCase(ch);
        ArrayList<Character> vowels = new ArrayList<>(Arrays.asList('a', 'o', 'u', 'å', 'e', 'i', 'y', 'ä', 'ö'));
        
        return vowels.contains(lower);
    }

    
}
