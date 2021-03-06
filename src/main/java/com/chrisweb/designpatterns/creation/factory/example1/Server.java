package com.chrisweb.designpatterns.creation.factory.example1;

public class Server extends Computer{

    private String ram;
    private String hdd;
    private String cpu;

    public Server(String ram, String hdd, String cpu) {

        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getHdd() {
        return this.hdd;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }

    @Override
    public String toString() {
        return "RAM ::" + getRam() + " | HDD :: " + getHdd() + " | CPU " + getCpu();
    }
}
