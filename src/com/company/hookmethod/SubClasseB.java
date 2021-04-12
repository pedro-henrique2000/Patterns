package com.company.hookmethod;

public class SubClasseB extends SuperClasse {

    @Override
    protected void hook() {
        System.out.println("Hook subclasse b");
    }
}
