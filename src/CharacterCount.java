import java.util.HashMap;
import java.util.Map;

public class CharacterCount {
        public static void main(String args[]) {
            String str="PARVATHI";
            Map<Character,Integer> map = new HashMap<>();
            for(int charCount = 0; charCount< str.length();charCount++){
                char ch=str.charAt(charCount);
                if(map.containsKey(ch)){
                    map.put(ch,map .get(ch)+1);}
                else{
                    map .put(ch,1);
                }
            }
            System.out.println(map);
        }
    }

