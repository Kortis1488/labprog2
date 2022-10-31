package attacks.Chatot;

import ru.ifmo.se.pokemon.*;



public class Roost extends StatusMove {
        Effect e;
    public Roost(){
        super(Type.FLYING,0,100);


    }

    @Override
    protected void applySelfEffects(Pokemon pokemon) {
        if (pokemon.getHP() < 76.0) {
            double t;
            t = 76.0 - pokemon.getHP();
            if (t > 36) {
                t = 36;
            }

            int t1 = (int) t;

            e = new Effect().chance(1).turns(1).stat(Stat.HP, -t1);
            pokemon.addEffect(e);
        }
    }
    @Override
    protected String describe() {
        return "Использует Roost";
    }
}
