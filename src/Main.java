import java.util.*;
public class Main {
    public static void main(String[] args ) {
        Scanner sc=new Scanner(System.in);
        double x=sc.nextDouble();
        double n=sc.nextDouble();
        double ans=1;
        for(double i=1;i<=n;i++){
            ans = ans * Math.pow(x,(n/i));
        }
        System.out.println(ans);
    }
}
