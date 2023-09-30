package mariej;

import java.util.BitSet;

class OUT
{
    private BitSet opCode = new BitSet(4);
    private BitSet bits = new BitSet(16);

    public OUT()
    {
        // opCode: 0110
        opCode.set(1);
        opCode.set(2);
    }
}
