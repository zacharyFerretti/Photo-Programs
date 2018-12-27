import java.awt.*;
import java.awt.image.*;
import java.io.*;
import javax.imageio.*;
import javax.swing.*;

public class simpleProgram {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		new simpleProgram(args[0]);
	}
	public simpleProgram(String filename) throws Exception{
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				JFrame editorFrame = new JFrame("Simple Program");
				editorFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
				
				BufferedImage image = null;
				try {
					image = ImageIO.read(new File(filename));
				}catch(Exception e){
					e.printStackTrace();
					System.exit(1);
				}
				
				ImageIcon imageIcon = new ImageIcon(image);
				JLabel jLabel = new JLabel();
				jLabel.setIcon(imageIcon);
				editorFrame.getContentPane().add(jLabel, BorderLayout.CENTER);
				
				editorFrame.pack();
				editorFrame.setLocationRelativeTo(null);
				editorFrame.setVisible(true);
			}
		});
	}

}
