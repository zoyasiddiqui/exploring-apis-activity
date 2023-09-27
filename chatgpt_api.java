public class chatgpt_api {

    private static final String API_URL = "https://api.openai.com/v1/chat/completions";
    private static final String API_TOKEN = System.getenv("API_TOKEN");

    public static String getApiToken() {
        return API_TOKEN;
    }


}
