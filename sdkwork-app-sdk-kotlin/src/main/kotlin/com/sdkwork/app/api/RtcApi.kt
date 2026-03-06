package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class RtcApi(private val client: HttpClient) {

    /** Create RTC room */
    suspend fun createRoom(body: CreateRoomRequest? = null): PlusApiResultMapStringObject? {
        return client.post(ApiPaths.appPath("/rtc/rooms"), body) as? PlusApiResultMapStringObject
    }

    /** Create RTC room token */
    suspend fun createRoomToken(roomId: String): PlusApiResultMapStringObject? {
        return client.post(ApiPaths.appPath("/rtc/rooms/$roomId/token"), null) as? PlusApiResultMapStringObject
    }

    /** End RTC room */
    suspend fun endRoom(roomId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/rtc/rooms/$roomId/end"), null) as? PlusApiResultVoid
    }

    /** Get RTC room */
    suspend fun getRoom(roomId: String): PlusApiResultMapStringObject? {
        return client.get(ApiPaths.appPath("/rtc/rooms/$roomId")) as? PlusApiResultMapStringObject
    }

    /** List RTC records */
    suspend fun listRecords(params: Map<String, Any>? = null): PlusApiResultListMapStringObject? {
        return client.get(ApiPaths.appPath("/rtc/records"), params) as? PlusApiResultListMapStringObject
    }
}
