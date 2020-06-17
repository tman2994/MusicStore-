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
public class CD extends musicItem {

    private int duration;
    
    //constructor
    public CD(String itemID, String title, String genre, String artist, Date releaseDate) {
        super(itemID, title, genre, artist, releaseDate);
    }

    //set and get methods
    public void setDuration(int durationn) {
        this.duration = durationn;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String getType() {
        return "CD";
    }

}
