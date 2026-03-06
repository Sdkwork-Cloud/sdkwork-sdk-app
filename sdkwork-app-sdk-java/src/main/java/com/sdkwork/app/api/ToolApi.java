package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class ToolApi {
    private final HttpClient client;
    
    public ToolApi(HttpClient client) {
        this.client = client;
    }

    /** Update tool credentials */
    public PlusApiResultMapStringObject updateCredentials(String toolId, UpdateCredentialsRequest body) throws Exception {
        return (PlusApiResultMapStringObject) client.put(ApiPaths.appPath("/tools/my/" + toolId + "/credentials"), body);
    }

    /** List my tools */
    public PlusApiResultListMapStringObject listMine() throws Exception {
        return (PlusApiResultListMapStringObject) client.get(ApiPaths.appPath("/tools/my"));
    }

    /** Install tool */
    public PlusApiResultMapStringObject install(InstallRequest body) throws Exception {
        return (PlusApiResultMapStringObject) client.post(ApiPaths.appPath("/tools/my"), body);
    }

    /** Test tool */
    public PlusApiResultMapStringObject test(String toolId) throws Exception {
        return (PlusApiResultMapStringObject) client.post(ApiPaths.appPath("/tools/market/" + toolId + "/test"), null);
    }

    /** List tool market */
    public PlusApiResultListMapStringObject listMarket(Map<String, Object> params) throws Exception {
        return (PlusApiResultListMapStringObject) client.get(ApiPaths.appPath("/tools/market"), params);
    }

    /** Get tool market item */
    public PlusApiResultMapStringObject getMarketItem(String toolId) throws Exception {
        return (PlusApiResultMapStringObject) client.get(ApiPaths.appPath("/tools/market/" + toolId + ""));
    }

    /** List tool categories */
    public PlusApiResultListMapStringObject listCategories() throws Exception {
        return (PlusApiResultListMapStringObject) client.get(ApiPaths.appPath("/tools/categories"));
    }

    /** Uninstall tool */
    public PlusApiResultVoid uninstall(String toolId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/tools/my/" + toolId + ""));
    }
}
