package ru.gb.telegrambotgateway.button;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;

@Component
public interface Button {

    void setButton(SendMessage sendMessage);

    default ReplyKeyboardMarkup setReplyKeyboard(SendMessage sendMessage) {
        ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(markup);
        markup.setSelective(true);
        markup.setResizeKeyboard(true);
        markup.setOneTimeKeyboard(false);
        return markup;
    }

}
