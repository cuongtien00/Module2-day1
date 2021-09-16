import java.util.Scanner;

public class chuyendoitien {
    public static void main(String[] args) {
        int dollar;
        int rate;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so tien dollar");
        dollar = scanner.nextInt();
        rate = dollar*23000;
        System.out.println("So VND tuong ung " + rate + "VND");

    }
}
