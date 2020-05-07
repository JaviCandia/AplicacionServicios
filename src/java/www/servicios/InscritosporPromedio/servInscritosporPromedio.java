/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.servicios.InscritosporPromedio;

import javax.jws.WebService;

/**
 *
 * @author javi-
 */
@WebService(serviceName = "servicioalumnosInscritosporPromedio", portName = "servicioalumnosInscritosporPromedioPort", endpointInterface = "com.itorizaba.servicioalumnosinscritosporpromedio.ServicioalumnosInscritosporPromedioPortType", targetNamespace = "http://www.itorizaba.com/servicioalumnosInscritosporPromedio.wsdl", wsdlLocation = "WEB-INF/wsdl/servInscritosporPromedio/servicioalumnosInscritosporPromedio.wsdl")
public class servInscritosporPromedio {

    public com.itorizaba.servicioalumnosinscritosporpromedio.ArregloAlumno alumnosInscritosporPromedio(java.lang.String promedio) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
