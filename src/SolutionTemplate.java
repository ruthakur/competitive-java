import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class SolutionTemplate {

    FastScanner in;
    PrintWriter out;

    public void solve() throws IOException {
        // Solution here
    }

    public void run() throws IOException {
        in = new FastScanner(new FileInputStream(".in"));
        out = new PrintWriter(new FileOutputStream(".out"));

        solve();

        out.close();
    }

    public static void main(String[] args) throws IOException {
        new SolutionTemplate().run();
    }
}
