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
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Board2Controller 
{
	private int count = 0; 
	private int locPlayer1 = -1; 
	private int locPlayer2 = -1;
	private Image image; 
	private ArrayList<Coordinates> listA = new ArrayList<Coordinates>();
	private ArrayList<Coordinates> listB = new ArrayList<Coordinates>();
	private String[] actionCards = {"100Fbank.jpg", "120Fbank.jpg", 
			"20Fplayer.jpg", "20Tbank.jpg", "30Tbank.jpg", 
			"30Tbank2.jpg", "30Tbank3.jpg", "30Tbank4.jpg", 
			"40Fbank.jpg", "40Fbank3.jpg", "40Fbank4.jpg",
			"40fbank2.jpg", "50FPlayer.jpg",
			"50Fbank.jpg", "50Fbank2.jpg", "50Tbank.jpg", 
			"50Tbank2.jpg", "50Tbank3.jpg",	"50Tbank4.jpg", 
			"50Tbank5.jpg", "50Tbank6.jpg", "70Fbank.jpg", 
	"70Fbank2.jpg"}; 

	private ArrayList<House> houses = new ArrayList<House>();

	public Board2Controller()
	{
		//Coordinates for Path A
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
		listA.add(new Coordinates(108, -200, -590, "y"));
		listA.add(new Coordinates(109, -273, -638, "r"));

		//Coordinates for Path B
		listB.add(new Coordinates(1, -153, -56, "y"));
		listB.add(new Coordinates(2, -209, -49, "g"));
		listB.add(new Coordinates(3, -263, -73, "y"));
		listB.add(new Coordinates(4, -278, -42, "y"));
		listB.add(new Coordinates(5, -308, -5, "g"));
		listB.add(new Coordinates(6, -356, -8, "y"));
		listB.add(new Coordinates(7, -402, -13, "y"));
		listB.add(new Coordinates(8, -454, -40, "y"));
		listB.add(new Coordinates(9, -502, -56, "y"));
		listB.add(new Coordinates(10, -548, -25, "g"));
		listB.add(new Coordinates(11, -608, -20, "y")); 
		listB.add(new Coordinates(12, -655, -24, "y"));
		listB.add(new Coordinates(13, -687, -56, "y"));
		listB.add(new Coordinates(14, -701, -100, "y"));
		listB.add(new Coordinates(15, -695, -145, "y")); 
		listB.add(new Coordinates(16, -664, -184, "y"));
		listB.add(new Coordinates(17, -629, -213, "y"));
		listB.add(new Coordinates(18, -631, -264, "y"));
		listB.add(new Coordinates(19, -642, -305, "y"));
		listB.add(new Coordinates(20, -663, -350, "g"));
		listB.add(new Coordinates(21, -678, -389, "y"));
		listB.add(new Coordinates(22, -687, -434, "y"));
		listB.add(new Coordinates(23, -701, -476, "y"));
		listB.add(new Coordinates(24, -705, -527, "h"));
		listB.add(new Coordinates(25, -666, -541, "y"));
		listB.add(new Coordinates(26, -624, -543, "y"));
		listB.add(new Coordinates(27, -617, -510, "y"));
		listB.add(new Coordinates(28, -588, -482, "y"));
		listB.add(new Coordinates(29, -550, -482, "y"));
		listB.add(new Coordinates(30, -521, -508, "y"));
		listB.add(new Coordinates(31, -496, -549, "y"));
		listB.add(new Coordinates(32, -443, -547, "g"));
		listB.add(new Coordinates(33, -435, -586, "y"));
		listB.add(new Coordinates(34, -453, -629, "y"));
		listB.add(new Coordinates(35, -438, -677, "y"));
		listB.add(new Coordinates(36, -424, -709, "y"));
		listB.add(new Coordinates(37, -385, -673, "y"));
		listB.add(new Coordinates(38, -363, -626, "h"));
		listB.add(new Coordinates(39, -373, -587, "y"));
		listB.add(new Coordinates(40, -384, -536, "g"));
		listB.add(new Coordinates(41, -414, -499, "t"));
		listB.add(new Coordinates(42, -451, -471, "y"));
		listB.add(new Coordinates(43, -489, -455, "y"));
		listB.add(new Coordinates(44, -531, -435, "y"));
		listB.add(new Coordinates(45, -561, -404, "y"));
		listB.add(new Coordinates(46, -573, -364, "h"));
		listB.add(new Coordinates(47, -573, -310, "g"));
		listB.add(new Coordinates(48, -574, -275, "y"));
		listB.add(new Coordinates(49, -573, -235, "y"));
		listB.add(new Coordinates(50, -527, -238, "y"));
		listB.add(new Coordinates(51, -499, -271, "y"));
		listB.add(new Coordinates(52, -498, -323, "y"));
		listB.add(new Coordinates(53, -498, -371, "y"));
		listB.add(new Coordinates(54, -472, -397, "y"));
		listB.add(new Coordinates(55, -438, -374, "g"));
		listB.add(new Coordinates(56, -403, -339, "y"));
		listB.add(new Coordinates(57, -373, -345, "y"));
		listB.add(new Coordinates(58, -373, -382, "y"));
		listB.add(new Coordinates(59, -373, -435, "y"));
		listB.add(new Coordinates(60, -324, -439, "y"));
		listB.add(new Coordinates(61, -308, -472, "b"));
		listB.add(new Coordinates(62, -321, -522, "y"));
		listB.add(new Coordinates(63, -321, -573, "h"));
		listB.add(new Coordinates(64, -319, -619, "g"));
		listB.add(new Coordinates(65, -317, -673, "b"));
		listB.add(new Coordinates(66, -308, -731, "y"));
		listB.add(new Coordinates(67, -261, -731, "y"));
		listB.add(new Coordinates(68, -224, -712, "y"));
		listB.add(new Coordinates(69, -176, -731, "y"));
		listB.add(new Coordinates(70, -121, -740, "y"));
		listB.add(new Coordinates(71, -77, -740, "y"));
		listB.add(new Coordinates(72, -31, -740, "h"));
		listB.add(new Coordinates(73, 22, -740, "y"));
		listB.add(new Coordinates(74, 34, -689, "g"));
		listB.add(new Coordinates(75, 37, -638, "y"));
		listB.add(new Coordinates(76, 33, -593, "y"));
		listB.add(new Coordinates(77, -9, -600, "y"));
		listB.add(new Coordinates(78, -48, -593, "+200K"));
		listB.add(new Coordinates(79, -89, -593, "y"));
		listB.add(new Coordinates(80, -82, -555, "-100K"));
		listB.add(new Coordinates(81, -41, -513, "+300K"));
		listB.add(new Coordinates(82, -51, -468, "-200K"));
		listB.add(new Coordinates(83, -82, -439, "g"));
		listB.add(new Coordinates(84, -89, -397, "y"));
		listB.add(new Coordinates(85, -130, -397, "y"));
		listB.add(new Coordinates(86, -171, -407, "y"));
		listB.add(new Coordinates(87, -214, -397, "y"));
		listB.add(new Coordinates(88, -258, -409, "h"));
		listB.add(new Coordinates(89, -267, -455, "g"));
		listB.add(new Coordinates(90, -218, -462, "y"));
		listB.add(new Coordinates(91, -172, -460, "y"));
		listB.add(new Coordinates(92, -137, -471, "y"));
		listB.add(new Coordinates(93, -135, -513, "y"));
		listB.add(new Coordinates(94, -171, -522, "g"));
		listB.add(new Coordinates(95, -218, -528, "y"));
		listB.add(new Coordinates(96, -262, -534, "y"));
		listB.add(new Coordinates(97, -262, -575, "y"));
		listB.add(new Coordinates(98, -184, -606, "y"));
		listB.add(new Coordinates(99, -121, -662, "r"));

		//House ArrayList
		houses.add(new House("House Boat", 200000.00, "gh1.jpg")); 
		houses.add(new House("Teepee", 100000.00, "gh2.jpg")); 
		houses.add(new House("Farm House", 300000.00, "gh3.jpg")); 
		houses.add(new House("Eco House", 200000.00, "gh4.jpg" )); 
		houses.add(new House("Beach Hut", 100000.00, "gh5.jpg")); 
		houses.add(new House("City Penthouse", 600000.00, "gh6.jpg")); 
		houses.add(new House("Idio Apartment", 100000.00, "gh7.jpg")); 
		houses.add(new House("Family House", 250000.00, "gh8.jpg")); 
		houses.add(new House("Ranch House", 600000.00, "gh9.jpg")); 
		houses.add(new House("Luxury Apartment", 250000.0, "gh10.jpg")); 
		houses.add(new House("Windmill", 350000.00, "gh11.jpg")); 
		houses.add(new House("Cozy Cottage", 150000.00, "gh12.jpg")); 
		houses.add(new House("Dream Villa", 300000.00, "gh13.jpg")); 

	}

	@FXML
	public ImageView playerOne;

	@FXML 
	public ImageView playerTwo; 

	@FXML
	public Label action; 

	@FXML
	public ImageView actionCard; 

	@FXML
	public ImageView houseCard; 

	//Labels on Menu: Player 1

	@FXML 
	public Label namePlayer1; 

	@FXML 
	public Label homePlayer1; 

	@FXML
	public Text careerPlayer1; 

	@FXML
	public Label moneyPlayer1; 

	@FXML 
	public Label childrenPlayer1; 

	@FXML 
	public Label player1Info; 

	//Labels on Menu: Player 2

	@FXML 
	public Label namePlayer2; 
 
	@FXML 
	public Label homePlayer2; 

	@FXML
	public Text careerPlayer2; 

	@FXML
	public Label moneyPlayer2; 

	@FXML 
	public Label childrenPlayer2; 


	@FXML 
	public Label player2Info; 

	private void displayCareerInfo()
	{
		//home label taken care of in action class 
		careerPlayer1.setText("Career: " + TwoPlayerScreenController.getCollegeCareer(TwoPlayerScreenController.getOne()));
		careerPlayer2.setText("Career: " + TwoPlayerScreenController.getNonCollegeCareer(TwoPlayerScreenController.getTwo()));
	}

	//really intense Action method adds/subtracts, gives kids, salary 
	private void action(Player play, ArrayList<Coordinates>list, int loc)
	{
		if(list.get(loc).getIdentifaction().equals("y"))  //Action card
		{
			int choose = (int)(Math.random()*actionCards.length); 
			image = new Image(actionCards[choose]); 
			actionCard.setImage(image); 
			if(choose == 0) //Skateboarding Competition 
				play.addMoney(100000);
			else if(choose == 1) //Pet Goat 
				play.addMoney(120000); 
			else if(choose == 2 || choose == 3)  //Lawsuit 
				play.subtractMoney(20000);
			else if(choose == 4 || choose == 5 || choose == 6 || choose == 7) //Mt. Everest //Family Band //Designer Suit //Adventure Playground
				play.subtractMoney(30000);
			else if(choose == 8 || choose == 9 || choose == 10 || choose == 11)// Family of the Year //Children's Book //Set up School //Beautiful forehead
				play.addMoney(40000);
			else if(choose == 12 || choose == 13 || choose == 14)//Lawsuit (deleted 50FPlayers)//Tax Refund //Maze
				play.addMoney(50000);
			else if(choose == 15 || choose == 16 || choose ==17 || choose == 18 || choose == 19 || choose == 20)//Sail Around World //Pass Driving test //Snail farm //Home Cinemea //Online Business
				play.subtractMoney(50000);
			else if(choose == 21 || choose == 22) //Family Tree //Sell flowers
				play.addMoney(70000);

			if(play.getName().equals(TwoPlayerScreenController.getOne().getName()))
				moneyPlayer1.setText("Money: $"  + TwoPlayerScreenController.getOne().getTotalMoney()); 
			else
				moneyPlayer2.setText("Money: $"  + TwoPlayerScreenController.getTwo().getTotalMoney());

		}
		else if(list.get(loc).getIdentifaction().equals("h"))   //House
		{
			int choose = (int)(Math.random()*houses.size()); 
			image = new Image(houses.get(choose).getDescription()); 
			houseCard.setImage(image);
			play.setCostOfHouse(houses.get(choose).getCost());
			play.subtractMoney(houses.get(choose).getCost());
			if(play.getName().equals(TwoPlayerScreenController.getOne().getName()))
			{
				homePlayer1.setText("You got a " + houses.get(choose).getType() + " for " + houses.get(choose).getCost() + "!");
				moneyPlayer1.setText("Money: $"  + TwoPlayerScreenController.getOne().getTotalMoney());
			}

			else
			{
				homePlayer2.setText("You got a " + houses.get(choose).getType() + " for " + houses.get(choose).getCost() + "!");
				moneyPlayer2.setText("Money: $"  + TwoPlayerScreenController.getTwo().getTotalMoney());
			}


		}
		else if(list.get(loc).getIdentifaction().equals("t"))  //Twins
		{
			play.addChildren(2);
			if(play.getName().equals(TwoPlayerScreenController.getOne().getName()))
				childrenPlayer1.setText("Children # : " + TwoPlayerScreenController.getOne().getNumOfChildren());
			else
				childrenPlayer2.setText("Children # : " + TwoPlayerScreenController.getTwo().getNumOfChildren());	
		}
		else if(list.get(loc).getIdentifaction().equals("b")) //baby
		{
			play.addChildren(1);
			if(play.getName().equals(TwoPlayerScreenController.getOne().getName()))
				childrenPlayer1.setText("Children # : " + TwoPlayerScreenController.getOne().getNumOfChildren());
			else
				childrenPlayer2.setText("Children # : " + TwoPlayerScreenController.getTwo().getNumOfChildren());	

		}
		else if(list.get(loc).getIdentifaction().equals("g")) //Salary time 
		{
			play.addMoney(play.getSalary());	

			if(play.getName().equals(TwoPlayerScreenController.getOne().getName()))
				moneyPlayer1.setText("Money: $"  + TwoPlayerScreenController.getOne().getTotalMoney()); 
			else
				moneyPlayer2.setText("Money: $"  + TwoPlayerScreenController.getTwo().getTotalMoney());
		}
		else if(list.get(loc).getIdentifaction().equals("+200K")) //risky
		{
			play.addMoney(200000);
			if(play.getName().equals(TwoPlayerScreenController.getOne().getName()))
				moneyPlayer1.setText("Money: $"  + TwoPlayerScreenController.getOne().getTotalMoney()); 
			else
				moneyPlayer2.setText("Money: $"  + TwoPlayerScreenController.getTwo().getTotalMoney());
		}
		else if(list.get(loc).getIdentifaction().equals("-100K"))  //risky
		{
			play.subtractMoney(100000);
			if(play.getName().equals(TwoPlayerScreenController.getOne().getName()))
				moneyPlayer1.setText("Money: $"  + TwoPlayerScreenController.getOne().getTotalMoney()); 
			else
				moneyPlayer2.setText("Money: $"  + TwoPlayerScreenController.getTwo().getTotalMoney());
			
		}
		else if(list.get(loc).getIdentifaction().equals("+300K"))   //risky
		{
			play.addMoney(300000);
			if(play.getName().equals(TwoPlayerScreenController.getOne().getName()))
				moneyPlayer1.setText("Money: $"  + TwoPlayerScreenController.getOne().getTotalMoney()); 
			else
				moneyPlayer2.setText("Money: $"  + TwoPlayerScreenController.getTwo().getTotalMoney());
			
		}
		else if(list.get(loc).getIdentifaction().equals("-200K")) //risk
		{
			play.subtractMoney(200000);
			if(play.getName().equals(TwoPlayerScreenController.getOne().getName()))
				moneyPlayer1.setText("Money: $"  + TwoPlayerScreenController.getOne().getTotalMoney()); 
			else
				moneyPlayer2.setText("Money: $"  + TwoPlayerScreenController.getTwo().getTotalMoney());
			
		}

	}

	@FXML
	private Label spin;
	public void spin(ActionEvent event)
	{

		if(count == 0)
			displayCareerInfo(); 
		int rand = (int)(Math.random()*10)+1;
		spin.setText(""+rand);

		if(count % 2 == 0 && locPlayer1 < listA.size())
		{
			movePlayer1(rand); 
			action(TwoPlayerScreenController.getOne(), listA, locPlayer1);
		}
		else if(count % 2 != 0 && locPlayer2 < listB.size())  //2nd part needed for one click,  post retirement
		{
			movePlayer2(rand); 
			action(TwoPlayerScreenController.getTwo(), listB, locPlayer2); 
		}

		count++;	
		
		getIsFinished(); 

	}


	private void movePlayer1(int spaces)  //two methods for ease 
	{
		locPlayer1+= spaces; 
		if(locPlayer1 >= listA.size())
		{
			playerOne.setX(listA.get(listA.size()-1).getCoordX());
			playerOne.setY(listA.get(listA.size()-1).getCoordY());
			locPlayer1 = listA.size()-1;                           //makes sure loc stays in bounds
		}
		else
		{
			playerOne.setX(listA.get(locPlayer1).getCoordX());
			playerOne.setY(listA.get(locPlayer1).getCoordY());

		}

	}

	private void movePlayer2(int spaces)
	{
		locPlayer2+= spaces;   
		if(locPlayer2 >= listB.size())
		{
			playerTwo.setX(listB.get(listB.size()-1).getCoordX());
			playerTwo.setY(listB.get(listB.size()-1).getCoordY());
			locPlayer2 = listB.size()-1;                          //makes sure loc stays in bounds
		}
		else
		{
			playerTwo.setX(listB.get(locPlayer2).getCoordX());
			playerTwo.setY(listB.get(locPlayer2).getCoordY());
		}

	}

	
	private void getIsFinished()
	{
		if(locPlayer1 >= listA.size()-1 && locPlayer2 >= listB.size()-1)
		{
			TwoPlayerScreenController.getOne().addMoney(TwoPlayerScreenController.getOne().getCostOfHouse() + (TwoPlayerScreenController.getOne().getNumOfChildren()*100000));
			TwoPlayerScreenController.getTwo().addMoney(TwoPlayerScreenController.getTwo().getCostOfHouse() + (TwoPlayerScreenController.getTwo().getNumOfChildren()*100000));
			
			moneyPlayer1.setText("Money: $"  + TwoPlayerScreenController.getOne().getTotalMoney()); 
			moneyPlayer2.setText("Money: $"  + TwoPlayerScreenController.getTwo().getTotalMoney());
			
		  if(TwoPlayerScreenController.getOne().getTotalMoney() > TwoPlayerScreenController.getTwo().getTotalMoney())
		  {
			  player1Info.setText("Congrats " + TwoPlayerScreenController.getOne().getName() + ", you've won the game!");
			  player2Info.setText("Sorry " + TwoPlayerScreenController.getTwo().getName() + ", you weren't so lucky...");
		  }
		  else if(TwoPlayerScreenController.getOne().getTotalMoney() < TwoPlayerScreenController.getTwo().getTotalMoney())
		  {
			  player1Info.setText("Sorry " + TwoPlayerScreenController.getOne().getName() + ", you weren't so lucky...");
			  player2Info.setText("Congrats " + TwoPlayerScreenController.getTwo().getName() + ", you've won the game!");
		  }
		  else
		  {

			  player1Info.setText("It's a tie, " + TwoPlayerScreenController.getOne().getName() + " & " + TwoPlayerScreenController.getTwo().getName());
			  player2Info.setText("It's a tie, " + TwoPlayerScreenController.getTwo().getName() + " & " + TwoPlayerScreenController.getOne().getName());
		  }
		}
	}
}





