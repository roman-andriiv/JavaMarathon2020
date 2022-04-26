package day18;
/*You are given a numeric array of arbitrary size. Calculate the sum of the numbers in this array without using loops
(need to use recursive calls).*/
public class Task1 {
    public static void main(String[] args) {
        int[] numbers = {1 , 10 , 1241 , 50402 , - 50 , 249 , 10215 , 665 , 2295 , 7 , 311};
        System.out.println( recursionSum(numbers, 0));
    }

    public static int recursionSum(int[] numbers, int i) {
        if (i == numbers.length)
            return 0;

        return numbers[i]+ recursionSum(numbers, i+1);
    }
}
