package ro.sci;

import org.imgscalr.Scalr;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException
    {

        Scanner scanner = new Scanner(System.in);

//        int myNumber = scanner.nextInt();

//        boolean isEven = isNumberEven(myNumber);
//
//        if (isEven) {
//            System.out.println("Number is even");
//        } else {
//            System.out.println("Number is odd");
//        }

//        System.out.println("Fibonacci n-th step: " + fibonacci(myNumber));

        BufferedImage sourceImage = loadImageFromDisk("E:/poza.png");

        BufferedImage rotatedImage = Scalr.rotate(sourceImage, Scalr.Rotation.CW_90);

        ImageIO.write(rotatedImage, "png", new File("e:/newImage.png"));

    }
// private nimic protected public
    public static BufferedImage loadImageFromDisk(String pathToImage) throws IOException
    {
        File sourceFile = new File(pathToImage);
        return ImageIO.read(sourceFile);
    }

    static long fibonacciFor(int step) {
        if (step == 0 || step == 1 ) {
            return step;
        }
        long prePrevious = 0;
        long previous = 1;
        for (int i = 2; i<= step; i++) {
            long currentValue = previous + prePrevious;
            prePrevious = previous;
            previous = currentValue;
        }
        return previous;
    }

    public static long fibonacci(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        return fibonacci(n-1) + fibonacci(n-2);
    }

    static boolean isNumberEven(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

}
