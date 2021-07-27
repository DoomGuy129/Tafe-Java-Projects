package Sample;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener
{
    JButton btnClose;
    Button btnInput;

    JTextField txtMessage;
    JTextField txtdisplay;
    JLabel lblLabel;

    public static void main(String[] args)
    {
        Main frm = new Main();
    }
    public Main()
    {
        SpringLayout myLayout = new SpringLayout();
        this.setSize(500, 500);
        this.setLayout(myLayout);
        this.getContentPane().setBackground(Color.cyan);
        btnClose = new JButton("CLOSE");
        btnClose.addActionListener(this);
        btnClose.setPreferredSize(new Dimension(75,25));
        myLayout.putConstraint(SpringLayout.WEST,btnClose,50,
                                         SpringLayout.WEST, this);
        myLayout.putConstraint(SpringLayout.NORTH,btnClose,50,
                SpringLayout.NORTH, this);
        this.add(btnClose);

        btnInput = new Button("Enter");
        btnInput.addActionListener(this);
        btnInput.setPreferredSize(new Dimension(75,25));
        myLayout.putConstraint(SpringLayout.EAST,btnInput,350,
                SpringLayout.EAST, this);
        myLayout.putConstraint(SpringLayout.NORTH,btnInput,78,
                SpringLayout.NORTH, this);
        this.add(btnInput);

        txtMessage = new JTextField("Input something",15);
        txtMessage.setBackground(Color.lightGray);
        txtMessage.setForeground(Color.red);
        myLayout.putConstraint(SpringLayout.WEST,txtMessage,120,
                SpringLayout.WEST, this);
        myLayout.putConstraint(SpringLayout.NORTH,txtMessage,80,
                SpringLayout.NORTH, this);
        this.add(txtMessage);
        txtdisplay = new JTextField(15);
        txtdisplay.setBackground(Color.lightGray);
        txtdisplay.setForeground(Color.black);
        myLayout.putConstraint(SpringLayout.WEST,txtdisplay,120,
                SpringLayout.WEST, this);
        myLayout.putConstraint(SpringLayout.NORTH,txtdisplay,140,
                SpringLayout.NORTH, this);
        txtdisplay.setEditable(false);
        this.add(txtdisplay);
        lblLabel = new JLabel("Input:");
        lblLabel.setForeground(Color.BLUE);
        lblLabel.setFont(new Font("Serif",Font.BOLD,50));
        myLayout.putConstraint(SpringLayout.WEST,lblLabel,150,
                SpringLayout.WEST, this);
        myLayout.putConstraint(SpringLayout.NORTH,lblLabel,10,
                SpringLayout.NORTH, this);
        this.add(lblLabel);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() == btnClose)
        {
            System.exit(0);
        }
        if(e.getSource() == btnInput)
        {
            txtdisplay.setText(txtMessage.getText());
        }
    }
}
