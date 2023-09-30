package mariej;

import java.util.Arrays;

public class Instruction
{
    // First 4 bits are opcode
    // last 12 represent address

    private byte bits[] = { 0x00, 0x00, 0x00, 0x00 };

    public byte[] getBits() { return bits; }
    public void setBits(byte[] bits)
    {
        assert(bits.length == 16);
        this.bits = bits;
    }

    public byte getOpCode()
    {
        return bits[0];
    }
    public void setOpCode(byte opCode)
    {
        this.bits[0] = opCode;
    }

    public byte[] getAddress()
    {
        return Arrays.copyOfRange(this.bits, 1, 4);
    }
    public void setAddress(byte[] address)
    {
        for (int i = 1; i < 5; i++) {
            this.bits[i] = address[i];
        }
    }

}
