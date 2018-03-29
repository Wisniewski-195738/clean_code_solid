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
public class RightTriangle implements IShape {
    
    private final double a, b, c;

    public RightTriangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.c = Math.sqrt(a * a + b * b);
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }

    @Override
    public double getSurfaceArea() {
        return a * b / 2.0d;
    }
}
