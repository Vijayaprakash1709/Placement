import java.util.Scanner;
public class SumOfNnumbers{
    public static void main(String args[]){
        //sc = reference
        //Student name,id
        //name =new Student()
        // Student note=new Student()
        Scanner sc = new Scanner(System.in);
        // class ref = new constructor(parameter);
        int n=sc.nextInt();
        int sum=0;
//        for(int i=1;i<=n;i++){
//            //O(n)
//            sum=sum+i;
//        }
        sum=n*(n+1)/2;
        System.out.println(sum);

    }
}
