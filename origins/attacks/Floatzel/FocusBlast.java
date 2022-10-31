package attacks.Floatzel;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast(){
        super(Type.FIGHTING, 120,70);
    }
    @Override
    protected String describe(){
        return "Использует Focus Blast";
    }
}
