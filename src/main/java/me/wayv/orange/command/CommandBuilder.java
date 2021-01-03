package me.wayv.orange.command;

public class CommandBuilder
{
    String Name;
    String Desc;
    String ownerOnly;

    public void Constructor(String CName, String CDesc, String CommandOwner )
    {
        this.Name = CName;
        this.Desc = CDesc;
        this.ownerOnly = CommandOwner;
    }

    public String CommandName()
    {
        return Name;
    }
    public String CommandDescription()
    {
        return Desc;
    }
    public String OwnerOnly()
    {
        return ownerOnly;
    }

    public void Constructor() {}
}
