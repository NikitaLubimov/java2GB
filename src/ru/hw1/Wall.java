package ru.hw1;

public class Wall implements let {
    private int height;

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int let() {
        return getHeight();
    }
}
