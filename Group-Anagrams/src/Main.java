import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"} ));
    }

    public static List<List<String>> groupAnagrams(String[] strs)
    {
        int length = strs.length;
        List<List<String>> anagramGroup = new ArrayList<>();
        List<String> anagrams = new ArrayList<>();


        for (int i = 0; i < length; i++)
        {
            if (anagrams.contains(strs[i].contentEquals(strs[i])))
        }
    }
}