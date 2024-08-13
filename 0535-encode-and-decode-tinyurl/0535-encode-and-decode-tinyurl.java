public class Codec {
    private static final String BASE_URL = "http://tinyurl.com/";
    private int counter;
    private Map<String, String> shortToLong;
    private Map<String, String> longToShort;
    
    public Codec(){
        shortToLong = new HashMap<String, String>();
        longToShort = new HashMap<String, String>();
        counter = 1;
    }

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        
        if (longToShort.containsKey(longUrl)) {
            return longToShort.get(longUrl);
        }
        
        String shortUrl = BASE_URL + counter;
        
        longToShort.put(longUrl,shortUrl);
        shortToLong.put(shortUrl,longUrl);
        
        //incrementing counter
        counter++;
        
        return shortUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return shortToLong.get(shortUrl);
    }
}

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));