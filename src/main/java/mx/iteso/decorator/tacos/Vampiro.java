package mx.iteso.decorator.tacos;
import mx.iteso.decorator.Taco;


/**
 * Created by lamos on 9/29/2016.
 */
public class Vampiro extends Taco {
    public Vampiro(){
        description = "Vampiro";
    }

    @Override
    public double cost() {
        return 10.00;
    }
    }


