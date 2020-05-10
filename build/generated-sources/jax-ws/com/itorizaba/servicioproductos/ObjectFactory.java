
package com.itorizaba.servicioproductos;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.itorizaba.servicioproductos package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.itorizaba.servicioproductos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ProductosRelacionados }
     * 
     */
    public ProductosRelacionados createProductosRelacionados() {
        return new ProductosRelacionados();
    }

    /**
     * Create an instance of {@link Proveedor }
     * 
     */
    public Proveedor createProveedor() {
        return new Proveedor();
    }

    /**
     * Create an instance of {@link ArregloProductosRelacionados }
     * 
     */
    public ArregloProductosRelacionados createArregloProductosRelacionados() {
        return new ArregloProductosRelacionados();
    }

    /**
     * Create an instance of {@link Producto }
     * 
     */
    public Producto createProducto() {
        return new Producto();
    }

    /**
     * Create an instance of {@link ArregloProducto }
     * 
     */
    public ArregloProducto createArregloProducto() {
        return new ArregloProducto();
    }

}
