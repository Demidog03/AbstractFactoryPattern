package com.company;

public class MedievalGameWeaponFactory implements GameWeaponFactory{
    @Override
    public PrimaryWeapon createPrimaryWeapon() {
        return new Longbow();
    }

    @Override
    public SecondaryWeapon createSecondaryWeapon() {
        return new Knife();
    }
}
