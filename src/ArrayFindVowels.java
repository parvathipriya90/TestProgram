//[‘a’, ‘z’, ‘4’, ‘i’, ‘m’, ‘7’]
//input : char array

import java.util.ArrayList;
import java.util.List;

//collect the vowels, consonants, numbers into separate lists
public class ArrayFindVowels {
    public static void main(String[] args) {
        char[] value = {'a', 'z', '4', 'i', 'm', '7'};
        List vowels = new ArrayList();
        List consonants = new ArrayList();
        List numbers = new ArrayList();
        System.out.println("Vowels");
        for (char indexOfVowels = 0; indexOfVowels < value.length; indexOfVowels++) {
            if (value[indexOfVowels] == 'a' || value[indexOfVowels] == 'i') {
                vowels.add(value[indexOfVowels]);
            }
        }
        System.out.println(vowels);
        System.out.println("Consonants");
        for (char indexOfConsonants = 0; indexOfConsonants < value.length; indexOfConsonants++) {
            if (value[indexOfConsonants] == 'z' || value[indexOfConsonants] == 'm') {
                consonants.add(value[indexOfConsonants]);
            }
        }
        System.out.println(consonants);
        System.out.println("Numbers");
        for (char indexOfNumbers = 0; indexOfNumbers < value.length; indexOfNumbers++) {
            if (value[indexOfNumbers] == '4' || value[indexOfNumbers] == '7') {
                numbers.add(value[indexOfNumbers]);
            }
        }
        System.out.println(numbers);
    }
}

