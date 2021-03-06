
package www.cliente.detalles;

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
@WebServiceClient(name = "servicioObtenerDetalles", targetNamespace = "http://www.itorizaba.com/servicioObtenerDetalles.wsdl", wsdlLocation = "http://localhost:8080/AplicacionServicio/servicioObtenerDetalles?WSDL")
public class ServicioObtenerDetalles
    extends Service
{

    private final static URL SERVICIOOBTENERDETALLES_WSDL_LOCATION;
    private final static WebServiceException SERVICIOOBTENERDETALLES_EXCEPTION;
    private final static QName SERVICIOOBTENERDETALLES_QNAME = new QName("http://www.itorizaba.com/servicioObtenerDetalles.wsdl", "servicioObtenerDetalles");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/AplicacionServicio/servicioObtenerDetalles?WSDL");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        SERVICIOOBTENERDETALLES_WSDL_LOCATION = url;
        SERVICIOOBTENERDETALLES_EXCEPTION = e;
    }

    public ServicioObtenerDetalles() {
        super(__getWsdlLocation(), SERVICIOOBTENERDETALLES_QNAME);
    }

    public ServicioObtenerDetalles(WebServiceFeature... features) {
        super(__getWsdlLocation(), SERVICIOOBTENERDETALLES_QNAME, features);
    }

    public ServicioObtenerDetalles(URL wsdlLocation) {
        super(wsdlLocation, SERVICIOOBTENERDETALLES_QNAME);
    }

    public ServicioObtenerDetalles(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, SERVICIOOBTENERDETALLES_QNAME, features);
    }

    public ServicioObtenerDetalles(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ServicioObtenerDetalles(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ServicioObtenerDetallesPortType
     */
    @WebEndpoint(name = "servicioObtenerDetallesPort")
    public ServicioObtenerDetallesPortType getServicioObtenerDetallesPort() {
        return super.getPort(new QName("http://www.itorizaba.com/servicioObtenerDetalles.wsdl", "servicioObtenerDetallesPort"), ServicioObtenerDetallesPortType.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ServicioObtenerDetallesPortType
     */
    @WebEndpoint(name = "servicioObtenerDetallesPort")
    public ServicioObtenerDetallesPortType getServicioObtenerDetallesPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://www.itorizaba.com/servicioObtenerDetalles.wsdl", "servicioObtenerDetallesPort"), ServicioObtenerDetallesPortType.class, features);
    }

    private static URL __getWsdlLocation() {
        if (SERVICIOOBTENERDETALLES_EXCEPTION!= null) {
            throw SERVICIOOBTENERDETALLES_EXCEPTION;
        }
        return SERVICIOOBTENERDETALLES_WSDL_LOCATION;
    }

}
