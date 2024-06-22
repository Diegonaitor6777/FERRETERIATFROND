/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferreteria.bean;

import com.ferreteria.servicio.WSFerreteria_Service;
import com.ferreteria.util.listasglobales;
import java.io.IOException;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.xml.ws.WebServiceRef;
import org.primefaces.context.RequestContext;

/**
 *
 * @author Diegu
 */
public class Beanlogin {

    /**
     * Creates a new instance of Beanlogin
     */
    private String usuario;
    private String password;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Beanlogin() {
    }

    public void iniciasesion() {
        listasglobales.listacarrito.clear();
        String respuesta = "9999";
        respuesta = ingreso(usuario.toUpperCase(), password);
        if (respuesta.trim().equalsIgnoreCase("D")) {
            listasglobales.setUsuarioglobal(usuario.toUpperCase());
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("./Menuadmin.xhtml");

            } catch (IOException ex) {
                System.out.println("Error al redireccionar");
            }
        } else if (respuesta.trim().equalsIgnoreCase("C")) {
            listasglobales.setUsuarioglobal(usuario.toUpperCase());
            try {
                FacesContext.getCurrentInstance().getExternalContext().redirect("./Menucliente.xhtml");

            } catch (IOException ex) {
                System.out.println("Error al redireccionar");
            }
        } else if (respuesta.trim().equalsIgnoreCase("9999")) {
            listasglobales.setUsuarioglobal("");
            final FacesMessage msg2 = new FacesMessage(FacesMessage.SEVERITY_WARN, "El usuario ingresado es incorrecto!", "");
            FacesContext.getCurrentInstance().addMessage((String) null, msg2);
        }

    }

    public void cerrarsesion() {
         listasglobales.listacarrito.clear();
         listasglobales.setUsuarioglobal("");
        try {
            FacesContext.getCurrentInstance().getExternalContext().redirect("./index.xhtml");

        } catch (IOException ex) {
            System.out.println("Error al redireccionar");
        }
    }

    private String ingreso(java.lang.String usuario, java.lang.String pass) {
        com.ferreteria.servicio.WSFerreteria_Service service = new com.ferreteria.servicio.WSFerreteria_Service();
        com.ferreteria.servicio.WSFerreteria port = service.getWSFerreteriaPort();
        return port.ingreso(usuario, pass);
    }

}
