/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.servicios.Restaurante;

import javax.jws.WebService;

import clases.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.jws.WebService;

/**
 *
 * @author javi-
 */
@WebService(serviceName = "servicioRestaurante", portName = "servicioRestaurantePort", endpointInterface = "com.itorizaba.serviciorestaurante.ServicioRestaurantePortType", targetNamespace = "http://www.itorizaba.com/servicioRestaurante.wsdl", wsdlLocation = "WEB-INF/wsdl/servRestaurante/servicioRestaurante.wsdl")
public class servRestaurante {

    public com.itorizaba.serviciorestaurante.ArregloRestaurante getRestaurantes(java.lang.String ciudad) {
        Connection conn = null;
        PreparedStatement stmt = null, stmt2 = null;
        ResultSet rs = null, rs2=null;

        com.itorizaba.serviciorestaurante.ArregloRestaurante arregloRestaurante = new com.itorizaba.serviciorestaurante.ArregloRestaurante();

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
        } catch (SQLException ex) {
        }

        try {
            conn = database.getConnection();
            stmt = conn.prepareStatement("SELECT * FROM restaurante WHERE ciudad = '" + ciudad + "'");
            rs = stmt.executeQuery();
            while (rs.next()) {
                com.itorizaba.serviciorestaurante.Restaurante restaurante = new com.itorizaba.serviciorestaurante.Restaurante();
                restaurante.setNombre(rs.getString("id_restaurante")+".- "+rs.getString("nombre"));
                restaurante.setDireccion(rs.getString("direccion"));
                restaurante.setDescripcion(rs.getString("descripcion"));
                
                //Aquí el arreglo jeje
                com.itorizaba.serviciorestaurante.ArregloMenu arregloMenu = new com.itorizaba.serviciorestaurante.ArregloMenu();
                stmt2 = conn.prepareStatement("SELECT * FROM restaurante INNER JOIN menu ON menu.id_restaurante = restaurante.id_restaurante WHERE restaurante.ciudad = '" + ciudad + "' AND menu.id_restaurante="+rs.getString("id_restaurante"));
                rs2 = stmt2.executeQuery();
                while (rs2.next()) {
                    com.itorizaba.serviciorestaurante.Menu menu = new com.itorizaba.serviciorestaurante.Menu();
                    menu.setPlatillo(rs2.getString("id_menu")+".- "+rs2.getString("platillo"));
                    menu.setIngredientes(rs2.getString("ingredientes"));
                    menu.setPrecio(rs2.getFloat("precio"));
                    arregloMenu.getItem().add(menu);
                }
                restaurante.setMenu(arregloMenu);

                arregloRestaurante.getItem().add(restaurante);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            database.close(rs);
            database.close(stmt);
            database.close(conn);
        }

        return arregloRestaurante;
    }

}
