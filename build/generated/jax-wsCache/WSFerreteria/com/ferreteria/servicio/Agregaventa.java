
package com.ferreteria.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Agregaventa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Agregaventa">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="totalprecio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="usuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="producto" type="{http://servicio.ferreteria.com/}producto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="formapago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Agregaventa", propOrder = {
    "totalprecio",
    "usuario",
    "producto",
    "formapago"
})
public class Agregaventa {

    protected String totalprecio;
    protected String usuario;
    protected List<Producto> producto;
    protected String formapago;

    /**
     * Obtiene el valor de la propiedad totalprecio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotalprecio() {
        return totalprecio;
    }

    /**
     * Define el valor de la propiedad totalprecio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalprecio(String value) {
        this.totalprecio = value;
    }

    /**
     * Obtiene el valor de la propiedad usuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * Define el valor de la propiedad usuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuario(String value) {
        this.usuario = value;
    }

    /**
     * Gets the value of the producto property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the producto property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProducto().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Producto }
     * 
     * 
     */
    public List<Producto> getProducto() {
        if (producto == null) {
            producto = new ArrayList<Producto>();
        }
        return this.producto;
    }

    /**
     * Obtiene el valor de la propiedad formapago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormapago() {
        return formapago;
    }

    /**
     * Define el valor de la propiedad formapago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormapago(String value) {
        this.formapago = value;
    }

}
