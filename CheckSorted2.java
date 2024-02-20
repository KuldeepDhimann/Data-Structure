public class CheckSorted2 {
    public static boolean checksorted(int input[]){
        if(input.length<=1)
            return true;
        if(input[0]>input[1])
            return false;
        else {
            int smallInput[]=new int[input.length-1];
            for(int i=1;i<input.length;i++){
                smallInput[i-1]=input[i];
            }
            boolean smallAns=checksorted(smallInput);
            return smallAns;
        }
    }
    public static void main(String[]args){
        int []arr={1,3,4,5,2};
        System.out.println(checksorted(arr));
    }
}
