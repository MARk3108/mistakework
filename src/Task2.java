import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int pos1;
        int pos2;
        int x1=scanner.nextInt();
        int y1=scanner.nextInt();
        int x2=scanner.nextInt();
        int y2=scanner.nextInt();
        if (x1==0||y1==0||x2==0||y2==0){
            System.out.println("NaN");
            return;
        }
        if (x1>0){
            if (y1>0){
                pos1=1;
            }else{
                pos1=4;
            }
        }else{
            if (y1>0){
                pos1=2;
            }else{
                pos1=3;
            }
        }

        if (x2>0){
            if (y2>0){
                pos2=1;
            }else{
                pos2=4;
            }
        }else{
            if (y2>0){
                pos2=2;
            }else{
                pos2=3;
            }
        }


        if (pos1==pos2){
            System.out.println("YES "+pos1);
        }else{
            System.out.println("NO "+pos1+" "+pos2);
        }
    }
}
