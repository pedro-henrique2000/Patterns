package com.company.hookmethod;

public class SubClasseA extends SuperClasse {
    @Override
    protected void hook() {
        System.out.println("Sub Classe A Hook");
    }
}
