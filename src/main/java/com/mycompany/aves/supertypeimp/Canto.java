package com.mycompany.aves.supertypeimp;

import com.mycompany.aves.supertype.TipoSonido;

/**
 * @author jhon
 */
public class Canto implements TipoSonido{
    public void makeSound(){
        System.out.println("Estoy cantando");
    }
}
