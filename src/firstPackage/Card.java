/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstPackage;

/**
 *
 * @author Vladica
 */
public abstract class Card {

    private String cardHolder;
    private int turnover;
    private double discountRate;

    public Card(String crdHolder) {
        this.cardHolder = crdHolder;
    }

    public int getTurnover() {
        return this.turnover;
    }

    public void setTurnover(int newTurnover) {
        this.turnover = newTurnover;
    }

    public double getDisRate() {
        return this.discountRate;
    }

    public void setDisRate(double newDisRate) {
        this.discountRate = newDisRate;
    }

    public double calculateDisRate(int numb) {
        System.out.println("Hello I am abstract class called card "
                + "and I am here to show polymorphism.");
        return 0.0;
    }

    public abstract String toString();

    public String getCrdHolder() {

        return this.cardHolder;
    }
}
