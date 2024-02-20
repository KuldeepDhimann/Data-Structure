package recursion;
public class CheckSorted {
    public static boolean checkSorted(int input[]){
        if(input.length<=1) {
            return true;
        }
        else {
            int smaallInput[]=new int[input.length-1];
            for(int i=1;i<input.length;i++){
                smaallInput[i-1]=input[i];
            }
            boolean smallAns=checkSorted(smaallInput);
            if(!smallAns)
                return false;
            if(input[0]<=input[1])
                return true;
            else
                return false;
        }
    }
    public static void main(String []args){
        int arr[]={1,2,3,7,5};
        System.out.println(checkSorted(arr));
    }
}
