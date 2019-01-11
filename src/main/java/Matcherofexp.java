import java.io.Console;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matcherofexp {
    Console console=System.console();
    Pattern pattern= Pattern.compile(console.readLine("%nEnter your regex: "));

    Matcher matcher = pattern.matcher(console.readLine("Enter input string to search: "));
    boolean found = false;
            while (matcher.find()) {
        console.format("%d-%d",
                matcher.start(),
                matcher.end());
        found = true;
    }
           // if(!found){
        console.format("No match found.%n");
    }
}

