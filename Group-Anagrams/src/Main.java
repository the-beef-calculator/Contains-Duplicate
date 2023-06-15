import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// Given an array of strings strs, group the anagrams together. You can return the answer in any order.
//
//An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
//
//
//Example 1:
//
//Input: strs = ["eat","tea","tan","ate","nat","bat"]
//Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
public class Main {

    public static void main(String[] args)
    {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"} ));
    }

    public static List<List<String>> groupAnagrams(String[] strs)
    {
        int length = strs.length;

        if (length == 0)
        {
            return new ArrayList<>();
        }

        HashMap <String, List<String>> words = new HashMap<>();

        for (int i = 0; i < length; i++)
        {

            char[] wordArray = strs[i].toCharArray();
            Arrays.sort(wordArray);
            String anagramKey = String.valueOf(wordArray);

            if (words.containsKey(anagramKey))
            {
                List<String> arrayListOfKey = words.get(anagramKey);
                arrayListOfKey.add(strs[i]);
                continue;
            }

            List<String> stringList = new ArrayList<>();
            stringList.add(strs[i]);
            words.put(anagramKey, stringList);

        }

        return words.values().stream().toList();


    }



}