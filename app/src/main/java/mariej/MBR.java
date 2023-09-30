package mariej;

import java.util.BitSet;

class MBR
{
    private BitSet opCode = new BitSet(4);
    private BitSet bits = new BitSet(16);

    public MBR()
    {
        // opCode: 0011
        opCode.set(0);
        opCode.set(1);
    }
}
