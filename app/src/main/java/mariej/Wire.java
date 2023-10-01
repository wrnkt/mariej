package mariej;

import java.util.BitSet;

public class Wire
{
    private boolean passSignal = false;
    private BitSet signal = new BitSet(16);

    public void setSignal(BitSet signal)
    {
        if (!this.passSignal) return;
        this.signal = signal;
    }

    public BitSet getSignal()
    {
        if (!this.passSignal) return new BitSet(16);
        return this.signal;
    }

    public void doPassSignal() { this.passSignal = true; }
    public void dontPassSignal() { this.passSignal = false; }
}
