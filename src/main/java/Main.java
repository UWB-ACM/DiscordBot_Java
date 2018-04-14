import sx.blah.discord.api.IDiscordClient;

import java.io.*;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {

        Properties property = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("config.properties");

            // load a properties file
            property.load(input);

            String token = property.getProperty("token");

            input.close();

            if (token != null)
                init(token);
            else
                System.err.println("Token attribute was not found. make sure it is spelled like this: 'token'");

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    //Initializes the discord client app
    //and registers the appropriate event listeners for the bot
    private static void init(final String TOKEN) {

        IDiscordClient cli = BotUtils.getBuiltDiscordClient(TOKEN);

        // Register a listener via the EventSubscriber annotation which allows for organisation and delegation of events
        cli.getDispatcher().registerListener(new BotEvents());

        // Only login after all events are registered otherwise some may be missed.
        cli.login();

    }

}