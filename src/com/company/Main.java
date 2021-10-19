package com.company;

public class Main {

    public static void main(String[] args) {
	    GameWeaponFactory factory = new FutureGameWeaponFactory();
        PrimaryWeapon primaryWeapon =factory.createPrimaryWeapon();
        SecondaryWeapon secondaryWeapon = factory.createSecondaryWeapon();
        primaryWeapon.display();
        secondaryWeapon.display();
        System.out.println();
        factory = new WW2GameWeaponFactory();
        primaryWeapon = factory.createPrimaryWeapon();
        secondaryWeapon = factory.createSecondaryWeapon();
        primaryWeapon.display();
        secondaryWeapon.display();

    }
}
