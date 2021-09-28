package edu.eci.arsw.app.ucord.service;

import edu.eci.arsw.app.ucord.model.Usuario;

/**
 * @author Ana Gabriela Silva
 * @author Leonardo Galeano
 * @author Iván Camilo Rincón Saavedra
 * @version 9/28/2021
 */


public interface IUsuarioService {
    //POST
    void agregarUsuario(Usuario usuario) throws UCordServicesException;

    //GET
    Usuario getUsuarioPorCorreo( String correo ) throws UCordServicesException;

    Usuario getUsuarioPorId( Integer id ) throws UCordServicesException;

    //PUT
    void actualizarFotoDeUsuario( String correo, String url);

    void actualizarContraseñaDeUsuario( String correo, String contraseña );

}
