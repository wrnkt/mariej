package mariej;

import java.util.Arrays;
import java.util.BitSet;
import java.util.function.BiConsumer;

public class Instruction
{
    private String name;

    // First 4 bits are opcode
    // last 12 represent address
    private BitSet bits = new BitSet(16);


    public Instruction(String name, byte[] opCode)
    {
        this.name = name;
        setOpCode(opCode);
        System.out.println(this.name + "\n");
        System.out.println(this.bits.toString() + "\n");
    }

    public String getName() { return this.name; }
    private void setName(String name)
    {
        this.name = name;
    }


    public BitSet getBits() { return bits; }
    public void setBits(BitSet bits)
    {
        this.bits = bits;
    }

    public BitSet getOpCode()
    {
        return bits.get(0, 4);
    }
    public void setOpCode(byte[] opCode)
    {
        this.bits = BitSet.valueOf(opCode);
    }

    public byte[] getAddress()
    {
        //return Arrays.copyOfRange(this.bits, 1, 4);
        return this.bits.get(4, 16).toByteArray();
    }
    public void setAddress(BitSet address)
    {
        for (int i = 4; i < 16; i++) {
            this.bits.set(i, address.get(i-4));
        }
    }

}
