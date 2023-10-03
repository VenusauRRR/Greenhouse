package VäxtHotell;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;

public class HuvudProgram {
    public static void main(String[] args) {

        ArrayList<Växt> växterList = new ArrayList<>(Arrays.asList(
                new Kaktus("Kaktusen Igge", 0.2),
                new Palm("Palmen Laura", 5),
                new Köttätande("Köttätande växten Meatloaf", 0.7),
                new Palm("Palmen Olof", 1)
        ));

        while (true){
            String input = JOptionPane.showInputDialog("Vilken växt ska få mat?");
            if (input==null || input.isEmpty()){
                JOptionPane.showMessageDialog(null, "Input kan inte vara tom.");
                continue;
            }

            for (int i = 0; i < växterList.size(); i++) {
                if (input.equals(växterList.get(i).getNamn())){
                    JOptionPane.showMessageDialog(null,
                            "Växten behöver " + växterList.get(i).getVätskaVolym() + " litre " + växterList.get(i).getVätska() + " per dag.");

                }
            }
            JOptionPane.showMessageDialog(null, "Fel input.");
            //test 1
        }
    }
}
