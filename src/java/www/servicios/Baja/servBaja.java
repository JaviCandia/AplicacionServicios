/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.servicios.Baja;

import javax.jws.WebService;

/**
 *
 * @author javi-
 */
@WebService(serviceName = "serviciobaja", portName = "serviciobajaPort", endpointInterface = "com.itorizaba.serviciobaja.ServiciobajaPortType", targetNamespace = "http://www.itorizaba.com/serviciobaja.wsdl", wsdlLocation = "WEB-INF/wsdl/servBaja/serviciobaja.wsdl")
public class servBaja {

    public boolean darBaja(java.lang.String numControl) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
