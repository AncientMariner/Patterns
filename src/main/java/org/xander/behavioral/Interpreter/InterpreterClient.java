package org.xander.behavioral.Interpreter;

public class InterpreterClient {
    public InterpreterContext ic;

    public InterpreterClient(InterpreterContext i) {
        this.ic = i;
    }

    public String interpret(String string) {
        Expression expression = null;
        //create rules for expressions
        if (string.contains("Hexadecimal")) {
            expression = new IntToHexExpression(Integer.parseInt(string.substring(0, string.indexOf(" "))));
        } else if (string.contains("Binary")) {
            expression = new IntToBinaryExpression(Integer.parseInt(string.substring(0, string.indexOf(" "))));
        } else return string;

        return expression.interpret(ic);
    }

    public static void main(String args[]) {
        String str1 = "28341 in Binary";
        String str2 = "28341 in Hexadecimal";

        InterpreterClient ec = new InterpreterClient(new InterpreterContext());
        System.out.println(str1 + "= " + ec.interpret(str1));
        System.out.println(str2 + "= " + ec.interpret(str2));
    }
}