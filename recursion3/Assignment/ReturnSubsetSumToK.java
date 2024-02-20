package recursion3.Assignment;

public class ReturnSubsetSumToK {
    public static int[][] returnSubsetSumToK(int[] input, int startInndex, int k) {
        if (startInndex == input.length) {
            if (k == 0) {
                int[][] output = new int[1][0];
                return output;
            } else {
                int[][] output = new int[0][0];
                return output;
            }
        }
        int[][] smallOutput1 = returnSubsetSumToK(input, startInndex + 1, k);
        int[][] smallOutput2 = returnSubsetSumToK(input, startInndex + 1, k - input[startInndex]);
        int[][] output = new int[smallOutput1.length + smallOutput2.length][];
        int index = 0;
        for (int i = 0; i < smallOutput1.length; i++) {
            output[index] = smallOutput1[i];
            index++;
        }
        for (int i = 0; i < smallOutput2.length; i++) {
            output[index] = new int[smallOutput2[i].length + 1];
            output[index][0] = input[startInndex];
            for (int j = 0; j < smallOutput2[i].length; j++) {
                output[index][j + 1] = smallOutput2[i][j];
            }
            index++;
        }
        return output;
    }

    public static int[][] returnSubsetSumOfK(int[] input, int k) {
        return returnSubsetSumToK(input,0,k);
    }
    public static void main(String []args){
        int []input={3,2,5,1,4,6};
        int [][]output=returnSubsetSumOfK(input,8);
        for(int []brr:output){
            for(int x:brr){
                System.out.print("["+x+"] ");
            }
            System.out.println();
        }
    }
}

