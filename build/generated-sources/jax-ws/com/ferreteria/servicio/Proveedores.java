
package com.ferreteria.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para proveedores complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="proveedores">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigoproveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nombreproveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="telefonoproveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "proveedores", propOrder = {
    "codigoproveedor",
    "nombreproveedor",
    "telefonoproveedor"
})
public class Proveedores {

    protected String codigoproveedor;
    protected String nombreproveedor;
    protected String telefonoproveedor;

    /**
     * Obtiene el valor de la propiedad codigoproveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigoproveedor() {
        return codigoproveedor;
    }

    /**
     * Define el valor de la propiedad codigoproveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigoproveedor(String value) {
        this.codigoproveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad nombreproveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreproveedor() {
        return nombreproveedor;
    }

    /**
     * Define el valor de la propiedad nombreproveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreproveedor(String value) {
        this.nombreproveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad telefonoproveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelefonoproveedor() {
        return telefonoproveedor;
    }

    /**
     * Define el valor de la propiedad telefonoproveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelefonoproveedor(String value) {
        this.telefonoproveedor = value;
    }

}
