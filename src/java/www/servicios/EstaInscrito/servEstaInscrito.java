/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.servicios.EstaInscrito;

import javax.jws.WebService;

/**
 *
 * @author javi-
 */
@WebService(serviceName = "servicioestaInscrito", portName = "servicioestaInscritoPort", endpointInterface = "com.itorizaba.servicioestainscrito.ServicioestaInscritoPortType", targetNamespace = "http://www.itorizaba.com/servicioestaInscrito.wsdl", wsdlLocation = "WEB-INF/wsdl/servEstaInscrito/servicioestaInscrito.wsdl")
public class servEstaInscrito {

    public boolean estaInscrito(java.lang.String numControl) {
        //TODO implement this method
        //throw new UnsupportedOperationException("Not implemented yet.");
        boolean resultado = false;
        
        if(numControl.equals("1505055487")){
            resultado = true;
        }
        else if(numControl.equals("1524548789")){
            resultado = true;
        }
        else{
            resultado = false;
        }
        
        return resultado;
    }
}
