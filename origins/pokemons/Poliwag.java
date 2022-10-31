package pokemons;
import attacks.Poliwag.*;
import ru.ifmo.se.pokemon.*;
public class Poliwag extends Pokemon{
    public Poliwag(String s, int i){
        super(s,i);
        setType(Type.WATER);
        setStats(40,50,40,40,40,90);
        addMove(new Scald());
        if(i>10){
            addMove(new IceBeam());
        }
    }
}
