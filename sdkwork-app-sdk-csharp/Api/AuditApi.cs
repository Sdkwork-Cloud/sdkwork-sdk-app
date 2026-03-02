using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class AuditApi
    {
        private readonly HttpClient _client;

        public AuditApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 审核申诉
        /// </summary>
        public async Task<PlusApiResultAuditAppealVO?> SubmitAppealAsync(string recordId, AuditAppealForm body)
        {
            return await _client.PostAsync<PlusApiResultAuditAppealVO>(ApiPaths.AppPath($"/audit/{recordId}/appeal"), body);
        }

        /// <summary>
        /// 视频审核
        /// </summary>
        public async Task<PlusApiResultVideoAuditVO?> VideoAsync(VideoAuditForm body)
        {
            return await _client.PostAsync<PlusApiResultVideoAuditVO>(ApiPaths.AppPath("/audit/video"), body);
        }

        /// <summary>
        /// 文本审核
        /// </summary>
        public async Task<PlusApiResultTextAuditVO?> TextAsync(TextAuditForm body)
        {
            return await _client.PostAsync<PlusApiResultTextAuditVO>(ApiPaths.AppPath("/audit/text"), body);
        }

        /// <summary>
        /// 文本替换建议
        /// </summary>
        public async Task<PlusApiResultTextSuggestVO?> SuggestTextReplacementAsync(TextSuggestForm body)
        {
            return await _client.PostAsync<PlusApiResultTextSuggestVO>(ApiPaths.AppPath("/audit/text/suggest"), body);
        }

        /// <summary>
        /// 批量文本审核
        /// </summary>
        public async Task<PlusApiResultBatchTextAuditVO?> BatchAuditTextAsync(BatchTextAuditForm body)
        {
            return await _client.PostAsync<PlusApiResultBatchTextAuditVO>(ApiPaths.AppPath("/audit/text/batch"), body);
        }

        /// <summary>
        /// 敏感词检测
        /// </summary>
        public async Task<PlusApiResultSensitiveWordsVO?> DetectSensitiveWordsAsync(SensitiveWordsForm body)
        {
            return await _client.PostAsync<PlusApiResultSensitiveWordsVO>(ApiPaths.AppPath("/audit/sensitive-words"), body);
        }

        /// <summary>
        /// 行为风险检测
        /// </summary>
        public async Task<PlusApiResultBehaviorRiskVO?> CheckBehaviorRiskAsync(BehaviorRiskCheckForm body)
        {
            return await _client.PostAsync<PlusApiResultBehaviorRiskVO>(ApiPaths.AppPath("/audit/risk/behavior"), body);
        }

        /// <summary>
        /// 账号风险检测
        /// </summary>
        public async Task<PlusApiResultAccountRiskVO?> CheckAccountRiskAsync(AccountRiskCheckForm body)
        {
            return await _client.PostAsync<PlusApiResultAccountRiskVO>(ApiPaths.AppPath("/audit/risk/account"), body);
        }

        /// <summary>
        /// 实时内容审核
        /// </summary>
        public async Task<PlusApiResultRealtimeAuditVO?> RealtimeAsync(RealtimeAuditForm body)
        {
            return await _client.PostAsync<PlusApiResultRealtimeAuditVO>(ApiPaths.AppPath("/audit/realtime"), body);
        }

        /// <summary>
        /// 图片审核
        /// </summary>
        public async Task<PlusApiResultImageAuditVO?> ImageAsync(ImageAuditForm body)
        {
            return await _client.PostAsync<PlusApiResultImageAuditVO>(ApiPaths.AppPath("/audit/image"), body);
        }

        /// <summary>
        /// 图片OCR审核
        /// </summary>
        public async Task<PlusApiResultImageOcrAuditVO?> ImageOcrAsync(ImageOcrAuditForm body)
        {
            return await _client.PostAsync<PlusApiResultImageOcrAuditVO>(ApiPaths.AppPath("/audit/image/ocr"), body);
        }

        /// <summary>
        /// 批量图片审核
        /// </summary>
        public async Task<PlusApiResultBatchImageAuditVO?> BatchAuditImageAsync(BatchImageAuditForm body)
        {
            return await _client.PostAsync<PlusApiResultBatchImageAuditVO>(ApiPaths.AppPath("/audit/image/batch"), body);
        }

        /// <summary>
        /// 综合内容审核
        /// </summary>
        public async Task<PlusApiResultContentAuditVO?> ContentAsync(ContentAuditForm body)
        {
            return await _client.PostAsync<PlusApiResultContentAuditVO>(ApiPaths.AppPath("/audit/content"), body);
        }

        /// <summary>
        /// 音频审核
        /// </summary>
        public async Task<PlusApiResultAudioAuditVO?> AudioAsync(AudioAuditForm body)
        {
            return await _client.PostAsync<PlusApiResultAudioAuditVO>(ApiPaths.AppPath("/audit/audio"), body);
        }

        /// <summary>
        /// 语音审核
        /// </summary>
        public async Task<PlusApiResultAudioAsrAuditVO?> AudioAsrAsync(AudioAsrAuditForm body)
        {
            return await _client.PostAsync<PlusApiResultAudioAsrAuditVO>(ApiPaths.AppPath("/audit/audio/asr"), body);
        }

        /// <summary>
        /// 敏感词库
        /// </summary>
        public async Task<PlusApiResultListSensitiveWordListVO?> ListSensitiveWordAsync()
        {
            return await _client.GetAsync<PlusApiResultListSensitiveWordListVO>(ApiPaths.AppPath("/audit/word-lists"));
        }

        /// <summary>
        /// 视频审核状态
        /// </summary>
        public async Task<PlusApiResultVideoAuditStatusVO?> GetVideoAuditStatusAsync(string taskId)
        {
            return await _client.GetAsync<PlusApiResultVideoAuditStatusVO>(ApiPaths.AppPath($"/audit/video/{taskId}"));
        }

        /// <summary>
        /// 审核记录
        /// </summary>
        public async Task<PlusApiResultPageAuditRecordVO?> ListAuditRecordsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageAuditRecordVO>(ApiPaths.AppPath("/audit/records"), query);
        }

        /// <summary>
        /// 审核记录详情
        /// </summary>
        public async Task<PlusApiResultAuditRecordDetailVO?> GetAuditRecordAsync(string recordId)
        {
            return await _client.GetAsync<PlusApiResultAuditRecordDetailVO>(ApiPaths.AppPath($"/audit/records/{recordId}"));
        }

        /// <summary>
        /// 审核策略
        /// </summary>
        public async Task<PlusApiResultListAuditPolicyVO?> ListAuditPoliciesAsync()
        {
            return await _client.GetAsync<PlusApiResultListAuditPolicyVO>(ApiPaths.AppPath("/audit/policies"));
        }

        /// <summary>
        /// 我的审核记录
        /// </summary>
        public async Task<PlusApiResultPageAuditRecordVO?> ListMyAuditRecordsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageAuditRecordVO>(ApiPaths.AppPath("/audit/my-records"), query);
        }

        /// <summary>
        /// 申诉记录
        /// </summary>
        public async Task<PlusApiResultPageAuditAppealVO?> ListAppealsAsync()
        {
            return await _client.GetAsync<PlusApiResultPageAuditAppealVO>(ApiPaths.AppPath("/audit/appeals"));
        }

        /// <summary>
        /// 申诉状态
        /// </summary>
        public async Task<PlusApiResultAuditAppealStatusVO?> GetAppealStatusAsync(string appealId)
        {
            return await _client.GetAsync<PlusApiResultAuditAppealStatusVO>(ApiPaths.AppPath($"/audit/appeals/{appealId}"));
        }
    }
}
