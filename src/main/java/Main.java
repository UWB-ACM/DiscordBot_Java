import sx.blah.discord.api.IDiscordClient;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        final String TOKEN;
        BufferedReader configFile;
        try {
            configFile = new BufferedReader(new FileReader("config.ini"));
        } catch (FileNotFoundException e) {
            System.err.println("Cannot find the file. Are you sure it's named correctly?");
            return;
        }

        try {
            TOKEN = configFile.readLine();
            configFile.close();

        } catch (IOException e) {
            System.err.println("The file is empty. Are you sure you included the token?");
            return;
        }

        init(TOKEN);

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