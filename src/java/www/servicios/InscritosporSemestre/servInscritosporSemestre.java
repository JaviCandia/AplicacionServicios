/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.servicios.InscritosporSemestre;

import javax.jws.WebService;

/**
 *
 * @author javi-
 */
@WebService(serviceName = "servicioalumnosInscritosporSemestre", portName = "servicioalumnosInscritosporSemestrePort", endpointInterface = "com.itorizaba.servicioalumnosinscritosporsemestre.ServicioalumnosInscritosporSemestrePortType", targetNamespace = "http://www.itorizaba.com/servicioalumnosInscritosporSemestre.wsdl", wsdlLocation = "WEB-INF/wsdl/servInscritosporSemestre/servicioalumnosInscritosporSemestre.wsdl")
public class servInscritosporSemestre {

    public com.itorizaba.servicioalumnosinscritosporsemestre.ArregloAlumno alumnosInscritosporSemestre(java.lang.String semestre) {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
