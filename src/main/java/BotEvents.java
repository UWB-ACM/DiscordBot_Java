import sx.blah.discord.api.events.EventSubscriber;
import sx.blah.discord.handle.impl.events.guild.channel.message.MessageReceivedEvent;

public class BotEvents {
    //Simple event listener that will message back
    //if the command "__test" is used
    @EventSubscriber
    public void onMessageReceived(MessageReceivedEvent event){
        if(event.getMessage().getContent().startsWith(BotUtils.BOT_PREFIX + "test"))
            BotUtils.sendMessage(event.getChannel(), "Message received! All good to go captain!");
    }
}