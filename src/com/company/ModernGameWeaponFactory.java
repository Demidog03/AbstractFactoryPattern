package com.company;

public class ModernGameWeaponFactory implements GameWeaponFactory{
    @Override
    public PrimaryWeapon createPrimaryWeapon() {
        return new M4A1();
    }

    @Override
    public SecondaryWeapon createSecondaryWeapon() {
        return new MP5();
    }
}
