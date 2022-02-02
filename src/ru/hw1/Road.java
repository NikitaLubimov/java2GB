package ru.hw1;

public class Road implements let{
    private int distance;

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public int let() {
        return getDistance();
    }
}

