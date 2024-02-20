package SearchingAndSorting.Assignment;
public class SumOfTwoArray {
    public static int[] sumOfTwoArray(int []arr1,int []arr2){
        int i=arr1.length-1;
        int j=arr2.length-1;
        int x=Math.max(arr1.length, arr2.length);
        int carry=0;
        int output[]=new int[x+1];
        int k=output.length-1;
        while(i>=0&&j>=0){
            int sum=arr1[i]+arr2[j]+carry;
            output[k]=sum%10;
            carry=sum/10;
            k--;
            i--;
            j--;
        }
        while(i>=0){
            int sum=arr1[i]+carry;
            output[k]=sum%10;
            carry=sum/10;
            i--;
            k--;
        }
        while(j>=0){
            int sum=arr2[j]+carry;
            output[k]=sum%10;
            carry=sum/10;
            j--;
            k--;
        }
       output[0]=carry;
        return output;
    }
    public static void main(String []args)
    {
        int []arr1={9,9,9,9};
        int []arr2={9,9,9};
        int []output=sumOfTwoArray(arr1,arr2);
        for(int i=0;i< output.length;i++){
            System.out.print(output[i]+" ");
        }
    }
}
