package mariej;

import java.util.BitSet;

class PC
{
    private BitSet opCode = new BitSet(4);
    private BitSet bits = new BitSet(12);

    public PC()
    {
        // opCode: 0010
        opCode.set(1);
    }
}
