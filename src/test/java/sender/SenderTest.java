package sender;

import org.junit.jupiter.api.Test;

class SenderTest {

    MailClient mailClient = new MailClient();

    Validator validator = new Validator();
    Sender sender = new Sender(validator, mailClient);

    @Test
    void whenEmailValidThenSendText(){
        sender.sendMessage("123", "Важный текст");
    }

}