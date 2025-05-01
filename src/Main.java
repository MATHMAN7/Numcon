import javax.swing.JOptionPane;
//import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String userInput = JOptionPane.showInputDialog("Enter a number in words (q to quit) ");
        userInput = userInput.trim().toLowerCase().replaceAll("[^a-z]", "");
        //userInput = userInput.replaceAll(" ", "");
        boolean big3order = true;


        String billion = "";
        String million = "";
        String thousand = "";
        String hundred = "";

        boolean bill = false;
        boolean mill = false;
        boolean thou = false;
        boolean hun = false;
while(true) {
    if(userInput.equals("q")) {break;}
        while (true) {


            big3order = che.check(userInput);

            String userInput2 = userInput;
            if (userInput2.contains("billion")) {
                billion = userInput2.substring(0, userInput2.indexOf("billion"));
                userInput2 = userInput2.substring(userInput2.indexOf("billion") + 7);
                bill = epsilon_check.check_epsilon(billion);
            }

            if (userInput2.contains("million")) {
                million = userInput2.substring(0, userInput2.indexOf("million"));
                userInput2 = userInput2.substring(userInput2.indexOf("million") + 7);
                mill = epsilon_check.check_epsilon(million);
            }

            if (userInput2.contains("thousand")) {
                thousand = userInput2.substring(0, userInput2.indexOf("thousand"));
                userInput2 = userInput2.substring(userInput2.indexOf("thousand") + 8);
                thou = epsilon_check.check_epsilon(thousand);
            }
            hundred = userInput2;

            hun = huh_check.huh(hundred);
            if (hun == true) {
                hun = epsilon_check.check_epsilon(hundred);
            }


//


            // System.out.println(big3order);
            //System.out.println(hun);
            // System.out.println(mill);
            //System.out.println(bill);
            // System.out.println(thou);


            if (big3order == false && hun == false && mill == false && bill == false && thou == false)

            //if(big3order==false)
            {
                break;
            } else {
                JOptionPane.showMessageDialog(null, "Enter a correct number");
                userInput = JOptionPane.showInputDialog("Enter a number in words ");
            }
        }

        long epsiB = 0;
        long epsiM = 0;
        long epsiTh = 0;
        long epsiHun = 0;

        if (billion != "") {
            epsiB = epsilon_converter.valueof(billion);
        }
        if (million != "") {
            epsiM = epsilon_converter.valueof(million);
        }
        if (thousand != "") {
            epsiTh = epsilon_converter.valueof(thousand);
        }
        if (hundred != "") {
            epsiHun = epsilon_converter.valueof(hundred);
        }

        epsiB = epsiB * 1000000000;
        epsiM = epsiM * 1000000;
        epsiTh = epsiTh * 1000;

        long finalNumber = epsiB + epsiM + epsiTh + epsiHun;


        JOptionPane.showMessageDialog(null, finalNumber);
        userInput=JOptionPane.showInputDialog("Enter again (q to quit) ");

    }

    }}









