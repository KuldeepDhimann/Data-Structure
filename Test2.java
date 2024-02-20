class A{
    public void display(){
        System.out.println("in class a");
    }
}
class B extends A{
    public void inB(){
        System.out.println("in class b");
    }

}
class C extends A{
    public void inC(){
        System.out.println("in class c");
    }

}
public class Test2{
    public static void main(String []args){
        A object1= new A();
        B object2= new B();
        C object3= new C();
        object2.display();
        object3.display();
    }

}
