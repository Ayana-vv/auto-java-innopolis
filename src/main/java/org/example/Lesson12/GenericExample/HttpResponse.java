package org.example.Lesson12.GenericExample;

import org.example.Lesson9.BannedUser;

import java.util.Map;

public class HttpResponse<T> {
    public int code;

    private Map<String, String> headers;

    private T body;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public HttpResponse(int code, T body) {
        this.code = code;
        this.body = body;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public T getBody() {
        return body;
    }
}
