package com.driver;

public class Main {
    public static class Product{
        public int product(int x,int y)
        {
            return 1;
        }
        public int product(int x,int y,int z)
        {
            return 2;
        }
        public double product(double x,double y)
        {
            return 3;
        }
   }
    public static void main(String[] args)
    {
        Product p = new Product();
        int ans1 = p.product(1,1);
        int ans2 = p.product(1,1,4);
        double ans3 = p.product(1.0,1.0);
    }
}