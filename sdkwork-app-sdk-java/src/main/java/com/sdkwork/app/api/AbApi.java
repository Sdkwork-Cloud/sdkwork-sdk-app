package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class AbApi {
    private final HttpClient client;
    
    public AbApi(HttpClient client) {
        this.client = client;
    }

    /** 实验反馈 */
    public PlusApiResultVoid submitExperimentFeedback(String experimentId, ExperimentFeedbackForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/abtest/" + experimentId + "/feedback"), body);
    }

    /** 退出实验 */
    public PlusApiResultVoid exitExperiment(String experimentId, Map<String, Object> params) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/abtest/" + experimentId + "/exit"), null, params);
    }

    /** 所有特性开关 */
    public PlusApiResultListFeatureFlagVO listFeatureFlags() throws Exception {
        return (PlusApiResultListFeatureFlagVO) client.get(ApiPaths.appPath("/abtest/features"));
    }

    /** 批量特性开关 */
    public PlusApiResultMapStringFeatureFlagVO batchCheckFeatures(BatchFeatureCheckForm body) throws Exception {
        return (PlusApiResultMapStringFeatureFlagVO) client.post(ApiPaths.appPath("/abtest/features"), body);
    }

    /** 上报实验曝光 */
    public PlusApiResultVoid trackExperimentExposure(ExperimentExposureForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/abtest/exposure"), body);
    }

    /** 上报实验事件 */
    public PlusApiResultVoid trackExperimentEvent(ExperimentEventForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/abtest/events"), body);
    }

    /** 上报实验转化 */
    public PlusApiResultVoid trackExperimentConversion(ExperimentConversionForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/abtest/conversion"), body);
    }

    /** 批量获取分组 */
    public PlusApiResultMapStringExperimentAssignmentVO batchGetAssignments(BatchAssignmentForm body) throws Exception {
        return (PlusApiResultMapStringExperimentAssignmentVO) client.post(ApiPaths.appPath("/abtest/assignments"), body);
    }

    /** 实验结果 */
    public PlusApiResultExperimentResultsVO getExperimentResults(String experimentId) throws Exception {
        return (PlusApiResultExperimentResultsVO) client.get(ApiPaths.appPath("/abtest/" + experimentId + "/results"));
    }

    /** 实验报告 */
    public PlusApiResultExperimentReportVO getExperimentReport(String experimentId) throws Exception {
        return (PlusApiResultExperimentReportVO) client.get(ApiPaths.appPath("/abtest/" + experimentId + "/report"));
    }

    /** UI配置 */
    public PlusApiResultUiConfigVO getUiConfig() throws Exception {
        return (PlusApiResultUiConfigVO) client.get(ApiPaths.appPath("/abtest/ui-config"));
    }

    /** 灰度配置 */
    public PlusApiResultListRolloutConfigVO listRolloutConfigs() throws Exception {
        return (PlusApiResultListRolloutConfigVO) client.get(ApiPaths.appPath("/abtest/rollouts"));
    }

    /** 灰度发布 */
    public PlusApiResultRolloutCheckVO checkRollout(String rolloutKey) throws Exception {
        return (PlusApiResultRolloutCheckVO) client.get(ApiPaths.appPath("/abtest/rollout/" + rolloutKey + ""));
    }

    /** 特性开关 */
    public PlusApiResultFeatureFlagVO checkFeatureFlag(String featureKey) throws Exception {
        return (PlusApiResultFeatureFlagVO) client.get(ApiPaths.appPath("/abtest/features/" + featureKey + ""));
    }

    /** 可用实验 */
    public PlusApiResultListExperimentVO listAvailableExperiments() throws Exception {
        return (PlusApiResultListExperimentVO) client.get(ApiPaths.appPath("/abtest/experiments"));
    }

    /** 实验详情 */
    public PlusApiResultExperimentDetailVO getExperimentDetail(String experimentId) throws Exception {
        return (PlusApiResultExperimentDetailVO) client.get(ApiPaths.appPath("/abtest/experiments/" + experimentId + ""));
    }

    /** 个性化配置 */
    public PlusApiResultMapStringObject getPersonalizedConfig() throws Exception {
        return (PlusApiResultMapStringObject) client.get(ApiPaths.appPath("/abtest/config"));
    }

    /** 获取实验分组 */
    public PlusApiResultExperimentAssignmentVO getExperimentAssignment(Map<String, Object> params) throws Exception {
        return (PlusApiResultExperimentAssignmentVO) client.get(ApiPaths.appPath("/abtest/assignment"), params);
    }

    /** 算法配置 */
    public PlusApiResultAlgorithmConfigVO getAlgorithmConfig() throws Exception {
        return (PlusApiResultAlgorithmConfigVO) client.get(ApiPaths.appPath("/abtest/algorithm-config"));
    }
}
