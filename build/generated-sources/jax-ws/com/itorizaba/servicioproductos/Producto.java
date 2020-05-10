
package com.itorizaba.servicioproductos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Producto complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Producto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="proveedor" type="{http://www.itorizaba.com/servicioProductos.xsd1}Proveedor"/&gt;
 *         &lt;element name="lista" type="{http://www.itorizaba.com/servicioProductos.xsd1}ArregloProductosRelacionados"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Producto", propOrder = {
    "id",
    "nombre",
    "descripcion",
    "precio",
    "proveedor",
    "lista"
})
public class Producto {

    @XmlElement(required = true)
    protected String id;
    @XmlElement(required = true)
    protected String nombre;
    @XmlElement(required = true)
    protected String descripcion;
    @XmlElement(required = true)
    protected String precio;
    @XmlElement(required = true)
    protected Proveedor proveedor;
    @XmlElement(required = true)
    protected ArregloProductosRelacionados lista;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad nombre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Define el valor de la propiedad nombre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Obtiene el valor de la propiedad descripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Define el valor de la propiedad descripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrecio(String value) {
        this.precio = value;
    }

    /**
     * Obtiene el valor de la propiedad proveedor.
     * 
     * @return
     *     possible object is
     *     {@link Proveedor }
     *     
     */
    public Proveedor getProveedor() {
        return proveedor;
    }

    /**
     * Define el valor de la propiedad proveedor.
     * 
     * @param value
     *     allowed object is
     *     {@link Proveedor }
     *     
     */
    public void setProveedor(Proveedor value) {
        this.proveedor = value;
    }

    /**
     * Obtiene el valor de la propiedad lista.
     * 
     * @return
     *     possible object is
     *     {@link ArregloProductosRelacionados }
     *     
     */
    public ArregloProductosRelacionados getLista() {
        return lista;
    }

    /**
     * Define el valor de la propiedad lista.
     * 
     * @param value
     *     allowed object is
     *     {@link ArregloProductosRelacionados }
     *     
     */
    public void setLista(ArregloProductosRelacionados value) {
        this.lista = value;
    }

}
