package com.company;

public class WW2GameWeaponFactory implements GameWeaponFactory{
    @Override
    public PrimaryWeapon createPrimaryWeapon() {
        return new M1Garand();
    }

    @Override
    public SecondaryWeapon createSecondaryWeapon() {
        return new Mauser();
    }
}
