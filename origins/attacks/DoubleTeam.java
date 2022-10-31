package attacks;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    Effect e = new Effect().chance(1).turns(-1).stat(Stat.EVASION, +1);
    public DoubleTeam(){
        super(Type.NORMAL, 0,100);

    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        pokemon.addEffect(e);
    }
    @Override
    protected String describe() {
        return "Использует Double Team";
    }
}
