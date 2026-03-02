package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class QrApi {
    private final HttpClient client;
    
    public QrApi(HttpClient client) {
        this.client = client;
    }

    /** 生成登录二维码 */
    public PlusApiResultQrCodeVO generateQrCode() throws Exception {
        return (PlusApiResultQrCodeVO) client.post(ApiPaths.appPath("/auth/qr/generate"), null);
    }

    /** 确认二维码登录 */
    public PlusApiResultVoid confirmQrCodeLogin(QrCodeConfirmForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/auth/qr/confirm"), body);
    }

    /** 检查二维码状态 */
    public PlusApiResultQrCodeStatusVO checkQrCodeStatus(String qrKey) throws Exception {
        return (PlusApiResultQrCodeStatusVO) client.get(ApiPaths.appPath("/auth/qr/status/" + qrKey + ""));
    }
}
