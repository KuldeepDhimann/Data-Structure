package TwoDimensionalArray.Assignment;
public class SumOfBoundriesAndDiagnol {
    public static int firstDiagonalSum(int[][] arr, int n) {
        int row = 0;
        int col = 0;
        int sum = 0;
        while (row < n && col < n) {
            sum = sum + arr[row][col];
            row++;
            col++;
        }
        return sum;
    }
    public static int secondDiagonalSum(int [][]arr,int n){
        int row=0;
        int col=n-1;
        int sum=0;
        while(row<n&&col>=0){
            sum=sum+arr[row][col];
            row++;
            col--;
        }
        return sum;
    }
    public static int boundarySum(int arr[][],int n){
        int sum=0;
        for(int i=1;i<n-1;i++){
            sum=sum+arr[0][i];
            sum=sum+arr[n-1][i];
            sum=sum+arr[i][0];
            sum=sum+arr[i][n-1];
        }
        return sum;
    }
    public static int getboundaryAndDiagonalSum(int arr[][],int n){
        int totalSum=0;
        if(n==0){
            return totalSum;
        }
        totalSum=firstDiagonalSum(arr,n)+secondDiagonalSum(arr,n)+boundarySum(arr,n);
      //  if(n%2!=0){
        //    totalSum=totalSum-arr[n/2][n/2];
        //}
        return totalSum;
    }
    public static void main(String[]args){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(getboundaryAndDiagonalSum(arr,3));
    }
}