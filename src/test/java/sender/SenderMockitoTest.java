package sender;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class SenderMockitoTest {

    MailClient mailClient = Mockito.mock(MailClient.class);
    Validator validator = Mockito.mock(Validator.class);
    Sender sender = new Sender(validator, mailClient);

    @Test
    void whenEmailValidThenSendText() {
        Mockito.when(validator.validate("123")).thenReturn(true);
        sender.sendMessage("123", "Важный текст");
        Mockito.verify(mailClient).sendText("123", "Важный текст");
    }


}