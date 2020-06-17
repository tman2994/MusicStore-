/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author trist_w1549895
 */
public class WestminsterMusicStoreManager implements musicStore {

    private ArrayList<musicItem> musicList;
    private int numOfCD = 500;
    private int numOfVinyl = 500;
    private int numItems = 1;
    

//constructer for creating storage limit
    public WestminsterMusicStoreManager(int numOfCD, int numOfVinyl) {
        this.numOfCD = numOfCD;
        this.numOfVinyl = numOfVinyl;
        //this.numOfSpace = numOfSpace;
        musicList = new ArrayList<musicItem>();

    }

//method to print item    
    public void printMusicItem() {
        for (int i = 0; i < musicList.size(); i++) {

            if (musicList.get(i).getType().equals("CD")) {
                System.out.println("itemID " + musicList.get(i).getItemID() + " title " + musicList.get(i).getTitle()
                        + " Genre " + musicList.get(i).getGenre() + " ReleaseDate " + musicList.get(i).getReleaseDate()
                        + " Artist " + musicList.get(i).getArtist() + "\n");

            }

            if (musicList.get(i).getType().equals("Vinyl")) {
                System.out.println("itemID " + musicList.get(i).getItemID() + " title " + musicList.get(i).getTitle()
                        + " Genre " + musicList.get(i).getGenre() + " ReleaseDate " + musicList.get(i).getReleaseDate()
                        + " Artist " + musicList.get(i).getArtist() + "\n");
            }
        }
    }

    //method to add item
    public void addItem(musicItem type) {

        if (musicList.size() < numOfCD + numOfVinyl) {
            musicList.add(type);
            System.out.println("Free space = " + (numOfCD + numOfVinyl - musicList.size()) + "\n");
        } else {
            System.out.println("No More Space to Store Music");
        }
    }

    //method to delete item
    public void deleteItem(String delItemID) {
        for (int i = 0; i < musicList.size(); i++) {
            if (musicList.get(i).getItemID().equals(delItemID)) {
                System.out.println("Item deleted was " + musicList.get(i).getItemID());
                System.out.println("Free space = " + (numOfCD + numOfVinyl - musicList.size()) + "\n");
            } else {
                System.out.println("item not removed");
            }
            musicList.remove(i);
        }
    }

    //method to sort item 
    public void sortItem() {

        Collections.sort(musicList);
        for (int i = 0; i < musicList.size(); i++) {
            String title = musicList.get(i).getTitle();
            System.out.println(title + "Music list has been sorted");
            break;
        }
    }

    //method to buy item
    public void buyItem(String bList) {
        int p = 0;
        int total;
        for (int i = 0; i < musicList.size(); i++) {
            if (musicList.get(i).getItemID().equals(bList)) {
                p = musicList.get(i).getPrice();
            } else {
                System.out.println("Please buy item with correct Id");
            }
            total = p;
            System.out.println("amount spent is £" + total + "\n");
        }
    }

    //method to run program this is what the user will see
    public boolean runMenu() {

        boolean exit = false;

        System.out.println("To Add Items to the Store press 1 ");
        System.out.println("To delete Item from Store press 2 ");
        System.out.println("To print the list of all Items stored press 3 ");
        System.out.println("To buy Item from Database press 4 ");
        System.out.println("To sort Item from Database press 5 ");
        System.out.println("");
        System.out.println("To exit press 6 \n ");

        Scanner s = new Scanner(System.in);
        int choise = s.nextInt();

        switch (choise) {
            case 1: //this is first menu 
                System.out.println("Press 1 if you want to add a CD ");
                System.out.println("Press 2 if you want to add a Vinyl ");
//the code launchs the switch caes that have been put inside the parent switch case "choise"
                int choise2 = s.nextInt();
                s.nextLine();
                System.out.println("Enter the item ID ");
                String itemID = s.nextLine();

                System.out.println("Enter the Title ");
                String title = s.nextLine();

                System.out.println("Enter the Genre ");
                String genre = s.nextLine();

                System.out.println("Enter the ReleaeseDate ");
                System.out.println("First Enter Day ");
                int day = s.nextInt();
                System.out.println("Enter Month ");
                int month = s.nextInt();
                System.out.println("Enter Year ");
                int year = s.nextInt();
                Date releaseDate = new Date(day, month, year);

                System.out.println("Enter the Artist ");
                String artist = s.next();

                System.out.println("Enter the Price ");
                int price = s.nextInt();

                switch (choise2) {

                    case 1:
                        // it is a CD
                        System.out.println("Enter the duration ");
                        int duration = s.nextInt();

                        CD d = new CD(itemID, title, genre, artist, releaseDate);
                        d.setPrice(price);
                        d.setDuration(duration);
                        this.addItem(d);
                        numItems = numItems + 1;
                        break;

                    case 2:
                        // it is a vinyl
                        System.out.println("Enter the speed ");
                        int speed = s.nextInt();

                        System.out.println("Enter the diameter ");
                        int diameter = s.nextInt();

                        Vinyl v = new Vinyl(itemID, title, genre, artist, releaseDate);
                        v.setPrice(price);
                        v.setDiameter(diameter);
                        v.setSpeed(speed);
                        this.addItem(v);
                        numItems = numItems + 1;
                        break;
                }
                break;

            case 2:
                System.out.println("delete item ");
                String delItemID = s.next();
                this.deleteItem(delItemID);
                break;

            case 3:
                this.printMusicItem();
                break;

            case 4:
                System.out.println("Please insert ItemID to buy ");
                String ID = s.next();
                this.buyItem(ID);
                break;

            case 5:
                System.out.println("Sort method ");
                this.sortItem();
                break;

            case 6:
                exit = true;
                break;

        }

        return exit;

    }

    //main class to launch program
    public static void main(String[] args) {
        // create a parking 
        musicStore sys = new WestminsterMusicStoreManager(500, 500);
        boolean exit = false;

        while (!exit) {
            exit = sys.runMenu();
        }
    }
}
