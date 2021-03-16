package com.minhaz.java.refactoringtopattern;

import java.util.ArrayList;
import java.util.List;

public class CompositeSpec implements Spec {
    private List<Spec> specs = new ArrayList<>();

    public CompositeSpec(List<Spec> specs) {
        this.specs = specs;
    }

    public List<Spec> getSpecs() {
        return specs;
    }

    @Override
    public boolean isSatisfiedBy(Product product) {
        boolean satisfiesAllSpecs = true;
        for (Spec spec : specs) {
            satisfiesAllSpecs &= spec.isSatisfiedBy(product);
        }
        return satisfiesAllSpecs;
    }
}
