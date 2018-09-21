package com.fancl.chain;

public class Request {
    private RequestType requestType;
    private String requestDetail;
    private boolean completed = false;

    public Request(RequestType requestType, String requestDetail) {
        this.requestType = requestType;
        this.requestDetail = requestDetail;
    }

    public void completeRequest() {
        this.completed = true;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public String getRequestDetail() {
        return requestDetail;
    }

    public boolean isCompleted() {
        return completed;
    }

    @Override
    public String toString() {
        return "Request{" +
                "requestType=" + requestType +
                ", requestDetail='" + requestDetail + '\'' +
                ", completed=" + completed +
                '}';
    }
}
