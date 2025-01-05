package com.hjg;

import java.util.Map;

record Employee(String name, int id) {}

/**
 * @Description
 * @Author hjg
 * @Date 2025-01-05 12:35
 */
public class Jdk17BasicRecord {

    public static void main(String[] args) {
        var bob = new Employee("Bob Dobbs", 11);
        var dot = new Employee("Dorothy Gale", 9);
        // bob.id = 12; // Error:
        // id has private access in Employee
        System.out.println(bob.name()); // Accessor
        System.out.println(bob.id()); // Accessor
        System.out.println(bob); // toString()
        // Employee works as the key in a Map:
        var map = Map.of(bob, "A", dot, "B");
        System.out.println(map);
    }
}
