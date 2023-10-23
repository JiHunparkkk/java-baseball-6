package baseball.model;

import static baseball.model.NumberRule.NUMBER_RANGE_END;
import static baseball.model.NumberRule.NUMBER_RANGE_START;
import static baseball.model.NumberRule.NUMBER_SIZE;

import baseball.controller.Validation;
import camp.nextstep.edu.missionutils.Randoms;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DecimalNumber {

    private static List<Integer> computer;
    private static List<Integer> user;

    public List<Integer> getComputer() {
        return computer;
    }

    public void setComputer() {
        DecimalNumber.computer = generateRandomNum();
    }

    public List<Integer> getUser() {
        return user;
    }

    public void setUser(String input) {
        Validation.validationGameNumber(input);
        DecimalNumber.user = getStringToList(input);
    }

    private List<Integer> generateRandomNum() {
        List<Integer> computer = new ArrayList<>();

        while (computer.size() < NUMBER_SIZE.getNumber()) {
            int randomNumber = Randoms.pickNumberInRange(NUMBER_RANGE_START.getNumber(), NUMBER_RANGE_END.getNumber());
            if (!computer.contains(randomNumber)) {
                computer.add(randomNumber);
            }
        }
        return computer;
    }

    private List<Integer> getStringToList(String input) {
        String[] strArr = input.split("");
        Integer[] intArr = new Integer[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        List<Integer> list = new ArrayList<>(Arrays.asList(intArr));

        return list;
    }
}
