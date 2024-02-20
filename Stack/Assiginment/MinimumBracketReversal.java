package Stack.Assiginment;
import java.util.Stack;
public class MinimumBracketReversal {
    public static int countBracketReversal(String exp){
        int len=exp.length();
        if(len==0){
            return 0;
        }
        if(len%2==1){
            return -1;
        }
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<len;i++){
            char currentChar=exp.charAt(i);
            if(exp.charAt(i)=='('){
                stack.push(currentChar);
            }else{
                if(!stack.isEmpty()&&stack.peek()=='('){
                    stack.pop();
                }else{
                    stack.push(currentChar);
                }
            }
        }
        int count=0;
        while (!stack.isEmpty()){
            char ch1=stack.pop();
            char ch2=stack.pop();
            if(ch1!=ch2){
                count+=2;
            }
            else {
                count+=1;
            }
        }
        return count;
    }
    public static void main(String[]args){
        System.out.println(countBracketReversal("(((())"));
    }
}
