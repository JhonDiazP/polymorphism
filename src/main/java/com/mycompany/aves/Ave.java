/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aves;

import com.mycompany.aves.supertype.TipoSonido;
import com.mycompany.aves.supertype.TipoVuelo;

/**
 *
 * @author jhon
 */
public abstract class Ave {
    TipoSonido tipoSonido;
    TipoVuelo tipoVuelo;

    public void setTipoSonido(TipoSonido tipoSonido){
        this.tipoSonido = tipoSonido;
    }

    public void setTipoVuelo(TipoVuelo tipoVuelo){
        this.tipoVuelo = tipoVuelo;
    }

    public void realizaVuelo(){
        tipoVuelo.vuelo();
    }

    public void realizaSonido(){
        tipoSonido.makeSound();
    }
}
