
package com.itorizaba.servicioalumnosporcarrera;

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
@WebServiceClient(name = "servicioalumnosporcarrera", targetNamespace = "http://www.itorizaba.com/servicioalumnosporcarrera.wsdl", wsdlLocation = "file:/C:/Users/javi-/OneDrive/Documentos/NetBeansProjects/AplicacionServicio/src/conf/xml-resources/web-services/servInscritosporCarrera/wsdl/servicioalumnosporcarrera.wsdl")
public class Servicioalumnosporcarrera
    extends Service
{

    private final static URL SERVICIOALUMNOSPORCARRERA_WSDL_LOCATION;
    private final static WebServiceException SERVICIOALUMNOSPORCARRERA_EXCEPTION;
    private final static QName SERVICIOALUMNOSPORCARRERA_QNAME = new QName("http://www.itorizaba.com/servicioalumnosporcarrera.wsdl", "servicioalumnosporcarrera");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/javi-/OneDrive/Documentos/NetBeansProjects/AplicacionServicio/src/conf/xml-resources/web-services/servInscritosporCarrera/wsdl/servicioalumnosporcarrera.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOALUMNOSPORCARRERA_WSDL_LOCATION = url;
        SERVICIOALUMNOSPORCARRERA_EXCEPTION = e;
    }

    public Servicioalumnosporcarrera() {
        super(__getWsdlLocation(), SERVICIOALUMNOSPORCARRERA_QNAME);
    }

    public Servicioalumnosporcarrera(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOALUMNOSPORCARRERA_QNAME, features);
    }

    public Servicioalumnosporcarrera(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOALUMNOSPORCARRERA_QNAME);
    }

    public Servicioalumnosporcarrera(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOALUMNOSPORCARRERA_QNAME, features);
    }

    public Servicioalumnosporcarrera(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Servicioalumnosporcarrera(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioalumnosporcarreraPortType
     */
    @WebEndpoint(name = "servicioalumnosporcarreraPort")
    public ServicioalumnosporcarreraPortType getServicioalumnosporcarreraPort() {
        return super.getPort(new QName("http://www.itorizaba.com/servicioalumnosporcarrera.wsdl", "servicioalumnosporcarreraPort"), ServicioalumnosporcarreraPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioalumnosporcarreraPortType
     */
    @WebEndpoint(name = "servicioalumnosporcarreraPort")
    public ServicioalumnosporcarreraPortType getServicioalumnosporcarreraPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.itorizaba.com/servicioalumnosporcarrera.wsdl", "servicioalumnosporcarreraPort"), ServicioalumnosporcarreraPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOALUMNOSPORCARRERA_EXCEPTION!= null) {
            throw SERVICIOALUMNOSPORCARRERA_EXCEPTION;
        }
        return SERVICIOALUMNOSPORCARRERA_WSDL_LOCATION;
    }

}
