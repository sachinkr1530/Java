
// import java.lang.classfile.Superclass;

public class p1_practice extends ClassA{
    public static void main(String[] args) {
        
        p1_practice p1_practice=new p1_practice();
        p1_practice.count();
    }
    public void count(){
        int sum=super.Add(11,22);
        System.out.println("Sum is "+sum);
        ClassB b;
        b=new ClassB(name ,"sachin");


        int product=b.Multiply(11, 11);
        System.out.println("Multiply of two number "+product);
    }
}