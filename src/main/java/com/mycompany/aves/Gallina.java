/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aves;

import com.mycompany.aves.supertypeimp.Grasnido;
import com.mycompany.aves.supertypeimp.VueloConAlas;

/**
 *
 * @author jhon
 */
public class Gallina extends Ave{
    public Gallina(){
        tipoSonido = new Grasnido();
        tipoVuelo = new VueloConAlas();
    }
}

