/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package chapter7;

import javax.swing.JFrame;

/**
 *
 * @author REZAUL KARIM
 */
public class DrawRainbowTest1 {
    public static void main(String[] args) {

        DrawRainbow panel = new DrawRainbow();

        JFrame application = new JFrame();

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        application.add(panel);

        application.setSize(400, 250);

        application.setVisible(true);
    }
}
