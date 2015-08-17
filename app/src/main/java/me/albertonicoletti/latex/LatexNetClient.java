package me.albertonicoletti.latex;


import com.loopj.android.http.AsyncHttpClient;
import com.loopj.android.http.AsyncHttpResponseHandler;
import com.loopj.android.http.RequestParams;

/**
 * Utility class for networking
 */
public class LatexNetClient {

    //private static final String BASE_URL = "http://latex-compiler.bitnamiapp.com:1234/";
    private static final String BASE_URL = "http://192.168.1.106:8080/";
    private static AsyncHttpClient client = new AsyncHttpClient();

    public static void post(String url, RequestParams params, AsyncHttpResponseHandler responseHandler) {
        client.post(getAbsoluteUrl(url), params, responseHandler);
    }

    private static String getAbsoluteUrl(String relativeUrl) {
        return BASE_URL + relativeUrl;
    }

}
