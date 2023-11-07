package com.mycompany;

import java.util.ArrayList;

public class Player {
	private String name;
	private String costume;
	private int piecesOfCandy;

	Player(){}
	
	Player(String name, String costume)
	{
		this.name = name;
		this.costume = costume;
	}

	public void trickOrTreat(int numHouses) {
		ArrayList<String> tricks = new ArrayList<>();
		tricks.add("(The homeowner gave you a rock instead of candy.)");
		tricks.add("(The homeowner gave you an apple instead of candy.)");
		tricks.add("(The homeowner sprayed you with silly string and shut the door.)");
		tricks.add("(The homeowner threw a handful of dirt at you and shut the door.)");
		
		boolean treat = false;

		for(int i = 0; i < numHouses;i++)
		{
			System.out.println("\n\n" + this.name + ": Trick or treat!\n");
			
			if(Math.round(Math.random()) == 1)
				treat = true;
			else
				treat = false;
			
			if (treat)
			{
				System.out.println("Homeowner: Oh wow, what a cool " + this.costume + "! Here is some candy!");
				int candyAmount = (int)Math.floor((Math.random()*9) + 1);
				System.out.println("(The homeowner gave you " + candyAmount + " pieces of candy.)\n");
				this.piecesOfCandy += candyAmount;
			}
			else
			{
				System.out.println("Homeowner: Ahhh! A " + this.costume + "!");
				System.out.println(tricks.get((int)Math.round(Math.random()*(tricks.size()-1))) + "\n");
			}

			System.out.println("You have " + this.piecesOfCandy + " pieces of candy.\n");
		}
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}

	public String getCostume()
	{
		return this.costume;
	}

	public void setCostume(String costume)
	{
		this.costume = costume;
	}

	public int getCandy()
	{
		return this.piecesOfCandy;
	}

	public void setCandy(int candyAmount)
	{
		this.piecesOfCandy = candyAmount;
	}
}