package mariej;

import java.util.ArrayList;

public class Marie
{
    private ReadCtrlBus readCtrlBus = new ReadCtrlBus();
    private WriteCtrlBus writeCtrlBus = new WriteCtrlBus();

    // READ
    private Wire mr = new Wire();
    private Wire p0 = new Wire();
    private Wire p1 = new Wire();
    private Wire p2 = new Wire();

    // WRITE
    private Wire mw = new Wire();
    private Wire p3 = new Wire();
    private Wire p4 = new Wire();
    private Wire p5 = new Wire();

    public Marie()
    {
        this.readCtrlBus.registerWire(new byte[]{ 0x00 }, this.mr);
        this.readCtrlBus.registerWire(new byte[]{ 0x01 }, this.p0);
        this.readCtrlBus.registerWire(new byte[]{ 0x02 }, this.p1);
        this.readCtrlBus.registerWire(new byte[]{ 0x04 }, this.p2);

        this.writeCtrlBus.registerWire(new byte[]{ 0x00 }, this.mw);
        this.writeCtrlBus.registerWire(new byte[]{ 0x01 }, this.p3);
        this.writeCtrlBus.registerWire(new byte[]{ 0x02 }, this.p4);
        this.writeCtrlBus.registerWire(new byte[]{ 0x04 }, this.p5);
    }

    private void updateBuses(byte[] opCode)
    {
        readCtrlBus.updateWireActivation(new byte[]{ 0x00 });
        writeCtrlBus.updateWireActivation(new byte[]{ 0x00 });
    }
}
