package fr.jpbriend.whazzup;

import fr.jpbriend.whazzup.model.Whazzup;

public class App {
    public static void main( String[] args ) throws Exception {
        WhazzupParser parser = new WhazzupParser("/Users/mudak/dev/workspaces/whazzup-parser/whazzup.txt");
        Whazzup result = parser.parse();
    }
}
