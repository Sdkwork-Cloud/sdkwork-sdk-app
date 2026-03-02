package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class CartApi {
    private final HttpClient client;
    
    public CartApi(HttpClient client) {
        this.client = client;
    }

    /** 更新购物车商品数量 */
    public PlusApiResultCartItemVO updateItemQuantity(String itemId, UpdateCartItemForm body) throws Exception {
        return (PlusApiResultCartItemVO) client.put(ApiPaths.appPath("/cart/items/" + itemId + ""), body);
    }

    /** 删除购物车商品 */
    public PlusApiResultVoid removeItem(String itemId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/cart/items/" + itemId + ""));
    }

    /** 更新商品选中状态 */
    public PlusApiResultVoid updateItemSelection(String itemId, Map<String, Object> params) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/cart/items/" + itemId + "/select"), null, params);
    }

    /** 批量更新选中状态 */
    public PlusApiResultVoid batchUpdateSelection(BatchSelectForm body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/cart/items/select"), body);
    }

    /** 获取购物车商品列表 */
    public PlusApiResultListCartItemVO getCartItems() throws Exception {
        return (PlusApiResultListCartItemVO) client.get(ApiPaths.appPath("/cart/items"));
    }

    /** 添加商品到购物车 */
    public PlusApiResultCartItemVO addItem(AddCartItemForm body) throws Exception {
        return (PlusApiResultCartItemVO) client.post(ApiPaths.appPath("/cart/items"), body);
    }

    /** 批量删除购物车商品 */
    public PlusApiResultVoid removeItems(Map<String, Object> params) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/cart/items"), params);
    }

    /** 获取当前用户购物车 */
    public PlusApiResultShoppingCartVO getMy() throws Exception {
        return (PlusApiResultShoppingCartVO) client.get(ApiPaths.appPath("/cart"));
    }

    /** 清空购物车 */
    public PlusApiResultVoid clear() throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/cart"));
    }

    /** 获取购物车统计 */
    public PlusApiResultCartStatisticsVO getCartStatistics() throws Exception {
        return (PlusApiResultCartStatisticsVO) client.get(ApiPaths.appPath("/cart/statistics"));
    }

    /** 获取选中的商品列表 */
    public PlusApiResultListCartItemVO getSelectedItems() throws Exception {
        return (PlusApiResultListCartItemVO) client.get(ApiPaths.appPath("/cart/items/selected"));
    }

    /** 检查商品是否在购物车中 */
    public PlusApiResultBoolean checkItemIn(Map<String, Object> params) throws Exception {
        return (PlusApiResultBoolean) client.get(ApiPaths.appPath("/cart/check"), params);
    }
}
