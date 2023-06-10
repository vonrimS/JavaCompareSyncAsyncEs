import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        A_RunSyncTasks.run();
        B_RunExecutorTasks.run();
        C_RunAsyncTasks.run();
    }
}