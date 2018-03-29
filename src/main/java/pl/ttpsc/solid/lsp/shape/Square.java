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
public class Square implements IShape {
    
    private final double a;

    public Square(double a) {
        this.a = a;
    }
    
    @Override
    public double getPerimeter() {
        return 4 * a;
    }

    @Override
    public double getSurfaceArea() {
        return a * a;
    }
}
