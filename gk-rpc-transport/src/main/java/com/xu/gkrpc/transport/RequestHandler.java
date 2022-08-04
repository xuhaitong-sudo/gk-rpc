package com.xu.gkrpc.transport;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * 处理网络请求的 handler
 */
public interface RequestHandler {
    void onRequest(InputStream receive, OutputStream toResp);
}
