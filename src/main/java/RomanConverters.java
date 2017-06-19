
public class RomanConverters {
    public static String convert(int number) {
        String roman = "";
        int[] arabic_numerals = {10, 9, 5, 4, 1};
        String[] roman_numerals = {"X", "IX", "V", "IV", "I"};

        /*for(RomanNumerals romanNumeral : RomanNumerals.values()){
            while (number >= romanNumeral.arab) {
                roman += romanNumeral.name();
                number -= romanNumeral.arab;
            }
        }*/

        //comment out this method (and arabic/roman_numerals variables above) to use enum
        for (int i = 0; i < arabic_numerals.length; i++) {
            while (number >= arabic_numerals[i]) {
                //you can only increment (+=) a number, therefore, had to concat the string below
                roman = roman.concat(roman_numerals[i]);
                number -= arabic_numerals[i];
            }
        }

        return roman;
    }
}