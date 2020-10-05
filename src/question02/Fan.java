/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question02;

/**
 *
 * @author Sai varsha Vellanki
 */
public class Fan {
  // Give SLOW,MEDIUM,FAST as CONSTANTS hence these were initialized as final
    private static final int SLOW = 1;
    private static final int MEDIUM = 2;
    private static final int FAST = 3;
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    /**
     *
     * @return
     */
    public int getSpeed() {
        return speed;
    }

    /**
     *
     * @param speed
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     *
     * @return
     */
    public boolean isOn() {
        return on;
    }

    /**
     *
     * @param on
     */
    public void setOn(boolean on) {
        this.on = on;
    }

    /**
     *
     * @return
     */
    public double getRadius() {
        return radius;
    }

    /**
     *
     * @param radius
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     *
     * @return
     */
    public String getColor() {
        return color;
    }

    /**
     *
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     *
     */
    public Fan() {

    }

    @Override
    public String toString() {

        if (on) {
            return "Fan Details: " + "   Fan Speed: " + getSpeed() + "   Fan Radius: " + getRadius() + "   Fan Color: " + getColor();

        } else {
            return "Fan is off: "+"   Fan Radius: " + getRadius() + "   Fan Color: " + getColor();
        }
    }

}
