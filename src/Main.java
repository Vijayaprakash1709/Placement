import java.util.*;
public class Main {
    public static void main(String[] args ) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        while(n>0) {
            int rem = n % 2;
            s = rem + s;
            n = n / 2;
        }
        System.out.println(s);
        String rev="";
        for(int i=s.length()-1;i>=0;i--){
            rev=rev+s.charAt(i);
        }
        if(s.equals(rev)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("It is not a Palindrome");
        }

    }
}
