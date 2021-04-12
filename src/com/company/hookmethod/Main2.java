package com.company.hookmethod;

public class Main2 {
    public static void main(String[] args) {

        SuperClasse superClasse = new SuperClasse();

        superClasse.principal();

        SubClasseA subClasseA = new SubClasseA();
        subClasseA.principal();

        SubClasseB subClasseB = new SubClasseB();
        subClasseB.principal();
    }
}
