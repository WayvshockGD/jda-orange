package me.wayv.orange.handlers;

import me.wayv.orange.Main;
import me.wayv.orange.command.CommandBuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

public class Command extends Main
{
    public void main(String[] args)
    {
        CommandBuilder builder = new CommandBuilder();
        MessageReceivedEvent event = null;


        if (this.dmsEnabled()) {
            assert false;
            event.getChannel().getType();
        }
        else {
            this.dmsEnabled();
        }

        String prefix = this.botPrefix();

        assert false;
        if (event.getMessage().getContentRaw().toLowerCase()
                .equals(prefix + builder.CommandName())) {
            builder.Constructor();
        }
    }
}
