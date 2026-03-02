using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class FeedbackApi
    {
        private readonly HttpClient _client;

        public FeedbackApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 关闭反馈
        /// </summary>
        public async Task<PlusApiResultFeedbackDetailVO?> CloseAsync(string feedbackId, Dictionary<string, object>? query = null)
        {
            return await _client.PutAsync<PlusApiResultFeedbackDetailVO>(ApiPaths.AppPath($"/feedback/{feedbackId}/close"), null, query);
        }

        /// <summary>
        /// 反馈列表
        /// </summary>
        public async Task<PlusApiResultPageFeedbackVO?> ListFeedbackAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageFeedbackVO>(ApiPaths.AppPath("/feedback"), query);
        }

        /// <summary>
        /// 提交反馈
        /// </summary>
        public async Task<PlusApiResultFeedbackVO?> SubmitAsync(FeedbackSubmitForm body)
        {
            return await _client.PostAsync<PlusApiResultFeedbackVO>(ApiPaths.AppPath("/feedback"), body);
        }

        /// <summary>
        /// 追加反馈
        /// </summary>
        public async Task<PlusApiResultFeedbackDetailVO?> FollowUpAsync(string feedbackId, FeedbackFollowUpForm body)
        {
            return await _client.PostAsync<PlusApiResultFeedbackDetailVO>(ApiPaths.AppPath($"/feedback/{feedbackId}/followup"), body);
        }

        /// <summary>
        /// 客服消息列表
        /// </summary>
        public async Task<PlusApiResultPageSupportMessageVO?> ListSupportMessagesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageSupportMessageVO>(ApiPaths.AppPath("/feedback/support/messages"), query);
        }

        /// <summary>
        /// 发送客服消息
        /// </summary>
        public async Task<PlusApiResultSupportMessageVO?> SendSupportMessageAsync(SupportMessageRequest body)
        {
            return await _client.PostAsync<PlusApiResultSupportMessageVO>(ApiPaths.AppPath("/feedback/support/messages"), body);
        }

        /// <summary>
        /// 举报列表
        /// </summary>
        public async Task<PlusApiResultPageReportVO?> ListReportsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageReportVO>(ApiPaths.AppPath("/feedback/reports"), query);
        }

        /// <summary>
        /// 提交举报
        /// </summary>
        public async Task<PlusApiResultReportVO?> SubmitReportAsync(ReportSubmitForm body)
        {
            return await _client.PostAsync<PlusApiResultReportVO>(ApiPaths.AppPath("/feedback/reports"), body);
        }

        /// <summary>
        /// 完成指引
        /// </summary>
        public async Task<PlusApiResultVoid?> CompleteOnboardingStepAsync(string stepId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/feedback/onboarding/{stepId}/complete"), null);
        }

        /// <summary>
        /// FAQ点赞
        /// </summary>
        public async Task<PlusApiResultVoid?> LikeFaqAsync(string faqId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/feedback/faq/{faqId}/like"), null);
        }

        /// <summary>
        /// FAQ点踩
        /// </summary>
        public async Task<PlusApiResultVoid?> DislikeFaqAsync(string faqId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/feedback/faq/{faqId}/dislike"), null);
        }

        /// <summary>
        /// 反馈详情
        /// </summary>
        public async Task<PlusApiResultFeedbackDetailVO?> GetFeedbackDetailAsync(string feedbackId)
        {
            return await _client.GetAsync<PlusApiResultFeedbackDetailVO>(ApiPaths.AppPath($"/feedback/{feedbackId}"));
        }

        /// <summary>
        /// 教程列表
        /// </summary>
        public async Task<PlusApiResultPageTutorialVO?> ListTutorialsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageTutorialVO>(ApiPaths.AppPath("/feedback/tutorials"), query);
        }

        /// <summary>
        /// 教程详情
        /// </summary>
        public async Task<PlusApiResultTutorialDetailVO?> GetTutorialDetailAsync(string tutorialId)
        {
            return await _client.GetAsync<PlusApiResultTutorialDetailVO>(ApiPaths.AppPath($"/feedback/tutorials/{tutorialId}"));
        }

        /// <summary>
        /// 客服信息
        /// </summary>
        public async Task<PlusApiResultSupportInfoVO?> GetSupportInfoAsync()
        {
            return await _client.GetAsync<PlusApiResultSupportInfoVO>(ApiPaths.AppPath("/feedback/support"));
        }

        /// <summary>
        /// 举报详情
        /// </summary>
        public async Task<PlusApiResultReportDetailVO?> GetReportDetailAsync(string reportId)
        {
            return await _client.GetAsync<PlusApiResultReportDetailVO>(ApiPaths.AppPath($"/feedback/reports/{reportId}"));
        }

        /// <summary>
        /// 新手指引
        /// </summary>
        public async Task<PlusApiResultListOnboardingStepVO?> GetOnboardingGuideAsync()
        {
            return await _client.GetAsync<PlusApiResultListOnboardingStepVO>(ApiPaths.AppPath("/feedback/onboarding"));
        }

        /// <summary>
        /// FAQ列表
        /// </summary>
        public async Task<PlusApiResultPageFaqVO?> ListFaqsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageFaqVO>(ApiPaths.AppPath("/feedback/faq"), query);
        }

        /// <summary>
        /// FAQ详情
        /// </summary>
        public async Task<PlusApiResultFaqDetailVO?> GetFaqDetailAsync(string faqId)
        {
            return await _client.GetAsync<PlusApiResultFaqDetailVO>(ApiPaths.AppPath($"/feedback/faq/{faqId}"));
        }

        /// <summary>
        /// 搜索FAQ
        /// </summary>
        public async Task<PlusApiResultListFaqVO?> SearchFaqsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListFaqVO>(ApiPaths.AppPath("/feedback/faq/search"), query);
        }

        /// <summary>
        /// FAQ分类
        /// </summary>
        public async Task<PlusApiResultListFaqCategoryVO?> ListFaqCategoriesAsync()
        {
            return await _client.GetAsync<PlusApiResultListFaqCategoryVO>(ApiPaths.AppPath("/feedback/faq/categories"));
        }
    }
}
