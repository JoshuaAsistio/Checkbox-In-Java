import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class MyFrame extends JFrame implements ActionListener{
	JButton button;
	JCheckBox checkbox;
	MyFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(420, 420);
		setLayout(new FlowLayout());
		
		button = new JButton("Submit");
		button.addActionListener(this);
		
		checkbox = new JCheckBox("I'm not a robot.");
		checkbox.setFocusable(false);
		checkbox.setFont(new Font("Consolas", Font.PLAIN, 25));
		
		add(button);
		add(checkbox);

		pack();
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == button) {
			System.out.println(checkbox.isSelected());
		}
	}
}
 