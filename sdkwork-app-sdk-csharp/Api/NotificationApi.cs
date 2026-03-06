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
        /// Mark notification as unread
        /// </summary>
        public async Task<PlusApiResultNotificationVO?> MarkAsUnreadAsync(string notificationId)
        {
            return await _client.PutAsync<PlusApiResultNotificationVO>(ApiPaths.AppPath($"/notification/{notificationId}/unread"), null);
        }

        /// <summary>
        /// Mark notification as read
        /// </summary>
        public async Task<PlusApiResultNotificationVO?> MarkAsReadAsync(string notificationId)
        {
            return await _client.PutAsync<PlusApiResultNotificationVO>(ApiPaths.AppPath($"/notification/{notificationId}/read"), null);
        }

        /// <summary>
        /// Get notification settings
        /// </summary>
        public async Task<PlusApiResultNotificationSettingsVO?> GetNotificationSettingsAsync()
        {
            return await _client.GetAsync<PlusApiResultNotificationSettingsVO>(ApiPaths.AppPath("/notification/settings"));
        }

        /// <summary>
        /// Update notification settings
        /// </summary>
        public async Task<PlusApiResultNotificationSettingsVO?> UpdateNotificationSettingsAsync(NotificationSettingsUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultNotificationSettingsVO>(ApiPaths.AppPath("/notification/settings"), body);
        }

        /// <summary>
        /// Update type settings
        /// </summary>
        public async Task<PlusApiResultVoid?> UpdateTypeSettingsAsync(string type, NotificationTypeSettingsForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/notification/settings/{type}"), body);
        }

        /// <summary>
        /// Mark all notifications as read
        /// </summary>
        public async Task<PlusApiResultVoid?> MarkAllAsReadAsync(Dictionary<string, object>? query = null)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath("/notification/read/all"), null, query);
        }

        /// <summary>
        /// Update device status
        /// </summary>
        public async Task<PlusApiResultDeviceVO?> UpdateDeviceStatusAsync(string deviceId, DeviceStatusUpdateForm body)
        {
            return await _client.PutAsync<PlusApiResultDeviceVO>(ApiPaths.AppPath($"/notification/devices/{deviceId}/status"), body);
        }

        /// <summary>
        /// Batch mark notifications as read
        /// </summary>
        public async Task<PlusApiResultVoid?> BatchMarkAsReadAsync(NotificationBatchReadForm body)
        {
            return await _client.PutAsync<PlusApiResultVoid>(ApiPaths.AppPath("/notification/batch/read"), body);
        }

        /// <summary>
        /// Send test notification
        /// </summary>
        public async Task<PlusApiResultVoid?> SendTestAsync(TestNotificationForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/notification/test"), body);
        }

        /// <summary>
        /// List subscriptions
        /// </summary>
        public async Task<PlusApiResultListString?> ListSubscriptionsAsync()
        {
            return await _client.GetAsync<PlusApiResultListString>(ApiPaths.AppPath("/notification/subscriptions"));
        }

        /// <summary>
        /// Subscribe topic
        /// </summary>
        public async Task<PlusApiResultVoid?> SubscribeTopicAsync(TopicSubscribeForm body)
        {
            return await _client.PostAsync<PlusApiResultVoid>(ApiPaths.AppPath("/notification/subscriptions"), body);
        }

        /// <summary>
        /// List devices
        /// </summary>
        public async Task<PlusApiResultListDeviceVO?> ListDevicesAsync()
        {
            return await _client.GetAsync<PlusApiResultListDeviceVO>(ApiPaths.AppPath("/notification/devices"));
        }

        /// <summary>
        /// Register device
        /// </summary>
        public async Task<PlusApiResultDeviceVO?> RegisterDeviceAsync(DeviceRegisterForm body)
        {
            return await _client.PostAsync<PlusApiResultDeviceVO>(ApiPaths.AppPath("/notification/devices"), body);
        }

        /// <summary>
        /// List device messages
        /// </summary>
        public async Task<PlusApiResultListDeviceMessageVO?> ListDeviceMessagesAsync(string deviceId, Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultListDeviceMessageVO>(ApiPaths.AppPath($"/notification/devices/{deviceId}/messages"), query);
        }

        /// <summary>
        /// Send device message
        /// </summary>
        public async Task<PlusApiResultDeviceMessageVO?> SendDeviceMessageAsync(string deviceId, DeviceMessageSendForm body)
        {
            return await _client.PostAsync<PlusApiResultDeviceMessageVO>(ApiPaths.AppPath($"/notification/devices/{deviceId}/messages"), body);
        }

        /// <summary>
        /// Control device
        /// </summary>
        public async Task<PlusApiResultBoolean?> ControlDeviceAsync(string deviceId, DeviceControlForm body)
        {
            return await _client.PostAsync<PlusApiResultBoolean>(ApiPaths.AppPath($"/notification/devices/{deviceId}/control"), body);
        }

        /// <summary>
        /// List notifications
        /// </summary>
        public async Task<PlusApiResultPageNotificationVO?> ListNotificationsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.GetAsync<PlusApiResultPageNotificationVO>(ApiPaths.AppPath("/notification"), query);
        }

        /// <summary>
        /// Get notification detail
        /// </summary>
        public async Task<PlusApiResultNotificationDetailVO?> GetNotificationDetailAsync(string notificationId)
        {
            return await _client.GetAsync<PlusApiResultNotificationDetailVO>(ApiPaths.AppPath($"/notification/{notificationId}"));
        }

        /// <summary>
        /// Delete notification
        /// </summary>
        public async Task<PlusApiResultVoid?> DeleteNotificationAsync(string notificationId)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/notification/{notificationId}"));
        }

        /// <summary>
        /// Get unread notification count
        /// </summary>
        public async Task<PlusApiResultMapStringInteger?> GetUnreadCountAsync()
        {
            return await _client.GetAsync<PlusApiResultMapStringInteger>(ApiPaths.AppPath("/notification/unread/count"));
        }

        /// <summary>
        /// List notification types
        /// </summary>
        public async Task<PlusApiResultListNotificationTypeVO?> ListNotificationTypesAsync()
        {
            return await _client.GetAsync<PlusApiResultListNotificationTypeVO>(ApiPaths.AppPath("/notification/types"));
        }

        /// <summary>
        /// Unsubscribe topic
        /// </summary>
        public async Task<PlusApiResultVoid?> UnsubscribeTopicAsync(string topic)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/notification/subscriptions/{topic}"));
        }

        /// <summary>
        /// Unregister device
        /// </summary>
        public async Task<PlusApiResultVoid?> UnregisterDeviceAsync(string deviceToken)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath($"/notification/devices/{deviceToken}"));
        }

        /// <summary>
        /// Clear notifications
        /// </summary>
        public async Task<PlusApiResultVoid?> ClearAllNotificationsAsync(Dictionary<string, object>? query = null)
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath("/notification/clear"), query);
        }

        /// <summary>
        /// Batch delete notifications
        /// </summary>
        public async Task<PlusApiResultVoid?> BatchDeleteNotificationsAsync()
        {
            return await _client.DeleteAsync<PlusApiResultVoid>(ApiPaths.AppPath("/notification/batch"));
        }
    }
}
