package OOPS1;

import java.util.Arrays;

public class Polynomial {
    private int degCoeff[];
    Polynomial(){
        degCoeff=new int[10];
    }
    public void setCoefficient(int deg,int coeff){
        if(degCoeff.length-1<deg){
            int temp[]=degCoeff;
            degCoeff=new int[deg+1];
            for(int i=0;i< temp.length;i++){
                degCoeff[i]=temp[i];
            }
        }
        degCoeff[deg]=coeff;
    }
    public void print() {
        for (int i = 0; i < degCoeff.length; i++) {
            if (degCoeff[i] != 0) {
                System.out.print(degCoeff[i] + "x" + i + " ");
            }
        }
        }
    public int getCoeff(int deg){
        if(deg<degCoeff.length)
            return degCoeff[deg];
        else
            return 0;
    }
    public Polynomial add(Polynomial p){
        Polynomial ans=new Polynomial();
        int plen1=this.degCoeff.length;
        int plen2=p.degCoeff.length;
        int len=Math.min(plen1,plen2);
        int i;
        for(i=0;i<len;i++){
            ans.setCoefficient(i,this.degCoeff[i]+p.degCoeff[i]);
        }
        while(i<plen1){
            ans.setCoefficient(i,this.degCoeff[i]);
            i++;
        }
        while(i<plen2){
            ans.setCoefficient(i,p.degCoeff[i]);
            i++;
        }
        return ans;
    }
    public Polynomial substract(Polynomial p){
        Polynomial ans=new Polynomial();
        int plen1=this.degCoeff.length;
        int plen2=p.degCoeff.length;
        int len=Math.min(plen1,plen2);
        int i;
        for(i=0;i<len;i++){
            ans.setCoefficient(i,this.degCoeff[i]-p.degCoeff[i]);
        }
        while(i<plen1){
            ans.setCoefficient(i,this.degCoeff[i]);
            i++;
        }
        while(i<plen2){
            ans.setCoefficient(i,p.degCoeff[i]);
            i++;
        }
        return ans;
    }
    public Polynomial multiply(Polynomial p){
        Polynomial ans=new Polynomial();
        for(int i=0;i<this.degCoeff.length;i++){
            for(int j=0;j<p.degCoeff.length;j++){
                int termDeg=i+j;
                int termCoeff=this.degCoeff[i]*p.degCoeff[j];
                int oldCoeff=ans.getCoeff(termDeg);
                setCoefficient(termDeg,termCoeff+oldCoeff);
            }
        }
        return ans;
    }
    public static void main(String []args){
        Polynomial p1=new Polynomial();
        p1.setCoefficient(0,3);
        p1.setCoefficient(2,2);
        p1.print();

        Polynomial p2=new Polynomial();
        p2.setCoefficient(0,3);
        p2.setCoefficient(2,5);
        p2.print();

        p1.add(p2);
        p1.print();
        p2.print();

        p2.multiply(p1);
        p2.print();
        p1.print();


    }

    }
