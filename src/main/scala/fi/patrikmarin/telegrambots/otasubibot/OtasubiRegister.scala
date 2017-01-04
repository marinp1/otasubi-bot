package fi.patrikmarin.telegrambots.otasubibot

import org.telegram.telegrambots.TelegramBotsApi
import org.telegram.telegrambots.logging.BotLogger

object OtasubiRegister extends App {
  
  private var telegramBotsApi: TelegramBotsApi = null;

  def registerBot(): Unit = {
    telegramBotsApi = new TelegramBotsApi()
    
    try {
      telegramBotsApi.registerBot(new OtasubiBot())
    } catch {
      case e: Throwable => BotLogger.error("MAIN", e)
    }
  }

  // Start application
  registerBot();
}