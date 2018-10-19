package com.interfaceComputer;

import com.interfaceComputer.computer;
public class computer_Main {

    public static void main(String[] args) {

        //polymorphic object creation
        //type of variable could be class or interface or primitive
        Storage hd = new HardDisk();
        Display mn = new Monitor();
        computer cm = new computer( hd, mn);
    }



}
