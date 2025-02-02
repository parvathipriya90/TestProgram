public class ArrayFindSameValue {
    public static void main(String[] args) {
    char[] array1={'1','a','3'};
    char[] array2={'a','1','4','a'};
    for(int firstArrayIndex=0;firstArrayIndex<array1.length;firstArrayIndex++) {
        boolean isFound=false;
        for (int secondArrayIndex = 0; secondArrayIndex < array2.length; secondArrayIndex++) {
            if (array1[firstArrayIndex] == array2[secondArrayIndex]) {
                isFound = true;
                break;
            }
        }
                System.out.println(array1[firstArrayIndex] +" "+ isFound);
            }
        }
    }

