package com.company;

public class Main {

    public static void main(String[] args) {

        Boss boss = new Boss();
        boss.setHealth(700);
        boss.setDamage(150);
        boss.setBossDefenceType("Magical");
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getBossDefenceType());



    }
}
