package org.example;

import liquibase.database.DatabaseFactory;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        DatabaseFactory.getInstance();
    }
}