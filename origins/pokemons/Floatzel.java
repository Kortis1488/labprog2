package pokemons;

import attacks.Floatzel.FocusBlast;

public class Floatzel extends Buizel{
    public Floatzel(String s, int i) {
        super(s, i+25);
        setStats(85,100, 55, 85,50,115);
        addMove( new FocusBlast());
    }
}
