package mariej;

import java.util.BitSet;

public class AC
{
    private BitSet opCode = new BitSet(4);
    private BitSet bits = new BitSet(16);

    public AC()
    {
        // opCode: 0100
        opCode.set(2);
    }
}
