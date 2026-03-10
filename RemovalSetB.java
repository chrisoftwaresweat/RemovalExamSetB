import java.util.Scanner;
//READ THIS: DON'T MIND THE MAIN METHOD, IF U WANNA REVIEW GO STRAIGHT TO SUB METHODS!
//REMOVE THE COMMENTS IF U WANNA USE THE CODE
public class RemovalSetB {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n\nWE HAVE 4 PROBLEMS");
            System.out.print("(1)Left-Shifted Star Pattern\n(2)Increasing Star Pattern with shift\n(3)Repeated Number Triangle\n(4)Fibonacci Sequence\n(5)Exit\nWhich one dy wanna run?: ");
            choice= scanner.nextInt();
            switch (choice){
                case 1:
                    problemOne(scanner);
                    break;
                case 2:
                    problemTwo(scanner);
                    break;
                case 3:
                    problemThree(scanner);
                    break;
                case 4:
                    problemFour(scanner);
                    break;
                case 5:
                    System.out.println("GOOD LUCK ON YOUR EXAM!");
                    break;
                default :
                    System.out.println("Only choose numbers from 1-5 and 6 to exit");
            }
        }while(choice!=5);
        scanner.close();
    }
    /*
    FOR THE FIRST 3 PROBLEMS REMEMBER THESE PATTERN
    (INITIALIZATION; CONDITION)
    OUTER LOOP: (1; USER INPUT) PRINT NEW LINE
    INNER LOOPS: INCREASING AND DECREASING
    INCREASING: 1: OUTER LOOP
    DECREASING: OUTER LOOP; USER INPUT
    JUST MANIPULATE THESE IF YOU'RE DEALING WITH PATTERNS! OUTER LOOP/S=ROWS, INNER LOOP/S=COLUMNS
    DON'T MEMORIZE SYNTAX; FIND PATTERNS, AND UNDERSTAND IT.
     */
    //Problem 1: Left-Shifted Star Pattern
    static void problemOne(Scanner scanner){
        //user input
        System.out.print("Enter how many rows: ");
        int n= scanner.nextInt();
        //it has a DECREASING space, and SQUARE/RECTANGLE patterns. for sq/rec patterns just reuse d outer loop.
        //outer loop
        for (int i=1; i<=n; i++){
            //decreasing space pattern
            for (int j=i; j<=n; j++){
                System.out.print(" ");
            }
            //sq/rec star pattern
            for (int k=1; k<=n; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Problem 2: Increasing Star Pattern with shift
    static void problemTwo(Scanner scanner){
        //user input
        System.out.print("Enter how many rows: ");
        int n= scanner.nextInt();
        //THIS ONE GOT 2 INCREASING PATTERNS BUT THE FIRST ONE IS SPACE, NEXT ONE IS STAR
        //outer loop
        for (int i=1; i<=n; i++){
            //inner loops
            for (int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for (int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    //Problem 3: Repeated Number Triangle
    static void problemThree(Scanner scanner){
        int n=9;
        //we need to reverse the numbers alongside reversing the triangle as well
        /*
        so we will manipulate the outer loop and inner loops as well(reversing their initialization, condition, update)
        instead of outer loop: 1; user input(n) we did n; 1
        and instead of DECREASING pattern of numbers we used INCREASING pattern of numbers
         */
        for (int i=n; i>=1; i--){
            for (int j=1; j<=i; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    //Problem 4: Number Series(Fibonacci Sequence)
    static void problemFour(Scanner scanner){
        int n=15;
        int first=0, second=1;
        for (int i=1; i<=n; i++){
            System.out.printf("%d ", first);
            //next = 0+1=1, 1+1=2, 1+2=3
            int next=first+second;
            //oldFirst(0)->newFirst(1), 1->1, 1->3
            first=second;
            //oldSecond(1)->newSecond(1), 1->2, 2->3
            second=next;
        }
    }
}
