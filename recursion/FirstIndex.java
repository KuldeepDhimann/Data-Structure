package recursion;

public class FirstIndex {
    public static int firstIndex(int input[],int n,int startIndex){
        if(input.length==startIndex){
            return -1;
        }
        if(input[startIndex]==n){
            return startIndex;
        }
       return firstIndex(input,n,startIndex+1);
       // if(ans==-1)
        //    return ans;
       // else
         //   return ans+1;
    }
    public static int firstIndex(int input[],int n){
        return firstIndex(input,n,0);
    }
    public static void main(String[]args){
        int arr[]={5,5,6,5,6};
        System.out.println(firstIndex(arr,6));
    }
}
