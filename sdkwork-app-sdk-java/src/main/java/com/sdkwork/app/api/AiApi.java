package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class AiApi {
    private final HttpClient client;
    
    public AiApi(HttpClient client) {
        this.client = client;
    }

    /** 获取提示语详情 */
    public PlusApiResultPromptVO getPromptDetail(String id) throws Exception {
        return (PlusApiResultPromptVO) client.get(ApiPaths.appPath("/prompt/" + id + ""));
    }

    /** 更新提示语 */
    public PlusApiResultPromptVO updatePrompt(String id, PromptUpdateForm body) throws Exception {
        return (PlusApiResultPromptVO) client.put(ApiPaths.appPath("/prompt/" + id + ""), body);
    }

    /** 删除提示语 */
    public PlusApiResultVoid deletePrompt(String id) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/prompt/" + id + ""));
    }

    /** 创建提示语 */
    public PlusApiResultPromptVO createPrompt(PromptCreateForm body) throws Exception {
        return (PlusApiResultPromptVO) client.post(ApiPaths.appPath("/prompt"), body);
    }

    /** 使用提示语 */
    public PlusApiResultVoid usePrompt(String id) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/prompt/" + id + "/use"), null);
    }

    /** 收藏提示语 */
    public PlusApiResultVoid favoritePrompt(String id) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/prompt/" + id + "/favorite"), null);
    }

    /** 取消收藏提示语 */
    public PlusApiResultVoid unfavoritePrompt(String id) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/prompt/" + id + "/favorite"));
    }

    /** 获取热门提示语 */
    public PlusApiResultPagePromptVO getPopularPrompts(Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePromptVO) client.get(ApiPaths.appPath("/prompt/popular"), params);
    }

    /** 获取最受欢迎提示语 */
    public PlusApiResultPagePromptVO getMostFavoritedPrompts(Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePromptVO) client.get(ApiPaths.appPath("/prompt/most-favorited"), params);
    }

    /** 获取提示语列表 */
    public PlusApiResultPagePromptVO listPrompts(Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePromptVO) client.get(ApiPaths.appPath("/prompt/list"), params);
    }

    /** 获取提示语历史详情 */
    public PlusApiResultPromptHistoryVO getPromptHistoryDetail(String id) throws Exception {
        return (PlusApiResultPromptHistoryVO) client.get(ApiPaths.appPath("/prompt/history/" + id + ""));
    }

    /** 删除提示语历史 */
    public PlusApiResultVoid deletePromptHistory(String id) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/prompt/history/" + id + ""));
    }

    /** 获取提示语使用历史 */
    public PlusApiResultPagePromptHistoryVO listPromptHistory(Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePromptHistoryVO) client.get(ApiPaths.appPath("/prompt/history/list"), params);
    }
}
