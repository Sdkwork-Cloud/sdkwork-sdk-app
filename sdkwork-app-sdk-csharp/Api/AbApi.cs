using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class AbApi
    {
        private readonly HttpClient _client;

        public AbApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 实验反馈
        /// </summary>
        public async Task<PlusApiResultVoid?> SubmitExperimentFeedbackAsync(string experimentId, ExperimentFeedbackForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/abtest/{experimentId}/feedback"), body);
        }

        /// <summary>
        /// 退出实验
        /// </summary>
        public async Task<PlusApiResultVoid?> ExitExperimentAsync(string experimentId, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/abtest/{experimentId}/exit"), null, query);
        }

        /// <summary>
        /// 所有特性开关
        /// </summary>
        public async Task<PlusApiResultListFeatureFlagVO?> ListFeatureFlagsAsync()
        {
            return await _client.GetAsync<PlusApiResultListFeatureFlagVO>(ApiPaths.AppPath("/abtest/features"));
        }

        /// <summary>
        /// 批量特性开关
        /// </summary>
        public async Task<PlusApiResultMapStringFeatureFlagVO?> BatchCheckFeaturesAsync(BatchFeatureCheckForm body)
        {
            return await _client.PostAsync<PlusApiResultMapStringFeatureFlagVO>(ApiPaths.AppPath("/abtest/features"), body);
        }

        /// <summary>
        /// 上报实验曝光
        /// </summary>
        public async Task<PlusApiResultVoid?> TrackExperimentExposureAsync(ExperimentExposureForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/abtest/exposure"), body);
        }

        /// <summary>
        /// 上报实验事件
        /// </summary>
        public async Task<PlusApiResultVoid?> TrackExperimentEventAsync(ExperimentEventForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/abtest/events"), body);
        }

        /// <summary>
        /// 上报实验转化
        /// </summary>
        public async Task<PlusApiResultVoid?> TrackExperimentConversionAsync(ExperimentConversionForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/abtest/conversion"), body);
        }

        /// <summary>
        /// 批量获取分组
        /// </summary>
        public async Task<PlusApiResultMapStringExperimentAssignmentVO?> BatchGetAssignmentsAsync(BatchAssignmentForm body)
        {
            return await _client.PostAsync<PlusApiResultMapStringExperimentAssignmentVO>(ApiPaths.AppPath("/abtest/assignments"), body);
        }

        /// <summary>
        /// 实验结果
        /// </summary>
        public async Task<PlusApiResultExperimentResultsVO?> GetExperimentResultsAsync(string experimentId)
        {
            return await _client.GetAsync<PlusApiResultExperimentResultsVO>(ApiPaths.AppPath($"/abtest/{experimentId}/results"));
        }

        /// <summary>
        /// 实验报告
        /// </summary>
        public async Task<PlusApiResultExperimentReportVO?> GetExperimentReportAsync(string experimentId)
        {
            return await _client.GetAsync<PlusApiResultExperimentReportVO>(ApiPaths.AppPath($"/abtest/{experimentId}/report"));
        }

        /// <summary>
        /// UI配置
        /// </summary>
        public async Task<PlusApiResultUiConfigVO?> GetUiConfigAsync()
        {
            return await _client.GetAsync<PlusApiResultUiConfigVO>(ApiPaths.AppPath("/abtest/ui-config"));
        }

        /// <summary>
        /// 灰度配置
        /// </summary>
        public async Task<PlusApiResultListRolloutConfigVO?> ListRolloutConfigsAsync()
        {
            return await _client.GetAsync<PlusApiResultListRolloutConfigVO>(ApiPaths.AppPath("/abtest/rollouts"));
        }

        /// <summary>
        /// 灰度发布
        /// </summary>
        public async Task<PlusApiResultRolloutCheckVO?> CheckRolloutAsync(string rolloutKey)
        {
            return await _client.GetAsync<PlusApiResultRolloutCheckVO>(ApiPaths.AppPath($"/abtest/rollout/{rolloutKey}"));
        }

        /// <summary>
        /// 特性开关
        /// </summary>
        public async Task<PlusApiResultFeatureFlagVO?> CheckFeatureFlagAsync(string featureKey)
        {
            return await _client.GetAsync<PlusApiResultFeatureFlagVO>(ApiPaths.AppPath($"/abtest/features/{featureKey}"));
        }

        /// <summary>
        /// 可用实验
        /// </summary>
        public async Task<PlusApiResultListExperimentVO?> ListAvailableExperimentsAsync()
        {
            return await _client.GetAsync<PlusApiResultListExperimentVO>(ApiPaths.AppPath("/abtest/experiments"));
        }

        /// <summary>
        /// 实验详情
        /// </summary>
        public async Task<PlusApiResultExperimentDetailVO?> GetExperimentDetailAsync(string experimentId)
        {
            return await _client.GetAsync<PlusApiResultExperimentDetailVO>(ApiPaths.AppPath($"/abtest/experiments/{experimentId}"));
        }

        /// <summary>
        /// 个性化配置
        /// </summary>
        public async Task<PlusApiResultMapStringObject?> GetPersonalizedConfigAsync()
        {
            return await _client.GetAsync<PlusApiResultMapStringObject>(ApiPaths.AppPath("/abtest/config"));
        }

        /// <summary>
        /// 获取实验分组
        /// </summary>
        public async Task<PlusApiResultExperimentAssignmentVO?> GetExperimentAssignmentAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultExperimentAssignmentVO>(ApiPaths.AppPath("/abtest/assignment"), query);
        }

        /// <summary>
        /// 算法配置
        /// </summary>
        public async Task<PlusApiResultAlgorithmConfigVO?> GetAlgorithmConfigAsync()
        {
            return await _client.GetAsync<PlusApiResultAlgorithmConfigVO>(ApiPaths.AppPath("/abtest/algorithm-config"));
        }
    }
}
