package baseball.controller;

import static baseball.model.NumberRule.NUMBER_SIZE;

import baseball.model.DecimalNumber;
import baseball.view.OutputView;
import java.util.List;

public class ComputerController {

    private DecimalNumber decimalNumber;
    private OutputView outputView;


    public ComputerController(DecimalNumber decimalNumber, OutputView outputView) {
        this.decimalNumber = decimalNumber;
        this.outputView = outputView;
    }

    public void initComputer() {
        decimalNumber.setComputer();
    }

    public Boolean checkAnswer() {
        List<Integer> computer = decimalNumber.getComputer();
        List<Integer> user = decimalNumber.getUser();

        int strike = 0;
        int ball = 0;

        for (int i = 0; i < NUMBER_SIZE.getNumber(); i++) {
            if (computer.get(i).equals(user.get(i))) {
                strike++;
            } else if (computer.contains(user.get(i))) {
                ball++;
            }
        }

        outputView.printHint(ball, strike);

        if (strike == NUMBER_SIZE.getNumber()) {
            return false;
        }
        return true;
    }
}
