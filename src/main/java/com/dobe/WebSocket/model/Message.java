package com.dobe.WebSocket.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Builder
@Getter
@Setter
public class Message {
    private String content;
    private String sender;
    private MessageType type;

}
