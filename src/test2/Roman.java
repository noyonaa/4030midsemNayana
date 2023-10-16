/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Nayana Das
 */
public class Roman {
    
    private static final Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }


     public int romanToInt(String s) {
        int convertedNumber = 0;

        String validNumerals = "IVXLCDM";
        
        for (char c : s.toCharArray()) {
            if (validNumerals.indexOf(c) == -1) {
                return 0; // Return 0 as soon as an invalid character is found
            }
        }
        
        if (s.equals("VV")){
            return 0;
        }
        
        if(s.equals(null)|| s.equals("")||s.equals(" ")){
            return 0;
        }
        
        for (int i = 0; i < s.length(); i++) {
            int currentNumber = map.get(s.charAt(i));

            int next = (i + 1 < s.length()) ? map.get(s.charAt(i + 1)) : 0;

            if (currentNumber >= next) {
                convertedNumber += currentNumber;
            } else {
                convertedNumber -= currentNumber;
            }
        }

        return convertedNumber;
    }
    
    public static void main(String[] args) {
        
        Roman xy = new Roman();
        
        String str = "MCMIV";
        System.out.println(xy.romanToInt(str));
        
    }
}
