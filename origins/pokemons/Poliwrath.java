package pokemons;
import ru.ifmo.se.pokemon.*;

public class Poliwrath extends Poliwhirl {
    public Poliwrath(String s, int i){
        super(s,i+5);
        setType(Type.WATER,Type.FIGHTING);
    }
}
