package com.example.demo;

public class game {

	computerChoice computerchoice = new computerChoice();
	gameBean gamebean = new gameBean();

	public String Game(String move) {
		String computer = computerchoice.computerchoice();
		String result = checkWhoWon(move, computer);
		return "Ditt val = " + move + ", datorns val = " + computer + ". " + result;
	}

	public String GetResults() {
		String pattern = "{ \"games\":\"%s\", \"wins\":\"%s\", \"losses\":\"%s\", \"ties\": \"%s\"}";
		return String.format(pattern, gamebean.getGameCount(), gamebean.getWins(), gamebean.getLosses(),
				gamebean.getDraws());
	}

	public String checkWhoWon(String userchoice, String computerchoice) {

		gamebean.setGameCount(gamebean.getGameCount() + 1);

		if (computerchoice.equals("sten") && userchoice.equals("påse")) {
			gamebean.setWins(gamebean.getWins() + 1);
			return "Du vann";
		}
		if (computerchoice.equals("sten") && userchoice.equals("sax")) {
			gamebean.setLosses(gamebean.getLosses() + 1);
			return "Datorn vann";
		}
		if (computerchoice.equals("påse") && userchoice.equals("sax")) {
			gamebean.setWins(gamebean.getWins() + 1);
			return "Du vann";
		}
		if (computerchoice.equals("påse") && userchoice.equals("sten")) {
			gamebean.setLosses(gamebean.getLosses() + 1);
			return "Datorn vann";
		}
		if (computerchoice.equals("sax") && userchoice.equals("sten")) {
			gamebean.setWins(gamebean.getWins() + 1);
			return "Du vann";
		}
		if (computerchoice.equals("sax") && userchoice.equals("påse")) {
			gamebean.setLosses(gamebean.getLosses() + 1);
			return "Datorn vann";
		}
		if (computerchoice.equals("sax") && userchoice.equals("sax")) {
			gamebean.setDraws(gamebean.getDraws() + 1);
			return "Det blev lika, testa igen";
		}
		if (computerchoice.equals("påse") && userchoice.equals("påse")) {
			gamebean.setDraws(gamebean.getDraws() + 1);
			return "Det blev lika, testa igen";
		}
		if (computerchoice.equals("sten") && userchoice.equals("sten")) {
			gamebean.setDraws(gamebean.getDraws() + 1);
			return "Det blev lika, testa igen";
		}

		return "Fel, ange giltigt val!";
	}

}
