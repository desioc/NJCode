package jpackage.test;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class SwingMixExample {
    private JTabbedPane tabbedPane;
    private JFrame frame;
    public SwingMixExample() {
        tabbedPane = new JTabbedPane();
        frame = new JFrame("Swing Mix Example");
        setup();
        addDetails();
    }
    final void setup() {
        tabbedPane.addTab("Labels Panel", new LabelsPanel());
        tabbedPane.addTab("Buttons Panel", new ButtonsPanel());
        tabbedPane.addTab("Text Panel", new TextPanel());
        tabbedPane.addTab("Boxes Panel", new BoxesPanel());
        tabbedPane.addTab("Tree Panel", new TreePanel());
        tabbedPane.addTab("Table Panel", new TablePanel());
        frame.add(tabbedPane);
    }
    final void addDetails() {
        frame.setSize(700, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    public static void main(String args[]) {
        SwingUtilities.invokeLater(() -> new SwingMixExample());
    }

    class LabelsPanel extends JPanel {
        private static final long serialVersionUID = 9194289783945214510L;
        LabelsPanel() {
            setLayout(new GridLayout(3, 1));
            JLabel toolTipLabel = new JLabel("This label has a tooltip", JLabel.CENTER);
            toolTipLabel.setToolTipText("Tool Tip Text");
            JLabel imageLabel = new JLabel("Label with EJE logo", new ImageIcon(LabelsPanel.class.getResource("/resources/eje.png")), JLabel.CENTER);
            add(toolTipLabel);
            add(imageLabel);
        }
    }

    class ButtonsPanel extends JPanel {
        private static final long serialVersionUID = 2200419301731503316L;
        private static final String F1 = "F1";
        private static final String F2 = "F2";
        ButtonsPanel() {
            setLayout(new FlowLayout(FlowLayout.CENTER, 100, 40));
            final JButton button = new JButton("Open Paint Dialog");
            button.setToolTipText("Press me if you want to paint");
            button.addActionListener((e) -> new PaintDialog().setVisible(true));
            final JButton imageButton = new JButton(new ImageIcon(LabelsPanel.class.getResource("/resources/clock.png")));
            imageButton.setRolloverIcon(new ImageIcon(LabelsPanel.class.getResource("/resources/clock-red.png")));
            add(button);
            add(imageButton);
            InputMap inputMap = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
            ActionMap actionMap = getActionMap();
            AbstractAction pressF1 = new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    button.doClick();
                }
            };
            AbstractAction pressF2 = new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    imageButton.doClick();
                }
            };
            inputMap.put(KeyStroke.getKeyStroke("F1"), F1);
            actionMap.put(F1, pressF1);
            inputMap.put(KeyStroke.getKeyStroke("F2"), F2);
            actionMap.put(F2, pressF2);
        }
    }

    class BoxesPanel extends JPanel {
        private static final long serialVersionUID = 2456545409364946536L;
        private static final String GEOLOGY_STATEMENT = "Geology is not a real science!";
        BoxesPanel() {
            setLayout(new GridLayout(1, 3));
            JPanel comboBoxPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 90));
            JComboBox<String> comboBox = new JComboBox<>(new String[]{"Cooper", "Hofstadter", "Wolowits", "Koothrappali"});
            comboBoxPanel.add(comboBox);
            add(comboBoxPanel);
            JPanel radioButtonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 90));
            JRadioButton pennyRadioButton = new JRadioButton("Penny");
            JRadioButton amyRadioButton = new JRadioButton("Amy");
            JRadioButton bernadetteRadioButton = new JRadioButton("Bernadette");
            ButtonGroup buttonGroup = new ButtonGroup();
            radioButtonPanel.add(pennyRadioButton);
            radioButtonPanel.add(amyRadioButton);
            radioButtonPanel.add(bernadetteRadioButton);
            buttonGroup.add(pennyRadioButton);
            buttonGroup.add(amyRadioButton);
            buttonGroup.add(bernadetteRadioButton);
            add(radioButtonPanel);
            JCheckBox checkBox = new JCheckBox(GEOLOGY_STATEMENT);
            checkBox.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    JCheckBox checkBox = (JCheckBox) e.getItem();
                    if (checkBox.isSelected()) {
                        checkBox.setText("Bazinga!");
                    } else {
                        checkBox.setText(GEOLOGY_STATEMENT);
                    }
                }
            });
            JPanel checkBoxPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 90));
            checkBoxPanel.add(checkBox);
            add(checkBoxPanel);
        }
    }

    class TextPanel extends JPanel {
        private static final long serialVersionUID = 5126108496344331500L;
        TextPanel() {
            setLayout(new BorderLayout());
            JTextField textField = new JTextField("This is a text field with an etched border", 30);
            JTextArea textArea = new JTextArea("This is a text area with a red rounded line border", 50, 30);
            textArea.setBorder(BorderFactory.createEtchedBorder());
            JScrollPane scrollPane = new JScrollPane(textArea);
            scrollPane.setBorder(BorderFactory.createLineBorder(Color.RED, 10, true));
            add(textField, BorderLayout.NORTH);
            add(scrollPane, BorderLayout.CENTER);
        }
    }

    class TreePanel extends JPanel {
        private static final long serialVersionUID = -6017898306748121062L;
        TreePanel() {
            setLayout(new BorderLayout());
            DefaultMutableTreeNode root = new DefaultMutableTreeNode("C:\\");
            DefaultMutableTreeNode javaForAliens = new DefaultMutableTreeNode("Java For Aliens");
            root.add(javaForAliens);
            DefaultMutableTreeNode examples = new DefaultMutableTreeNode("Examples");
            javaForAliens.add(examples);
            DefaultMutableTreeNode swingMixExample = new DefaultMutableTreeNode("SwingMixExample.java");
            examples.add(swingMixExample);
            DefaultMutableTreeNode exercises = new DefaultMutableTreeNode("Exercises");
            javaForAliens.add(exercises);
            DefaultMutableTreeNode users = new DefaultMutableTreeNode("Users");
            root.add(users);
            DefaultMutableTreeNode user1 = new DefaultMutableTreeNode("User1");
            users.add(user1);
            DefaultMutableTreeNode windows = new DefaultMutableTreeNode("Windows");
            root.add(windows);
            DefaultMutableTreeNode system = new DefaultMutableTreeNode("System");
            windows.add(system);
            JTree tree = new JTree(root);
            JScrollPane scrollPane = new JScrollPane(tree);
            scrollPane.setBorder(BorderFactory.createEtchedBorder());
            add(scrollPane, BorderLayout.CENTER);
        }
    }

    class TablePanel extends JPanel {
        private static final long serialVersionUID = 2200419301731503316L;
        TablePanel() {
            setLayout(new BorderLayout());
            String[] headers = {"Name", "City", "State"
            };
            Object[][] contents = {
                {"Fulvio", "Bruxelles", "Belgium"},
                {"Luca", "Foligno", "Italy"},
                {"Fabio", "Latina", "Italy"},
                {"Bruno", "Turin", "Italy"},
                {"Edo", "Poznan", "Poland"},
                {"Marcella", "Madrid", "England"},
                {"Piero", "Lagos", "Nigeria"}
            };
            JTable table = new JTable(contents, headers);
            table.setBorder(BorderFactory.createEtchedBorder());
            JScrollPane scrollPane = new JScrollPane(table);
            add(new JLabel("Distant old friends"), BorderLayout.NORTH);
            add(scrollPane, BorderLayout.CENTER);
        }
    }

    enum ColorEnum {
        BLACK(Color.BLACK), BLUE(Color.BLUE), GREEN(Color.GREEN), ORANGE(Color.ORANGE),
        PINK(Color.PINK), RED(Color.RED), WHITE(Color.WHITE), YELLOW(Color.YELLOW);
        private Color color;
        ColorEnum(Color color) {
            this.color = color;
        }
        public Color getColor() {
            return color;
        }
    }

    class PaintDialog extends JDialog {
        private static final long serialVersionUID = 1234419391738703316L;
        Color selectedColor;
        PaintDialog() {
            super(frame, "Paint Dialog");
            setLayout(new BorderLayout());
            JPanel southPanel = new JPanel();
            JList<ColorEnum> colorsList = new JList<>(ColorEnum.values());
            colorsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
            JButton resetButton = new JButton("Reset");
            southPanel.add(resetButton);
            add(southPanel, BorderLayout.SOUTH);
            add(colorsList, BorderLayout.WEST);
            JLabel label = new JLabel();
            label.setBorder(BorderFactory.createEtchedBorder());
            add(label, BorderLayout.CENTER);
            resetButton.addActionListener((e) -> repaint());
            label.addMouseMotionListener(new MouseMotionAdapter() {
                @Override
                public void mouseDragged(MouseEvent e) {
                    Graphics g = getGraphics();
                    g.setColor(selectedColor);
                    g.fillOval(e.getX() + 45, e.getY() + 28, 20, 20);
                }
            });
            colorsList.addListSelectionListener((e) -> selectedColor = colorsList.getSelectedValue().getColor());
            colorsList.setSelectedIndex(0);
            setModal(true);
            setSize(1024, 768);
            setLocationRelativeTo(frame);
            setResizable(false);
        }
    }
}