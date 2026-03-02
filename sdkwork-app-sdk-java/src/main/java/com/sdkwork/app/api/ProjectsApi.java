package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class ProjectsApi {
    private final HttpClient client;
    
    public ProjectsApi(HttpClient client) {
        this.client = client;
    }

    /** 获取项目详情 */
    public PlusApiResultProjectDetailVO getProjectDetail(String projectId) throws Exception {
        return (PlusApiResultProjectDetailVO) client.get(ApiPaths.appPath("/projects/" + projectId + ""));
    }

    /** 更新项目 */
    public PlusApiResultProjectVO updateProject(String projectId, ProjectUpdateRequest body) throws Exception {
        return (PlusApiResultProjectVO) client.put(ApiPaths.appPath("/projects/" + projectId + ""), body);
    }

    /** 删除项目 */
    public PlusApiResultVoid deleteProject(String projectId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/projects/" + projectId + ""));
    }

    /** 取消归档项目 */
    public PlusApiResultVoid unarchiveProject(String projectId) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/projects/" + projectId + "/unarchive"), null);
    }

    /** 移动项目 */
    public PlusApiResultVoid moveProject(String projectId, ProjectMoveRequest body) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/projects/" + projectId + "/move"), body);
    }

    /** 归档项目 */
    public PlusApiResultVoid archiveProject(String projectId) throws Exception {
        return (PlusApiResultVoid) client.put(ApiPaths.appPath("/projects/" + projectId + "/archive"), null);
    }

    /** 获取项目列表 */
    public PlusApiResultPageProjectVO listProjects(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageProjectVO) client.get(ApiPaths.appPath("/projects"), params);
    }

    /** 创建项目 */
    public PlusApiResultProjectVO createProject(ProjectCreateRequest body) throws Exception {
        return (PlusApiResultProjectVO) client.post(ApiPaths.appPath("/projects"), body);
    }

    /** 复制项目 */
    public PlusApiResultProjectVO copyProject(String projectId, ProjectCopyRequest body) throws Exception {
        return (PlusApiResultProjectVO) client.post(ApiPaths.appPath("/projects/" + projectId + "/copy"), body);
    }

    /** 项目统计 */
    public PlusApiResultProjectStatisticsVO getProjectStatistics(String projectId) throws Exception {
        return (PlusApiResultProjectStatisticsVO) client.get(ApiPaths.appPath("/projects/" + projectId + "/statistics"));
    }

    /** 搜索项目 */
    public PlusApiResultPageProjectVO search(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageProjectVO) client.get(ApiPaths.appPath("/projects/search"), params);
    }

    /** 最近访问项目 */
    public PlusApiResultListProjectVO listRecent(Map<String, Object> params) throws Exception {
        return (PlusApiResultListProjectVO) client.get(ApiPaths.appPath("/projects/recent"), params);
    }
}
