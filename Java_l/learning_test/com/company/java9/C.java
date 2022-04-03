package com.company.java9;

interface  A {
    int x = 0;
    int x1 = 2;
}
class B {
    int x = 1;
    int x2 = 3;
}

class C extends B implements A{
    public void pX(){
       // System.out.println(x);
        System.out.println(super.x);// 1
        System.out.println(A.x); //0
        System.out.println(x1);
        System.out.println(x2);
    }

    public static void main(String[] args) {
        new C().pX();
    }
}