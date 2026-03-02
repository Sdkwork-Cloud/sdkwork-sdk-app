using System;
using System.Collections.Generic;
using System.Threading.Tasks;
using App.Http;
using App.Models;

namespace App.Api
{
    public class NotificationApi
    {
        private readonly HttpClient _client;

        public NotificationApi(HttpClient client)
        {
            _client = client;
        }

        /// <summary>
        /// 标记已读
        /// </summary>
        public async Task<PlusApiResultNotificationVO?> MarkAsReadAsync(string notificationId)
        {
            return await _client.PutAsync<PlusApiResultNotificationVO>(ApiPaths.AppPath($"/notification/{notificationId}/read"), null);
        }

        /// <summary>
        /// 获取推送设置
        /// </summary>
        public async Task<PlusApiResultNotificationSettingsVO?> GetNotificationSettingsAsync()
        {
            return await _client.GetAsync<PlusApiResultNotificationSettingsVO>(ApiPaths.AppPath("/notification/settings"));
        }

        /// <summary>
        /// 更新推送设置
        /// </summary>
        public async Task<PlusApiResultNotificationSettingsVO?> UpdateNotificationSettingsAsync(NotificationSettingsUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultNotificationSettingsVO>(ApiPaths.AppPath("/notification/settings"), body);
        }

        /// <summary>
        /// 更新类型推送设置
        /// </summary>
        public async Task<PlusApiResultVoid?> UpdateTypeSettingsAsync(string type, NotificationTypeSettingsForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/notification/settings/{type}"), body);
        }

        /// <summary>
        /// 全部标记已读
        /// </summary>
        public async Task<PlusApiResultVoid?> MarkAllAsReadAsync(Dictionary<string, object>? query = null)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath("/notification/read/all"), null, query);
        }

        /// <summary>
        /// 批量标记已读
        /// </summary>
        public async Task<PlusApiResultVoid?> BatchMarkAsReadAsync(NotificationBatchReadForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath("/notification/batch/read"), body);
        }

        /// <summary>
        /// 发送测试消息
        /// </summary>
        public async Task<PlusApiResultVoid?> SendTestAsync(TestNotificationForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/notification/test"), body);
        }

        /// <summary>
        /// 订阅列表
        /// </summary>
        public async Task<PlusApiResultListString?> ListSubscriptionsAsync()
        {
            return await _client.GetAsync<PlusApiResultListString>(ApiPaths.AppPath("/notification/subscriptions"));
        }

        /// <summary>
        /// 订阅主题
        /// </summary>
        public async Task<PlusApiResultVoid?> SubscribeTopicAsync(TopicSubscribeForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/notification/subscriptions"), body);
        }

        /// <summary>
        /// 获取设备列表
        /// </summary>
        public async Task<PlusApiResultListDeviceVO?> ListDevicesAsync()
        {
            return await _client.GetAsync<PlusApiResultListDeviceVO>(ApiPaths.AppPath("/notification/devices"));
        }

        /// <summary>
        /// 注册推送设备
        /// </summary>
        public async Task<PlusApiResultVoid?> RegisterDeviceAsync(DeviceRegisterForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/notification/devices"), body);
        }

        /// <summary>
        /// 获取消息列表
        /// </summary>
        public async Task<PlusApiResultPageNotificationVO?> ListNotificationsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageNotificationVO>(ApiPaths.AppPath("/notification"), query);
        }

        /// <summary>
        /// 获取消息详情
        /// </summary>
        public async Task<PlusApiResultNotificationDetailVO?> GetNotificationDetailAsync(string notificationId)
        {
            return await _client.GetAsync<PlusApiResultNotificationDetailVO>(ApiPaths.AppPath($"/notification/{notificationId}"));
        }

        /// <summary>
        /// 删除消息
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteNotificationAsync(string notificationId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/notification/{notificationId}"));
        }

        /// <summary>
        /// 未读消息统计
        /// </summary>
        public async Task<PlusApiResultMapStringInteger?> GetUnreadCountAsync()
        {
            return await _client.GetAsync<PlusApiResultMapStringInteger>(ApiPaths.AppPath("/notification/unread/count"));
        }

        /// <summary>
        /// 消息类型
        /// </summary>
        public async Task<PlusApiResultListNotificationTypeVO?> ListNotificationTypesAsync()
        {
            return await _client.GetAsync<PlusApiResultListNotificationTypeVO>(ApiPaths.AppPath("/notification/types"));
        }

        /// <summary>
        /// 取消订阅
        /// </summary>
        public async Task<PlusApiResultVoid?> UnsubscribeTopicAsync(string topic)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/notification/subscriptions/{topic}"));
        }

        /// <summary>
        /// 注销推送设备
        /// </summary>
        public async Task<PlusApiResultVoid?> UnregisterDeviceAsync(string deviceToken)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/notification/devices/{deviceToken}"));
        }

        /// <summary>
        /// 清空消息
        /// </summary>
        public async Task<PlusApiResultVoid?> ClearAllNotificationsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath("/notification/clear"), query);
        }

        /// <summary>
        /// 批量删除消息
        /// </summary>
        public async Task<PlusApiResultVoid?> BatchDeleteNotificationsAsync()
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath("/notification/batch"));
        }
    }
}
