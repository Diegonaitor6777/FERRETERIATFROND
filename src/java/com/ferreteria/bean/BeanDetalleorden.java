/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferreteria.bean;

import com.ferreteria.servicio.FormaPago;
import com.ferreteria.servicio.Producto;
import com.ferreteria.servicio.Proveedores;
import com.ferreteria.servicio.WSFerreteria_Service;
import com.ferreteria.util.listasglobales;
import java.text.SimpleDateFormat;
import java.util.Date;
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
public class BeanDetalleorden {

    private List<Producto> listacarrito = new LinkedList<Producto>();
    private List<FormaPago> listpagos = new LinkedList<FormaPago>();
    private List<Proveedores> listaproveedor = new LinkedList<Proveedores>();
    private Proveedores selecionproveedor;
    private String preciototal;
    private String cantidadtotal;
    private String selecformapago;
    private boolean tarjetdebi;
    private boolean tarjetcredit;
    private boolean efectivocontra;

    private boolean bloqueacredit;
    private boolean bloqueadebit;
    private boolean bloqueaefect;

    private Producto eliminaproduct;
    private String fechaDesde;
    private Date maximafecha;
    private String codigorden;

    public String getCodigorden() {
        return codigorden;
    }

    public void setCodigorden(String codigorden) {
        this.codigorden = codigorden;
    }

    public Proveedores getSelecionproveedor() {
        return selecionproveedor;
    }

    public void setSelecionproveedor(Proveedores selecionproveedor) {
        this.selecionproveedor = selecionproveedor;
    }

    public List<Proveedores> getListaproveedor() {
        return listaproveedor;
    }

    public void setListaproveedor(List<Proveedores> listaproveedor) {
        this.listaproveedor = listaproveedor;
    }

    public Date getMaximafecha() {
        return maximafecha;
    }

    public void setMaximafecha(Date maximafecha) {
        this.maximafecha = maximafecha;
    }

    public String getFechaDesde() {
        return fechaDesde;
    }

    public void setFechaDesde(String fechaDesde) {
        this.fechaDesde = fechaDesde;
    }

    public Producto getEliminaproduct() {
        return eliminaproduct;
    }

    public void setEliminaproduct(Producto eliminaproduct) {
        this.eliminaproduct = eliminaproduct;

        if (this.eliminaproduct != null) {

            for (Producto prod : listacarrito) {
                if (prod.getCodigo().trim().equalsIgnoreCase(eliminaproduct.getCodigo())) {
                    listacarrito.remove(prod);
                }
            }
            for (Producto prod : listasglobales.listacarrito) {
                if (prod.getCodigo().trim().equalsIgnoreCase(eliminaproduct.getCodigo())) {
                    listasglobales.listacarrito.remove(prod);
                }
            }
            int canttemp = 0;
            double precifinal = 0;
            for (Producto prod : listacarrito) {
                canttemp = canttemp + Integer.parseInt(prod.getCantcompr());
                precifinal = precifinal + (Double.parseDouble(prod.getPrecio().replace("Q.", "")) * Integer.parseInt(prod.getCantcompr()));
            }
            preciototal = String.valueOf(precifinal);
            cantidadtotal = String.valueOf(canttemp);
            System.out.println("tamanio de la lista es " + listacarrito.size());
            System.out.println("tamanio de la lista global es " + listasglobales.listacarrito.size());
            RequestContext contexto = RequestContext.getCurrentInstance();
            contexto.update("piform:conrut");
            contexto.update("piform:totpiz");
            contexto.update("piform:totpre");
        }
    }

    public boolean isBloqueacredit() {
        return bloqueacredit;
    }

    public void setBloqueacredit(boolean bloqueacredit) {
        this.bloqueacredit = bloqueacredit;
    }

    public boolean isBloqueadebit() {
        return bloqueadebit;
    }

    public void setBloqueadebit(boolean bloqueadebit) {
        this.bloqueadebit = bloqueadebit;
    }

