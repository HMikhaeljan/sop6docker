/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundary.rest;

import javax.ejb.Stateless;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

/**
 *
 * @author 878550
 */
@Stateless
@Path("")
public class aids {

    @GET
    public String test(){
        return "Hahahahahahhahahahhaha docker hahahahhahaha";
    }
    @GET
    @Path("2")
    public String test2(){
        return "De dockerzzz";
    }
}
