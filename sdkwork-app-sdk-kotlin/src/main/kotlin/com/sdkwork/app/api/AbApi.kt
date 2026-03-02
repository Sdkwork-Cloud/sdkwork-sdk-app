package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class AbApi(private val client: HttpClient) {

    /** 实验反馈 */
    suspend fun submitExperimentFeedback(experimentId: String, body: ExperimentFeedbackForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/abtest/$experimentId/feedback"), body) as? PlusApiResultVoid
    }

    /** 退出实验 */
    suspend fun exitExperiment(experimentId: String, params: Map<String, Any>? = null): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/abtest/$experimentId/exit"), null, params) as? PlusApiResultVoid
    }

    /** 所有特性开关 */
    suspend fun listFeatureFlags(): PlusApiResultListFeatureFlagVO? {
        return client.get(ApiPaths.appPath("/abtest/features")) as? PlusApiResultListFeatureFlagVO
    }

    /** 批量特性开关 */
    suspend fun batchCheckFeatures(body: BatchFeatureCheckForm): PlusApiResultMapStringFeatureFlagVO? {
        return client.post(ApiPaths.appPath("/abtest/features"), body) as? PlusApiResultMapStringFeatureFlagVO
    }

    /** 上报实验曝光 */
    suspend fun trackExperimentExposure(body: ExperimentExposureForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/abtest/exposure"), body) as? PlusApiResultVoid
    }

    /** 上报实验事件 */
    suspend fun trackExperimentEvent(body: ExperimentEventForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/abtest/events"), body) as? PlusApiResultVoid
    }

    /** 上报实验转化 */
    suspend fun trackExperimentConversion(body: ExperimentConversionForm): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/abtest/conversion"), body) as? PlusApiResultVoid
    }

    /** 批量获取分组 */
    suspend fun batchGetAssignments(body: BatchAssignmentForm): PlusApiResultMapStringExperimentAssignmentVO? {
        return client.post(ApiPaths.appPath("/abtest/assignments"), body) as? PlusApiResultMapStringExperimentAssignmentVO
    }

    /** 实验结果 */
    suspend fun getExperimentResults(experimentId: String): PlusApiResultExperimentResultsVO? {
        return client.get(ApiPaths.appPath("/abtest/$experimentId/results")) as? PlusApiResultExperimentResultsVO
    }

    /** 实验报告 */
    suspend fun getExperimentReport(experimentId: String): PlusApiResultExperimentReportVO? {
        return client.get(ApiPaths.appPath("/abtest/$experimentId/report")) as? PlusApiResultExperimentReportVO
    }

    /** UI配置 */
    suspend fun getUiConfig(): PlusApiResultUiConfigVO? {
        return client.get(ApiPaths.appPath("/abtest/ui-config")) as? PlusApiResultUiConfigVO
    }

    /** 灰度配置 */
    suspend fun listRolloutConfigs(): PlusApiResultListRolloutConfigVO? {
        return client.get(ApiPaths.appPath("/abtest/rollouts")) as? PlusApiResultListRolloutConfigVO
    }

    /** 灰度发布 */
    suspend fun checkRollout(rolloutKey: String): PlusApiResultRolloutCheckVO? {
        return client.get(ApiPaths.appPath("/abtest/rollout/$rolloutKey")) as? PlusApiResultRolloutCheckVO
    }

    /** 特性开关 */
    suspend fun checkFeatureFlag(featureKey: String): PlusApiResultFeatureFlagVO? {
        return client.get(ApiPaths.appPath("/abtest/features/$featureKey")) as? PlusApiResultFeatureFlagVO
    }

    /** 可用实验 */
    suspend fun listAvailableExperiments(): PlusApiResultListExperimentVO? {
        return client.get(ApiPaths.appPath("/abtest/experiments")) as? PlusApiResultListExperimentVO
    }

    /** 实验详情 */
    suspend fun getExperimentDetail(experimentId: String): PlusApiResultExperimentDetailVO? {
        return client.get(ApiPaths.appPath("/abtest/experiments/$experimentId")) as? PlusApiResultExperimentDetailVO
    }

    /** 个性化配置 */
    suspend fun getPersonalizedConfig(): PlusApiResultMapStringObject? {
        return client.get(ApiPaths.appPath("/abtest/config")) as? PlusApiResultMapStringObject
    }

    /** 获取实验分组 */
    suspend fun getExperimentAssignment(params: Map<String, Any>? = null): PlusApiResultExperimentAssignmentVO? {
        return client.get(ApiPaths.appPath("/abtest/assignment"), params) as? PlusApiResultExperimentAssignmentVO
    }

    /** 算法配置 */
    suspend fun getAlgorithmConfig(): PlusApiResultAlgorithmConfigVO? {
        return client.get(ApiPaths.appPath("/abtest/algorithm-config")) as? PlusApiResultAlgorithmConfigVO
    }
}
