
package greenthumb;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Greenthumb extends JFrame {
    // Components for the main window
    private JButton planLayoutButton;
    private JButton selectPlantsButton;

    // Constructor
    public Greenthumb() {
        // Set title and size
        setTitle("GreenThumb Garden Planner");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set layout
        setLayout(new FlowLayout());
       
        // Welcome message
        JLabel welcomeLabel = new JLabel("Welcome to GreenThumb Garden Planner!!!");
       
        add(welcomeLabel);
     welcomeLabel.setForeground(Color.MAGENTA);
        // Plan Layout button
        planLayoutButton = new JButton("Plan Layout");
        planLayoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openLayoutPlanningWindow();
            }
        });
        add(planLayoutButton);

        planLayoutButton.setForeground(Color.blue);
 
        
        // Select Plants button
        selectPlantsButton = new JButton("Select Plants");
        selectPlantsButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openPlantSelectionWindow();
            }
        });
        add(selectPlantsButton);
        selectPlantsButton.setForeground(Color.blue);
    }
      

// Method to open the layout planning window
    private void openLayoutPlanningWindow() {
        LayoutPlanningWindow layoutWindow = new LayoutPlanningWindow(this);
        layoutWindow.setVisible(true);
    }

    // Method to open the plant selection window
    private void openPlantSelectionWindow() {
        PlantSelectionWindow plantWindow = new PlantSelectionWindow(this);
        plantWindow.setVisible(true);
    }

    public static void main(String[] args) {
        // Set custom look and feel
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Greenthumb mainFrame = new Greenthumb();
        mainFrame.setVisible(true);
    }
}



// Layout planning window class
class LayoutPlanningWindow extends JFrame {
    // Components
    private JTextField lengthField;
    private JTextField widthField;

    public LayoutPlanningWindow(JFrame parent) {
        // Set title and size
        setTitle("Plan Layout");
        setSize(300, 200);

        // Set layout
        setLayout(new FlowLayout());

        // Label and text fields for dimensions
        JLabel lengthLabel = new JLabel("Length:");
        add(lengthLabel);
        lengthField = new JTextField(10);
        add(lengthField);
      
        JLabel widthLabel = new JLabel("Width:");
        add(widthLabel);
        widthField = new JTextField(10);
        add(widthField);
        
    
        // Draw Layout button
        JButton drawLayoutButton = new JButton("Draw Layout");
        drawLayoutButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int length = Integer.parseInt(lengthField.getText());
                int width = Integer.parseInt(widthField.getText());

                // Simulate drawing layout
                JOptionPane.showMessageDialog(null, "Layout drawn with dimensions: " + length + " x " + width);
            }
        });
        add(drawLayoutButton);
drawLayoutButton.setForeground(Color.CYAN);
        // Back button
        JButton backButton = new JButton("Back");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        add(backButton);
backButton.setForeground(Color.CYAN);
        // Center the window relative to the parent
        setLocationRelativeTo(parent);
    }
}


// Plant selection window class
class PlantSelectionWindow extends JFrame {
    // Components
    private JComboBox<String> plantList;

    public PlantSelectionWindow(JFrame parent) {
        // Set title and size
        setTitle("Select Plants");
        setSize(300, 200);

        // Set layout
        setLayout(new FlowLayout());

        // Plant list
        String[] plants = {"Tomato", "Cucumber", "Roses", "Oranges", "Sunflower"};
        plantList = new JComboBox<>(plants);
        add(plantList);

        // Add to Garden button
        JButton addToGardenButton = new JButton("Add to Garden");
        addToGardenButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedPlant = (String) plantList.getSelectedItem();
                JOptionPane.showMessageDialog(null, selectedPlant + " added to garden!");
            }
        });
        add(addToGardenButton);
addToGardenButton.setForeground(Color.ORANGE);
        // Back button
        JButton backButton = new JButton("Back");
        backButton.setForeground(Color.ORANGE);
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
        add(backButton);

        // Center the window relative to the parent
        setLocationRelativeTo(parent);
    }
}

