package model;

/**
 * Created by Alex on 07/07/2015.
 */
public class Compra {

//Classe alterada no branch devDemo
    private String item;
    private int amount;

    public Compra() {
    }

    public static Compra createCompra(String item,int amount) {

        Compra compra = new Compra();
        compra.item = item;
        compra.amount = amount;

        return  compra;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
