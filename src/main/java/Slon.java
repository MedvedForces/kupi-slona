public class Slon {
    public static final String CMD_HELP = "\\help";
    public static final String CMD_EXIT = "\\exit";

    private final QuestionStore questionStore;

    public Slon() {
        this(new QuestionStore());
    }

    public Slon(QuestionStore questionStore) {
        this.questionStore = questionStore;
    }

    public String greeting() {
        return String.format(
                "Привет!\nЯ - продавец слона\nДля справки используй %s или\n%s\n",
                CMD_HELP,
                questionStore.getGreetingQuestion()
        );
    }

    public boolean isExitCommand(String line) {
        return CMD_EXIT.equals(line);
    }

    public String respond(String line) {
        if (CMD_HELP.equals(line)) {
            return greeting();
        }

        return String.format(
                "Все говорят \"%s\".\n%s\n",
                line,
                questionStore.getTeasingQuestion()
        );
    }
}
