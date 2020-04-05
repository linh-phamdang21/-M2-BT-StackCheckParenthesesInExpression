import java.util.Stack;

public class BracketInExpression {

    public static void main(String[] args) {
        Expression expression = new Expression();
        expression.setExpression();
        System.out.println("Your expression: \n" + expression.getExpression());
        expression.splitExpression();
        if(expression.isCorrectExpression()){
            System.out.println("Your expression is incorrect");
        } else {
            System.out.println("Your expression is correct");
        }
    }
}
