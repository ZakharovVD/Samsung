import java.util.Scanner;

public class Task3 {
    public static int get_wtf(int start, int a, int cnt) {
        for(int i = 0; i < cnt; i++){
            start += a;
            a += 10;
        }
        return start;
    }

    public static void checker(){
        int ans = 0;
        ans = get_wtf(ans, 10, 4);
        ans = get_wtf(ans, 100, 4);
        ans = get_wtf(ans, 220, 3);
        System.out.print(ans);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // checker();

        int count = scanner.nextInt(), ans = 0;
        for(int i = 0; i < count; i++){
            int a = scanner.nextInt(), b = scanner.nextInt();
            ans = get_wtf(ans, a, b);
        }
        System.out.println(ans);
    }
}
