package PracticeProblem02;

public class SumOfASeries {
    public static void main(String[] args) {
         //Generating two series 2, 4, 6, 8, 10, 12, 14, 16, 18, 20
         //                   and 1, 3, 5, 7, 9, 11, 13, 15, 17, 19
         //and Calculate the sum of two series Using Loops

        int i = 1, sumEven = 0, sumOdd = 0;
        System.out.println("Odd Series: ");
        for(i = 1; i <= 20; i += 2){
            System.out.print(i + " ");
            sumOdd += i;
        }
        System.out.println("\nSum Of Odd Series: " + sumOdd);
        int j = 2;
        System.out.println("Even Series: ");
        while(j <= 20){
            System.out.print(j + " ");
            sumEven += j;
            j += 2;
        }
        System.out.println("\nSum Of Even Series: " + sumEven);
    }
}
