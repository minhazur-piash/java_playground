package com.minhaz.java.refactoringtopattern;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {
    private List<Product> products = new ArrayList<>();

    void add(Product product) {
        products.add(product);
    }

    public List<Product> selectBy(Spec spec) {
        List<Product> foundProducts = new ArrayList<>();
        for (Product product : products) {
            if (spec.isSatisfiedBy(product)) {
                foundProducts.add(product);
            }
        }

        return foundProducts;
    }
}
