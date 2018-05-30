package application;

import javafx.util.Duration;

import java.awt.event.KeyEvent;
import java.util.ArrayList; 

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Board2Controller
{
	private int count = 0; 
	private int locPlayer1 = -1; 
	private int locPlayer2 = -1;
	private ArrayList<Coordinates> listA = new ArrayList<Coordinates>();
	private ArrayList<Coordinates> listB = new ArrayList<Coordinates>();
	private String[] actionCards = {"100Fbank.jpg", "120Fbank.jpg", 
			"20Fplayer.jpg", "20Tbank.jpg", "30Tbank.jpg", 
			"30Tbank2.jpg", "30Tbank3.jpg", "30Tbank4.jpg", 
			"40Fbank.jpg", "40Fbank3.jpg", "40Fbank4.jpg",
			"40fbank2.jpg", "50FPlayer.jpg", "50FPlayers.jpg", 
			"50Fbank.jpg", "50Fbank2.jpg", "50Tbank.jpg", 
			"50Tbank2.jpg", "50Tbank3.jpg",	"50Tbank4.jpg", 
			"50Tbank5.jpg", "50Tbank6.jpg", "70Fbank.jpg", 
			"70Fbank2.jpg"}; 
	
	public Board2Controller()
	{
		listA.add(new Coordinates(1, -39, -157, "y"));
		listA.add(new Coordinates(2, -38, -216, "y"));  
		listA.add(new Coordinates(3, -68, -277, "y"));
		listA.add(new Coordinates(4, -112, -318, "y"));
		listA.add(new Coordinates(5, -164, -332, "y"));
		listA.add(new Coordinates(6, -224, -340, "y"));
		listA.add(new Coordinates(7, -280, -326, "y"));
		listA.add(new Coordinates(8, -325, -284, "y"));
		listA.add(new Coordinates(9, -352, -232, "y"));
		listA.add(new Coordinates(10, -362, -176, "y"));
		listA.add(new Coordinates(11, -346, -126, "y"));
		listA.add(new Coordinates(12, -324, -81, "y"));
		listA.add(new Coordinates(13, -284, -42, "y"));
		listA.add(new Coordinates(14, -299, -16, "y")); //
		listA.add(new Coordinates(15, -332, 15, "g"));
		listA.add(new Coordinates(16, -382, 25, "y"));
		listA.add(new Coordinates(17, -430, 13, "y"));
		listA.add(new Coordinates(18, -471, -17, "y"));
		listA.add(new Coordinates(19,-523, -27, "y"));
		listA.add(new Coordinates(20, -572, -10, "g"));
		listA.add(new Coordinates(21, -619, 14, "y"));
		listA.add(new Coordinates(22, -677, 3, "y"));
		listA.add(new Coordinates(23, -716, -35, "m"));
		listA.add(new Coordinates(24, -732, -79, "y"));
		listA.add(new Coordinates(25, -718, -124, "y"));
		listA.add(new Coordinates(26, -684, -157, "y"));
		listA.add(new Coordinates(27, -647, -188, "y"));
		listA.add(new Coordinates(28, -650, -238, "y"));
		listA.add(new Coordinates(29, -663, -279, "y"));
		listA.add(new Coordinates(30, -682, -322, "g"));
		listA.add(new Coordinates(31, -694, -364, "y"));
		listA.add(new Coordinates(32, -712, -413, "y"));
		listA.add(new Coordinates(33, -724, -453, "y"));
		listA.add(new Coordinates(34, -732, -505, "h"));
		listA.add(new Coordinates(35, -684, -516, "y"));
		listA.add(new Coordinates(36, -649, -519, "y"));
		listA.add(new Coordinates(37, -608, -530, "y"));
		listA.add(new Coordinates(38, -577, -557, "y"));
		listA.add(new Coordinates(39, -555, -596, "y"));
		listA.add(new Coordinates(40, -547, -641, "y"));
		listA.add(new Coordinates(41, -532, -688, "g"));
		listA.add(new Coordinates(42, -488, -696, "y"));
		listA.add(new Coordinates(43, -442, -683, "y"));
		listA.add(new Coordinates(44, -404, -652, "y"));
		listA.add(new Coordinates(45, -393, -606, "h"));
		listA.add(new Coordinates(46, -393, -558, "y"));
		listA.add(new Coordinates(47, -408, -514, "g"));
		listA.add(new Coordinates(48, -436, -478, "t"));
		listA.add(new Coordinates(49, -475, -453, "y"));
		listA.add(new Coordinates(50, -515, -434, "y"));
		listA.add(new Coordinates(51, -552, -413, "y"));
		listA.add(new Coordinates(52, -584, -383, "y"));
		listA.add(new Coordinates(53, -595, -340, "h"));
		listA.add(new Coordinates(54, -595, -291, "g"));
		listA.add(new Coordinates(55, -595, -250, "y"));
		listA.add(new Coordinates(56, -595, -211, "y"));
		listA.add(new Coordinates(57, -585, -175, "y"));
		listA.add(new Coordinates(58, -564, -139, "t"));
		listA.add(new Coordinates(59, -541, -110, "h"));
		listA.add(new Coordinates(60, -503, -84, "b"));
		listA.add(new Coordinates(61, -453, -79, "t"));
		listA.add(new Coordinates(62, -417, -96, "g"));
		listA.add(new Coordinates(63, -400, -138, "b"));
		listA.add(new Coordinates(64, -400, -182, "b"));
		listA.add(new Coordinates(65, -399, -232, "y"));
		listA.add(new Coordinates(66, -393, -272, "y"));
		listA.add(new Coordinates(67, -393, -308, "y"));
		listA.add(new Coordinates(68, -393, -364, "y"));
		listA.add(new Coordinates(69, -393, -412, "y"));
		listA.add(new Coordinates(70, -343, -417, "y"));
		listA.add(new Coordinates(71, -332, -448, "b"));
		listA.add(new Coordinates(72, -341, -498, "y"));
		listA.add(new Coordinates(73, -340, -548, "h"));
		listA.add(new Coordinates(74, -343, -603, "g"));
		listA.add(new Coordinates(75, -341, -651, "b"));
		listA.add(new Coordinates(76, -338, -702, "y"));
		listA.add(new Coordinates(77, -285, -705, "y"));
		listA.add(new Coordinates(78, -242, -687, "y"));
		listA.add(new Coordinates(79, -193, -702, "y"));
		listA.add(new Coordinates(80, -145, -712, "y"));
		listA.add(new Coordinates(81, -98, -717, "y"));
		listA.add(new Coordinates(82, -55, -717, "h"));
		listA.add(new Coordinates(83, -1, -706, "y"));
		listA.add(new Coordinates(84, 9, -664, "g"));
		listA.add(new Coordinates(85, 9, -615, "y"));
		listA.add(new Coordinates(86, 9, -570, "y"));
		listA.add(new Coordinates(87, 9, -530, "y"));
		listA.add(new Coordinates(88, 9, -491, "y"));
		listA.add(new Coordinates(89, 9, -445, "y"));
		listA.add(new Coordinates(90, 9, -400, "y"));
		listA.add(new Coordinates(91, 9, -353, "y"));
		listA.add(new Coordinates(92, -31, -340, "y"));
		listA.add(new Coordinates(93, -65, -364, "g"));
		listA.add(new Coordinates(94, -104, -379, "y"));
		listA.add(new Coordinates(95, -150, -381, "y"));
		listA.add(new Coordinates(96, -193, -381, "y"));
		listA.add(new Coordinates(97, -230, -382, "y"));
		listA.add(new Coordinates(98, -278, -385, "h"));
		listA.add(new Coordinates(99, -278, -427, "g"));
		listA.add(new Coordinates(100, -237, -435, "y"));
		listA.add(new Coordinates(101, -196, -437, "y"));
		listA.add(new Coordinates(102, -157, -450, "y"));
		listA.add(new Coordinates(103, -157, -486, "y"));
		listA.add(new Coordinates(104, -198, -498, "g"));
		listA.add(new Coordinates(105, -238, -498, "y"));
		listA.add(new Coordinates(106, -286, -507, "y"));
		listA.add(new Coordinates(107, -284, -543, "y"));
		listA.add(new Coordinates(108, -200, -590, "r"));
		listA.add(new Coordinates(109, -273, -638, "e"));
		
		
		listB.add(new Coordinates(1, 729, 765, "y"));
		listB.add(new Coordinates(2, 573, 761, "g"));
		listB.add(new Coordinates(3, 515, 741, "y"));
		listB.add(new Coordinates(36, 162, 308, "y"));
		listB.add(new Coordinates(37, 191, 336, "y"));
		listB.add(new Coordinates(38, 234, 332, "y"));
		listB.add(new Coordinates(39, 255, 299, "y"));
		listB.add(new Coordinates(40, 280, 268, "y"));
		listB.add(new Coordinates(41, 333, 271, "g"));
		listB.add(new Coordinates(42, 339, 231, "y"));
		listB.add(new Coordinates(43, 328, 187, "y"));
		listB.add(new Coordinates(44, 338, 138, "y"));
		listB.add(new Coordinates(56, 247, 570, "y"));
		listB.add(new Coordinates(57, 276, 539, "y"));
		listB.add(new Coordinates(58, 277, 484, "y"));
		listB.add(new Coordinates(59, 275, 438, "y"));
		listB.add(new Coordinates(60, 407, 415, "y"));
		listB.add(new Coordinates(61, 346, 432, "y"));
		listB.add(new Coordinates(62, 366, 472, "y"));
		listB.add(new Coordinates(87, 771, 213, "y"));
		listB.add(new Coordinates(88, 732, 212, "+200K"));
		listB.add(new Coordinates(89, 689, 226, "y"));
		listB.add(new Coordinates(90, 697, 263, "-100K"));
		listB.add(new Coordinates(91, 733, 294, "+300K"));
		listB.add(new Coordinates(92, 733, 337, "-100K"));
		listB.add(new Coordinates(93, 696, 368, "g"));
	}
	@FXML 
	public ImageView playerTwo; 
	 
	
	
	@FXML
	public ImageView playerOne;
	
	@FXML
	private Label spin;
	public void spin(ActionEvent event)
	{
		 
			int rand = (int)(Math.random()*10)+1;
			spin.setText(""+rand);
			
			if(count % 2 == 0)
			{
				movePlayer1(rand); 
				actionPlayer1();
			}
			else
			{
				movePlayer2(rand); 
			}
			
			count++;
			
	}
	
 
	private void movePlayer1(int spaces)
	{
		
		playerOne.setX(listA.get(locPlayer1 += spaces).getCoordX());
		playerOne.setY(listA.get(locPlayer1).getCoordY());
		
	}
	
	
	private void movePlayer2(int spaces)
	{
		
		playerTwo.setX(listA.get(locPlayer2 += spaces).getCoordX());
		playerTwo.setY(listA.get(locPlayer2).getCoordY());
	}
	
	@FXML
	public Label action;
	private void actionPlayer1()
	{
		if(listA.get(locPlayer1).getIdentifaction().equals("y"))
		{
			int choose = (int)(Math.random()+actionCards.length);
			action.setText(actionCards[choose]);
		}
		
	}
	
	private void actionPlayer2(int x, int y)
	{
		
	}
}
