package me.wayv.orange.exceptions;

import me.wayv.orange.command.CommandBuilder;

public class CommandException extends CommandBuilder
{
    public void main(String[] args)
    {
        if ( this.CommandName() == null)
        {
            System.out.println(this.CommandName() + " Must be a String / Name");
        } else if ( this.CommandDescription() == null )
        {
            System.out.println(this.CommandDescription() + " Must be a String / Description");
        }
    }
}
