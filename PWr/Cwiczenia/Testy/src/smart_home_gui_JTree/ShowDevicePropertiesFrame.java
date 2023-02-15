package smart_home_gui_JTree;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class ShowDevicePropertiesFrame {

    private JFrame groupJFrame;

    private  JButton groupJButton;
    public ShowDevicePropertiesFrame() {
        initialize();
    }

    public void initialize(){

        // create a JFrame
        groupJFrame  = new JFrame();
        groupJFrame.setSize(500, 500);
        groupJFrame.setTitle("Smart Home Groups");
        groupJFrame.setVisible(true);

        JPanel panelLeft = new JPanel();
        JPanel panelRight = new JPanel();

        groupJFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        groupJFrame.getContentPane().add(BorderLayout.WEST, panelLeft);
        groupJFrame.getContentPane().setBackground(Color.red);
        groupJFrame.getContentPane().add(BorderLayout.EAST, panelRight);



        DefaultMutableTreeNode mainGroup = new DefaultMutableTreeNode("Devices");
        DefaultMutableTreeNode group1 = new DefaultMutableTreeNode("House");
        DefaultMutableTreeNode group2 = new DefaultMutableTreeNode("Outdoors");

        mainGroup.add(group1);
        mainGroup.add(group2);

        DefaultMutableTreeNode device1 = new DefaultMutableTreeNode("Gas Sensor");
        DefaultMutableTreeNode device2 = new DefaultMutableTreeNode("Air Humidity Sensor");
        DefaultMutableTreeNode device3 = new DefaultMutableTreeNode("Bulb");
        DefaultMutableTreeNode device4 = new DefaultMutableTreeNode("Bulb RGB");
        group1.add(device1); group1.add(device2); group1.add(device3); group1.add(device4);

        DefaultMutableTreeNode device5 = new DefaultMutableTreeNode("Light Sensor");
        DefaultMutableTreeNode device6 = new DefaultMutableTreeNode("Movement Sensor");
        DefaultMutableTreeNode device7 = new DefaultMutableTreeNode("Automatic Gate");
        DefaultMutableTreeNode device8 = new DefaultMutableTreeNode("Lock");
        group2.add(device5);
        group2.add(device6);
        group2.add(device7);
        group2.add(device8);

        JTree jt = new JTree(mainGroup);
        panelLeft.add(jt);
        jt.setSize(200,200);
        jt.setVisible(true);



    }





}
