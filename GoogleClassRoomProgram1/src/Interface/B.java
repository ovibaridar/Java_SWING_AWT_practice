/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Ovi
 */
public class B implements A.NestedIF {

    /**
     *
     * @param x
     * @return
     */
    @Override
     public boolean isNotNegative(int x) {
    return x < 0 ? false: true;
    }
     public boolean ispsitive(int m) {
    return m > 0 ? false: true;
    }
     
    
}
