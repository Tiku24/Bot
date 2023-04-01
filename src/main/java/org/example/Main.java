package org.example;

import events.*;
import events.MessageEventListener;
import events.ReadyEventListener;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.requests.GatewayIntent;


public class Main {
    public static void main(String[] args){
        final String Token = "MTA4ODQyMjE0MzgzMTgzNDcxNA.G8_W_a.KzKp1py5vwPg5BMJY8EvMQ1weyTRuwmGkxt9FI";
        JDABuilder jdaBuilder = JDABuilder.createDefault(Token);
        JDA jda = jdaBuilder
                .enableIntents(GatewayIntent.MESSAGE_CONTENT, GatewayIntent.GUILD_MESSAGES)
                .addEventListeners(new ReadyEventListener(), new MessageEventListener(), new InteractionEventListener(), new MessageSent())
                .build();

        jda.upsertCommand("slash-cmd", "This is a slash command").setGuildOnly(true).queue();
        jda.upsertCommand("flash-cards","Lists all flash cards set").setGuildOnly(true).queue();
        jda.upsertCommand("hello-tikeshwar","Gritting").setGuildOnly(true).queue();
        jda.upsertCommand("quiz" ,"Gives you a random quiz").setGuildOnly(false).queue();


    }
}