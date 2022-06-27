    import java.util.Scanner;

    public class MaxHammingDistance {
        static int temp=0;
        public static void main(String[] args) {
            Scanner ob = new Scanner(System.in);
            String str = ob.next();
            String str2 = str;
            int size = str.length();
            MaxHammingDistance a = new MaxHammingDistance();
            a.anagm(str2,str, 0, size - 1);
            System.out.println(temp);

        }

        private void anagm(String str2,String str, int start, int end)
        {
            if (start == end) {
                    int i = 0, count = 0;
                    while (i < str.length()) {
                        if (str2.charAt(i) != str.charAt(i))
                            count++;
                        i++;
                    }
                if (temp < count) {
                    temp = count;
                }
                }
            else {
                for (int i = start; i <= end; i++) {
                    str = swap(str, start, i);
                    anagm(str2,str, start + 1, end);
                    str = swap(str, start, i);
                }
            }
        }
        public String swap(String a, int i, int j)
        {
            char temp;
            char[] charArray = a.toCharArray();
            temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
            return String.valueOf(charArray);
        }
    }
