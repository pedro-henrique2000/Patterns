package com.company.hookmethod;

public class SuperClasse {

    public void principal() {
        System.out.println("Principal");
        hook();
    }

    protected void hook() {
        System.out.println("Super class hook");
    }

}
