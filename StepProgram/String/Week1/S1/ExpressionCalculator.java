import java.util.*;
public class ExpressionCalculator {
    public static int evalSimple(List<Integer> nums,List<Character> ops) {
        for(int i=0;i<ops.size();) {
            char op=ops.get(i);
            if(op=='*'||op=='/') {
                int a=nums.get(i),b=nums.get(i+1),res=(op=='*')?a*b:a/b;
                nums.set(i,res);nums.remove(i+1);ops.remove(i);
            } else i++;
        }
        int res=nums.get(0);
        for(int i=0;i<ops.size();i++) {
            char op=ops.get(i);
            int b=nums.get(i+1);
            if(op=='+') res+=b;
            else res-=b;
        }
        return res;
    }
    public static int evaluate(String expr) {
        Stack<Integer> values=new Stack<>();
        Stack<Character> ops=new Stack<>();
        for(int i=0;i<expr.length();i++) {
            char c=expr.charAt(i);
            if(Character.isDigit(c)) {
                int num=0;
                while(i<expr.length()&&Character.isDigit(expr.charAt(i))) {
                    num=num*10+(expr.charAt(i)-'0');
                    i++;
                }
                i--;
                values.push(num);
            } else if(c=='(') ops.push(c);
            else if(c==')') {
                while(ops.peek()!='(') {
                    int b=values.pop(),a=values.pop();
                    char op=ops.pop();
                    values.push(apply(a,b,op));
                }
                ops.pop();
            } else if("+-*/".indexOf(c)!=-1) {
                while(!ops.isEmpty()&&precedence(ops.peek())>=precedence(c)) {
                    int b=values.pop(),a=values.pop();
                    values.push(apply(a,b,ops.pop()));
                }
                ops.push(c);
            }
        }
        while(!ops.isEmpty()) {
            int b=values.pop(),a=values.pop();
            values.push(apply(a,b,ops.pop()));
        }
        return values.pop();
    }
    public static int apply(int a,int b,char op) {
        if(op=='+') return a+b;
        if(op=='-') return a-b;
        if(op=='*') return a*b;
        return a/b;
    }
    public static int precedence(char c) {
        if(c=='+'||c=='-') return 1;
        if(c=='*'||c=='/') return 2;
        return 0;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String expr=sc.nextLine();
        System.out.println("Result: "+evaluate(expr));
    }
}