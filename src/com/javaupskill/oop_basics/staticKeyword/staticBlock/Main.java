package com.javaupskill.oop_basics.staticKeyword.staticBlock;
class Game{
    static String deploy;
    static int announce = 5;

    static {
        deploy = "All troops deploy";
        System.out.println("Welcome to Mobile Legends");
        System.out.println(Game.announce + " seconds 'til the enemy reaches the battlefield, smash them!");
    }
}
public class Main {
    public static void main(String[] args){
        System.out.println(Game.deploy);
    }
}
