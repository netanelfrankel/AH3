public class Solution {
    public static void main(String[] args) {
        recursiveFizzBuzz(15);
    }
    public static void fizzBuzz(int n){
        for(int i=1; i <=n ;i++){
            if(i%5==0 && i%3==0){
                System.out.println("FizzBuzz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            }
            else{
                System.out.println(i);
            }
        }
    }
    public static void recursiveFizzBuzz(int n){
//        base case
        if (n == 1){
            System.out.println(n);
        }
//        recursive case
        else {

            if (n % 5 == 0 && n % 3 == 0) {
                System.out.println("FizzBuzz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else if (n % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(n);
            }
            recursiveFizzBuzz(n - 1);
        }
    }
}
