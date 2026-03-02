package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class CurrencyApi {
    private final HttpClient client;
    
    public CurrencyApi(HttpClient client) {
        this.client = client;
    }

    /** 创建货币 */
    public PlusApiResultCurrencyVO createCurrency(CurrencyCreateForm body) throws Exception {
        return (PlusApiResultCurrencyVO) client.post(ApiPaths.appPath("/currency"), body);
    }

    /** 禁用货币 */
    public PlusApiResultCurrencyVO deactivate(String currencyId) throws Exception {
        return (PlusApiResultCurrencyVO) client.post(ApiPaths.appPath("/currency/" + currencyId + "/deactivate"), null);
    }

    /** 启用货币 */
    public PlusApiResultCurrencyVO activate(String currencyId) throws Exception {
        return (PlusApiResultCurrencyVO) client.post(ApiPaths.appPath("/currency/" + currencyId + "/activate"), null);
    }

    /** 创建汇率 */
    public PlusApiResultExchangeRateVO createExchangeRate(ExchangeRateCreateForm body) throws Exception {
        return (PlusApiResultExchangeRateVO) client.post(ApiPaths.appPath("/currency/rate"), body);
    }

    /** 货币兑换计算 */
    public PlusApiResultCurrencyConvertVO convert(CurrencyConvertForm body) throws Exception {
        return (PlusApiResultCurrencyConvertVO) client.post(ApiPaths.appPath("/currency/convert"), body);
    }

    /** 获取货币详情 */
    public PlusApiResultCurrencyVO getCurrency(String currencyId) throws Exception {
        return (PlusApiResultCurrencyVO) client.get(ApiPaths.appPath("/currency/" + currencyId + ""));
    }

    /** 获取货币类型列表 */
    public PlusApiResultListCurrencyTypeVO getCurrencyTypes() throws Exception {
        return (PlusApiResultListCurrencyTypeVO) client.get(ApiPaths.appPath("/currency/types"));
    }

    /** 获取最新汇率 */
    public PlusApiResultExchangeRateVO getLatestRate(Map<String, Object> params) throws Exception {
        return (PlusApiResultExchangeRateVO) client.get(ApiPaths.appPath("/currency/rate/latest"), params);
    }

    /** 获取汇率历史 */
    public PlusApiResultListExchangeRateVO getRateHistory(Map<String, Object> params) throws Exception {
        return (PlusApiResultListExchangeRateVO) client.get(ApiPaths.appPath("/currency/rate/history"), params);
    }

    /** 获取货币列表 */
    public PlusApiResultPageCurrencyVO getCurrencyList(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageCurrencyVO) client.get(ApiPaths.appPath("/currency/list"), params);
    }

    /** 根据代码获取货币 */
    public PlusApiResultCurrencyVO getCurrencyByCode(String code) throws Exception {
        return (PlusApiResultCurrencyVO) client.get(ApiPaths.appPath("/currency/code/" + code + ""));
    }

    /** 获取启用的货币 */
    public PlusApiResultListCurrencyVO getActiveCurrencies() throws Exception {
        return (PlusApiResultListCurrencyVO) client.get(ApiPaths.appPath("/currency/active"));
    }
}
