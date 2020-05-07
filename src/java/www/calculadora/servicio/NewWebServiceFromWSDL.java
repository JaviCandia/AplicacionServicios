/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.calculadora.servicio;

import javax.jws.WebService;

/**
 *
 * @author javi-
 */
@WebService(serviceName = "serviciocalculadora", portName = "serviciocalculadoraPort", endpointInterface = "com.itorizaba.serviciocalculadora.ServiciocalculadoraPortType", targetNamespace = "http://www.itorizaba.com/serviciocalculadora.wsdl", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/serviciocalculadora.wsdl")
public class NewWebServiceFromWSDL {

    public int sumar(int a, int b) {
        //TODO implement this method
        return a+b;
    }

    public int restar(int a, int b) {
        //TODO implement this method
        return a-b;
    }

    public int multiplicar(int a, int b) {
        //TODO implement this method
        return a*b;
    }

    public float dividir(float a, float b) {
        //TODO implement this method
        return a/b;
    }  
}
