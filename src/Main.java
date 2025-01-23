
import java.util.Arrays;
import java.util.Objects;
import java.util.Random;


public class Main {
    public static String find_Things() {

        Random randint = new Random();
        int [] arr = new int[15];
        int sumOf = 0;
        double counter = 0;
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i< arr.length; i++){
            arr[i] = randint.nextInt(101);
        }

        for (int i:arr){
            sumOf+=i;
            counter+=1;
            if (i < smallest){
                smallest = i;
            }
            if (i > largest){
                largest = i;
            }
        }
        System.out.println("Массив: " + Arrays.toString(arr));

        return  "Largest: " + largest + " " +  "Smallest " + smallest + " " + "average " + sumOf/counter;
    }

    public static void main(String[] args) {
        System.out.println(find_Things());
        System.out.println(isPalindrome("1bavab1"));
    }

        public static boolean isPalindrome(Object abc) {
            String str = abc.toString();

            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    return false;
                }
                else{
                    left++;
                    right--;
                }

            }
            return true;
        }
}