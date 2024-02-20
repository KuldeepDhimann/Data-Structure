package TwoDimensionalArray.Assignment;
public class PrintLikeWave {
    public static void printLikeWave(int [][]arr){
        int row=arr.length;
        int col=arr[0].length;
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(i%2==0)
                    System.out.print(arr[j][i]+" ");
                else
                    System.out.print(arr[row-j-1][i]+" ");
            }
        }
    }
    public static void main(String[]args){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        printLikeWave(arr);
    }
}
