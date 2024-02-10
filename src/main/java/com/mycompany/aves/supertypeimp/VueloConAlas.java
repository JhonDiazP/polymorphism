package com.mycompany.aves.supertypeimp;

import com.mycompany.aves.supertype.TipoVuelo;

/**
 * @author jhon
 */
public class VueloConAlas implements TipoVuelo{
    public void vuelo(){
        System.out.println("Esta volando, aleteando");
    }
}
