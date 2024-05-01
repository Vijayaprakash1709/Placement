import java.util.*;
public class NumberOfDigits {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            count=(count*10)+(n%10);
            n/=10;
        }
        System.out.println(count);
    }
}
