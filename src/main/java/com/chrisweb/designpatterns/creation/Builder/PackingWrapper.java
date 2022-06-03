package com.chrisweb.designpatterns.creation.Builder;

public class PackingWrapper implements Packing{
    @Override
    public String pack() {
        return "PackingWrapper";
    }
}
