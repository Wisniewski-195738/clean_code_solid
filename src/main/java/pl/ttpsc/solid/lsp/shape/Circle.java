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
public class Circle implements IShape {

    private final double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    public double getSurfaceArea() {
        return Math.PI * r * r;
    }
}
