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
public class SilverCard extends Card {

    public SilverCard(String crdHolder) {
        super(crdHolder);
        Scanner entry;
        entry = new Scanner(System.in);
        System.out.println("SILVER :");
        System.out.println("Turnover : ");
        super.setTurnover(entry.nextInt());
        super.setDisRate(calculateDisRate(super.getTurnover()));
    }

    public double calculateDisRate(int turnover1) {
        if (turnover1 > 300) {
            return (3.5);
        } else {
            return (2.0);
        }
    }

    public String toString() {
        return ("Silver card:  Discount rate: " + super.getDisRate() + "%");
    }

}
