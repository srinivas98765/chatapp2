package com.example.demo.chat;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class ChatMessage {
    private String content;
    private  String sender;
    private MessageType type;

    public String getSender() {
        return sender;
    }
}
