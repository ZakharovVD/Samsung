public class Task1 {
    static int answer;

    public static int get_max(int a, int b){
        if (a > b) return a;
        else return b;
    }

    public static void checker(){
        // Ok
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 11;
        answer = get_max(a, b);
        System.out.print(answer);
    }
}
