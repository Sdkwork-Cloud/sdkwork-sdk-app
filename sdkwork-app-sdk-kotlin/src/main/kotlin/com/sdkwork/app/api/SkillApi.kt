package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class SkillApi(private val client: HttpClient) {

    /** Get skill detail */
    suspend fun detail(skillId: String): PlusApiResultSkillVO? {
        return client.get(ApiPaths.appPath("/skills/$skillId")) as? PlusApiResultSkillVO
    }

    /** Update skill */
    suspend fun update(skillId: String, body: SkillSaveForm): PlusApiResultSkillVO? {
        return client.put(ApiPaths.appPath("/skills/$skillId"), body) as? PlusApiResultSkillVO
    }

    /** Update user skill config */
    suspend fun updateConfig(skillId: String, body: SkillConfigUpdateForm? = null): PlusApiResultUserSkillVO? {
        return client.put(ApiPaths.appPath("/skills/$skillId/config"), body) as? PlusApiResultUserSkillVO
    }

    /** List market skills */
    suspend fun list(params: Map<String, Any>? = null): PlusApiResultPageSkillVO? {
        return client.get(ApiPaths.appPath("/skills"), params) as? PlusApiResultPageSkillVO
    }

    /** Create skill */
    suspend fun create(body: SkillSaveForm): PlusApiResultSkillVO? {
        return client.post(ApiPaths.appPath("/skills"), body) as? PlusApiResultSkillVO
    }

    /** Submit skill for review */
    suspend fun submitReview(skillId: String): PlusApiResultSkillVO? {
        return client.post(ApiPaths.appPath("/skills/$skillId/submit-review"), null) as? PlusApiResultSkillVO
    }

    /** Publish skill to market */
    suspend fun publish(skillId: String): PlusApiResultSkillVO? {
        return client.post(ApiPaths.appPath("/skills/$skillId/publish"), null) as? PlusApiResultSkillVO
    }

    /** Offline skill from market */
    suspend fun offline(skillId: String): PlusApiResultSkillVO? {
        return client.post(ApiPaths.appPath("/skills/$skillId/offline"), null) as? PlusApiResultSkillVO
    }

    /** Enable skill for current user */
    suspend fun enable(skillId: String): PlusApiResultUserSkillVO? {
        return client.post(ApiPaths.appPath("/skills/$skillId/enable"), null) as? PlusApiResultUserSkillVO
    }

    /** Disable skill for current user */
    suspend fun disable(skillId: String): PlusApiResultBoolean? {
        return client.post(ApiPaths.appPath("/skills/$skillId/disable"), null) as? PlusApiResultBoolean
    }

    /** List skill packages */
    suspend fun listPackages(): PlusApiResultListSkillPackageVO? {
        return client.get(ApiPaths.appPath("/skills/packages")) as? PlusApiResultListSkillPackageVO
    }

    /** List my installed skills */
    suspend fun listMine(): PlusApiResultListUserSkillVO? {
        return client.get(ApiPaths.appPath("/skills/my")) as? PlusApiResultListUserSkillVO
    }

    /** List skill categories */
    suspend fun listCategories(): PlusApiResultListSkillCategoryVO? {
        return client.get(ApiPaths.appPath("/skills/categories")) as? PlusApiResultListSkillCategoryVO
    }
}
