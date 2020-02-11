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
public class GoldCard extends Card {

    public GoldCard(String crdHolder) {
        super(crdHolder);
        Scanner entry;
        entry = new Scanner(System.in);
        System.out.println("GOLD :");
        System.out.println("Turnover : ");
        super.setTurnover(entry.nextInt());
        super.setDisRate(calculateDisRate(super.getTurnover()));
    }

    public double calculateDisRate(int turnover1) {
        if (turnover1 < 100) {
            return (2.0);
        } else {
            double calcDR = 2.0 + (int) (turnover1 / 100);
            if (calcDR >= 10.0) {
                return 10.0;
            } else {
                return calcDR;
            }

        }
    }

    public String toString() {
        return ("Gold card:  Discount rate: " + super.getDisRate() + "%");
    }

}
