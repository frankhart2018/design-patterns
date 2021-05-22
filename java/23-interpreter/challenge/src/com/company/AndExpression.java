package com.company;

public class AndExpression implements Expression {
    private Expression expr1 = null;
    private Expression expr2 = null;

    public AndExpression(Expression expr1, Expression expr2) {
        this.expr1 = expr1;
        this.expr2 = expr2;
    }

    @Override
    public boolean intepret(Context context) {
        return expr1.intepret(context) && expr2.intepret(context);
    }
}
