import java.util.Scanner;

public class baitap2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tyGia = 23000;
        int usd,vnd;
        System.out.println("nhap tien usd vao");
        usd = scanner.nextInt();
        vnd = usd*tyGia;
        System.out.println("doi ra tien viet la "+vnd);
    }
}
