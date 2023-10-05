package VäxtHotell;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class HuvudProgram {
    public static void main(String[] args) {

        //Polymorfism
        ArrayList<Växt> växterList = new ArrayList<>(Arrays.asList(
                new Kaktus("Kaktusen Igge", 0.2),
                new Palm("Palmen Laura", 5),
                new Köttätande("Köttätande växten Meatloaf", 0.7),
                new Palm("Palmen Olof", 1)
        ));

        //Felsökning för input String
        while (true){
            String input = JOptionPane.showInputDialog("Vilken växt ska få mat?");
            if (input.isEmpty()){
                JOptionPane.showMessageDialog(null, "Input kan inte vara tom.");
                continue;
            }

            for (Växt i : växterList){
                if (input.toLowerCase().equals(i.getNamn().toLowerCase())){
                    JOptionPane.showMessageDialog(null,
                            "Växten behöver " + i.räknaVätska() + " litre " + i.getVätska() + " per dag.");
                    System.exit(1);
                }
            }
            JOptionPane.showMessageDialog(null, "Växter finns inte.");
        }
    }
}
