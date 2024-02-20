package TwoDimensionalArray;
public class LargestColumnSum {
    public static int lasgestColSum(int [][]arr){
        int row=arr.length;
        int col=arr[0].length;
        int largest=Integer.MIN_VALUE;
        for(int j=0;j<col;j++){
            int sum=0;
            for(int i=0;i<row;i++){
                sum=sum+arr[i][j];
            }
            if(largest<sum){
                largest=sum;
            }
        }
        return largest;
    }
    public static void main(String []args){
        int [][]arr={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(lasgestColSum(arr));
    }
}
