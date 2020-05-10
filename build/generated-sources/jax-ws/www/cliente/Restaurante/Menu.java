
package www.cliente.Restaurante;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Menu complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Menu"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="platillo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ingredientes" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}float"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Menu", propOrder = {
    "platillo",
    "ingredientes",
    "precio"
})
public class Menu {

    @XmlElement(required = true)
    protected String platillo;
    @XmlElement(required = true)
    protected String ingredientes;
    protected float precio;

    /**
     * Obtiene el valor de la propiedad platillo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlatillo() {
        return platillo;
    }

    /**
     * Define el valor de la propiedad platillo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlatillo(String value) {
        this.platillo = value;
    }

    /**
     * Obtiene el valor de la propiedad ingredientes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIngredientes() {
        return ingredientes;
    }

    /**
     * Define el valor de la propiedad ingredientes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIngredientes(String value) {
        this.ingredientes = value;
    }

    /**
     * Obtiene el valor de la propiedad precio.
     * 
     */
    public float getPrecio() {
        return precio;
    }

    /**
     * Define el valor de la propiedad precio.
     * 
     */
    public void setPrecio(float value) {
        this.precio = value;
    }

}