    public boolean isBloqueaefect() {
        return bloqueaefect;
    }

    public void setBloqueaefect(boolean bloqueaefect) {
        this.bloqueaefect = bloqueaefect;
    }

    public boolean isTarjetdebi() {
        return tarjetdebi;
    }

    public void setTarjetdebi(boolean tarjetdebi) {
        this.tarjetdebi = tarjetdebi;
    }

    public boolean isTarjetcredit() {
        return tarjetcredit;
    }

    public void setTarjetcredit(boolean tarjetcredit) {
        this.tarjetcredit = tarjetcredit;
    }

    public boolean isEfectivocontra() {
        return efectivocontra;
    }

    public void setEfectivocontra(boolean efectivocontra) {
        this.efectivocontra = efectivocontra;
    }

    public String getSelecformapago() {
        return selecformapago;
    }

    public void setSelecformapago(String selecformapago) {
        this.selecformapago = selecformapago;
    }

    public List<FormaPago> getListpagos() {
        return listpagos;
    }

    public void setListpagos(List<FormaPago> listpagos) {
        this.listpagos = listpagos;
    }

    public String getPreciototal() {
        return preciototal;
    }

    public void setPreciototal(String preciototal) {
        this.preciototal = preciototal;
    }

    public String getCantidadtotal() {
        return cantidadtotal;
    }

    public void setCantidadtotal(String cantidadtotal) {
        this.cantidadtotal = cantidadtotal;
    }

    public List<Producto> getListacarrito() {
        return listacarrito;
    }

    public void setListacarrito(List<Producto> listacarrito) {
        this.listacarrito = listacarrito;
    }
    double subtot2 = 0;
    int cantlocal = 0;
    double prelocal = 0;

    public BeanDetalleorden() {
        listaproveedor = new LinkedList<Proveedores>();
        maximafecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fechalocals = formato.format(maximafecha);
        System.out.println("la fecha es " + fechalocals);
        fechaDesde = fechalocals;

        listpagos = new LinkedList<FormaPago>();
        listacarrito = new LinkedList<Producto>();
        List<Producto> listalocal = new LinkedList<Producto>();
        listaproveedor = listaproveedor();
        listalocal = listasglobales.listacarrito;
        System.out.println("la lista es " + listalocal.size());
        listpagos = formapagos();

        for (Producto prod2 : listalocal) {
            System.out.println("el product " + prod2.getCodigo());
            Producto pr = new Producto();
            pr.setCodigo(prod2.getCodigo());
            pr.setDescripcion(prod2.getDescripcion());
            pr.setCantcompr(prod2.getCantcompr());
            pr.setPrecio(prod2.getPrecio());
            cantlocal = Integer.parseInt(prod2.getCantcompr());
            prelocal = Double.parseDouble(prod2.getPrecio().replace("Q.", ""));
            subtot2 = cantlocal * prelocal;
            pr.setSubtotl("Q." + String.valueOf(subtot2));
            listacarrito.add(pr);
        }

        System.out.println("tamanio de la lista es " + listacarrito.size());
        int canttemp = 0;
        double precifinal = 0;
        for (Producto prod : listacarrito) {
            canttemp = canttemp + Integer.parseInt(prod.getCantcompr());
            precifinal = precifinal + (Double.parseDouble(prod.getPrecio().replace("Q.", "")) * Integer.parseInt(prod.getCantcompr()));
        }
        preciototal = String.valueOf(precifinal);
        cantidadtotal = String.valueOf(canttemp);
    }

    public void bloqueaforma() {
        System.out.println("procesobloquea");
        if (tarjetcredit == true) {
            selecformapago = "1";
            bloqueacredit = false;
            bloqueadebit = true;
            bloqueaefect = true;

        } else if (tarjetdebi == true) {
            selecformapago = "2";
            bloqueacredit = true;
            bloqueadebit = false;
            bloqueaefect = true;
        } else if (efectivocontra == true) {
            selecformapago = "3";
            bloqueacredit = true;
            bloqueadebit = true;
            bloqueaefect = false;
        } else {
            selecformapago = "";
            bloqueacredit = false;
            bloqueadebit = false;
            bloqueaefect = false;
        }
        //debit credit efec
        RequestContext contexto = RequestContext.getCurrentInstance();
        contexto.update("piform:debit");
        contexto.update("piform:credit");
        contexto.update("piform:efec");

    }

