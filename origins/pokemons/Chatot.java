package pokemons;
import attacks.DoubleTeam;
import ru.ifmo.se.pokemon.*;
import attacks.Chatot.*;

public class Chatot extends Pokemon {
   public Chatot(String s, int i){
        super(s,i);
        setStats(76,65,45,92,42,91);
        setType(Type.NORMAL,Type.FIGHTING);
        addMove(new Peck());
        if(i>5) {
            addMove(new Roost());
        }
        if(i>10) {
            addMove(new Growl());
        }
        if(i>15) {
            addMove(new DoubleTeam());
        }

   }
}
