/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.aves;

import com.mycompany.aves.supertypeimp.SinCanto;
import com.mycompany.aves.supertypeimp.SinVuelo;

/**
 *
 * @author jhon
 */
public class AvesTruz extends Ave {
    public AvesTruz(){
        tipoSonido = new SinCanto();
        tipoVuelo = new SinVuelo();
    }
}
