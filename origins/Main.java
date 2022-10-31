import ru.ifmo.se.pokemon.*;
import pokemons.*;
import attacks.Chatot.*;
import static ru.ifmo.se.pokemon.Type.FLYING;





public class Main {
    public static void main(String[] args) {
        Chatot ch = new Chatot("Chatot", 16);
        Buizel bz = new Buizel("Buizel", 16);
        Floatzel fz = new Floatzel("Floatzel", 1);
        Poliwag pw = new Poliwag("Poliwag", 16);
        Poliwhirl pwl = new Poliwhirl("Poliwhirl",1);
        Poliwrath pwh = new Poliwrath("Poliwrath", 1);
        Battle b = new Battle();
        b.addAlly(ch);
        b.addAlly(bz);
        b.addAlly(fz);
        b.addFoe(pw);
        b.addFoe(pwl);
        b.addFoe(pwh);
        b.go();
    }
}
