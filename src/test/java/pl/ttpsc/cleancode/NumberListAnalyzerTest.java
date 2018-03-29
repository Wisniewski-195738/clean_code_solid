/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.ttpsc.cleancode;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;
import java.util.ArrayList;
import javax.naming.OperationNotSupportedException;

/**
 *
 * @author Siwy
 */
public class NumberListAnalyzerTest {
    
    private final List<Integer> numbers;
    private final List<Integer> noNumbers;
    
    
    public NumberListAnalyzerTest() {
        numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(5);
        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(1);
        
        noNumbers = new ArrayList<>();
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getNumberWeight method, of class NumberListAnalyzer.
     */
    @Test
    public void testGetNumberWeight() {
        System.out.println("getNumberWeight");
        int number = 5;
        NumberListAnalyzer instance = new NumberListAnalyzer(numbers);
        int expResult = 3;
        int result = instance.getNumberWeight(number);
        assertEquals(expResult, result);
    }

    /**
     * Test of getWeightedAverage method, of class NumberListAnalyzer.
     * @throws javax.naming.OperationNotSupportedException
     */
    @Test
    public void testGetWeightedAverage() throws OperationNotSupportedException {
        System.out.println("getWeightedAverage");
        NumberListAnalyzer instance = new NumberListAnalyzer(numbers);
        double expResult = 4.0;
        double result = instance.getWeightedAverage();
        assertEquals(expResult, result, 1);
    }

    /**
     * Test of getWeightedAverage method, of class NumberListAnalyzer.
     * @throws javax.naming.OperationNotSupportedException
     */
    @Test(expected = OperationNotSupportedException.class)
    public void testGetWeightedAverageFromEmptyList() throws OperationNotSupportedException {
        System.out.println("getWeightedAverage");
        NumberListAnalyzer instance = new NumberListAnalyzer(noNumbers);
        instance.getWeightedAverage();
    }

    /**
     * Test of getMin method, of class NumberListAnalyzer.
     */
    @Test
    public void testGetMin() {
        System.out.println("getMin");
        NumberListAnalyzer instance = new NumberListAnalyzer(numbers);
        int expResult = 1;
        int result = instance.getMin();
        assertEquals(expResult, result);
    }

    /**
     * Test of getMax method, of class NumberListAnalyzer.
     */
    @Test
    public void testGetMax() {
        System.out.println("getMax");
        NumberListAnalyzer instance = new NumberListAnalyzer(numbers);
        int expResult = 5;
        int result = instance.getMax();
        assertEquals(expResult, result);
    }
    
}
