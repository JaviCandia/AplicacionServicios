
package com.itorizaba.servicioproductos;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "servicioProductos", targetNamespace = "http://www.itorizaba.com/servicioProductos.wsdl", wsdlLocation = "file:/C:/Users/javi-/OneDrive/Documentos/NetBeansProjects/AplicacionServicio/src/conf/xml-resources/web-services/servProductos/wsdl/servicioProductos.wsdl")
public class ServicioProductos
    extends Service
{

    private final static URL SERVICIOPRODUCTOS_WSDL_LOCATION;
    private final static WebServiceException SERVICIOPRODUCTOS_EXCEPTION;
    private final static QName SERVICIOPRODUCTOS_QNAME = new QName("http://www.itorizaba.com/servicioProductos.wsdl", "servicioProductos");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/javi-/OneDrive/Documentos/NetBeansProjects/AplicacionServicio/src/conf/xml-resources/web-services/servProductos/wsdl/servicioProductos.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOPRODUCTOS_WSDL_LOCATION = url;
        SERVICIOPRODUCTOS_EXCEPTION = e;
    }

    public ServicioProductos() {
        super(__getWsdlLocation(), SERVICIOPRODUCTOS_QNAME);
    }

    public ServicioProductos(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOPRODUCTOS_QNAME, features);
    }

    public ServicioProductos(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOPRODUCTOS_QNAME);
    }

    public ServicioProductos(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOPRODUCTOS_QNAME, features);
    }

    public ServicioProductos(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioProductos(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioProductosPortType
     */
    @WebEndpoint(name = "servicioProductosPort")
    public ServicioProductosPortType getServicioProductosPort() {
        return super.getPort(new QName("http://www.itorizaba.com/servicioProductos.wsdl", "servicioProductosPort"), ServicioProductosPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioProductosPortType
     */
    @WebEndpoint(name = "servicioProductosPort")
    public ServicioProductosPortType getServicioProductosPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.itorizaba.com/servicioProductos.wsdl", "servicioProductosPort"), ServicioProductosPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOPRODUCTOS_EXCEPTION!= null) {
            throw SERVICIOPRODUCTOS_EXCEPTION;
        }
        return SERVICIOPRODUCTOS_WSDL_LOCATION;
    }

}
