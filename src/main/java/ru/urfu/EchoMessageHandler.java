package ru.urfu;

/**
 * Эхо-обработчик сообщений
 *
 * @author mnovozhilov
 * @since 12.04.2024
 */
public class EchoMessageHandler implements MessageHandler
{
    @Override
    public String handleMessage(String message)
    {
        return "Ваше сообщение: '%s'".formatted(message);
    }
}