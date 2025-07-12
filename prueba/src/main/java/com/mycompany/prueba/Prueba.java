/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.prueba;

import clases.Producto;
import clases.catedraticos;
import clases.persona;

/**
 *
 * @author sergi
 */
public class Prueba {



    public static void main(String[] args) {


        Producto producto = new Producto("JDJFJKALJ53", "PRODUCTO 1", 22);
        System.out.println(producto.codigo());
        System.out.println(producto.nombre());
        System.out.println(producto.precio());




        persona p = new catedraticos("sergio chuquiej", 30);
        p.saludar();
        p.mostrarEdad();

    }
}
