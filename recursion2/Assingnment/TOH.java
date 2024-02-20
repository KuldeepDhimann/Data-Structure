package recursion2.Assingnment;

public class TOH {
    public static void TOH(int n,char s,char a,char d){
        if(n==0){
            return;
        }
        TOH(n-1,s,d,a);
        System.out.println(s+" "+d);
        TOH(n-1,a,s,d);
    }
    public static void TOH(int n){
        char s='a';
        char d='b';
        char a='c';
        TOH(n,s,d,a);
    }
    public static void main(String []args){
        TOH(3);
    }
}
