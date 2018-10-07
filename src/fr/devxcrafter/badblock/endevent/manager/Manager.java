package fr.devxcrafter.badblock.endevent.manager;

import fr.devxcrafter.badblock.endevent.Main;

public class Manager {

    private Main main;

    public Manager(Main main){
        this.main = main;
    }

    private static int counter;

    public int getCounter(){
        return counter;
    }

    

}
