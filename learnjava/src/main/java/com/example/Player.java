package com.example;

import java.util.ArrayList;

/**
 * Created by Greg on 5/23/2016.
 */
public class Player {

    private String handleName;
    private int lives;
    private int level;
    private int score;
    private Weapon weapon;
    private ArrayList<InventoryItem> inventoryItems;

    public Player(){
        this.handleName = "Unknown player";
        lives = 3;
        level = 1;
        score = 0;
        setDefaultWeapon();
        inventoryItems = new ArrayList<InventoryItem>();
    }

    public Player(String handleName){
        this();
        setHandleName(handleName);
    }

    public Player(String handleName, int level){
        this();
        setHandleName(handleName);
        setLevel(level);
    }

    private void setDefaultWeapon(){
        this.weapon = new Weapon("Sword", 10, 20);
    }

    public String getHandleName(){
        return handleName;
    }

    public void setHandleName(String handleName){
        if(handleName.length() < 4)
            return;

        this.handleName = handleName;
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<InventoryItem> getInventoryItems() {
        return inventoryItems;
    }

//    public void setInventoryItems(ArrayList<InventoryItem> inventoryItems) {
//        this.inventoryItems = inventoryItems;
//    }

    public void addInventoryItem(InventoryItem inventoryItem){
        inventoryItems.add(inventoryItem);
    }

    public boolean dropInventoryItem(InventoryItem inventoryItem){
        if(this.inventoryItems.contains(inventoryItem)){
            inventoryItems.remove(inventoryItem);
            return true;
        }

        return false;

    }
}
