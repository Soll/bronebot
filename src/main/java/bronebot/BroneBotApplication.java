package bronebot;

import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

import java.util.Map;

public class BroneBotApplication {

    private static final Map<String, String> getenv = System.getenv();

    public static void main(String[] args) {
        try {
            TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
            //botsApi.registerBot(new Bot(getenv.get("BOT_NAME"), getenv.get("BOT_TOKEN")));
            botsApi.registerBot(new Bot("sber_brone_bot", "5988847234:AAEmuoDsSPKwNv6jmIdCRFWcCMI0HO3VaGs"));
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
