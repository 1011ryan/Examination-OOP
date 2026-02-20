/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.swing.JOptionPane;

public class VUCourses {

    public static void main(String[] args) {

        String moduleCode;
        String moduleName = "";
        int tuition = 0;

        // Input dialog
        moduleCode = JOptionPane.showInputDialog(
                "Enter Module Code (BSF, BIT, BCS, BCE):");

        if (moduleCode == null) {
            return; // If user cancels
        }

        moduleCode = moduleCode.toUpperCase();

        switch (moduleCode) {

            case "BSF" -> {
                moduleName = "BSc. Software Engineering";
                tuition = 900000;
            }

            case "BIT" -> {
                moduleName = "BSc. Information Technology";
                tuition = 750000;
            }

            case "BCS" -> {
                moduleName = "BSc. Computer Science";
                tuition = 800000;
            }

            case "BCE" -> {
                moduleName = "BSc. Computer Engineering";
                tuition = 950000;
            }

            default -> {
                JOptionPane.showMessageDialog(null,
                        "Wrong Module Code details");
                return;
            }
        }

        // Output dialog
        JOptionPane.showMessageDialog(null,
                "Module Code: " + moduleCode +
                "\nCourse: " + moduleName +
                "\nTuition: UGX " + tuition);
    }
}