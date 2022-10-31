package pokemons;
import attacks.Buizel.AquaJet;
import attacks.Buizel.Swagger;
import attacks.DoubleTeam;
import ru.ifmo.se.pokemon.*;
public class Buizel extends Pokemon{




    public Buizel(String s, int i) {
            super(s, i);
            setStats(55,65,35,60,30,85);
            setType(Type.WATER);

            addMove(new AquaJet());
            if(i>10) {
                addMove(new DoubleTeam());
            }
            if(i>15) {
                addMove(new Swagger());
            }

    }

}
