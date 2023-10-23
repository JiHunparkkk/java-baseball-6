package baseball.model;

public enum Message {
    START("숫자 야구 게임을 시작합니다."),
    END("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요."),
    INPUT("숫자를 입력해주세요 : "),
    BALL("볼"),
    STRIKE("스트라이크"),
    CORRECT("3스트라이크\n" + "3개의 숫자를 모두 맞히셨습니다! 게임 종료"),
    INCORRECT("낫싱"),
    WRONG_RANGE_NUMBER("잘못된 범위의 숫자가 포함되어 있습니다."),
    WRONG_SIZE_NUMBER("숫자의 자릿수가 잘못되었습니다."),
    WRONG_OVERLAP_NUMBER("중복된 숫자가 포함되어 있습니다.");

    private String message;

    Message(String message) {
        this.message = message;
    }
    

    public String getMessage() {
        return message;
    }


}
