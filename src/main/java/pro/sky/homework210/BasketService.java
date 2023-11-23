package pro.sky.homework210;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Scope
public class BasketService {

    Basket basket;

    public BasketService(Basket basket) {
        this.basket = basket;
    }

    public void addInBasket(ArrayList<Integer> bask) {

        basket.addInBasket(bask);
    }


    public List<Integer> getBasket() {
        return basket.getBasket();
    }
}


