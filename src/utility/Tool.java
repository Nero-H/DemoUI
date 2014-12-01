/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package utility;

import java.awt.Font;

/**
 *
 * @author administrasion
 */
public class Tool {
    public static  boolean isNumeric(String str){
        int j = 0;
        for (int i = str.length();--i>=0;){
            char c = str.charAt(i);
            if ((!Character.isDigit(c))&&(c != '.')){
                return false;
            }
            if(c == '.'){
                if(j == 1){
                    return false;
                }
                j++;
            }
        }
        return true;
    }
    
    public static Font getButtonFont(){
        return new Font("KaiTi", 0, 16);
    }
    
    public static Font getTitleFont(){
        return new Font("KaiTi", 0, 24);
    }
}
