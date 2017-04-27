
public class RomanConverters {
    public static String convert(int number) {
        String roman = "";
        //int[] arabic_numerals = {10, 9, 5, 4, 1};
        //String[] roman_numerals = {"X", "IX", "V", "IV", "I"};

        for(RomanNumerals romanNumeral : RomanNumerals.values()){
            while ( number >= romanNumeral.arab) {
                roman += romanNumeral.name();
                number -= romanNumeral.arab;
            }
        }

        /*for (int i = 0; i < RomanNumerals. arabic_numerals.length; i++) {
            while (number >= arabic_numerals[i]) {
                roman += RomanNumerals.;
                number -= arabic_numerals[i];
            }
        }*/
        return roman;
    }
}