using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class AnnouncementApi
    {
        private readonly HttpClient _client;

        public AnnouncementApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 标记已读
        /// </summary>
        public async Task<PlusApiResultVoid?> MarkAsReadAsync(string announcementId)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/announcement/{announcementId}/read"), null);
        }

        /// <summary>
        /// 全部已读
        /// </summary>
        public async Task<PlusApiResultVoid?> MarkAllAsReadAsync()
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath("/announcement/read/all"), null);
        }

        /// <summary>
        /// 确认公告
        /// </summary>
        public async Task<PlusApiResultVoid?> AcknowledgeAsync(string announcementId)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/announcement/{announcementId}/acknowledge"), null);
        }

        /// <summary>
        /// 关闭弹窗
        /// </summary>
        public async Task<PlusApiResultVoid?> DismissPopupAsync(string popupId, Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/announcement/popups/{popupId}/dismiss"), null, query);
        }

        /// <summary>
        /// 完成引导
        /// </summary>
        public async Task<PlusApiResultVoid?> CompleteOnboardingAsync(Dictionary<string, object>? query = null)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/announcement/onboarding/complete"), null, query);
        }

        /// <summary>
        /// 公告列表
        /// </summary>
        public async Task<PlusApiResultPageAnnouncementVO?> ListAnnouncementsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageAnnouncementVO>(ApiPaths.AppPath("/announcement"), query);
        }

        /// <summary>
        /// 公告详情
        /// </summary>
        public async Task<PlusApiResultAnnouncementDetailVO?> GetAnnouncementDetailAsync(string announcementId)
        {
            return await _client.GetAsync<PlusApiResultAnnouncementDetailVO>(ApiPaths.AppPath($"/announcement/{announcementId}"));
        }

        /// <summary>
        /// 检查更新
        /// </summary>
        public async Task<PlusApiResultUpdateCheckVO?> CheckUpdateAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultUpdateCheckVO>(ApiPaths.AppPath("/announcement/update/check"), query);
        }

        /// <summary>
        /// 更新日志
        /// </summary>
        public async Task<PlusApiResultListChangelogVO?> GetChangelogsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListChangelogVO>(ApiPaths.AppPath("/announcement/update/changelog"), query);
        }

        /// <summary>
        /// 未读公告
        /// </summary>
        public async Task<PlusApiResultListAnnouncementVO?> GetUnreadAnnouncementsAsync()
        {
            return await _client.GetAsync<PlusApiResultListAnnouncementVO>(ApiPaths.AppPath("/announcement/unread"));
        }

        /// <summary>
        /// 未读公告数
        /// </summary>
        public async Task<PlusApiResultInteger?> GetUnreadAnnouncementCountAsync()
        {
            return await _client.GetAsync<PlusApiResultInteger>(ApiPaths.AppPath("/announcement/unread/count"));
        }

        /// <summary>
        /// 系统状态
        /// </summary>
        public async Task<PlusApiResultSystemStatusVO?> GetSystemStatusAsync()
        {
            return await _client.GetAsync<PlusApiResultSystemStatusVO>(ApiPaths.AppPath("/announcement/system/status"));
        }

        /// <summary>
        /// 维护公告
        /// </summary>
        public async Task<PlusApiResultMaintenanceNoticeVO?> GetMaintenanceNoticeAsync()
        {
            return await _client.GetAsync<PlusApiResultMaintenanceNoticeVO>(ApiPaths.AppPath("/announcement/system/maintenance"));
        }

        /// <summary>
        /// 弹窗通知
        /// </summary>
        public async Task<PlusApiResultListPopupNotificationVO?> GetPopupNotificationsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListPopupNotificationVO>(ApiPaths.AppPath("/announcement/popups"), query);
        }

        /// <summary>
        /// 置顶公告
        /// </summary>
        public async Task<PlusApiResultListAnnouncementVO?> GetPinnedAnnouncementsAsync()
        {
            return await _client.GetAsync<PlusApiResultListAnnouncementVO>(ApiPaths.AppPath("/announcement/pinned"));
        }

        /// <summary>
        /// 新用户引导
        /// </summary>
        public async Task<PlusApiResultListOnboardingPageVO?> GetOnboardingPagesAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListOnboardingPageVO>(ApiPaths.AppPath("/announcement/onboarding"), query);
        }

        /// <summary>
        /// 最新公告
        /// </summary>
        public async Task<PlusApiResultListAnnouncementVO?> GetLatestAnnouncementsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListAnnouncementVO>(ApiPaths.AppPath("/announcement/latest"), query);
        }
    }
}
