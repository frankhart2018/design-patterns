package com.company;

public interface Expression {
    public boolean intepret(Context context);
}

class TerminalExpression implements Expression {
    private String data;

    public TerminalExpression(String data) {
        this.data = data;
    }

    @Override
    public boolean intepret(Context context) {
        return context.getResult(data);
    }
}
