import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { DeviceRegisterForm, NotificationBatchReadForm, NotificationSettingsUpdateForm, NotificationTypeSettingsForm, PlusApiResultListDeviceVO, PlusApiResultListNotificationTypeVO, PlusApiResultListString, PlusApiResultMapStringInteger, PlusApiResultNotificationDetailVO, PlusApiResultNotificationSettingsVO, PlusApiResultNotificationVO, PlusApiResultPageNotificationVO, PlusApiResultVoid, TestNotificationForm, TopicSubscribeForm } from '../types';


export class NotificationApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 标记已读 */
  async markAsRead(notificationId: string | number): Promise<PlusApiResultNotificationVO> {
    return this.client.put<PlusApiResultNotificationVO>(appApiPath(`/notification/${notificationId}/read`));
  }

/** 获取推送设置 */
  async getNotificationSettings(): Promise<PlusApiResultNotificationSettingsVO> {
    return this.client.get<PlusApiResultNotificationSettingsVO>(appApiPath(`/notification/settings`));
  }

/** 更新推送设置 */
  async updateNotificationSettings(body: NotificationSettingsUpdateForm): Promise<PlusApiResultNotificationSettingsVO> {
    return this.client.put<PlusApiResultNotificationSettingsVO>(appApiPath(`/notification/settings`), body);
  }

/** 更新类型推送设置 */
  async updateTypeSettings(type: string | number, body: NotificationTypeSettingsForm): Promise<PlusApiResultVoid> {
    return this.client.put<PlusApiResultVoid>(appApiPath(`/notification/settings/${type}`), body);
  }

/** 全部标记已读 */
  async markAllAsRead(params?: QueryParams): Promise<PlusApiResultVoid> {
    return this.client.put<PlusApiResultVoid>(appApiPath(`/notification/read/all`), undefined, params);
  }

/** 批量标记已读 */
  async batchMarkAsRead(body: NotificationBatchReadForm): Promise<PlusApiResultVoid> {
    return this.client.put<PlusApiResultVoid>(appApiPath(`/notification/batch/read`), body);
  }

/** 发送测试消息 */
  async sendTest(body: TestNotificationForm): Promise<PlusApiResultVoid> {
    return this.client.post<PlusApiResultVoid>(appApiPath(`/notification/test`), body);
  }

/** 订阅列表 */
  async listSubscriptions(): Promise<PlusApiResultListString> {
    return this.client.get<PlusApiResultListString>(appApiPath(`/notification/subscriptions`));
  }

/** 订阅主题 */
  async subscribeTopic(body: TopicSubscribeForm): Promise<PlusApiResultVoid> {
    return this.client.post<PlusApiResultVoid>(appApiPath(`/notification/subscriptions`), body);
  }

/** 获取设备列表 */
  async listDevices(): Promise<PlusApiResultListDeviceVO> {
    return this.client.get<PlusApiResultListDeviceVO>(appApiPath(`/notification/devices`));
  }

/** 注册推送设备 */
  async registerDevice(body: DeviceRegisterForm): Promise<PlusApiResultVoid> {
    return this.client.post<PlusApiResultVoid>(appApiPath(`/notification/devices`), body);
  }

/** 获取消息列表 */
  async listNotifications(params?: QueryParams): Promise<PlusApiResultPageNotificationVO> {
    return this.client.get<PlusApiResultPageNotificationVO>(appApiPath(`/notification`), params);
  }

/** 获取消息详情 */
  async getNotificationDetail(notificationId: string | number): Promise<PlusApiResultNotificationDetailVO> {
    return this.client.get<PlusApiResultNotificationDetailVO>(appApiPath(`/notification/${notificationId}`));
  }

/** 删除消息 */
  async deleteNotification(notificationId: string | number): Promise<PlusApiResultVoid> {
    return this.client.delete<PlusApiResultVoid>(appApiPath(`/notification/${notificationId}`));
  }

/** 未读消息统计 */
  async getUnreadCount(): Promise<PlusApiResultMapStringInteger> {
    return this.client.get<PlusApiResultMapStringInteger>(appApiPath(`/notification/unread/count`));
  }

/** 消息类型 */
  async listNotificationTypes(): Promise<PlusApiResultListNotificationTypeVO> {
    return this.client.get<PlusApiResultListNotificationTypeVO>(appApiPath(`/notification/types`));
  }

/** 取消订阅 */
  async unsubscribeTopic(topic: string | number): Promise<PlusApiResultVoid> {
    return this.client.delete<PlusApiResultVoid>(appApiPath(`/notification/subscriptions/${topic}`));
  }

/** 注销推送设备 */
  async unregisterDevice(deviceToken: string | number): Promise<PlusApiResultVoid> {
    return this.client.delete<PlusApiResultVoid>(appApiPath(`/notification/devices/${deviceToken}`));
  }

/** 清空消息 */
  async clearAllNotifications(params?: QueryParams): Promise<PlusApiResultVoid> {
    return this.client.delete<PlusApiResultVoid>(appApiPath(`/notification/clear`), params);
  }

/** 批量删除消息 */
  async batchDeleteNotifications(): Promise<PlusApiResultVoid> {
    return this.client.delete<PlusApiResultVoid>(appApiPath(`/notification/batch`));
  }
}

export function createNotificationApi(client: HttpClient): NotificationApi {
  return new NotificationApi(client);
}
