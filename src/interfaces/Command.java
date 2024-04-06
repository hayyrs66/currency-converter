package interfaces;

import java.io.IOException;

public interface Command {
    void execute(double amount) throws IOException, InterruptedException;
}
