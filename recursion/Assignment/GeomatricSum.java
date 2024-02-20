package recursion.Assignment;
import static java.lang.Math.pow;
public class GeomatricSum {
    public static double geometricSum(int k){
        if(k==0){
            return 1;
        }
        return geometricSum(k-1)+1/pow(2,k);
    }
    public static void main(String []args){
System.out.println(geometricSum(4   ));
    }

}
