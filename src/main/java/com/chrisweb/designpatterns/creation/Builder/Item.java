package com.chrisweb.designpatterns.creation.Builder;

public interface Item {
    public String getName();
    public Packing packing();
    public float getPrice();

}
