//[‘a’, ‘z’, ‘4’, ‘i’, ‘m’, ‘7’]
  //      input : char array
//    collect the vowels, consonants, numbers into separate lists

import java.util.Arrays;
public class ArrayVowels {
        public static void main(String[] args) {
            char value=4;
            char[] array = {'a', 'z', '4', 'i', 'm', '7','e','u'};
            char[] vowels = new char[value];
            char[] consonants=new char[value];
            char[] numbers=new char[value];
            int vowelscount=0;
            int consonantscount=0;
            int numberscount=0;
            for (int number = 0; number<array.length;number++) {
               if (array[number]=='a'||array[number]=='i'||array[number]=='u'||array[number]=='e'){
                    vowels[vowelscount++] = array[number];
            }else if(array[number]=='z'||array[number]=='m'){
                    consonants[consonantscount++]=array[number];
                } else if (array[number]=='4'||array[number]=='7') {
                    numbers[numberscount++]=array[number];
                }
            }
            System.out.println(Arrays.toString(vowels));
            System.out.println(Arrays.toString(consonants));
            System.out.println(Arrays.toString(numbers));

            }
}
