import java.util.HashMap;
import java.util.HashSet;

public class Main {

    //Given two strings s and t, return true if t is an anagram of s, and false otherwise.
    //An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
    // typically using all the original letters exactly once.
    public static void main(String[] args) {

        System.out.println(isAnagram1("anagram","nagaram"));
        System.out.println(isAnagram1("rat","car"));
        System.out.println(isAnagram1("aacc","ccac"));
    }



    //Time Complexity O(2n) -> O(n)
    public static boolean isAnagram(String s, String t)
    {
        if (s.length() != t.length())
        {
            return false;
        }

        int[] alphabet = new int[27];
        int length = s.length();

        for (int i = 0; i < length; i++)
        {
            alphabet[s.charAt(i) - 'a']++;
            alphabet[t.charAt(i) - 'a']--;
        }

        for (int i = 0; i < alphabet.length; i++)
        {
            if (alphabet[i] != 0)
            {
                return false;
            }
        }
        return true;
    }

    public static boolean isAnagram1(String s, String t)
    {
        if (s.length() != t.length())
        {
            return false;
        }
        char[] S = s.toCharArray();
        char[] T = t.toCharArray();



        HashMap<Character, Integer> stringMap1 = new HashMap<>();
        HashMap<Character, Integer> stringMap2 = new HashMap<>();

        for(char letter: S)
        {
            if(stringMap1.containsKey(letter))
            {
                int counter = stringMap1.get(letter);
                stringMap1.put(letter, ++counter);
                continue;
            }
            stringMap1.put(letter,1);
        }

        for(char letter: T)
        {
            if(stringMap2.containsKey(letter))
            {
                int counter = stringMap2.get(letter);
                stringMap2.put(letter, ++counter);
                continue;
            }
            stringMap2.put(letter,1);
        }

        return stringMap1.equals(stringMap2);


    }

    public static boolean isAnagram2(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] store = new int[26];

        for(int i = 0; i < s.length(); i++) {
            store[s.charAt(i) - 'a']++;
            store[t.charAt(i) - 'a']--;
        }

        for (int n : store) {
            if (n != 0) {
                return false;
            }
        }

        return true;

    }
}
