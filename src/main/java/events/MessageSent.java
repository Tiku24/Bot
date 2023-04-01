package events;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class MessageSent extends ListenerAdapter {
    @Override
    public void onMessageReceived(MessageReceivedEvent event) {
//        if(event.getMessage().getContentRaw().equals("hello")){
//            event.getChannel().sendMessage("Hello!").queue();
//        }
//        else if (event.getMessage().getContentRaw().equals("I love you")) {
//            event.getChannel().sendMessage("मुझे तुमसे प्यार है!").queue();
//        }
        switch (event.getMessage().getContentRaw()){
            case "hello":
                event.getChannel().sendMessage("Hello!").queue();
                break;
            case "How are you?":
                event.getChannel().sendMessage("Great! tell me about you?").queue();
                break;
            case "where do you live":
                event.getChannel().sendMessage("I live in server").queue();
                break;
            case "what do you do?":
                event.getChannel().sendMessage("मदद").queue();
                break;
            case "Hello":
                event.getChannel().sendMessage("hello!").queue();
                break;
        }
    }
}
