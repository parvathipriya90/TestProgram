public class ReverseCharacter {
            public static void revChar(String str,String rev){
             str="PARVATHI" ;
             rev="";
            for(int i = str.length()-1; i>=0; i--) {
                rev=rev + str.charAt(i);
            }
            System.out.println(rev);
        }
    }

