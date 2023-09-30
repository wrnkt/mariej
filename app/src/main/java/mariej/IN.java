package mariej;

import java.util.BitSet;

public class IN
{
    private BitSet opCode = new BitSet(4);
    private BitSet bits = new BitSet(16);

    public IN()
    {
        // opCode: 0101
        opCode.set(0);
        opCode.set(2);
    }
}
