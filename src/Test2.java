public class Test2 {
        public static void main(String[] args) {
            String[] List1 = {"1", "a", "3"};
            String[] findList = {"a", "1", "4", "a"};

            for (int i = 0; i < List1.length; i++) {
                boolean find1 = false;
                for (int j = 0; j < findList.length; j++) {
                    if (List1[i] == findList[j]) {
                        find1 = true;
                    }
                }

                System.out.println(List1[i] + " " + find1);
            }
        }
    }
