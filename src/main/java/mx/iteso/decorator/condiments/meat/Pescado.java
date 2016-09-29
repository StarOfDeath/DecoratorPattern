package mx.iteso.decorator.condiments.meat;

import mx.iteso.decorator.CondimentsDecorator;
import mx.iteso.decorator.Taco;

/**
 * Created by lamos on 9/29/2016.
 */
public class Pescado extends CondimentsDecorator {
    Taco taco;

    public Pescado (Taco taco){
        this.taco = taco;
    }

    @Override
    public String getDescription() {
        return taco.getDescription() + " de pescado";
    }

    @Override
    public double cost() {
        return 0 + taco.cost();
    }

}
