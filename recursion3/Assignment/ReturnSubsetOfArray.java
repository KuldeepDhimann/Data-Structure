package recursion3.Assignment;
public class ReturnSubsetOfArray {
    public static int [][] returnSubsetOfArray(int arr[],int startIndex){
        if(arr.length==startIndex){
            int output[][]=new int[1][0];
            return output;
        }
        int smallOutput[][]=returnSubsetOfArray(arr,startIndex+1);
        int output[][]=new int[smallOutput.length*2][];
        int k=0;
        for(int i=0;i< smallOutput.length;i++){
            output[k]=new int[smallOutput[i].length];
            for(int j=0;j<smallOutput[i].length;j++){
                output[k][j]=smallOutput[i][j];
            }
            k++;
        }
        for(int i=0;i< smallOutput.length;i++){
            output[k]=new int[smallOutput[i].length+1];
            output[k][0]=arr[startIndex];
            for(int j=1;j<=smallOutput[i].length;j++){
                output[k][j]=smallOutput[i][j-1];
            }
            k++;
        }
        return output;
    }
    public static int[][] returnSubsetOfArray(int arr[]){
        return returnSubsetOfArray(arr,0);
    }
    public static void main(String []args){
        int arr[]={1,2,3};
        int output[][]=returnSubsetOfArray(arr);
        for(int i=0;i<output.length;i++){
            for(int j=0;j<output[i].length;j++){
                System.out.print("["+output[i][j]+"]");
            }
            System.out.println();
        }
    }
}
