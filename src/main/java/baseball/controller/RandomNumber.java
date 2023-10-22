package baseball.controller;

import baseball.model.Message;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.List;

public class RandomNumber {

    private int NUM_SIZE = Message.GAME_NUMBER_SIZE.getNumber();
    private int NUM_START = Message.GAME_NUMBER_RANGE_START.getNumber();
    private int NUM_END = Message.GAME_NUMBER_RANGE_END.getNumber();

    public void generateRandomNum() {
        List<Integer> computer = new ArrayList<>();

        while (computer.size() < NUM_SIZE) {
            int randomNumber = Randoms.pickNumberInRange(NUM_START, NUM_END);
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }

    }
}
