package ru.geekbrains.java_1.lesson6.online;
import java.io.*;
import java.util.Scanner;

public class main {


    public static void main(String[] args) throws IOException{
        String text1 = "To accurately simulate the orbits of the Earth and moon around the sun, we require information " +
                "about the masses of each object and the positional and velocity values of each at any one instant";
        String text2 ="In order to procure the position and velocity values we used the Aerospace Toolbox support package in MATLAB to gather the Ephemeris data." +
                " The data we used as our collection time is 05/05/2020 ," +
                "The following commands were used to collect our values.";


        FileOutputStream file1 = new FileOutputStream("c://temp//File1.txt");
        FileOutputStream file2 = new FileOutputStream("c://temp//File2.txt");

            file1.write(text1.getBytes());
            file2.write(text2.getBytes());
        file1.close();
        file2.close();
        Scanner sc1 = new Scanner(new File("D://desktop//File1.txt"));
        Scanner sc2 = new Scanner(new File("D://desktop//File2.txt"));


        String str[] = new String[3];
        while (sc1.hasNextLine()||sc2.hasNextLine()) {
            str[0] = sc1.nextLine();
            str[1] = sc2.nextLine();
        }
        FileWriter writer = new FileWriter("c://desktop//File3.txt");
        writer.append(str[0]+"\n");
        writer.append(str[1]+"\n");
        writer.flush();
        System.out.println("File has been created");

        FileReader fr = new FileReader(writer);  //Creation of File Reader object
        BufferedReader br = new BufferedReader(fr);

        System.out.println("Please, enter the word you want to search:");
        Scanner in = new Scanner(System.in);
        String word=in.nextLine();




    }

}
