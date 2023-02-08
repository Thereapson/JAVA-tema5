package com.interfaces;

public class CocheCRUDImpl implements CocheCRUD{

    @Override
    public void save() {
        System.out.println("Metohd save");
    }

    @Override
    public void findAll() {
        System.out.println("Metohd findAll");
    }

    @Override
    public void delete() {
        System.out.println("Method delete");
    }
}
