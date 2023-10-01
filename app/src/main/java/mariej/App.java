package mariej;

import mariej.AC;
import mariej.InstructionSetBuilder;

public class App
{
    public static void main(String[] args)
    {
        System.out.println("Hello");
        var isb = new InstructionSetBuilder();
        isb.generateSet();
    }
}
