package attacks.Buizel;
import ru.ifmo.se.pokemon.*;
public class AquaJet extends PhysicalMove {
    public AquaJet() {
        super(Type.WATER, 40, 100);
    }
    @Override
    protected String describe(){
        return "Использует Aqua Jet";
    }
}
