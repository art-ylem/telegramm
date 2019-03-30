package com.example.telegram;

public class Messages {
    private int messageImage;
    private String messageName;
    private String messageMessage;
    private String messageTime;

    public Messages(int messageImage, String messageName, String messageMessage, String messageTime) {
        this.messageImage = messageImage;
        this.messageName = messageName;
        this.messageMessage = messageMessage;
        this.messageTime = messageTime;
    }

    public int getMessageImage() {
        return messageImage;
    }

    public void setMessageImage(int messageImage) {
        this.messageImage = messageImage;
    }

    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

    public String getMessageMessage() {
        return messageMessage;
    }

    public void setMessageMessage(String messageMessage) {
        this.messageMessage = messageMessage;
    }

    public String getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(String messageTime) {
        this.messageTime = messageTime;
    }
}
