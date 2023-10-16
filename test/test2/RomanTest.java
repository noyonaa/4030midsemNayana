/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nayana Das
 */
public class RomanTest {
    
    public RomanTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    @Test
    public void testRomanToInt() {
    Roman roman = new Roman(); // Create an instance of the Roman class

        // Test cases for single Letters
        assertEquals(1, roman.romanToInt("I"));
        assertEquals(5, roman.romanToInt("V"));
        assertEquals(10, roman.romanToInt("X"));
        assertEquals(50, roman.romanToInt("L"));
        assertEquals(100, roman.romanToInt("C"));
        assertEquals(500, roman.romanToInt("D"));
        assertEquals(1000, roman.romanToInt("M"));

        // Test cases for repetition
        assertEquals(2, roman.romanToInt("II"));
        assertEquals(20, roman.romanToInt("XX"));

        // Test cases for subtractive notation
        assertEquals(4, roman.romanToInt("IV"));
        assertEquals(9, roman.romanToInt("IX"));

        // Test cases for numerals with and without subtractive notation
        assertEquals(14, roman.romanToInt("XIV"));
        assertEquals(19, roman.romanToInt("XIX"));

        // Test cases for more complex Roman numerals
        assertEquals(1984, roman.romanToInt("MCMLXXXIV"));
        assertEquals(3999, roman.romanToInt("MMMCMXCIX"));
        
        //Test cases for invalid characters
        assertEquals(0, roman.romanToInt("Z"));
        
        //not valid
        assertEquals(0, roman.romanToInt("VV"));
        
        //Invalid and valid
        assertEquals(0, roman.romanToInt("VZI"));
        
        //First number
        assertEquals(1, roman.romanToInt("I"));
        
        //test case for null
        assertEquals(0, roman.romanToInt(""));
    }

    /**
     * Test of romanToInt method, of class Roman.
     */
   
    
}
