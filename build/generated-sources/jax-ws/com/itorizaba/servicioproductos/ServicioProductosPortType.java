
package com.itorizaba.servicioproductos;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebService(name = "servicioProductosPortType", targetNamespace = "http://www.itorizaba.com/servicioProductos.wsdl")
@SOAPBinding(style = SOAPBinding.Style.RPC)
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServicioProductosPortType {


    /**
     * 
     * @return
     *     returns com.itorizaba.servicioproductos.ArregloProducto
     */
    @WebMethod(action = "capeconnect:servicioProductos:servicioProductosPortType#getProductos")
    @WebResult(name = "respuesta", partName = "respuesta")
    public ArregloProducto getProductos();

}
