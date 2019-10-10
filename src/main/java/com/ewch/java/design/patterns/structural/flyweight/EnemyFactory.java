package com.ewch.java.design.patterns.structural.flyweight;

import java.util.HashMap;

public class EnemyFactory {

    private static HashMap<String, Enemy> enemyHashMap = new HashMap<>();

    public static Enemy getEnemy(String type) {
        Enemy enemy = null;
        if (enemyHashMap.containsKey(type)) {
            enemy = enemyHashMap.get(type);
        } else {
            switch (type) {
                case "Private":
                    System.out.println("Private has created.");
                    enemy = new Private();
                    break;
                case "Detective":
                    System.out.println("Detective has created.");
                    enemy = new Detective();
                    break;
                default:
                    System.out.println("Enemy has not been created.");
            }
            enemyHashMap.put(type, enemy);
        }
        return enemy;
    }
}
