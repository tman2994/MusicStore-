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
public interface musicStore {

    //abstract methods 
    public abstract void addItem(musicItem type);

    public abstract void deleteItem(String delItemID);

    public abstract void printMusicItem();

    public abstract void sortItem();

    public abstract boolean runMenu();

}
