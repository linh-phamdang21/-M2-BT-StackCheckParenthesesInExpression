import java.util.Scanner;
import java.util.Stack;

public class Expression {
    private String expression;
    private String[] arrSym;
    private String left = "";
    Scanner scanner = new Scanner(System.in);
    Stack<String> stack;
    public Expression(){
        stack = new Stack<>();
    }

    public void setExpression() {
        System.out.println("Enter an expression: ");
        this.expression = scanner.nextLine();
    }

    public String getExpression(){
        return this.expression;
    }

    public void splitExpression() {
        arrSym = this.expression.split("");
    }
    public boolean isCorrectExpression(){
        for (int i = 0; i < arrSym.length - 1; i++) {
            if (arrSym[i].equals("(")) {
                stack.push("(");
            }
        }
        for (int i = 0; i < arrSym.length - 1; i++) {
            if (arrSym[i].equals(")")) {
                if (stack.isEmpty()) {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()){
            return true;
        } else {
            return false;
        }
    }
}
