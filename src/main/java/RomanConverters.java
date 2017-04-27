
public class RomanConverters {
    public static String convert(int number) {
        String roman = "";
        int[] arabic_numerals = {10, 9, 5, 4, 1};
        String[] roman_numerals = {"X", "IX", "V", "IV", "I"};

        for (int i = 0; i < arabic_numerals.length; i++) {
            while (number >= arabic_numerals[i]) {
                roman += roman_numerals[i];
                number -= arabic_numerals[i];
            }
        }
        return roman;
    }
}