    public void limpiarcarrito() {
        bloqueacredit = false;
        bloqueadebit = false;
        bloqueaefect = false;
        tarjetcredit = false;
        tarjetdebi = false;
        efectivocontra = false;

        listacarrito = new LinkedList<Producto>();
        preciototal = "";
        cantidadtotal = "";
        selecformapago = "";
        listasglobales.listacarrito.clear();
        codigorden="";

        RequestContext contexto = RequestContext.getCurrentInstance();
        contexto.update("piform:debit");
        contexto.update("piform:credit");
        contexto.update("piform:efec");
        contexto.update("piform:totpiz");
        contexto.update("piform:totpre");
        contexto.update("piform:conrut");
        contexto.update("piform:codordens");
    }

    public void pagarproducto() {
        maximafecha = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("yyyyMMdd");
        String fechalocals = formato.format(maximafecha);
        System.out.println("iniciando proceso de venta");
        String respuesta = "9999";
        if (selecionproveedor == null) {
            final FacesMessage msg2 = new FacesMessage(FacesMessage.SEVERITY_WARN, "Debe seleccionar un proveedor!", "");
            FacesContext.getCurrentInstance().addMessage((String) null, msg2);
        } else {
             respuesta = ordencompr(codigorden, listasglobales.usuarioglobal,fechalocals,preciototal,selecionproveedor.getCodigoproveedor(),selecformapago,listacarrito,"");
            System.out.println("la respuestasss " + respuesta);
            if (respuesta.trim().equals("0000")) {
                limpiarcarrito();
                final FacesMessage msg2 = new FacesMessage(FacesMessage.SEVERITY_INFO, "Compra realizada exitosamente!", "");
                FacesContext.getCurrentInstance().addMessage((String) null, msg2);
            } else if (respuesta.trim().equals("8888")) {
                final FacesMessage msg2 = new FacesMessage(FacesMessage.SEVERITY_WARN, "Error al conseguir el numero de venta!", "");
                FacesContext.getCurrentInstance().addMessage((String) null, msg2);
            } else {
                final FacesMessage msg2 = new FacesMessage(FacesMessage.SEVERITY_WARN, "Error al realizar la compra!", "");
                FacesContext.getCurrentInstance().addMessage((String) null, msg2);
            }
        }

    }

    private java.util.List<com.ferreteria.servicio.FormaPago> formapagos() {
        com.ferreteria.servicio.WSFerreteria_Service service = new com.ferreteria.servicio.WSFerreteria_Service();
        com.ferreteria.servicio.WSFerreteria port = service.getWSFerreteriaPort();
        return port.formapagos();
    }

    private java.util.List<com.ferreteria.servicio.Proveedores> listaproveedor() {
        com.ferreteria.servicio.WSFerreteria_Service service = new com.ferreteria.servicio.WSFerreteria_Service();
        com.ferreteria.servicio.WSFerreteria port = service.getWSFerreteriaPort();
        return port.listaproveedor();
    }

    private String ordencompr(java.lang.String codorden, java.lang.String codusuario, java.lang.String fecha, java.lang.String totpago, java.lang.String codproveedor, java.lang.String codpago, java.util.List<com.ferreteria.servicio.Producto> tipproduc, java.lang.String cantcompr) {
        com.ferreteria.servicio.WSFerreteria_Service service = new com.ferreteria.servicio.WSFerreteria_Service();
        com.ferreteria.servicio.WSFerreteria port = service.getWSFerreteriaPort();
        return port.ordencompr(codorden, codusuario, fecha, totpago, codproveedor, codpago, tipproduc, cantcompr);
    }

}
