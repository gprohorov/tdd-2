package edu.pro.tdd2;
/*
  @author   george
  @project   tdd-2
  @class  Rectangle
  @version  1.0.0 
  @since 06.02.23 - 15.41
*/

public class Rectangle {
    private int sideA;
    private int sideB;

    public Rectangle() {
    }

    public Rectangle(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }



    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                '}';
    }

    public int getArea() {
        return this.getSideA() * this.getSideB();
    }

    public double getDiagonal() {
        return Math.sqrt(sideA * sideA + sideB * sideB);
    }
}
