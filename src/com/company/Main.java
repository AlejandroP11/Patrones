package com.company;

public class Main {

    public static void main(String[] args) {
        UnicoObjeto obj1=UnicoObjeto.crearObj();
        obj1.nombre="pepe";
        UnicoObjeto obj2=UnicoObjeto.crearObj();
        System.out.println(obj2.nombre);

    }
}
