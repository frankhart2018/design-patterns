package com.company;

public interface IntegerValueInterface {
    public int getInteger();
}

class IntegerValue implements IntegerValueInterface {

    @Override
    public int getInteger() {
        return 5;
    }
}

class ClassAdapter extends IntegerValue {
    @Override
    public int getInteger() {
        return 2 + super.getInteger();
    }
}

class ObjectAdapater implements IntegerValueInterface {
    private IntegerValueInterface myInt;

    public ObjectAdapater(IntegerValueInterface myInt) {
        this.myInt = myInt;
    }

    @Override
    public int getInteger() {
        return 2 + this.myInt.getInteger();
    }
}