/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferreteria.bean;

import com.ferreteria.servicio.Producto;
import com.ferreteria.util.listasglobales;
import java.util.LinkedList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Diegu
 */
public class BeanElectrodomestico {

   private List<Producto> product = new LinkedList<Producto>();
    private List<Producto> listdetalle = new LinkedList<Producto>();
    private Producto productoselec;
    private String imagen;
    private String nombre;
    private String precio;
    private String existencia;
    private String descric;
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

    public Producto getAgregaprodcarrito() {
        return agregaprodcarrito;
    }

    public void setAgregaprodcarrito(Producto agregaprodcarrito) {
        this.agregaprodcarrito = agregaprodcarrito;
        if (this.agregaprodcarrito != null) {
            System.out.println("entre");
            cantingres = "";
            existenciasel = agregaprodcarrito.getExistencia();
            precisel = agregaprodcarrito.getPrecio();
            codsel = agregaprodcarrito.getCodigo();
            nomsel = agregaprodcarrito.getDescripcion();

            RequestContext contexto = RequestContext.getCurrentInstance();
            contexto.update("fom:cants");
            contexto.execute("PF('wdialogo').show()");
        }

    }

    public List<Producto> getListdetalle() {
        return listdetalle;
    }

    public void setListdetalle(List<Producto> listdetalle) {
        this.listdetalle = listdetalle;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getExistencia() {
        return existencia;
    }

    public void setExistencia(String existencia) {
        this.existencia = existencia;
    }

    public String getDescric() {
        return descric;
    }

    public void setDescric(String descric) {
        this.descric = descric;
    }

    public Producto getProductoselec() {
        return productoselec;
    }

    public void setProductoselec(Producto productoselec) {
        listdetalle = new LinkedList<Producto>();
        this.productoselec = productoselec;
        if (this.productoselec != null) {
            if (productoselec.getCodigo().equals("B010")) {
                descric = "Refrigeradora ultimo modelo, capaz de congelar todo tipo de producto. ";
            } else if (productoselec.getCodigo().equals("B011")) {
                descric = "Estufa con 8 ornias capaz de cocinar de todo.";
            } else if (productoselec.getCodigo().equals("B012")) {
                descric = "Secadora ultimo modelo, con la capacidad de  secar todo al instante";
            }
            imagen = String.valueOf(productoselec.getCodigo()) + ".jpg";
            nombre = productoselec.getDescripcion();
            precio = productoselec.getPrecio();
            existencia = productoselec.getExistencia();
            Producto pro = new Producto();
            pro.setCodigo(productoselec.getCodigo());
            pro.setDescripcion(nombre);
            pro.setPrecio(precio);
            pro.setExistencia(existencia);
            pro.setProductodetalle(descric);
            listdetalle.add(pro);
            RequestContext contexto = RequestContext.getCurrentInstance();
            contexto.update("piform:listdetpro");

        }

    }

    public List<Producto> getProduct() {
        return product;
    }

    public void setProduct(List<Producto> product) {
        this.product = product;
    }

    public BeanElectrodomestico() {
        product = listaProductos("E");
    }
    
    public void agregcarritofinal() {
        int bands = 0;
        if (!quitaNulo(cantingres).trim().isEmpty() == true) {
            if (Integer.parseInt(cantingres) > 0) {
                if (Integer.parseInt(existenciasel) < Integer.parseInt(cantingres)) {
                    bands = 0;
                    System.out.println("entress");
                    final FacesMessage msg2 = new FacesMessage(FacesMessage.SEVERITY_WARN, "Supera la cantidad de existencias!", "");
                    FacesContext.getCurrentInstance().addMessage((String) null, msg2);
                } else {
                    final FacesMessage msg2 = new FacesMessage(FacesMessage.SEVERITY_INFO, "Producto agregado al carrito exitosamente!", "");
                    FacesContext.getCurrentInstance().addMessage((String) null, msg2);
                    RequestContext co = RequestContext.getCurrentInstance();
                    Producto pro = new Producto();
                    pro.setCodigo(codsel);
                    pro.setDescripcion(nomsel);
                    pro.setPrecio(precisel);
                    pro.setCantcompr(cantingres);
                    listasglobales.listacarrito.add(pro);
                    co.execute("PF('wdialogo').hide()");
                    System.out.println("tamanio de la lista es " + listasglobales.listacarrito.size());

                }
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

    private java.util.List<com.ferreteria.servicio.Producto> listaProductos(java.lang.String categoria) {
        com.ferreteria.servicio.WSFerreteria_Service service = new com.ferreteria.servicio.WSFerreteria_Service();
        com.ferreteria.servicio.WSFerreteria port = service.getWSFerreteriaPort();
        return port.listaProductos(categoria);
    }
    
    
}
