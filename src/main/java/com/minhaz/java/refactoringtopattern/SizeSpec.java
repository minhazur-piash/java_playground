package com.minhaz.java.refactoringtopattern;

public class SizeSpec implements Spec {
    private final ProductSize size;

    public SizeSpec(ProductSize size) {
        this.size = size;
    }

    public ProductSize getSize() {
        return size;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        return size == product.getSize();
    }
}
