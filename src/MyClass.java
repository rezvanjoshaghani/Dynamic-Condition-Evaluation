import java.security.PublicKey;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;


public class MyClass {

    private ExpressionParser parser;

    public MyClass() {
        this.parser = new SpelExpressionParser();
    }

    private void evaluateCondition() {

        EnvironmantalVariables environment = new EnvironmantalVariables(); //current state of system

        String condition="time > 1800"; //read conditions from database

        Expression exp = parser.parseExpression(condition);

        System.out.println(exp.getValue(environment,Boolean.class)); //evaluation result( True or False)

    }

    public static void main(String args[]) {
        MyClass class1=new MyClass();
        class1.evaluateCondition();
    }
}