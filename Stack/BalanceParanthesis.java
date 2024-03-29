package Stack;

import java.util.Stack;

public class BalanceParanthesis {
    public static boolean isBalance(String exp){
        Stack<Character>stack=new Stack<>();
        for(int i=0;i<exp.length();i++) {
            if (exp.charAt(i) == '(') {
                stack.push(exp.charAt(i));
            } else if (exp.charAt(i) == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
            char topChar = stack.pop();
            if (exp.charAt(i) == ')' && topChar == '(') {
                continue;
            } else {
                return false;
                }
            }

        }
        return stack.isEmpty();
    }
    public static void main(String []args){
        //BalanceParanthesis bs=new BalanceParanthesis();
        System.out.println(BalanceParanthesis.isBalance("(()()())"));
    }
}
