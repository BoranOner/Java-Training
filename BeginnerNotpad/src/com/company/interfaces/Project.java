package com.company.interfaces;

public class Project {

    interface Test {
        void nothing();
        default void nothing1(){

        }
    }
    class Class1 implements Test{

        @Override
        public void nothing() {

        }
    }
    class Class2 implements Test{

        @Override
        public void nothing() {

        }
    }


    public static void main(String[] args) {
        ComplexAlgorithm algorithm = new RealAlgorithm();
        System.out.println(algorithm.ComplexAlgorithm(10,20));
    }
}