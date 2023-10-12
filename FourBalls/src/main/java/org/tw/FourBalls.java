
package org.tw;

import processing.core.PApplet;
public class FourBalls extends PApplet {


    public static final int WIDTH = 640;

    public static final int HEIGHT = 700;

    public static final int DIAMETER = 20;



    public static void main(String[] args) {
        FourBalls fb = new FourBalls();
        PApplet.runSketch(new String[]{"FourBalls"}, fb);
    }


    Ball b1 = new Ball(0, HEIGHT / 5,1);
    Ball b2 = new Ball(0, 2*HEIGHT / 5,2);
    Ball b3 = new Ball(0, 3*HEIGHT / 5,3);
    Ball b4 = new Ball(0, 4*HEIGHT / 5,4);



    @Override
    public void settings() {
        super.settings();
        size(HEIGHT, WIDTH);
    }

    @Override
    public void setup() {
        super.setup();
    }

    private void drawBall(int position, int distance) {
        ellipse(position, distance, DIAMETER, DIAMETER);
    }


    @Override
    public void draw() {

        drawBall(b1.getPosition(), b1.getDistance());
        b1.setPosition(b1.getPosition()+b1.getSpeed());
        drawBall(b2.getPosition(), b2.getDistance());
        b2.setPosition(b2.getPosition()+b2.getSpeed());
        drawBall(b3.getPosition(), b3.getDistance());
        b3.setPosition(b3.getPosition()+b3.getSpeed());
        drawBall(b4.getPosition(), b4.getDistance());
        b4.setPosition(b4.getPosition()+b4.getSpeed());

    }
}

