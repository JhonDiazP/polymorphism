package com.mycompany.aves.supertypeimp;

import com.mycompany.aves.supertype.TipoVuelo;

/**
 * @author jhon
 */
public class SinVuelo implements TipoVuelo {
    public void vuelo(){
        System.out.println("no puede volar");
    }
}
