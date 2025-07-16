package com.java.neoteric;

public class StaticVsNonStatic {

        static int staticVar = 10;
        int instanceVar = 20;

        public static void main(String[] args) {
            StaticVsNonStatic obj = new StaticVsNonStatic();
            System.out.println("Static Variable: " + StaticVsNonStatic.staticVar);
            System.out.println("Instance Variable: " + obj.instanceVar);
        }
    }


