import java.util.HashMap;

public class Main {
    public static void main(String[] args)
    {
        System.out.println(intToNumeral(1666));
    }

    //Symbol    Value
    //I          1
    //V          5
    //X          10
    //L          50
    //C          100
    //D          500
    //M          1,000
    public static String intToNumeral(int n)
    {
        StringBuilder romanNumeral = new StringBuilder();
        HashMap<Integer, String> numerals = new HashMap<>();
        numerals.put(1000,"M");
        numerals.put(900, "CM");
        numerals.put(500, "D");
        numerals.put(400, "CD");
        numerals.put(100,"C");
        numerals.put(90, "XC");
        numerals.put(50, "L");
        numerals.put(10, "X");
        numerals.put(9, "IX");
        numerals.put(5,"V");
        numerals.put(4,"IV");
        numerals.put(1,"I");

        int[] numeralArray = {1000,900,500,400,100,90,50,10,9,5,4,1};

        int counter;

        for (int i = 0; i < numeralArray.length; i++)
        {
            counter = 3;

            if(n - numeralArray[i] >= 0)
            {
                while(n - numeralArray[i] >= 0 && counter != 0)
                {
                    n -= numeralArray[i];
                    counter--;
                    romanNumeral.append(numerals.get(numeralArray[i]));
                }
            }
        }
        return romanNumeral.toString();
    }
}