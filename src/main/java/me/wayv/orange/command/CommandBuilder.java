package me.wayv.orange.command;

public class CommandBuilder
{
    String Name;
    String Desc;

    public void Constructor(String CName, String CDesc )
    {
        this.Name = CName;
        this.Desc = CDesc;
    }

    public String CommandName()
    {
        return Name;
    }
    public String CommandDescription()
    {
        return Desc;
    }
}
