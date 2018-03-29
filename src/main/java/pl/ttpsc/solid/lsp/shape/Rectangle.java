/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.ttpsc.solid.lsp.shape;

/**
 *
 * @author Siwy
 */
public class Rectangle implements IShape {
    
    private final double a, b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2 * a + 2 * b;
    }

    @Override
    public double getSurfaceArea() {
        return a * b;
    }
}
