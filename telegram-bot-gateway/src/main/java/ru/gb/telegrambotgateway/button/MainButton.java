package ru.gb.telegrambotgateway.button;

import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;

import java.util.ArrayList;
import java.util.List;

public class MainButton implements Button {

    @Override
    public void setButton(SendMessage sendMessage) {
        ReplyKeyboardMarkup markup = setReplyKeyboard(sendMessage);
        List<KeyboardRow> keyboardRows = new ArrayList<KeyboardRow>() {{
            add(new KeyboardRow() {{ add("Играть"); }});
            add(new KeyboardRow() {{ add("Рейтинг"); }});
            add(new KeyboardRow() {{ add("Помощь"); }});
        }};
        markup.setKeyboard(keyboardRows);
    }

}