package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class StyleApi {
    private final HttpClient client;
    
    public StyleApi(HttpClient client) {
        this.client = client;
    }

    /** 获取风格详情 */
    public PlusApiResultGenerationStyleDetailVO getStyle(String styleId) throws Exception {
        return (PlusApiResultGenerationStyleDetailVO) client.get(ApiPaths.appPath("/generation/style/" + styleId + ""));
    }

    /** 更新风格 */
    public PlusApiResultGenerationStyleVO updateStyle(String styleId, GenerationStyleUpdateForm body) throws Exception {
        return (PlusApiResultGenerationStyleVO) client.put(ApiPaths.appPath("/generation/style/" + styleId + ""), body);
    }

    /** 删除风格 */
    public PlusApiResultVoid deleteStyle(String styleId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/generation/style/" + styleId + ""));
    }

    /** 创建风格 */
    public PlusApiResultGenerationStyleVO createStyle(GenerationStyleCreateForm body) throws Exception {
        return (PlusApiResultGenerationStyleVO) client.post(ApiPaths.appPath("/generation/style"), body);
    }

    /** 发布风格 */
    public PlusApiResultVoid publish(String styleId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/generation/style/" + styleId + "/publish"), null);
    }

    /** 取消发布 */
    public PlusApiResultVoid unpublish(String styleId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/generation/style/" + styleId + "/publish"));
    }

    /** 停用风格 */
    public PlusApiResultVoid deactivate(String styleId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/generation/style/" + styleId + "/deactivate"), null);
    }

    /** 激活风格 */
    public PlusApiResultVoid activate(String styleId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/generation/style/" + styleId + "/activate"), null);
    }

    /** 获取风格类型列表 */
    public PlusApiResultListStyleTypeVO getStyleTypes() throws Exception {
        return (PlusApiResultListStyleTypeVO) client.get(ApiPaths.appPath("/generation/style/types"));
    }

    /** 获取风格统计 */
    public PlusApiResultStyleStatisticsVO getStyleStatistics() throws Exception {
        return (PlusApiResultStyleStatisticsVO) client.get(ApiPaths.appPath("/generation/style/statistics"));
    }

    /** 搜索风格 */
    public PlusApiResultPageGenerationStyleVO searchStyles(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageGenerationStyleVO) client.get(ApiPaths.appPath("/generation/style/search"), params);
    }

    /** 获取公开风格 */
    public PlusApiResultPageGenerationStyleVO getPublicStyles(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageGenerationStyleVO) client.get(ApiPaths.appPath("/generation/style/public"), params);
    }

    /** 获取热门风格 */
    public PlusApiResultPageGenerationStyleVO getPopularStyles(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageGenerationStyleVO) client.get(ApiPaths.appPath("/generation/style/popular"), params);
    }

    /** 获取我的风格 */
    public PlusApiResultPageGenerationStyleVO getMyStyles(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageGenerationStyleVO) client.get(ApiPaths.appPath("/generation/style/my"), params);
    }
}
