package TwoDimensionalArray.Assignment;
public class SpiralPrint {
    public static void spiralPrint(int arr[][]){
        int row= arr.length;
        int col=arr[0].length;
        int rs=0;
        int re=row-1;
        int cs=0;
        int ce=col-1;
        int count=0;
        while(count<row*col){
            for(int i=cs;i<ce;i++){
                System.out.print(arr[rs][i]+" ");
                count++;
            }
            for(int i=rs;i<re;i++){
                System.out.print(arr[i][ce]+" ");
                count++;
            }
            for(int i=ce;i>cs;i--){
                System.out.print(arr[re][i]+" ");
                count++;
            }
            for(int i=re;i>rs;i--){
                System.out.print(arr[i][cs]+" ");
                count++;
            }
            cs++;
            rs++;
            re--;
            ce--;
        }
    }
    public static void main(String[]args){
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralPrint(arr);
    }
}
