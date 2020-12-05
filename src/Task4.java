import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double real=0;
        double expected=0;
        int n=scanner.nextInt();
        double p=scanner.nextInt();
        for (int i = 0; i <n; i++) {
            int a= scanner.nextInt();
            expected=expected+a*(p/100);
            real=real+Math.ceil(a*(p/100));
        }
        System.out.println(real-expected);
    }
}
