package sender;

public class Sender {

    private final Validator validator;
    private final MailClient mailClient;

    public Sender(Validator validator, MailClient mailClient) {
        this.validator = validator;
        this.mailClient = mailClient;
    }


    void sendMessage(String emil, String text) {
        if (validator.validate(emil)) {
            mailClient.sendText(emil, text);
        } else {
            throw new RuntimeException("Не валидная почта " + emil);
        }
    }

}
