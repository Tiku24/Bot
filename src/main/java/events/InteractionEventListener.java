package events;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class InteractionEventListener extends ListenerAdapter {
    @Override
    public void onSlashCommandInteraction(@NotNull SlashCommandInteractionEvent event) {
        super.onSlashCommandInteraction(event);
        System.out.println("Interaction");
        System.out.println(event.getName());
        switch (event.getName()){
            case "flash-cards":
                event.reply("Here are your flash cards").setEphemeral(true).queue();
                break;
            case "quiz":
                event.reply("Quiz Command").setEphemeral(true).queue();
                break;
            case "slash-cmd":
            event.reply("slash command").setEphemeral(true).queue();
            break;
            case "hello-tikeshwar":
                event.reply("Hii! How can I help you?").setEphemeral(true).queue();
                break;
        }


    }
}
