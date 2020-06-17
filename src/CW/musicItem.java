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
//class is abstract and comparable 
public abstract class musicItem implements Comparable<musicItem> {

    protected String itemID;
    protected String title;
    protected String genre;
    protected String artist;
    protected int price;
    protected int totalcost;
    protected Date releaseDate;

    //constructor
    public musicItem(String itemID, String title, String genre, String artist, Date releaseDate) {
        this.itemID = itemID;
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.artist = artist;

    }

    //set and get mrthods
    public musicItem(int price) {
        this.price = price;

    }

    public void setPrice(int pricee) {
        price = pricee;
    }

    public void setItemID(String itemId) {
        itemID = itemId;
    }

    public void setReleaseDate(Date d) {
        releaseDate = d;
    }

    public void setTitle(String titlee) {
        title = titlee;
    }

    public void setGenre(String genree) {
        genre = genree;
    }

    public void setArtist(String Artistt) {
        artist = Artistt;
    }

    public String getItemID() {
        return itemID;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getArtist() {
        return artist;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public int getPrice() {
        return price;
    }

    public abstract String getType();

    //compare to sort items by title in alphabetical order 
    @Override
    public int compareTo(musicItem other) {
        int compareInt = this.title.compareTo(other.title);
        if (compareInt < 0) {
            return -1;
        }
        if (compareInt > 0) {
            return 1;
        }
        return 0;
    }
}
