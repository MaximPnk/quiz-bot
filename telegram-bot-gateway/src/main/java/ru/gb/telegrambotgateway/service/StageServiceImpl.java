package ru.gb.telegrambotgateway.service;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import ru.gb.telegrambotgateway.model.Stage;
import ru.gb.telegrambotgateway.repository.inter.StageRepository;
import ru.gb.telegrambotgateway.service.inter.StageService;


@Service
@RequiredArgsConstructor
@Slf4j
public class StageServiceImpl implements StageService {

    private final StageRepository stageRepository;

    @Override
    public Stage getByChatId(Long chatId) {
        Stage stage = stageRepository.getByChatId(chatId);
        if (stage == null) {
            stage = Stage.MAIN;
            save(chatId, stage);
        }
        return stage;
    }

    @Override
    public void save(Long chatId, Stage stage) {
        stageRepository.save(chatId, stage);
    }
}


