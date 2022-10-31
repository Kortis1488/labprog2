package attacks.Poliwag;
import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {
    public IceBeam(){
     super(Type.ICE,90,100);
    }

    @Override
    protected String describe() {
        return "Использует Ice Beam";
    }
}
