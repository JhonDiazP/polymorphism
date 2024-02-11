package com.mycompany.aves;

import com.mycompany.aves.supertypeimp.Canto;
import com.mycompany.aves.supertypeimp.Grasnido;
import com.mycompany.aves.supertypeimp.SinCanto;

public class TestAves {
    public void canarioTest(){
        Canario canario = new Canario(); 
        System.out.println("Canario ejecuta vuelo");
        canario.realizaVuelo();
        System.out.println("Canario ejecuta canto");
        canario.realizaSonido();
        System.out.println("Cambiamos el sonido");
        canario.setTipoSonido(new Grasnido());
        System.out.println("Canario realiza el sonido");
        canario.realizaSonido();
    }

    public void avestruzTest(){
        AvesTruz avesTruz = new AvesTruz(); 
        System.out.println("Avestruz ejecuta vuelo");
        avesTruz.realizaVuelo();
        System.out.println("Aveztruz ejecuta canto");
        avesTruz.realizaSonido();
        System.out.println("Cambiamos el sonido");
        avesTruz.setTipoSonido(new Canto());
        System.out.println("Aveztruz realiza el sonido");
        avesTruz.realizaSonido();
    }

    public void gallinaTest(){
        Gallina gallina = new Gallina(); 
        System.out.println("Gallina ejecuta vuelo");
        gallina.realizaVuelo();
        System.out.println("Gallina ejecuta canto");
        gallina.realizaSonido();
        System.out.println("Cambiamos el sonido");
        gallina.setTipoSonido(new SinCanto());
        System.out.println("Gallina realiza el sonido");
        gallina.realizaSonido();
    }
}
