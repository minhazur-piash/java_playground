package com.minhaz.java.refactoringtopattern;

import java.util.UUID;

public class Product {
    private UUID id;
    private String name;
    private Color color;
    private ProductSize size;

    public Product(UUID id, String name, Color color, ProductSize size) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.size = size;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ProductSize getSize() {
        return size;
    }

    public void setSize(ProductSize size) {
        this.size = size;
    }
}
