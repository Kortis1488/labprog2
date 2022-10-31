package attacks.Buizel;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    Effect e = new Effect().chance(1).turns(4).stat(Stat.ATTACK, +2);
    public Swagger(){
        super(Type.NORMAL,0,85);
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.confuse();
        pokemon.addEffect(e);
    }
    @Override
    protected String describe() {
        return "Использует Swagger";
    }

}
