package ru.hw1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        arrayOne();
        arrayTwo();
    }

    public static void arrayOne() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long timeOne = System.currentTimeMillis();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Первые замеры времени: " + (System.currentTimeMillis() - timeOne) + " ms.");
    }

    public static void arrayTwo() {
        int size = 10_000_000;
        float[] arr = new float[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1.0f;
        }
        long timeOne = System.currentTimeMillis();
        float[] leftArry = new float[size / 2];
        float[] rightArry = new float[size / 2];
        System.arraycopy(arr, 0, leftArry, 0, size / 2);
        System.arraycopy(arr, size / 2, rightArry, 0, size / 2);

        MyThreard t1 = new MyThreard() {
            @Override
            public void run() {
                for (int i = 0; i < leftArry.length; i++) {
                    leftArry[i] = (float) (leftArry[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        };
        MyThreard t2 = new MyThreard() {
            @Override
            public void run() {
                for (int i = 0; i < rightArry.length; i++) {
                    rightArry[i] = (float) (rightArry[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
            }
        };
        t1.start();
        t2.start();
        float[] arr2 = new float[size];
        System.arraycopy(leftArry, 0, arr2, 0, size / 2);
        System.arraycopy(rightArry, 0, arr2, size / 2, size / 2);

        System.out.println("Вторые замеры времени: " + (System.currentTimeMillis() - timeOne) + " ms.");
    }
}