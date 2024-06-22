
package com.ferreteria.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para formaPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="formaPago">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codpago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="nompago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "formaPago", propOrder = {
    "codpago",
    "nompago"
})
public class FormaPago {

    protected String codpago;
    protected String nompago;

    /**
     * Obtiene el valor de la propiedad codpago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodpago() {
        return codpago;
    }

    /**
     * Define el valor de la propiedad codpago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodpago(String value) {
        this.codpago = value;
    }

    /**
     * Obtiene el valor de la propiedad nompago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNompago() {
        return nompago;
    }

    /**
     * Define el valor de la propiedad nompago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNompago(String value) {
        this.nompago = value;
    }

}
