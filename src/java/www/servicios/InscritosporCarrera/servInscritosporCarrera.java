/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.servicios.InscritosporCarrera;

import javax.jws.WebService;

/**
 *
 * @author javi-
 */
@WebService(serviceName = "servicioalumnosporcarrera", portName = "servicioalumnosporcarreraPort", endpointInterface = "com.itorizaba.servicioalumnosporcarrera.ServicioalumnosporcarreraPortType", targetNamespace = "http://www.itorizaba.com/servicioalumnosporcarrera.wsdl", wsdlLocation = "WEB-INF/wsdl/servInscritosporCarrera/servicioalumnosporcarrera.wsdl")
public class servInscritosporCarrera {

    public com.itorizaba.servicioalumnosporcarrera.ArregloAlumno alumnosInscritosporCarrera(java.lang.String carrera) {
        //TODO implement this method
        //throw new UnsupportedOperationException("Not implemented yet.");
        com.itorizaba.servicioalumnosporcarrera.ArregloAlumno arreglo = new com.itorizaba.servicioalumnosporcarrera.ArregloAlumno();
        
        if(carrera.equals("Sistemas")){
            for(int i=0; i<50; i++){
                com.itorizaba.servicioalumnosporcarrera.Alumno alumno = new com.itorizaba.servicioalumnosporcarrera.Alumno();
                alumno.setNumControl("15423654"+i);
                alumno.setCarrera("Sistemas");
                alumno.setDireccion("Dirrecion: "+i);
                alumno.setEdad("21");
                alumno.setEmail("Alumno"+i+"@gmail.com");
                alumno.setNombre("Nombre: "+i);
                alumno.setPromedio("90");
                alumno.setSemestre("Septimo");
                alumno.setTelefono("2222222222");
                arreglo.getItem().add(alumno);
            }
        }
        else if(carrera.equals("Quimica")){
            for(int i=0; i<40; i++){
                com.itorizaba.servicioalumnosporcarrera.Alumno alumno = new com.itorizaba.servicioalumnosporcarrera.Alumno();
                alumno.setNumControl("14423654"+i);
                alumno.setCarrera("Quimica");
                alumno.setDireccion("Dirrecion: "+i);
                alumno.setEdad("23");
                alumno.setEmail("Alumno"+i+"@gmail.com");
                alumno.setNombre("Nombre: "+i);
                alumno.setPromedio("90");
                alumno.setSemestre("Noveno");
                alumno.setTelefono("333333333");
                arreglo.getItem().add(alumno);
            }
        }
        else if(carrera.equals("Electronica")){
            for(int i=0; i<30; i++){
                com.itorizaba.servicioalumnosporcarrera.Alumno alumno = new com.itorizaba.servicioalumnosporcarrera.Alumno();
                alumno.setNumControl("16423654"+i);
                alumno.setCarrera("Electronica");
                alumno.setDireccion("Dirrecion: "+i);
                alumno.setEdad("22");
                alumno.setEmail("Alumno"+i+"@gmail.com");
                alumno.setNombre("Nombre: "+i);
                alumno.setPromedio("94");
                alumno.setSemestre("Octavo");
                alumno.setTelefono("4444444444");
                arreglo.getItem().add(alumno);
            }
        }
        else{
            for(int i=0; i<40; i++){
                com.itorizaba.servicioalumnosporcarrera.Alumno alumno = new com.itorizaba.servicioalumnosporcarrera.Alumno();
                alumno.setNumControl("17423654"+i);
                alumno.setCarrera("Gestion Empresarial");
                alumno.setDireccion("Dirrecion: "+i);
                alumno.setEdad("20");
                alumno.setEmail("Alumno"+i+"@gmail.com");
                alumno.setNombre("Nombre: "+i);
                alumno.setPromedio("90");
                alumno.setSemestre("Sexto");
                alumno.setTelefono("5555555555");
                arreglo.getItem().add(alumno);
            }
        }
        
        return arreglo;
    }
    
}
