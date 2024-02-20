package OOPS1;
public class ComplexNumber {
    private int real;
    private int imaginary;
    ComplexNumber(int x,int y){
        real=x;
        imaginary=y;
    }
    public void printComplexNumber(){
        System.out.println(real+"+"+imaginary+"i");
    }
    public void setReal(int x){
        real=x;
    }
    public void setImaginary(int y){
        imaginary=y;
    }
    public void add(ComplexNumber c1){
        real=real+c1.real;
        imaginary=imaginary+c1.imaginary;
    }
    public void multiply(ComplexNumber c1){
        real=(real*c1.real)-(imaginary*c1.imaginary);
        imaginary=(real*c1.imaginary)+(imaginary*c1.real);
    }

}
class Main{
    public static void main(String[]args){
        ComplexNumber c1=new ComplexNumber(2,3);
        c1.printComplexNumber();
        c1.setReal(4);
        c1.setImaginary(10);
        c1.printComplexNumber();

        ComplexNumber c2=new ComplexNumber(2,3);
        c1.add(c2);
        c1.printComplexNumber();
        c2.printComplexNumber();

        ComplexNumber c3=new ComplexNumber(2,3);
        c3.multiply(c2);
        c2.printComplexNumber();;
        c3.printComplexNumber();

    }
}