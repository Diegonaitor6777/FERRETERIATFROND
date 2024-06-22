
package com.ferreteria.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Ordencompr complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Ordencompr">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codorden" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codusuario" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="fecha" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="totpago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codproveedor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codpago" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="tipproduc" type="{http://servicio.ferreteria.com/}producto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="cantcompr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Ordencompr", propOrder = {
    "codorden",
    "codusuario",
    "fecha",
    "totpago",
    "codproveedor",
    "codpago",
    "tipproduc",
    "cantcompr"
})
public class Ordencompr {

    protected String codorden;
    protected String codusuario;
    protected String fecha;
    protected String totpago;
    protected String codproveedor;
    protected String codpago;
    protected List<Producto> tipproduc;
    protected String cantcompr;

    /**
     * Obtiene el valor de la propiedad codorden.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodorden() {
        return codorden;
    }

    /**
     * Define el valor de la propiedad codorden.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodorden(String value) {
        this.codorden = value;
    }

    /**
     * Obtiene el valor de la propiedad codusuario.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodusuario() {
        return codusuario;
    }

    /**
     * Define el valor de la propiedad codusuario.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodusuario(String value) {
        this.codusuario = value;
    }

    /**
     * Obtiene el valor de la propiedad fecha.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * Define el valor de la propiedad fecha.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFecha(String value) {
        this.fecha = value;
    }

    /**
     * Obtiene el valor de la propiedad totpago.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTotpago() {
        return totpago;
    }

    /**
     * Define el valor de la propiedad totpago.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotpago(String value) {
        this.totpago = value;
    }

    /**
     * Obtiene el valor de la propiedad codproveedor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodproveedor() {
        return codproveedor;
    }

    /**
     * Define el valor de la propiedad codproveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodproveedor(String value) {
        this.codproveedor = value;
    }

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
     * Gets the value of the tipproduc property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tipproduc property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTipproduc().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Producto }
     * 
     * 
     */
    public List<Producto> getTipproduc() {
        if (tipproduc == null) {
            tipproduc = new ArrayList<Producto>();
        }
        return this.tipproduc;
    }

    /**
     * Obtiene el valor de la propiedad cantcompr.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCantcompr() {
        return cantcompr;
    }

    /**
     * Define el valor de la propiedad cantcompr.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCantcompr(String value) {
        this.cantcompr = value;
    }

}
