package MathUtils.misc;

import java.nio.ByteBuffer;
import java.util.Base64;

public class Decoder {
    public static int decode(String encoded) {
        return ByteBuffer.wrap(Base64.getDecoder().decode(encoded)).getInt();
    }
}
