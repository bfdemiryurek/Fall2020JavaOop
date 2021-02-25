/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fall2020wednesdayoop;

/**
 *
 * @author Lenova
 */
public class Dogs extends Animals{

    @Override
    public void dogs() {
        System.out.println("Dogs bark");
    }

    @Override
    public void cats() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
