package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class CurrencyApi(private val client: HttpClient) {

    /** 创建货币 */
    suspend fun createCurrency(body: CurrencyCreateForm): PlusApiResultCurrencyVO? {
        return client.post(ApiPaths.appPath("/currency"), body) as? PlusApiResultCurrencyVO
    }

    /** 禁用货币 */
    suspend fun deactivate(currencyId: String): PlusApiResultCurrencyVO? {
        return client.post(ApiPaths.appPath("/currency/$currencyId/deactivate"), null) as? PlusApiResultCurrencyVO
    }

    /** 启用货币 */
    suspend fun activate(currencyId: String): PlusApiResultCurrencyVO? {
        return client.post(ApiPaths.appPath("/currency/$currencyId/activate"), null) as? PlusApiResultCurrencyVO
    }

    /** 创建汇率 */
    suspend fun createExchangeRate(body: ExchangeRateCreateForm): PlusApiResultExchangeRateVO? {
        return client.post(ApiPaths.appPath("/currency/rate"), body) as? PlusApiResultExchangeRateVO
    }

    /** 货币兑换计算 */
    suspend fun convert(body: CurrencyConvertForm): PlusApiResultCurrencyConvertVO? {
        return client.post(ApiPaths.appPath("/currency/convert"), body) as? PlusApiResultCurrencyConvertVO
    }

    /** 获取货币详情 */
    suspend fun getCurrency(currencyId: String): PlusApiResultCurrencyVO? {
        return client.get(ApiPaths.appPath("/currency/$currencyId")) as? PlusApiResultCurrencyVO
    }

    /** 获取货币类型列表 */
    suspend fun getCurrencyTypes(): PlusApiResultListCurrencyTypeVO? {
        return client.get(ApiPaths.appPath("/currency/types")) as? PlusApiResultListCurrencyTypeVO
    }

    /** 获取最新汇率 */
    suspend fun getLatestRate(params: Map<String, Any>? = null): PlusApiResultExchangeRateVO? {
        return client.get(ApiPaths.appPath("/currency/rate/latest"), params) as? PlusApiResultExchangeRateVO
    }

    /** 获取汇率历史 */
    suspend fun getRateHistory(params: Map<String, Any>? = null): PlusApiResultListExchangeRateVO? {
        return client.get(ApiPaths.appPath("/currency/rate/history"), params) as? PlusApiResultListExchangeRateVO
    }

    /** 获取货币列表 */
    suspend fun getCurrencyList(params: Map<String, Any>? = null): PlusApiResultPageCurrencyVO? {
        return client.get(ApiPaths.appPath("/currency/list"), params) as? PlusApiResultPageCurrencyVO
    }

    /** 根据代码获取货币 */
    suspend fun getCurrencyByCode(code: String): PlusApiResultCurrencyVO? {
        return client.get(ApiPaths.appPath("/currency/code/$code")) as? PlusApiResultCurrencyVO
    }

    /** 获取启用的货币 */
    suspend fun getActiveCurrencies(): PlusApiResultListCurrencyVO? {
        return client.get(ApiPaths.appPath("/currency/active")) as? PlusApiResultListCurrencyVO
    }
}
