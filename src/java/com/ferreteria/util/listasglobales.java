/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferreteria.util;

import com.ferreteria.servicio.Producto;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Diegu
 */
public class listasglobales {
    public static List<Producto> listacarrito= new LinkedList<Producto>();
    public static String usuarioglobal="";

    public static String getUsuarioglobal() {
        return usuarioglobal;
    }

    public static void setUsuarioglobal(String usuarioglobal) {
        listasglobales.usuarioglobal = usuarioglobal;
    }
    
    
    

    public static List<Producto> getListacarrito() {
        return listacarrito;
    }

    public static void setListacarrito(List<Producto> listacarrito) {
        listasglobales.listacarrito = listacarrito;
    }
    
    
    
}
