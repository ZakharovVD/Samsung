import java.util.Scanner;

public class Task2 {
    public static int get_max(int a, int b, int c){
        int ret = a;
        if (b > ret) ret = b;
        if (c > ret) ret = c;
        return ret;
    }

    public static void checker(){
        System.out.println(get_max(-1, -1, 1));
        System.out.println(get_max(-1, 2, -1));
        System.out.println(get_max(3, -1, -1));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // checker();

        System.out.println(get_max(scanner.nextInt(), scanner.nextInt(), scanner.nextInt()));
    }
}
