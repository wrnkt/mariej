package mariej;

import java.util.BitSet;

class IR
{
    private BitSet opCode = new BitSet(4);
    private BitSet bits = new BitSet(16);

    public IR()
    {
        // opCode: 0111
        opCode.set(0);
        opCode.set(1);
        opCode.set(2);
    }
}
