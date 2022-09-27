import java.util.Scanner;

public class baitap3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b,c,abc;
        System.out.println("nhap so nguyen duong co toi da 3 chu so vao");
        abc = scanner.nextInt();
        a = abc/100;
        b = abc%100/10;
        c = abc%10;
        if (abc<16){
            switch (abc){
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("tow");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("for");
                    break;
                case 5:
                    System.out.println("fire");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nice");
                    break;
                case 11:
                    System.out.println("eleven");
                    break;
                case 12:
                    System.out.println("twelf");
                    break;
                case 13:
                    System.out.println("thirteen");
                    break;
                case 14:
                    System.out.println("fourteen");
                    break;
                case 15:
                    System.out.println("fifteen");
                    break;
            }
        } else if (abc<20){
            System.out.println(+"teen");
        } else {

        }

    }
}
