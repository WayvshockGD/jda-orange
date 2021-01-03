package me.wayv.orange;

public class Main
{
    String token;
    String prefix;
    Boolean dms;
    String ownerID;

    public void Options(String token, String prefix,
                        Boolean dms, String ownerID
    ) {
        this.token = token;
        this.prefix = prefix;
        this.dms = dms;
        this.ownerID = ownerID;
    }

    public void main(String[] args)
    {}

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
}
