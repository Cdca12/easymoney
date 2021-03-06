/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ub.easymoney.services.admin;

import com.ub.easymoney.utils.UtilsDate.DateClass;
import java.util.Date;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * servicios de utilerias
 *
 * @author Ulises Beltrán Gómez --- beltrangomezulises@gmail.com
 */
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
@Path("/utilerias")
public class Utilerias {

    /**
     * servicio para obtener la fecha hora del servidor
     *
     * @return instancia DateClass
     */
    @Path("/date")
    @GET
    public DateClass fechaServidor() {
        return new DateClass(new Date());
    }

}
