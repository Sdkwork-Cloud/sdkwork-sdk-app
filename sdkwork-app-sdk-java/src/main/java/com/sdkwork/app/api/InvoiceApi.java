package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class InvoiceApi {
    private final HttpClient client;
    
    public InvoiceApi(HttpClient client) {
        this.client = client;
    }

    /** 获取发票详情 */
    public PlusApiResultInvoiceDetailVO getInvoice(String invoiceId) throws Exception {
        return (PlusApiResultInvoiceDetailVO) client.get(ApiPaths.appPath("/invoice/" + invoiceId + ""));
    }

    /** 更新发票 */
    public PlusApiResultInvoiceVO updateInvoice(String invoiceId, InvoiceUpdateForm body) throws Exception {
        return (PlusApiResultInvoiceVO) client.put(ApiPaths.appPath("/invoice/" + invoiceId + ""), body);
    }

    /** 创建发票 */
    public PlusApiResultInvoiceVO createInvoice(InvoiceCreateForm body) throws Exception {
        return (PlusApiResultInvoiceVO) client.post(ApiPaths.appPath("/invoice"), body);
    }

    /** 提交发票 */
    public PlusApiResultInvoiceVO submit(String invoiceId) throws Exception {
        return (PlusApiResultInvoiceVO) client.post(ApiPaths.appPath("/invoice/" + invoiceId + "/submit"), null);
    }

    /** 作废发票 */
    public PlusApiResultVoid cancel(String invoiceId, InvoiceCancelForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/invoice/" + invoiceId + "/cancel"), body);
    }

    /** 获取发票明细 */
    public PlusApiResultListInvoiceItemVO getInvoiceItems(String invoiceId) throws Exception {
        return (PlusApiResultListInvoiceItemVO) client.get(ApiPaths.appPath("/invoice/" + invoiceId + "/items"));
    }

    /** 获取发票统计 */
    public PlusApiResultInvoiceStatisticsVO getInvoiceStatistics() throws Exception {
        return (PlusApiResultInvoiceStatisticsVO) client.get(ApiPaths.appPath("/invoice/statistics"));
    }

    /** 搜索发票 */
    public PlusApiResultPageInvoiceVO searchInvoices(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageInvoiceVO) client.get(ApiPaths.appPath("/invoice/search"), params);
    }

    /** 获取我的发票 */
    public PlusApiResultPageInvoiceVO getMyInvoices(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageInvoiceVO) client.get(ApiPaths.appPath("/invoice/my"), params);
    }
}
