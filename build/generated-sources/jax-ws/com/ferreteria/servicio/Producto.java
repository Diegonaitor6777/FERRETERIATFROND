
package com.ferreteria.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para producto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="producto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="cantcompr" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codigo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="existencia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="productodetalle" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="subtotl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "producto", propOrder = {
    "cantcompr",
    "codigo",
    "descripcion",
    "existencia",
    "precio",
    "productodetalle",
    "status",
    "subtotl"
})
public class Producto {

    protected String cantcompr;
    protected String codigo;
    protected String descripcion;
    protected String existencia;
    protected String precio;
    protected String productodetalle;
    protected String status;
    protected String subtotl;

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

    /**
     * Obtiene el valor de la propiedad codigo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * Define el valor de la propiedad codigo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodigo(String value) {
        this.codigo = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad existencia.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistencia() {
        return existencia;
    }

    /**
     * Define el valor de la propiedad existencia.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistencia(String value) {
        this.existencia = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecio(String value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad productodetalle.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductodetalle() {
        return productodetalle;
    }

    /**
     * Define el valor de la propiedad productodetalle.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductodetalle(String value) {
        this.productodetalle = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad subtotl.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubtotl() {
        return subtotl;
    }

    /**
     * Define el valor de la propiedad subtotl.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubtotl(String value) {
        this.subtotl = value;
    }

}
