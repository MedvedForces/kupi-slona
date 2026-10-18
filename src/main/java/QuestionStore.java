public class QuestionStore {
    private final String greetingQuestion;
    private final String teasingQuestion;

    public QuestionStore() {
        this("Купи слона!", "А ты купи слона!");
    }

    public QuestionStore(String greetingQuestion, String teasingQuestion) {
        this.greetingQuestion = greetingQuestion;
        this.teasingQuestion = teasingQuestion;
    }

    public String getGreetingQuestion() {
        return greetingQuestion;
    }

    public String getTeasingQuestion() {
        return teasingQuestion;
    }
}
