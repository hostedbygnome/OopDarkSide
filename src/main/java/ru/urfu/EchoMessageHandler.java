package ru.urfu;

/**
 * Эхо-обработчик сообщений
 *
 * @author mnovozhilov
 * @since 12.04.2024
 */
public class EchoMessageHandler
{
    /**
     * Обработать сообщение
     * @param message исходный текст сообщения
     * @return обработанный текст сообщения
     */
    public String handleMessage(String message)
    {
        return "Ваше сообщение: '%s'".formatted(message);
    }
}