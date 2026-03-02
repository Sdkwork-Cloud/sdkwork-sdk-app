package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class QrApi(private val client: HttpClient) {

    /** 生成登录二维码 */
    suspend fun generateQrCode(): PlusApiResultQrCodeVO? {
        return client.post(ApiPaths.appPath("/auth/qr/generate"), null) as? PlusApiResultQrCodeVO
    }

    /** 确认二维码登录 */
    suspend fun confirmQrCodeLogin(body: QrCodeConfirmForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/auth/qr/confirm"), body) as? PlusApiResultVoid
    }

    /** 检查二维码状态 */
    suspend fun checkQrCodeStatus(qrKey: String): PlusApiResultQrCodeStatusVO? {
        return client.get(ApiPaths.appPath("/auth/qr/status/$qrKey")) as? PlusApiResultQrCodeStatusVO
    }
}
