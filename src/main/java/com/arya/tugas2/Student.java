package com.arya.tugas2;

public class Student {
    private Integer nrp;
    private String nama;

    public Student(Integer nrp, String nama) {
        this.nrp = nrp;
        this.nama = nama;
    }

    public Integer getNrp() {
        return nrp;
    }

    public void setNrp(Integer nrp) {
        this.nrp = nrp;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    @Override
    public String toString() {
        return nama;
    }
}
