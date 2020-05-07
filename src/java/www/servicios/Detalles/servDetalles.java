/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.servicios.Detalles;

import clases.database;
import javax.jws.WebService;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author javi-
 */
@WebService(serviceName = "servicioObtenerDetalles", portName = "servicioObtenerDetallesPort", endpointInterface = "com.itorizaba.servicioobtenerdetalles.ServicioObtenerDetallesPortType", targetNamespace = "http://www.itorizaba.com/servicioObtenerDetalles.wsdl", wsdlLocation = "WEB-INF/wsdl/servDetalles/servicioObtenerDetalles.wsdl")
public class servDetalles {

    public com.itorizaba.servicioobtenerdetalles.Alumno obtenerDetalles(String numControl) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        com.itorizaba.servicioobtenerdetalles.Alumno alumno = new com.itorizaba.servicioobtenerdetalles.Alumno();

        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
        } catch (SQLException ex) {
        }

        try {
            conn = database.getConnection();
            stmt = conn.prepareStatement("select * from alumno where num_control = " + numControl);
            rs = stmt.executeQuery();

            if (numControl.isEmpty()) {
                alumno.setNumControl("");
                alumno.setCarrera("");
                alumno.setDireccion("");
                alumno.setEdad("");
                alumno.setEmail("");
                alumno.setPromedio("");
                alumno.setNombre("");
                alumno.setTelefono("");
                alumno.setSemestre("");
            } else {
                rs = stmt.executeQuery();
                while (rs.next()) {
                    alumno.setNumControl(numControl);
                    alumno.setCarrera(rs.getString("carrera"));
                    alumno.setDireccion(rs.getString("direccion"));
                    alumno.setEdad(rs.getString("edad"));
                    alumno.setEmail(rs.getString("email"));
                    alumno.setPromedio(rs.getString("promedio"));
                    alumno.setNombre(rs.getString("nombre"));
                    alumno.setTelefono(rs.getString("telefono"));
                    alumno.setSemestre(rs.getString("semestre"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            database.close(rs);
            database.close(stmt);
            database.close(conn);
        }
        return alumno;
    }
}
