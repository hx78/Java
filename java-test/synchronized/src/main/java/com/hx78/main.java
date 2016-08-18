package com.hx78;

import java.io.IOException;

/**
 * Created by linming on 2015/12/15 0015.
 */
public class main {
    public static void main(String[] args) throws IOException {
//        new BufferedWriter(new FileWriter("a.txt"));
//
//        //new BufferedReader(new FileInputStream("a.dat"));
//
//        new GZIPOutputStream(new FileOutputStream("a.zip"));
//
//        new ObjectInputStream(new FileInputStream("a.dat"));

//        Integer lock = -1;
//        try {
//            lock.wait();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

//        double n = 330;
//        double r = n / 1202 * 1.77 * 100;
//        System.out.println(r);

        java.text.DecimalFormat   df=new   java.text.DecimalFormat("#.###");

        double vw = 32.5;
        double px = vw / 100 * 667 / 10;
        System.out.println(df.format(px));
    }
}
