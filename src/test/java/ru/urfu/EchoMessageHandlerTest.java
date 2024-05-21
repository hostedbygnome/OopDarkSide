package ru.urfu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Тестирование {@link EchoMessageHandler}
 */
class EchoMessageHandlerTest
{
    private final EchoMessageHandler echoMessageHandler = new EchoMessageHandler();

    /**
     * Тестирование обработки простого сообщения
     */
    @Test
    void testHandleSimpleMessage()
    {
        String message = "Тестовое сообщение";
        String handledMessage = echoMessageHandler.handleMessage(message);
        Assertions.assertEquals("Ваше сообщение: '%s'".formatted(message), handledMessage);
    }
}