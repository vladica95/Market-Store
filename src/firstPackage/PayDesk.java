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
public class PayDesk {

    public PayDesk() {

    }

    private static void purchase(Client client, double purchaseValue) {
        System.out.println("Output:");
        System.out.println(client.getCard().toString());
        System.out.println("Purchase value: " + "$" + purchaseValue);
        double discount = client.getCard().getDisRate() * purchaseValue / 100;
        System.out.println("Discount: " + "$" + discount);
        System.out.println("Total: " + "$" + (purchaseValue - discount));
        System.out.println();
    }

    public static void output(Client client) {

        Scanner entry;
        entry = new Scanner(System.in);
        System.out.println("Enter purchase value:");
        double purchaseValue = entry.nextDouble();
        purchase(client, purchaseValue);
        System.out.println();

    }

}
