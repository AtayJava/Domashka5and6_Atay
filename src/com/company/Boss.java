package com.company;

public class Boss extends GameEntity {
    private String typeOfProtectionBoss;
    Weapon weapon = new Weapon();


    public String getTypeOfProtectionBoss() {
        return typeOfProtectionBoss;
    }

    public void setTypeOfProtectionBoss(String typeOfProtectionBoss) {
        this.typeOfProtectionBoss = typeOfProtectionBoss;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

}
