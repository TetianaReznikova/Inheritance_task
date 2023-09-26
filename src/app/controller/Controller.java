package app.controller;

import app.model.Case1;
import app.model.Case2;
import app.model.Case3;
import app.view.View;

public class Controller {

    public String bet;
    public String winNum;
    private final View view = new View();

    public void runApp() {
        String[] data = view.getData();
        View bet = convertData(view.getData());
        View winNum = convertData(view.getData());

        if (winNum < 3) {
            Case1.calcWinSum(bet)
        } else if (winNum == 3 & winNum < 7) {
            Case2.calcWinSum(bet)
        } else {
            Case3.calcWinSum(bet)
        }
    }

    private View convertData(String[] data) {
        return new View(Double.parseDouble(data[0], Integer.parseInt(data[1]));
    }
}
