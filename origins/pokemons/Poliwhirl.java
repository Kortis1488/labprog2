package pokemons;
import attacks.Poliwhirl.*;
import ru.ifmo.se.pokemon.*;
import pokemons.*;
public class Poliwhirl extends Poliwag  {
    public Poliwhirl(String s, int i){
        super(s,i+24);
        setStats(65,65,65,50,50,90);
        addMove(new HydroPump());
    }
}
