package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class ToolApi(private val client: HttpClient) {

    /** Update tool credentials */
    suspend fun updateCredentials(toolId: String, body: UpdateCredentialsRequest? = null): PlusApiResultMapStringObject? {
        return client.put(ApiPaths.appPath("/tools/my/$toolId/credentials"), body) as? PlusApiResultMapStringObject
    }

    /** List my tools */
    suspend fun listMine(): PlusApiResultListMapStringObject? {
        return client.get(ApiPaths.appPath("/tools/my")) as? PlusApiResultListMapStringObject
    }

    /** Install tool */
    suspend fun install(body: InstallRequest? = null): PlusApiResultMapStringObject? {
        return client.post(ApiPaths.appPath("/tools/my"), body) as? PlusApiResultMapStringObject
    }

    /** Test tool */
    suspend fun test(toolId: String): PlusApiResultMapStringObject? {
        return client.post(ApiPaths.appPath("/tools/market/$toolId/test"), null) as? PlusApiResultMapStringObject
    }

    /** List tool market */
    suspend fun listMarket(params: Map<String, Any>? = null): PlusApiResultListMapStringObject? {
        return client.get(ApiPaths.appPath("/tools/market"), params) as? PlusApiResultListMapStringObject
    }

    /** Get tool market item */
    suspend fun getMarketItem(toolId: String): PlusApiResultMapStringObject? {
        return client.get(ApiPaths.appPath("/tools/market/$toolId")) as? PlusApiResultMapStringObject
    }

    /** List tool categories */
    suspend fun listCategories(): PlusApiResultListMapStringObject? {
        return client.get(ApiPaths.appPath("/tools/categories")) as? PlusApiResultListMapStringObject
    }

    /** Uninstall tool */
    suspend fun uninstall(toolId: String): PlusApiResultVoid? {
        return client.delete(ApiPaths.appPath("/tools/my/$toolId")) as? PlusApiResultVoid
    }
}
