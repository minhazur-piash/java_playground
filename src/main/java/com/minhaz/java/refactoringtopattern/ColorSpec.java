package com.minhaz.java.refactoringtopattern;

public class ColorSpec implements Spec {
    private Color color;

    public ColorSpec(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        return this.color == product.getColor();
    }
}
