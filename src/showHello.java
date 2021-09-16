import java.util.Scanner;

public class showHello {
    public static void main(String[] args) {
        String name;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban nhap ten");
        name = scanner.nextLine();
        System.out.println("Hello " + name );

    }
}
