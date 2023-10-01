package mariej;

import java.util.HashMap;
import java.util.BitSet;

abstract class CtrlBus
{
    private HashMap<BitSet, Wire> wires;

    abstract void registerWire(byte[] activation, Wire wire);
    abstract void updateWireActivation(byte[] opCode);
    public void deactivateAllWires()
    {
        this.wires.values().forEach((wire) -> wire.dontPassSignal());
    }
}
