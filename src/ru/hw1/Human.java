package ru.hw1;

public class Human implements Action {
    private int speed;
    private int maxJump;


    public Human(int speed, int maxJump) {
        this.speed = speed;
        this.maxJump = maxJump;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMaxJump() {
        return maxJump;
    }

    @Override
    public boolean run(int distance) {
        if (getSpeed() > distance) {
            System.out.println("Человек пробежал");
            return true;
        } else {
            System.out.println("Человек не смог пробежать");
            return false;
        }
    }

    @Override
    public boolean jump(int height) {
        if (getMaxJump() > height) {
            System.out.println("Человек смог перепрыгнуть");
            return true;
        } else {
            System.out.println("Человек не смог перепрыгнуть");
            return false;
        }
    }
}
