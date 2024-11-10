package com.loops;

public class MultiplicationTable {

    public void printTable(int n) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }

    public String getTable(int n) {
        StringBuilder table = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            table.append(n).append(" x ").append(i).append(" = ").append(n * i).append("\n");
        }
        return table.toString().trim();
    }
}
