/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.servicios.RangoEdad;

import javax.jws.WebService;

/**
 *
 * @author javi-
 */
@WebService(serviceName = "servicioalumnosInscritosporRangoEdad", portName = "servicioalumnosInscritosporRangoEdadPort", endpointInterface = "com.itorizaba.servicioalumnosinscritosporrangoedad.ServicioalumnosInscritosporRangoEdadPortType", targetNamespace = "http://www.itorizaba.com/servicioalumnosInscritosporRangoEdad.wsdl", wsdlLocation = "WEB-INF/wsdl/servRangoEdad/servicioalumnosInscritosporRangoEdad.wsdl")
public class servRangoEdad {

    public com.itorizaba.servicioalumnosinscritosporrangoedad.ArregloAlumno alumnosInscritosporRangoEdad(java.lang.String rango1, java.lang.String rango2) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
