/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planeadordecitas;

/**
 *
 * @author admin
 */
public class Jour {

    public Jour(String date, String name, Creneau[] creneau) {
        this.date = date;
        this.name = name;
        this.creneau = creneau;
    }
    private String date;
    private String name;
    private Creneau creneau[]; 
}
