/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.servicios.Inscritos;

import javax.jws.WebService;

/**
 *
 * @author javi-
 */
@WebService(serviceName = "servicioAlumnosInscritos", portName = "servicioAlumnosInscritosPort", endpointInterface = "com.itorizaba.servicioalumnosinscritos.ServicioAlumnosInscritosPortType", targetNamespace = "http://www.itorizaba.com/servicioAlumnosInscritos.wsdl", wsdlLocation = "WEB-INF/wsdl/servInscritos/servicioAlumnosInscritos.wsdl")
public class servInscritos {

    public com.itorizaba.servicioalumnosinscritos.ArregloAlumno alumnosInscritos() {
           //TODO implement this method
           //throw new UnsupportedOperationException("Not implemented yet.");
           com.itorizaba.servicioalumnosinscritos.ArregloAlumno arreglo = new com.itorizaba.servicioalumnosinscritos.ArregloAlumno();
           for(int i=0; i<100;i++){
               com.itorizaba.servicioalumnosinscritos.Alumno alumno = new com.itorizaba.servicioalumnosinscritos.Alumno();
               alumno.setNumControl("1555213"+i);
               alumno.setNombre("Nombre: "+i);
               alumno.setCarrera("Sistemas");
               alumno.setEdad("21");
               alumno.setDireccion("Direccion: "+i);
               alumno.setPromedio("90");
               alumno.setEmail("alumno"+i+"@gmail.com");
               alumno.setSemestre("Septimo");
               alumno.setTelefono("2727255144");
               arreglo.getItem().add(alumno);
           }
           return arreglo;
    }

}
