/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferreteria.bean;

import com.ferreteria.servicio.Producto;
import com.ferreteria.servicio.WSFerreteria_Service;
import com.ferreteria.util.listasglobales;
import java.util.LinkedList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Diegu
 */
public class Beanproductoinvent {

    private List<Producto> listaproductos = new LinkedList<Producto>();
    private List<Producto> Listaproductminimo = new LinkedList<Producto>();
    private Producto agregaprodcarrito;
    private String existenciasel;
    private String precisel;
    private String codsel;
    private String nomsel;
    private String cantingres;

    public String getExistenciasel() {
        return existenciasel;
    }

    public void setExistenciasel(String existenciasel) {
        this.existenciasel = existenciasel;
    }

    public String getPrecisel() {
        return precisel;
    }

    public void setPrecisel(String precisel) {
        this.precisel = precisel;
    }

    public String getCodsel() {
        return codsel;
    }

    public void setCodsel(String codsel) {
        this.codsel = codsel;
    }

    public String getNomsel() {
        return nomsel;
    }

    public void setNomsel(String nomsel) {
        this.nomsel = nomsel;
    }

    public String getCantingres() {
        return cantingres;
    }

    public void setCantingres(String cantingres) {
        this.cantingres = cantingres;
    }

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    public Producto getAgregaprodcarrito() {
        return agregaprodcarrito;
    }

    public void setAgregaprodcarrito(Producto agregaprodcarrito) {
        this.agregaprodcarrito = agregaprodcarrito;
        if (this.agregaprodcarrito != null) {
            cantingres = "";
            existenciasel = agregaprodcarrito.getExistencia();
            precisel = agregaprodcarrito.getPrecio();
            codsel = agregaprodcarrito.getCodigo();
            nomsel = agregaprodcarrito.getDescripcion();

            RequestContext contexto = RequestContext.getCurrentInstance();
            contexto.update("fom2:cants2");
            contexto.execute("PF('wdialogo2').show()");
        }

    }

    public List<Producto> getListaproductminimo() {
        return Listaproductminimo;
    }

    public void setListaproductminimo(List<Producto> Listaproductminimo) {
        this.Listaproductminimo = Listaproductminimo;
    }

    public List<Producto> getListaproductos() {
        return listaproductos;
    }

    public void setListaproductos(List<Producto> listaproductos) {
        this.listaproductos = listaproductos;
    }
    String bandera = "9999";

    public Beanproductoinvent() {
        listaproductos = new LinkedList<Producto>();
        Listaproductminimo = new LinkedList<Producto>();
        listaproductos = productoinventario();

        for (Producto prod : listaproductos) {
            if (prod.getStatus().trim().equals("Bajo")) {
                bandera = "0000";
                Producto pro = new Producto();
                pro.setCodigo(prod.getCodigo());
                pro.setExistencia(prod.getExistencia());
                pro.setDescripcion(prod.getDescripcion());
                pro.setStatus(prod.getStatus());
                pro.setPrecio(prod.getPrecio());
                Listaproductminimo.add(pro);
            }
        }

        if (bandera.equals("0000")) {
            RequestContext contexto = RequestContext.getCurrentInstance();
            contexto.execute("PF('wdialogo').show()");
        }

    }

    public void agregcarritofinal() {
        int bands = 0;
        if (!quitaNulo(cantingres).trim().isEmpty() == true) {
            if (Integer.parseInt(cantingres) > 0) {
                    final FacesMessage msg2 = new FacesMessage(FacesMessage.SEVERITY_INFO, "Producto agregado al carrito exitosamente!", "");
                    FacesContext.getCurrentInstance().addMessage((String) null, msg2);
                    RequestContext co = RequestContext.getCurrentInstance();
                    Producto pro = new Producto();
                    pro.setCodigo(codsel);
                    pro.setDescripcion(nomsel);
                    pro.setPrecio(precisel);
                    pro.setCantcompr(cantingres);
                    listasglobales.listacarrito.add(pro);
                    co.execute("PF('wdialogo2').hide()");
                    System.out.println("tamanio de la lista es " + listasglobales.listacarrito.size());
                    cantingres = "";
                    co.update("fom2:cants2");
                
            } else {
                final FacesMessage msg2 = new FacesMessage(FacesMessage.SEVERITY_WARN, "La cantidad de producto no debe ser negativar!", "");
                FacesContext.getCurrentInstance().addMessage((String) null, msg2);
            }

        } else {
            final FacesMessage msg2 = new FacesMessage(FacesMessage.SEVERITY_WARN, "Debe ingresar la cantidad que desea comprar!", "");
            FacesContext.getCurrentInstance().addMessage((String) null, msg2);
        }

    }
    /*
     *Este metodo se encarga de tratar los espacios en blanco.
     */

    public String quitaNulo(String var) {
        String res = "";
        if (var != null && var.trim().length() > 0) {
            res = var.trim();
        } else {
            res = "";
        }
        return res;
    }

    public void regresar() {
        RequestContext contexto = RequestContext.getCurrentInstance();
        contexto.execute("PF('wdialogo').hide()");
    }

    private java.util.List<com.ferreteria.servicio.Producto> productoinventario() {
        com.ferreteria.servicio.WSFerreteria_Service service = new com.ferreteria.servicio.WSFerreteria_Service();
        com.ferreteria.servicio.WSFerreteria port = service.getWSFerreteriaPort();
        return port.productoinventario();
    }

}
