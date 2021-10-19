package com.company;

public class FutureGameWeaponFactory implements GameWeaponFactory{
    @Override
    public PrimaryWeapon createPrimaryWeapon() {
        return new Volk();
    }

    @Override
    public SecondaryWeapon createSecondaryWeapon() {
        return new RPREvo();
    }
}
