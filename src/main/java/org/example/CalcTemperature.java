package org.example;

/**
 * UCF COP3330 Summer 2021 Assignment 1 Solutions
 * Copyright 2021 Vincent Verapen
 */
public class CalcTemperature
{
    public static void main( String[] args )
    {
        determineType n = new determineType();
        String type = n.getType();
        n.type(type);
    }
}
