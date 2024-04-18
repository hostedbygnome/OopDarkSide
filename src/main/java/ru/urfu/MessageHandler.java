package ru.urfu;

/**
 * Обработчик сообщений
 *
 * @author mnovozhilov
 * @since 12.04.2024
 */
public interface MessageHandler
{
    /**
     * Обработать сообщение
     * @param message исходный текст сообщения
     * @return обработанный текст сообщения
     */
    String handleMessage(String message);
}