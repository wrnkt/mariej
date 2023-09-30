package mariej;

import java.util.ArrayList;
import java.util.BitSet;
import mariej.Instruction;

public class InstructionSetBuilder
{
    public ArrayList<Instruction> generateSet()
    {
        var instructions = new ArrayList<Instruction>();
        instructions.add(new Instruction("Add", new byte[]{ 0x03, 0x00 }));
        instructions.add(new Instruction("Subt", new byte[]{ 0x04, 0x00 }));
        instructions.add(new Instruction("Addl", new byte[]{ 0x0B, 0x00 }));
        instructions.add(new Instruction("Clear", new byte[]{ 0x0A, 0x00 }));
        instructions.add(new Instruction("Load", new byte[]{ 0x01, 0x00 }));
        instructions.add(new Instruction("Store", new byte[]{ 0x02, 0x00 }));
        instructions.add(new Instruction("Input", new byte[]{ 0x05, 0x00 }));
        instructions.add(new Instruction("Output", new byte[]{ 0x06, 0x00 }));
        instructions.add(new Instruction("Jump", new byte[]{ 0x09, 0x00 }));
        instructions.add(new Instruction("Skipcond", new byte[]{ 0x08, 0x00 }));
        instructions.add(new Instruction("JnS", new byte[]{ 0x00, 0x00 }));
        instructions.add(new Instruction("Jumpl", new byte[]{ 0x0C, 0x00 }));
        instructions.add(new Instruction("Storel", new byte[]{ 0x0C, 0x00 }));
        instructions.add(new Instruction("Loadl", new byte[]{ 0x0D, 0x00 }));
        instructions.add(new Instruction("Halt", new byte[]{ 0x07, 0x00 }));
        return instructions;
    }
}
