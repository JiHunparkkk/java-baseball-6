package baseball.controller;

import baseball.model.Message;
import baseball.model.NumberRule;
import java.util.Arrays;

public class Validation {
    private int NUM_SIZE = NumberRule.GAME_NUMBER_SIZE.getNumber();
    private int NUM_START = NumberRule.GAME_NUMBER_RANGE_START.getNumber();
    private int NUM_END = NumberRule.GAME_NUMBER_RANGE_END.getNumber();
    private String WRONG_RANGE_NUMBER = Message.WRONG_RANGE_NUMBER.getMessage();
    private String WRONG_SIZE_NUMBER = Message.WRONG_SIZE_NUMBER.getMessage();
    private String WRONG_OVERLAP_NUMBER = Message.WRONG_OVERLAP_NUMBER.getMessage();

    private String[] number;

    public void validationGameNumber(String number) {
        this.number = number.split("");
        numberRangeValidation();
        numberSizeValidation();
        numberOverlapValidation();
    }

    //1~9 사이 숫자인가?
    private void numberRangeValidation() {
        for (String s : number) {
            int num = Integer.parseInt(s);
            if (!(NUM_START <= num && num <= NUM_END)) {
                throw new IllegalArgumentException(WRONG_RANGE_NUMBER);
            }
        }
    }

    //3자리 숫자인가?
    private void numberSizeValidation() {
        //숫자 범위 유효성 검사에서 걸러지므로, 배열 크기만 검사
        if (number.length != NUM_SIZE) {
            throw new IllegalArgumentException(WRONG_SIZE_NUMBER);
        }
    }

    //중복된 숫자가 있는가?
    private void numberOverlapValidation() {
        if (number.length != Arrays.stream(number).distinct().count()) {
            throw new IllegalArgumentException(WRONG_OVERLAP_NUMBER);
        }
    }
}
