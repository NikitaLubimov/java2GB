package ru.hw1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();

        Road road1 = new Road();
        Wall wall1 = new Wall();

        road1.setDistance(r.nextInt(4));
        wall1.setHeight(r.nextInt(5));

        Cat cat1 = new Cat(2, 5);
        Human human1 = new Human(1, 7);
        Robot robot1 = new Robot(4, 4);

        Action[] actionsArry = new Action[]{cat1, human1, robot1};
        let[] letArry = new let[]{road1, wall1};

        for (int i = 1; i <letArry.length; i++) {
            for (int j = 0; j <actionsArry.length ; j++) {
                if (!actionsArry[j].run(letArry[i].let())) {
                    continue;
                };
                actionsArry[j].jump(letArry[i].let());
            }
        }
    }
}