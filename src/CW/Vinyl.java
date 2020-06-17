/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CW;

/**
 *
 * @author trist_w1549895
 */
public class Vinyl extends musicItem {

    private int speed;
    private int diameter;

    //constructor
    public Vinyl(String itemID, String title, String genre, String artist, Date releaseDate) {
        super(itemID, title, genre, artist, releaseDate);
    }

    //set and getmethods
    public void Vinyl(int speed, int diameter) {
        this.speed = speed;
        this.diameter = diameter;
    }

    public void setSpeed(int speedd) {
        this.speed = speedd;
    }

    public void setDiameter(int diameterr) {
        this.diameter = diameterr;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDiameter() {
        return diameter;
    }

    @Override
    public String getType() {
        return "Vinyl";
    }

}
