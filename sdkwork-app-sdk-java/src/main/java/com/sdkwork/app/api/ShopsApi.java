package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class ShopsApi {
    private final HttpClient client;
    
    public ShopsApi(HttpClient client) {
        this.client = client;
    }

    /** 获取店铺详情 */
    public PlusApiResultShopDetailVO getShopDetail(String shopId) throws Exception {
        return (PlusApiResultShopDetailVO) client.get(ApiPaths.appPath("/shops/" + shopId + ""));
    }

    /** 更新店铺 */
    public PlusApiResultShopVO updateShop(String shopId, ShopUpdateForm body) throws Exception {
        return (PlusApiResultShopVO) client.put(ApiPaths.appPath("/shops/" + shopId + ""), body);
    }

    /** 删除店铺 */
    public PlusApiResultVoid deleteShop(String shopId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/shops/" + shopId + ""));
    }

    /** 更新店铺状态 */
    public PlusApiResultVoid updateStatus(String shopId, Map<String, Object> params) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/shops/" + shopId + "/status"), null, params);
    }

    /** 开店营业 */
    public PlusApiResultVoid openShop(String shopId) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/shops/" + shopId + "/open"), null);
    }

    /** 关店休息 */
    public PlusApiResultVoid closeShop(String shopId) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/shops/" + shopId + "/close"), null);
    }

    /** 获取店铺列表 */
    public PlusApiResultPageShopVO listShops(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageShopVO) client.get(ApiPaths.appPath("/shops"), params);
    }

    /** 创建店铺 */
    public PlusApiResultShopVO createShop(ShopCreateForm body) throws Exception {
        return (PlusApiResultShopVO) client.post(ApiPaths.appPath("/shops"), body);
    }

    /** 获取店铺统计 */
    public PlusApiResultShopStatisticsVO getStatistics() throws Exception {
        return (PlusApiResultShopStatisticsVO) client.get(ApiPaths.appPath("/shops/statistics"));
    }

    /** 获取所有激活店铺 */
    public PlusApiResultListShopVO listAllActive() throws Exception {
        return (PlusApiResultListShopVO) client.get(ApiPaths.appPath("/shops/all"));
    }
}
