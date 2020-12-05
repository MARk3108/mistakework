import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int summ=0;
        int a=0;
        int b=0;
        for (int i = n; i >=1; i--) {
            if (getDel(getDel(i))==i&&i<getDel(i)){
                a=i;
                b=getDel(i);
                break;
            }
        }

        if(a!=0){
            System.out.println(a+" "+b);
        }else{
            System.out.println(0);
        }
    }


    static int getDel(int x){
        int sum=0;
        for (int i = 1; i <= x/2; i++) {
            if(x%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}
