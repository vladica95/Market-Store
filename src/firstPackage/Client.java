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
public class Client {

    private String clientName;
    private Card discountCard;

    public Client(String clntName) {
        this.clientName = clntName;
        Scanner entry;
        entry = new Scanner(System.in);
        int typeOfCard = 0;
        while (typeOfCard != 1 && typeOfCard != 2 && typeOfCard != 3) {
            System.out.println("Select type of discount card: ");
            System.out.println("1 for bronze card, 2 for silver card or 3 for gold card");
            typeOfCard = entry.nextInt();
            if (typeOfCard == 1) {
                this.discountCard = new BronzeCard(clntName);
            } else if (typeOfCard == 2) {
                this.discountCard = new SilverCard(clntName);
            } else if (typeOfCard == 3) {
                this.discountCard = new GoldCard(clntName);
            } else {
                System.out.println("You entered undefined type of card!");
                System.out.println("Try again!");
            }
        }
    }

    public Card getCard() {

        return this.discountCard;
    }

}
