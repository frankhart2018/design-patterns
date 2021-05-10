package com.company;

public interface Faculty {
    public String getDetails();
}

class Professor implements Faculty {
    private String mName;
    private String mPosition;
    private int mOfficeNun;

    public Professor(String mName, String mPosition, int mOfficeNun) {
        this.mName = mName;
        this.mPosition = mPosition;
        this.mOfficeNun = mOfficeNun;
    }

    @Override
    public String getDetails() {
        return (mName + " is the " + mPosition);
    }
}



