package org.tw;

public class Ball {
    private int position;
    private int distance;
    private int speed;

    public Ball(int position, int distance, int speed) {
        this.position = position;
        this.distance = distance;
        this.speed = speed;

    }

    public int getPosition() {
        return position;
    }

    public int getDistance() {
        return distance;
    }

    public int getSpeed() {
        return speed;
    }

    public void setPosition(int position) {
        this.position = position;
    }

}

