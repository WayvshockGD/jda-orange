package me.wayv.orange;

import me.wayv.orange.handlers.Command;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;

import javax.security.auth.login.LoginException;

public class Main
{
    String token;
    String prefix;
    Boolean dms;
    String ownerID;
    String status;

    private void Options(String token, String prefix,
                        Boolean dms, String ownerID, String status
    ) {
        this.token = token;
        this.prefix = prefix;
        this.dms = dms;
        this.ownerID = ownerID;
        this.status = status;
    }

    public void main(String[] args) throws LoginException
    {
        JDABuilder client = JDABuilder.createDefault(token);
        client.setStatus(OnlineStatus.valueOf(status));
        client.addEventListeners(new Main());
        client.addEventListeners(new Command());
        client.setAutoReconnect(true);
        client.build();
    }


    public String botToken()
    {
        return token;
    }
    public String botPrefix()
    {
        return prefix;
    }
    public Boolean dmsEnabled()
    {
        return dms;
    }
    public String OwnerID()
    {
        return ownerID;
    }
    public String OrangeClient()
    {
        return main();
    }

    private String main() {
        return null;
    }
}
