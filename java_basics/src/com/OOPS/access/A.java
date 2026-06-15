package com.OOPS.access;

public class A {
    //default here means cannot access it outside the package
    int num ;
    String name;
    int[] arr;


    public int getNum(){
        return num;
    }

    public void setNum(int num){
        this.num = num;
    }

    public A(int num ,String name){
        this.num = num;
        this.name = name;
        this.arr = new int[num];
    }
}
//Modifier	SameClass	SamePackage	 Subclass(diff pkg)	   World
//public	✅	          ✅	        ✅	               ✅
//protected	✅	          ✅	        ✅	               ❌
//default	✅	          ✅	        ❌	               ❌
//private	✅            ❌	        ❌	               ❌