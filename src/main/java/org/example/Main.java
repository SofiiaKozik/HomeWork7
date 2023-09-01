package org.example;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //HttpStatusChecker httpStatusChecker = new HttpStatusChecker();
       // System.out.println(httpStatusChecker.getStatusImage(400));
        //HttpStatusImageDownloader httpStatusImageDownloader = new HttpStatusImageDownloader();
        //httpStatusImageDownloader.downloadStatusImage(200);
        try {
            HttpImageStatusCli httpImageStatusCli = new HttpImageStatusCli();
            httpImageStatusCli.donloadIm();
        } catch (RuntimeException e) {
            System.err.println("Image not found");
        }



    }
}