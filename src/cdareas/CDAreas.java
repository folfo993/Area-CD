    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdareas;

/**
 *
 * @author FOLFO
 */
public class CDAreas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Modelo mod = new Modelo();
        Vista.askType(mod);
        ClaseLogica.shapeType(mod);
    }
    
}
