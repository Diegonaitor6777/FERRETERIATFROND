
package com.ferreteria.servicio;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ferreteria.servicio package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Ingreso_QNAME = new QName("http://servicio.ferreteria.com/", "ingreso");
    private final static QName _ProductoinventarioResponse_QNAME = new QName("http://servicio.ferreteria.com/", "ProductoinventarioResponse");
    private final static QName _Ordencompr_QNAME = new QName("http://servicio.ferreteria.com/", "Ordencompr");
    private final static QName _ListaProductosResponse_QNAME = new QName("http://servicio.ferreteria.com/", "listaProductosResponse");
    private final static QName _Agregaventa_QNAME = new QName("http://servicio.ferreteria.com/", "Agregaventa");
    private final static QName _Productoinventario_QNAME = new QName("http://servicio.ferreteria.com/", "Productoinventario");
    private final static QName _ListaproveedorResponse_QNAME = new QName("http://servicio.ferreteria.com/", "ListaproveedorResponse");
    private final static QName _OrdencomprResponse_QNAME = new QName("http://servicio.ferreteria.com/", "OrdencomprResponse");
    private final static QName _AgregaventaResponse_QNAME = new QName("http://servicio.ferreteria.com/", "AgregaventaResponse");
    private final static QName _Listaproveedor_QNAME = new QName("http://servicio.ferreteria.com/", "Listaproveedor");
    private final static QName _Formapagos_QNAME = new QName("http://servicio.ferreteria.com/", "formapagos");
    private final static QName _IngresoResponse_QNAME = new QName("http://servicio.ferreteria.com/", "ingresoResponse");
    private final static QName _FormapagosResponse_QNAME = new QName("http://servicio.ferreteria.com/", "formapagosResponse");
    private final static QName _ListaProductos_QNAME = new QName("http://servicio.ferreteria.com/", "listaProductos");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ferreteria.servicio
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link FormapagosResponse }
     * 
     */
    public FormapagosResponse createFormapagosResponse() {
        return new FormapagosResponse();
    }

    /**
     * Create an instance of {@link ListaProductos }
     * 
     */
    public ListaProductos createListaProductos() {
        return new ListaProductos();
    }

    /**
     * Create an instance of {@link AgregaventaResponse }
     * 
     */
    public AgregaventaResponse createAgregaventaResponse() {
        return new AgregaventaResponse();
    }

    /**
     * Create an instance of {@link IngresoResponse }
     * 
     */
    public IngresoResponse createIngresoResponse() {
        return new IngresoResponse();
    }

    /**
     * Create an instance of {@link Listaproveedor }
     * 
     */
    public Listaproveedor createListaproveedor() {
        return new Listaproveedor();
    }

    /**
     * Create an instance of {@link Formapagos }
     * 
     */
    public Formapagos createFormapagos() {
        return new Formapagos();
    }

    /**
     * Create an instance of {@link ListaProductosResponse }
     * 
     */
    public ListaProductosResponse createListaProductosResponse() {
        return new ListaProductosResponse();
    }

    /**
     * Create an instance of {@link Ordencompr }
     * 
     */
    public Ordencompr createOrdencompr() {
        return new Ordencompr();
    }

    /**
     * Create an instance of {@link Ingreso }
     * 
     */
    public Ingreso createIngreso() {
        return new Ingreso();
    }

    /**
     * Create an instance of {@link ProductoinventarioResponse }
     * 
     */
    public ProductoinventarioResponse createProductoinventarioResponse() {
        return new ProductoinventarioResponse();
    }

    /**
     * Create an instance of {@link OrdencomprResponse }
     * 
     */
    public OrdencomprResponse createOrdencomprResponse() {
        return new OrdencomprResponse();
    }

    /**
     * Create an instance of {@link Agregaventa }
     * 
     */
    public Agregaventa createAgregaventa() {
        return new Agregaventa();
    }

    /**
     * Create an instance of {@link ListaproveedorResponse }
     * 
     */
    public ListaproveedorResponse createListaproveedorResponse() {
        return new ListaproveedorResponse();
    }

    /**
     * Create an instance of {@link Productoinventario }
     * 
     */
    public Productoinventario createProductoinventario() {
        return new Productoinventario();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link Proveedores }
     * 
     */
    public Proveedores createProveedores() {
        return new Proveedores();
    }

    /**
     * Create an instance of {@link FormaPago }
     * 
     */
    public FormaPago createFormaPago() {
        return new FormaPago();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ingreso }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.ferreteria.com/", name = "ingreso")
    public JAXBElement<Ingreso> createIngreso(Ingreso value) {
        return new JAXBElement<Ingreso>(_Ingreso_QNAME, Ingreso.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProductoinventarioResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.ferreteria.com/", name = "ProductoinventarioResponse")
    public JAXBElement<ProductoinventarioResponse> createProductoinventarioResponse(ProductoinventarioResponse value) {
        return new JAXBElement<ProductoinventarioResponse>(_ProductoinventarioResponse_QNAME, ProductoinventarioResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Ordencompr }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.ferreteria.com/", name = "Ordencompr")
    public JAXBElement<Ordencompr> createOrdencompr(Ordencompr value) {
        return new JAXBElement<Ordencompr>(_Ordencompr_QNAME, Ordencompr.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaProductosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.ferreteria.com/", name = "listaProductosResponse")
    public JAXBElement<ListaProductosResponse> createListaProductosResponse(ListaProductosResponse value) {
        return new JAXBElement<ListaProductosResponse>(_ListaProductosResponse_QNAME, ListaProductosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Agregaventa }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.ferreteria.com/", name = "Agregaventa")
    public JAXBElement<Agregaventa> createAgregaventa(Agregaventa value) {
        return new JAXBElement<Agregaventa>(_Agregaventa_QNAME, Agregaventa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Productoinventario }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.ferreteria.com/", name = "Productoinventario")
    public JAXBElement<Productoinventario> createProductoinventario(Productoinventario value) {
        return new JAXBElement<Productoinventario>(_Productoinventario_QNAME, Productoinventario.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaproveedorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.ferreteria.com/", name = "ListaproveedorResponse")
    public JAXBElement<ListaproveedorResponse> createListaproveedorResponse(ListaproveedorResponse value) {
        return new JAXBElement<ListaproveedorResponse>(_ListaproveedorResponse_QNAME, ListaproveedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link OrdencomprResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.ferreteria.com/", name = "OrdencomprResponse")
    public JAXBElement<OrdencomprResponse> createOrdencomprResponse(OrdencomprResponse value) {
        return new JAXBElement<OrdencomprResponse>(_OrdencomprResponse_QNAME, OrdencomprResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AgregaventaResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.ferreteria.com/", name = "AgregaventaResponse")
    public JAXBElement<AgregaventaResponse> createAgregaventaResponse(AgregaventaResponse value) {
        return new JAXBElement<AgregaventaResponse>(_AgregaventaResponse_QNAME, AgregaventaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Listaproveedor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.ferreteria.com/", name = "Listaproveedor")
    public JAXBElement<Listaproveedor> createListaproveedor(Listaproveedor value) {
        return new JAXBElement<Listaproveedor>(_Listaproveedor_QNAME, Listaproveedor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Formapagos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.ferreteria.com/", name = "formapagos")
    public JAXBElement<Formapagos> createFormapagos(Formapagos value) {
        return new JAXBElement<Formapagos>(_Formapagos_QNAME, Formapagos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link IngresoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.ferreteria.com/", name = "ingresoResponse")
    public JAXBElement<IngresoResponse> createIngresoResponse(IngresoResponse value) {
        return new JAXBElement<IngresoResponse>(_IngresoResponse_QNAME, IngresoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link FormapagosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.ferreteria.com/", name = "formapagosResponse")
    public JAXBElement<FormapagosResponse> createFormapagosResponse(FormapagosResponse value) {
        return new JAXBElement<FormapagosResponse>(_FormapagosResponse_QNAME, FormapagosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListaProductos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://servicio.ferreteria.com/", name = "listaProductos")
    public JAXBElement<ListaProductos> createListaProductos(ListaProductos value) {
        return new JAXBElement<ListaProductos>(_ListaProductos_QNAME, ListaProductos.class, null, value);
    }

}
