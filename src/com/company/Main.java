package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setDamage(100);
        boss.setHealth(500);
        boss.setTypeOfProtectionBoss("Physical Protection");

        Weapon weapon = new Weapon();
        weapon.setType("GUN");
        weapon.setName("MARK-9");

        boss.setWeapon(weapon);

        System.out.println(boss.getDamage() + " " +
                boss.getHealth() + " " + boss.getTypeOfProtectionBoss() + " " +
                boss.getWeapon().getType() + " " + boss.getWeapon().getName());

        System.out.println("Health : " + boss.getHealth() + ";" + " " +
                "Damage : " + boss.getDamage() + ";" + " " +
                "Protection : " + boss.getTypeOfProtectionBoss() + ";" + " " +
                "Type of Weapon : " + boss.getWeapon().getType() + ";" + " " +
                "Name of Weapon : " + boss.getWeapon().getName());


    }
}
