/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.servicios.Productos;

import javax.jws.WebService;

/**
 *
 * @author javi-
 */
@WebService(serviceName = "servicioProductos", portName = "servicioProductosPort", endpointInterface = "com.itorizaba.servicioproductos.ServicioProductosPortType", targetNamespace = "http://www.itorizaba.com/servicioProductos.wsdl", wsdlLocation = "WEB-INF/wsdl/servProductos/servicioProductos.wsdl")
public class servProductos {

    public com.itorizaba.servicioproductos.ArregloProducto getProductos() {
        com.itorizaba.servicioproductos.ArregloProducto arreglo = new com.itorizaba.servicioproductos.ArregloProducto();
        
        
        
        return arreglo;
    }
    
}
