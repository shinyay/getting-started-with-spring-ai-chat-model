package com.microsoft.shinyay.ai.demo.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChatMessageTest {

    @Test
    public void testGetMessage() {
        ChatMessage chatMessage = new ChatMessage("Hello, World!");
        assertEquals("Hello, World!", chatMessage.getMessage());
    }

    @Test
    public void testSetMessage() {
        ChatMessage chatMessage = new ChatMessage();
        chatMessage.setMessage("Hello, World!");
        assertEquals("Hello, World!", chatMessage.getMessage());
    }
}
