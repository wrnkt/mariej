package mariej;

import java.util.BitSet;
import java.util.HashMap;
import mariej.Wire;

public class ReadCtrlBus extends CtrlBus
{
    private HashMap<BitSet, Wire> wires = new HashMap<BitSet, Wire>();

    public ReadCtrlBus() {}

    public void registerWire(byte[] activation, Wire wire)
    {
        this.wires.put(BitSet.valueOf(activation), wire);
    }

    public void updateWireActivation(byte[] opCode)
    {
        deactivateAllWires();
        BitSet opCodeBS = BitSet.valueOf(opCode);
        if (opCodeBS.isEmpty()) {
            this.wires.get(opCodeBS).doPassSignal();
            return;
        }
        this.wires.forEach((activationBits, wire) -> {
            if (activationBits.intersects(opCodeBS)) wire.doPassSignal();
        });
    }
}
