package recursion;

public class AllIndicesOfNumber2 {
    public static int[] allIndicesOfNumber(int []input,int n,int startIndex){
        if(input.length==startIndex){
            int output[]=new int[0];
            return output;
        }
        int smalloutput[]=allIndicesOfNumber(input,n,startIndex+1);
        if(input[startIndex]==n){
            int output[]=new int[input.length+1];
            output[0]=startIndex;
            for(int i=0;i<output.length;i++){
                output[i+1]=smalloutput[i];
            }
            return output;
        }
        else {
            return smalloutput;
        }

    }
    public static int[] allIndicesNumber(int []input,int n){
      return  allIndicesOfNumber(input,n,0)  ;
    }
    public static void main(String []args){
        int arr[]={9,8,10,8,8};
        int brr[]=allIndicesNumber(arr,8);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
}
