package com.company.hookmethod;

import com.sun.net.httpserver.HttpServer;

public class Main2 {
    public static void main(String[] args) {


        SubClasseA subClasseA = new SubClasseA();
        subClasseA.principal();

        SubClasseB subClasseB = new SubClasseB();
        subClasseB.principal();
    }
}
