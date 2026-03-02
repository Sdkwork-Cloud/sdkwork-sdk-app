package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class InvoiceApi(private val client: HttpClient) {

    /** 获取发票详情 */
    suspend fun getInvoice(invoiceId: String): PlusApiResultInvoiceDetailVO? {
        return client.get(ApiPaths.appPath("/invoice/$invoiceId")) as? PlusApiResultInvoiceDetailVO
    }

    /** 更新发票 */
    suspend fun updateInvoice(invoiceId: String, body: InvoiceUpdateForm): PlusApiResultInvoiceVO? {
        return client.put(ApiPaths.appPath("/invoice/$invoiceId"), body) as? PlusApiResultInvoiceVO
    }

    /** 创建发票 */
    suspend fun createInvoice(body: InvoiceCreateForm): PlusApiResultInvoiceVO? {
        return client.post(ApiPaths.appPath("/invoice"), body) as? PlusApiResultInvoiceVO
    }

    /** 提交发票 */
    suspend fun submit(invoiceId: String): PlusApiResultInvoiceVO? {
        return client.post(ApiPaths.appPath("/invoice/$invoiceId/submit"), null) as? PlusApiResultInvoiceVO
    }

    /** 作废发票 */
    suspend fun cancel(invoiceId: String, body: InvoiceCancelForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/invoice/$invoiceId/cancel"), body) as? PlusApiResultVoid
    }

    /** 获取发票明细 */
    suspend fun getInvoiceItems(invoiceId: String): PlusApiResultListInvoiceItemVO? {
        return client.get(ApiPaths.appPath("/invoice/$invoiceId/items")) as? PlusApiResultListInvoiceItemVO
    }

    /** 获取发票统计 */
    suspend fun getInvoiceStatistics(): PlusApiResultInvoiceStatisticsVO? {
        return client.get(ApiPaths.appPath("/invoice/statistics")) as? PlusApiResultInvoiceStatisticsVO
    }

    /** 搜索发票 */
    suspend fun searchInvoices(params: Map<String, Any>? = null): PlusApiResultPageInvoiceVO? {
        return client.get(ApiPaths.appPath("/invoice/search"), params) as? PlusApiResultPageInvoiceVO
    }

    /** 获取我的发票 */
    suspend fun getMyInvoices(params: Map<String, Any>? = null): PlusApiResultPageInvoiceVO? {
        return client.get(ApiPaths.appPath("/invoice/my"), params) as? PlusApiResultPageInvoiceVO
    }
}
