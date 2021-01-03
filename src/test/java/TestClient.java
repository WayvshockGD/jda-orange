import me.wayv.orange.Main;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class TestClient extends ListenerAdapter
{

    public static void main(String[] args)
    {
        Main client = new Main();
        client.botToken("no");
    }
}
