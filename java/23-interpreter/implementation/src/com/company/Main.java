package com.company;

public class Main {
    public InterpreterContext interpreterContext;

    public Main(InterpreterContext interpreterContext) {
        this.interpreterContext = interpreterContext;
    }

    public String interpret(String str) {
        Expression expression = null;

        if(str.contains("Hexadecimal")) {
            expression = new IntToHexExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else if(str.contains("Binary")) {
            expression = new IntToBinaryExpression(Integer.parseInt(str.substring(0, str.indexOf(" "))));
        } else {
            return str;
        }

        return expression.interpret(interpreterContext);
    }

    public static void main(String[] args) {
        String str1 = "28 in Binary";
        String str2 = "28 in Hexadecimal";

        Main main = new Main(new InterpreterContext());
        System.out.println(str1 + " = " + main.interpret(str1));
        System.out.println(str2 + " = " + main.interpret(str2));
    }
}
