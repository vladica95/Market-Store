/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstPackage;

import java.util.Scanner;

/**
 *
 * @author Vladica
 */
public class Main {

    public static void main(String[] args) {

        Client firstClient = new Client("Mark");
        PayDesk.output(firstClient);

        Client secondClient = new Client("John");
        PayDesk.output(secondClient);

        Client thirdClient = new Client("Peter");
        PayDesk.output(thirdClient);
    }

}
