import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class FastScanner {
    BufferedReader br;

    FastScanner(InputStream inputStream) {
        br = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8));
    }

    String next() throws IOException {
        return br.readLine();
    }

    int nextInt() throws IOException {
        return Integer.parseInt(next());
    }
}
