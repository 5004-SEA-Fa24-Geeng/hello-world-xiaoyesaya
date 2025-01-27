package student;

/**
 * The Greeting class represents a greeting message for a specific locality.
 * It stores the locality ID, locality name, ASCII and Unicode greetings,
 * and a format string to generate the final greeting message.
 */
public class Greeting {
    /** int value of localityID. */
    private int localityID;
    /** holds localityName. */
    private String localityName;
    /** holds asciiGreeting. */
    private String asciiGreeting;
    /** holds unicodeGreeting. */
    private String unicodeGreeting;
    /** holds formatStr. */
    private String formatStr;

    /**
     * The default greeting is "Hello, {name}!".
     *
     * @param localityID   the ID of the locality
     * @param localityName the name of the locality
     */
    public Greeting(int localityID, String localityName) {
        this(localityID, localityName, "Hello", "Hello", "%s, %%s!");
    }

    /**
     * Greeting that creates a greeting with ascii and unicode characters
     * assuming the language is already using ascii letters only.
     *
     * @param localityID    the ID of the locality
     * @param localityName  the name of the locality
     * @param greeting      the ASCII greeting
     */
    public Greeting(int localityID, String localityName, String greeting){
        this(localityID, localityName, greeting, greeting, "%s, %%s!");
    }

    /**
     * Greeting that creates a greeting with ascii and unicode characters.
     *
     * @param localityID       the ID of the locality
     * @param localityName     the name of the locality
     * @param asciiGreeting    the ASCII greeting
     * @param unicodeGreeting  the Unicode greeting
     * @param formatStr        the format string for the greeting
     */
    public Greeting(int localityID,
                    String localityName,
                    String asciiGreeting,
                    String unicodeGreeting,
                    String formatStr){
        this.localityID = localityID;
        this.localityName = localityName;
        this.asciiGreeting = asciiGreeting;
        this.unicodeGreeting = unicodeGreeting;
        this.formatStr = formatStr;
    }

    /**
     * Returns the locality ID number.
     *
     * @return the locality ID number
     */
    public int getLocalityID() {
        return localityID;
    }

    /**
     * Returns the locality name.
     *
     * @return the locality name
     */
    public String getLocalityName() {
        return localityName;
    }

    /**
     * Returns the ascii greeting.
     *
     * @return the ascii greeting
     */
    public String getAsciiGreeting() {
        return asciiGreeting;
    }

    /**
     * Returns the unicode greeting.
     *
     * @return the unicode greeting
     */
    public String getUnicodeGreeting() {
        return unicodeGreeting;
    }

    /**
     * Gets the unicode format string.
     * This string will have a %s, so that the name can be inserted into the greeting in the correct location.
     *
     * @return the format string with the greeting inserted into the format
     */
    public String getFormatStr() {
        return String.format(formatStr, unicodeGreeting);
    }

    /**
     * Returns the format string with the greeting inserted into the format.
     * This string will have a %s, so that the name can be inserted into the greeting in the correct location.
     *
     * @param asciiOnly - if true, only ascii characters will be used
     * @return the format string with the greeting inserted into the format
     */
    public String getFormatStr(boolean asciiOnly){
        String greeting;
        if(asciiOnly){
            greeting = asciiGreeting;
        }
        else{
            greeting = unicodeGreeting;
        }
        return String.format(formatStr, greeting);
    }

    /**
     * Returns the full greeting details as a string.
     * Example string format:
     * {localityID:1, localityName:"Hawaii", asciiGreeting:"Aloha", unicodeGreeting:"Aloha"}
     *
     * @return the full greeting details as a string
     */
    @Override
    public String toString(){
        return String.format(
                "{localityID:%d, localityName:\"%s\", asciiGreeting:\"%s\", unicodeGreeting:\"%s\"}",
                localityID, localityName, asciiGreeting, unicodeGreeting
        );
    }

}
