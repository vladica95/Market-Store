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
public class BronzeCard extends Card {

    public BronzeCard(String crdHolder) {
        super(crdHolder);
        Scanner entry;
        entry = new Scanner(System.in);
        System.out.println("BRONZE :");
        System.out.println("Turnover : ");
        super.setTurnover(entry.nextInt());
        super.setDisRate(calculateDisRate(super.getTurnover()));
    }

    public double calculateDisRate(int turnover1) {
        if (turnover1 < 100) {
            return (0.0);
        } else if (turnover1 < 300 && turnover1 >= 100) {
            return (1.0);
        } else {
            return (2.5);
        }
    }

    public String toString() {
        return ("Bronze card:  Discount rate: " + super.getDisRate() + "%");
    }
}
