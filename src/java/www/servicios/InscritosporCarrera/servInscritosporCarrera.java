/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package www.servicios.InscritosporCarrera;

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
@WebService(serviceName = "servicioalumnosporcarrera", portName = "servicioalumnosporcarreraPort", endpointInterface = "com.itorizaba.servicioalumnosporcarrera.ServicioalumnosporcarreraPortType", targetNamespace = "http://www.itorizaba.com/servicioalumnosporcarrera.wsdl", wsdlLocation = "WEB-INF/wsdl/servInscritosporCarrera/servicioalumnosporcarrera.wsdl")
public class servInscritosporCarrera {

    public com.itorizaba.servicioalumnosporcarrera.ArregloAlumno alumnosInscritosporCarrera(java.lang.String carrera) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        
        com.itorizaba.servicioalumnosporcarrera.ArregloAlumno arreglo = new com.itorizaba.servicioalumnosporcarrera.ArregloAlumno();
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/", "root", "");
        } catch (SQLException ex) {
        }

        try {
            conn = database.getConnection();
            stmt = conn.prepareStatement("select * from alumno where carrera = '"+carrera+"'");
            rs = stmt.executeQuery();
            while (rs.next()) {
                com.itorizaba.servicioalumnosporcarrera.Alumno alumno = new com.itorizaba.servicioalumnosporcarrera.Alumno();
                alumno.setNumControl(rs.getString("num_control"));
                alumno.setCarrera(rs.getString("carrera"));
                alumno.setDireccion(rs.getString("direccion"));
                alumno.setEdad(rs.getString("edad"));
                alumno.setEmail(rs.getString("email"));
                alumno.setPromedio(rs.getString("promedio"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setTelefono(rs.getString("telefono"));
                alumno.setSemestre(rs.getString("semestre"));
                arreglo.getItem().add(alumno);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            database.close(rs);
            database.close(stmt);
            database.close(conn);
        }
        return arreglo;
    }
    
}
