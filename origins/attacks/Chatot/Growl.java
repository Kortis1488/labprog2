package attacks.Chatot;
import ru.ifmo.se.pokemon.*;

public class Growl extends StatusMove{
    Effect e = new Effect().chance(1).turns(-1).stat(Stat.ATTACK, -1);
    int count = 0;
    public Growl(){
        super(Type.NORMAL, 0,100);

    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {

            pokemon.addEffect(e);

    }

    @Override
    protected String describe() {
        return "Использует Growl";
    }

}
