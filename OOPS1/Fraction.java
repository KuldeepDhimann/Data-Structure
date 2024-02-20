package OOPS1;
public class Fraction {
    private int numerator;
    private int denominator;
    public Fraction(int numerator,int denominator){
        this.numerator=numerator;
        this.denominator=denominator;
        simplify();
    }
    public void simplify() {
        int hcf = 1;
        int smaller = Math.min(numerator, denominator);
        for (int i = 2; i < smaller; i++) {
            if (numerator % 2 == 0 && denominator % 2 == 0) {
                hcf = i;
            }
            numerator = numerator / hcf;
            denominator = denominator / hcf;
        }
    }
        public void increment(){
            numerator=numerator+denominator;
            simplify();
        }
        public void printFraction(){
            System.out.println(numerator+"/"+denominator);
        }
        public void setNumerator(int n){
        numerator=n;
        }
        public int getNumerator(){
        return numerator;
        }
        public void setDenominator(int d){
        denominator=d;
        }
        public int getDenominator(){
        return denominator;
        }
        public void add(Fraction f){
        this.numerator=this.numerator*f.denominator+this.denominator*f.numerator;
        this.denominator=this.denominator*f.denominator;
        simplify();
        }
        public Fraction add(Fraction f1,Fraction f2){
            int n;
            int d;
            n=f1.numerator*f2.denominator+f1.denominator*f2.numerator;
            d=f1.denominator*f2.denominator;
            Fraction f3=new Fraction(n,d);
            return f3;
        }
        public static void main(String[]args){
        Fraction f1=new Fraction(2,3);
        f1.printFraction();
        }
    }


