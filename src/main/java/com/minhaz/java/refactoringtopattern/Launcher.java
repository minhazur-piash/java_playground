package com.minhaz.java.refactoringtopattern;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class Launcher {

    public static void main(String[] args) {
        Product bottle = new Product(UUID.randomUUID(), "Quechua", Color.RED, ProductSize.LARGE);
        Product mug = new Product(UUID.randomUUID(), "RFL", Color.GREEN, ProductSize.MEDIUM);

        ProductRepository repository = new ProductRepository();
        repository.add(bottle);
        repository.add(mug);

        ColorSpec redSpec = new ColorSpec(Color.RED);
        SizeSpec smallSpec = new SizeSpec(ProductSize.LARGE);

        List<Product> products = repository.selectBy(redSpec);
        System.out.println("red products = " + products.size());

        List<Product> foundProducts = repository.selectBy(
                new CompositeSpec(Arrays.asList(redSpec, smallSpec))
        );
        System.out.println("red, green, blue products = " + foundProducts.size());

    }
}
