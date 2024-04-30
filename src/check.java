
class A{
    A(){
        System.out.println("Hello from class A");
    }
}
class B extends A
{
    B(){
        System.out.println("Hello ");
    }
}
public class check {
    public static void main(String args[]){
        A obj1=new B();


    }
}
