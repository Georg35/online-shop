package pro.sky.homework210;

import org.springframework.context.annotation.Scope;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;


@SessionScope
public class Basket {

    private ArrayList<Integer> basket;
    public Basket(ArrayList<Integer> basket) {
        this.basket = basket;
    }

    public void addInBasket(ArrayList<Integer> bask) {

        basket.addAll(bask);
    }
    public ArrayList<Integer> getBasket() {
        return basket;
    }

    public void setBasket(ArrayList<Integer> basket) {
        this.basket = basket;
    }
}
