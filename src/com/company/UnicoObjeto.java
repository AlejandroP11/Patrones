package com.company;

public class UnicoObjeto {
    public String nombre;
    private static UnicoObjeto instanciar = null;

    private UnicoObjeto() {
    }

    public static UnicoObjeto crearObj() {
        if (instanciar == null) {
            instanciar = new UnicoObjeto();
        }
        return instanciar;
    }
}
