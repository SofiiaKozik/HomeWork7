package org.example;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HttpImageStatusCli {

    public void donloadIm() throws IOException {
        Scanner scanner = new Scanner(System.in);
        int code;
        System.out.print("Enter HTTP status code ");
        do{
            String text = scanner.next();
            code = checkStatus(text);
        } while (code == -1);

        HttpStatusImageDownloader httpStatusImageDownloader = new HttpStatusImageDownloader();
        httpStatusImageDownloader.downloadStatusImage(code);
        scanner.close();
    }

    private int checkStatus(String text) throws IOException {
        int code = -1;
        try {
            code = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.err.println("Please enter a valid number.");
        }
        return code;
    }


}
