package com.company.Behavional.Mediator;

/**
 * Created by Dima on 17.02.2017.
 */
public class SimpleChatRunner {
    public static void main(String[] args) {

        SimpleTextChat simpleTextChat =  new SimpleTextChat();

        User admin =  new Admin(simpleTextChat,"Admin" );
        User user =  new SimpleUser(simpleTextChat,"User" );
        User user2 =  new SimpleUser(simpleTextChat,"User2" );

        simpleTextChat.setAdmin(admin);
        simpleTextChat.addUserToChat(user);
        simpleTextChat.addUserToChat(user2);

        user.sendMessage("Hello haw are you");

    }
}
