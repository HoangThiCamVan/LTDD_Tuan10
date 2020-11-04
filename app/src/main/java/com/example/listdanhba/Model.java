package com.example.listdanhba;

public class Model {
    int id,image;
    String name,sodt;

    public Model(int id, int image, String name, String sodt) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.sodt = sodt;
    }

    public Model() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSdt() {
        return sodt;
    }

    public void setSdt(String sdt) {
        this.sodt = sdt;
    }
}
