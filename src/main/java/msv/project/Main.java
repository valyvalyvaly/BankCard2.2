package msv.project;

import msv.project.credit.CreditCardWithCashback;
import msv.project.credit.CreditCardWithPoints;
import msv.project.credit.CreditCardWithSavings;
import msv.project.debit.DebitCardWithCashback;
import msv.project.debit.DebitCardWithPoints;
import msv.project.debit.DebitCardWithSavings;

public class Main {
    public static void main(String[] args) {
        CreditCardWithSavings cardWithSavings = new CreditCardWithSavings(10000, 10000);
        cardWithSavings.topUp(5000);
        System.out.println(cardWithSavings.getAvailableFundsInfo());
        cardWithSavings.topUp(3000);
        System.out.println(cardWithSavings.getAvailableFundsInfo());
        cardWithSavings.topUp(2000);
        System.out.println(cardWithSavings.getAvailableFundsInfo());
        cardWithSavings.pay(5000);
        System.out.println(cardWithSavings.getAvailableFundsInfo());
        cardWithSavings.pay(3000);
        System.out.println(cardWithSavings.getAvailableFundsInfo());
        cardWithSavings.pay(2000);
        System.out.println(cardWithSavings.getAvailableFundsInfo());
        cardWithSavings.pay(20000);
        System.out.println(cardWithSavings.getAvailableFundsInfo());
//        ===============================================================
        CreditCardWithPoints creditCardWithPoints = new CreditCardWithPoints(10000,10000);
        creditCardWithPoints.topUp(5000);
        System.out.println(creditCardWithPoints.getAvailableFundsInfo());
        creditCardWithPoints.topUp(3000);
        System.out.println(creditCardWithPoints.getAvailableFundsInfo());
        creditCardWithPoints.topUp(2000);
        System.out.println(creditCardWithPoints.getAvailableFundsInfo());
        creditCardWithPoints.pay(5000);
        System.out.println(creditCardWithPoints.getAvailableFundsInfo());
        creditCardWithPoints.pay(3000);
        System.out.println(creditCardWithPoints.getAvailableFundsInfo());
        creditCardWithPoints.pay(2000);
        System.out.println(creditCardWithPoints.getAvailableFundsInfo());
        creditCardWithPoints.pay(20000);
        System.out.println(creditCardWithPoints.getAvailableFundsInfo());
//      ===================================================================
        CreditCardWithCashback creditCardWithCashback = new CreditCardWithCashback(10000,10000);
        creditCardWithCashback.topUp(5000);
        System.out.println(creditCardWithCashback.getAvailableFundsInfo());
        creditCardWithCashback.topUp(3000);
        System.out.println(creditCardWithCashback.getAvailableFundsInfo());
        creditCardWithCashback.topUp(2000);
        System.out.println(creditCardWithCashback.getAvailableFundsInfo());
        creditCardWithCashback.pay(5000);
        System.out.println(creditCardWithCashback.getAvailableFundsInfo());
        creditCardWithCashback.pay(3000);
        System.out.println(creditCardWithCashback.getAvailableFundsInfo());
        creditCardWithCashback.pay(2000);
        System.out.println(creditCardWithCashback.getAvailableFundsInfo());
        creditCardWithCashback.pay(20000);
        System.out.println(creditCardWithCashback.getAvailableFundsInfo());
//      =================================================================
//      =================================================================
        DebitCardWithSavings debitCardWithSavings = new DebitCardWithSavings(10000);
        debitCardWithSavings.topUp(5000);
        System.out.println(debitCardWithSavings.getAvailableFundsInfo());
        debitCardWithSavings.topUp(3000);
        System.out.println(debitCardWithSavings.getAvailableFundsInfo());
        debitCardWithSavings.topUp(2000);
        System.out.println(debitCardWithSavings.getAvailableFundsInfo());
        debitCardWithSavings.pay(5000);
        System.out.println(debitCardWithSavings.getAvailableFundsInfo());
        debitCardWithSavings.pay(3000);
        System.out.println(debitCardWithSavings.getAvailableFundsInfo());
        debitCardWithSavings.pay(2000);
        System.out.println(debitCardWithSavings.getAvailableFundsInfo());
        debitCardWithSavings.pay(20000);
        System.out.println(debitCardWithSavings.getAvailableFundsInfo());
//      =================================================================
        DebitCardWithPoints debitCardWithPoints = new DebitCardWithPoints(10000);
        debitCardWithPoints.topUp(5000);
        System.out.println(debitCardWithPoints.getAvailableFundsInfo());
        debitCardWithPoints.topUp(3000);
        System.out.println(debitCardWithPoints.getAvailableFundsInfo());
        debitCardWithPoints.topUp(2000);
        System.out.println(debitCardWithPoints.getAvailableFundsInfo());
        debitCardWithPoints.pay(5000);
        System.out.println(debitCardWithPoints.getAvailableFundsInfo());
        debitCardWithPoints.pay(3000);
        System.out.println(debitCardWithPoints.getAvailableFundsInfo());
        debitCardWithPoints.pay(2000);
        System.out.println(debitCardWithPoints.getAvailableFundsInfo());
        debitCardWithPoints.pay(20000);
        System.out.println(debitCardWithPoints.getAvailableFundsInfo());
//      =================================================================
        DebitCardWithCashback debitCardWithCashback = new DebitCardWithCashback(10000);
        debitCardWithCashback.topUp(5000);
        System.out.println(debitCardWithCashback.getAvailableFundsInfo());
        debitCardWithCashback.topUp(3000);
        System.out.println(debitCardWithCashback.getAvailableFundsInfo());
        debitCardWithCashback.topUp(2000);
        System.out.println(debitCardWithCashback.getAvailableFundsInfo());
        debitCardWithCashback.pay(5000);
        System.out.println(debitCardWithCashback.getAvailableFundsInfo());
        debitCardWithCashback.pay(3000);
        System.out.println(debitCardWithCashback.getAvailableFundsInfo());
        debitCardWithCashback.pay(2000);
        System.out.println(debitCardWithCashback.getAvailableFundsInfo());
        debitCardWithCashback.pay(20000);
        System.out.println(debitCardWithCashback.getAvailableFundsInfo());


    }
}
