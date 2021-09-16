import java.util.Scanner;

public class readInt {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap so");
        number = scanner.nextInt();
        if (0<=number && number <=10) {
            switch (number) {
                case 0 :
                    System.out.println("zero");
                    break;
                case 1 :
                    System.out.println("one");
                    break;
                case 2 :
                    System.out.println("two");
                    break;
                case 3 :
                    System.out.println("three");
                    break;
                case 4 :
                    System.out.println("four");
                    break;
                case 5 :
                    System.out.println("five");
                    break;
                case 6 :
                    System.out.println("six");
                    break;
                case 7 :
                    System.out.println("seven");
                    break;
                case 8 :
                    System.out.println("eight");
                    break;
                case 9 :
                    System.out.println("nine");
                    break;
                case 10 :
                    System.out.println("ten");
                    break;
            }
        }
        if(10<number && number<20) {
            int soDu = number%10;
            switch (soDu) {
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }
        }
        if(20<= number && number <100) {
            int tens = number/10;
            int ones = number - tens*10;
            Math.floor(tens);
            switch (tens) {
                case 2 :
                    System.out.println("twenty " );
                    break;
                case 3 :
                    System.out.println("thirty ");
                    break;
                case 4 :
                    System.out.println("fourty ");
                    break;
                case 5 :
                    System.out.println("fifty ");
                    break;
                case 6 :
                    System.out.println("sixty ");
                    break;
                case 7 :
                    System.out.println("seventy ");
                    break;
                case 8 :
                    System.out.println("eighty ");
                    break;
                case 9 :
                    System.out.println("ninety ");
                    break;
            }
            switch (ones) {
                case 0 :
                    System.out.println("ty");
                    break;
                case 1 :
                    System.out.println("one");
                    break;
                case 2 :
                    System.out.println("two");
                    break;
                case 3 :
                    System.out.println("three");
                    break;
                case 4 :
                    System.out.println("four");
                    break;
                case 5 :
                    System.out.println("five");
                    break;
                case 6 :
                    System.out.println("six");
                    break;
                case 7 :
                    System.out.println("seven");
                    break;
                case 8 :
                    System.out.println("eight");
                    break;
                case 9 :
                    System.out.println("nine");
                    break;
            }
        }
    }
}
