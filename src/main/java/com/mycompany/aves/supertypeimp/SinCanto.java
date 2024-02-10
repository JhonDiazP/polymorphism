package com.mycompany.aves.supertypeimp;

import com.mycompany.aves.supertype.TipoSonido;

/**
 * @author jhon
 */
public class SinCanto implements TipoSonido {
    public void makeSound(){
        System.out.println("<<Silencio>>");
    }
}
