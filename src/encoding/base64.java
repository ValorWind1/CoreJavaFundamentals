package encoding;

import java.util.Base64;
import java.util.UUID;

public class base64 {
    public static void main(String[] args) {

        // regular encoding
        String original = "Encoding to base 64";
        System.out.println("Original string: " + original);

        String encode = Base64.getEncoder().encodeToString(original.getBytes());
        System.out.println("Encoded string : "+encode);

        byte[] decodedByte = Base64.getDecoder().decode(encode);
        System.out.println(decodedByte);

        String decodedString = new String(decodedByte);
        System.out.println("Decoded String : " + decodedString);


        // URL and file encoding
        String url = "https://www.slack.com";
        System.out.println("URL : "+ url);

        String encodedURL = Base64.getUrlEncoder().encodeToString(url.getBytes());
        System.out.println("Encoded Url: " + encodedURL);

        byte [] decodedByteURL = Base64.getUrlDecoder().decode(encodedURL);
        System.out.println("Decoded Byte URL : " +decodedByteURL);

        String decodedStrURL = new String(decodedByteURL);
        System.out.println(decodedStrURL);

        // MIME encoding
        StringBuilder sb = new StringBuilder();

        for( int i = 0 ; i < 3 ; i++){
            sb.append(UUID.randomUUID().toString());
        }
        System.out.println("Random String :" + sb);

        byte[] encodedMimeByte = sb.toString().getBytes();
        System.out.println("Encoded Mime Byte: " + encodedMimeByte);

        String encodedMimeStr = Base64.getMimeEncoder().encodeToString(encodedMimeByte);
        System.out.println("Encoded Mime String: "+encodedMimeStr);

        byte[] decodedByteMime = Base64.getMimeDecoder().decode(encodedMimeStr);
        System.out.println("Decoded Mime Byte: " + decodedByteMime);

        String decodedMime = new String(decodedByteMime);
        System.out.println("Decoded Mime:" + decodedMime);


        System.out.println("\n\nDecoded: "+ new String(Base64.getMimeDecoder().decode("asdasdasadadasdaddad").toString()));

    }


}
