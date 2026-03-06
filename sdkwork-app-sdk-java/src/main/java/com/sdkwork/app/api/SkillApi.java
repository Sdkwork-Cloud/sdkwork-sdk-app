package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class SkillApi {
    private final HttpClient client;
    
    public SkillApi(HttpClient client) {
        this.client = client;
    }

    /** Get skill detail */
    public PlusApiResultSkillVO detail(String skillId) throws Exception {
        return (PlusApiResultSkillVO) client.get(ApiPaths.appPath("/skills/" + skillId + ""));
    }

    /** Update skill */
    public PlusApiResultSkillVO update(String skillId, SkillSaveForm body) throws Exception {
        return (PlusApiResultSkillVO) client.put(ApiPaths.appPath("/skills/" + skillId + ""), body);
    }

    /** Update user skill config */
    public PlusApiResultUserSkillVO updateConfig(String skillId, SkillConfigUpdateForm body) throws Exception {
        return (PlusApiResultUserSkillVO) client.put(ApiPaths.appPath("/skills/" + skillId + "/config"), body);
    }

    /** List market skills */
    public PlusApiResultPageSkillVO list(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageSkillVO) client.get(ApiPaths.appPath("/skills"), params);
    }

    /** Create skill */
    public PlusApiResultSkillVO create(SkillSaveForm body) throws Exception {
        return (PlusApiResultSkillVO) client.post(ApiPaths.appPath("/skills"), body);
    }

    /** Submit skill for review */
    public PlusApiResultSkillVO submitReview(String skillId) throws Exception {
        return (PlusApiResultSkillVO) client.post(ApiPaths.appPath("/skills/" + skillId + "/submit-review"), null);
    }

    /** Publish skill to market */
    public PlusApiResultSkillVO publish(String skillId) throws Exception {
        return (PlusApiResultSkillVO) client.post(ApiPaths.appPath("/skills/" + skillId + "/publish"), null);
    }

    /** Offline skill from market */
    public PlusApiResultSkillVO offline(String skillId) throws Exception {
        return (PlusApiResultSkillVO) client.post(ApiPaths.appPath("/skills/" + skillId + "/offline"), null);
    }

    /** Enable skill for current user */
    public PlusApiResultUserSkillVO enable(String skillId) throws Exception {
        return (PlusApiResultUserSkillVO) client.post(ApiPaths.appPath("/skills/" + skillId + "/enable"), null);
    }

    /** Disable skill for current user */
    public PlusApiResultBoolean disable(String skillId) throws Exception {
        return (PlusApiResultBoolean) client.post(ApiPaths.appPath("/skills/" + skillId + "/disable"), null);
    }

    /** List skill packages */
    public PlusApiResultListSkillPackageVO listPackages() throws Exception {
        return (PlusApiResultListSkillPackageVO) client.get(ApiPaths.appPath("/skills/packages"));
    }

    /** List my installed skills */
    public PlusApiResultListUserSkillVO listMine() throws Exception {
        return (PlusApiResultListUserSkillVO) client.get(ApiPaths.appPath("/skills/my"));
    }

    /** List skill categories */
    public PlusApiResultListSkillCategoryVO listCategories() throws Exception {
        return (PlusApiResultListSkillCategoryVO) client.get(ApiPaths.appPath("/skills/categories"));
    }
}
