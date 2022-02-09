package com.company;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class shape {
    private ArrayList<Double> doubleArrayList;
    private ArrayList<Point> pointArrayList;

    public shape() {
        pointArrayList = new ArrayList<>();
        doubleArrayList = new ArrayList<>();
    }

    public void addPoint(Point point) {
        pointArrayList.add(point);
    }

    public void calculatedistance() {
        for (int i = 0; i < pointArrayList.size() - 1; i++) {
            doubleArrayList.add(pointArrayList.get(i).distance(pointArrayList.get(i + 1)));
        }
    }
}