package com.company.hookmethod;

public abstract class SuperClasse {

    public void principal() {
        System.out.println("Principal");
        hook();
    }

    protected abstract void hook();

}
