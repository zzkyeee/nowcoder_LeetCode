package niuke;

import java.util.Stack;
/**
 * 题目名称：evaluate-reverse-polish-notation
 * 题目描述：Evaluate the value of an arithmetic expression in Reverse Polish Notation.
 Valid operators are+,-,*,/. Each operand may be an integer or another expression.
 Some examples:
 */
public class Problem2 {
    Stack<Integer> operand = new Stack<Integer>();

    public boolean isOperator(String s){
        switch(s){
            case "+":
            case "-":
            case "*":
            case "/": return true;
            default:return false;
        }
    }
    public int evalRPN(String[] tokens) {
        for(String token : tokens){
            //如果是操作数
            if(isOperator(token)){
                int a1 = operand.pop();
                int a2 = operand.pop();
                switch (token){
                    case "+":operand.push(a2+a1);break;
                    case "-":operand.push(a2-a1);break;
                    case "*":operand.push(a2*a1);break;
                    case "/":operand.push(a2/a1);break;
                    default:break;
                }
            }else{
                operand.push(Integer.valueOf(token));
            }
        }
        return operand.pop();
    }

    public static void main(String[] args){
        String[] tokens = {"4", "13", "5", "/", "+"};
        Problem2 problem2 = new Problem2();
        System.out.println(problem2.evalRPN(tokens));
    }
}