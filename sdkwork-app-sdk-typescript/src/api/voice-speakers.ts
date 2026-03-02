import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultListVoiceSpeakerVO, PlusApiResultPageVoiceSpeakerVO, PlusApiResultSpeakerStatisticsVO, PlusApiResultVoiceSpeakerDetailVO, PlusApiResultVoiceSpeakerVO, PlusApiResultVoid, VoiceSpeakerCreateForm } from '../types';


export class VoiceSpeakersApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 获取发音人详情 */
  async getSpeakerDetail(speakerId: string | number): Promise<PlusApiResultVoiceSpeakerDetailVO> {
    return this.client.get<PlusApiResultVoiceSpeakerDetailVO>(appApiPath(`/voice-speakers/${speakerId}`));
  }

/** 更新发音人 */
  async updateSpeaker(speakerId: string | number, body: VoiceSpeakerCreateForm): Promise<PlusApiResultVoiceSpeakerVO> {
    return this.client.put<PlusApiResultVoiceSpeakerVO>(appApiPath(`/voice-speakers/${speakerId}`), body);
  }

/** 删除发音人 */
  async deleteSpeaker(speakerId: string | number): Promise<PlusApiResultVoid> {
    return this.client.delete<PlusApiResultVoid>(appApiPath(`/voice-speakers/${speakerId}`));
  }

/** 获取发音人列表 */
  async listSpeakers(params?: QueryParams): Promise<PlusApiResultPageVoiceSpeakerVO> {
    return this.client.get<PlusApiResultPageVoiceSpeakerVO>(appApiPath(`/voice-speakers`), params);
  }

/** 创建发音人 */
  async createSpeaker(body: VoiceSpeakerCreateForm): Promise<PlusApiResultVoiceSpeakerVO> {
    return this.client.post<PlusApiResultVoiceSpeakerVO>(appApiPath(`/voice-speakers`), body);
  }

/** 更新发音人状态 */
  async updateStatus(speakerId: string | number, params?: QueryParams): Promise<PlusApiResultVoid> {
    return this.client.post<PlusApiResultVoid>(appApiPath(`/voice-speakers/${speakerId}/status`), undefined, params);
  }

/** 设为默认发音人 */
  async setAsDefault(speakerId: string | number): Promise<PlusApiResultVoiceSpeakerVO> {
    return this.client.post<PlusApiResultVoiceSpeakerVO>(appApiPath(`/voice-speakers/${speakerId}/set-default`));
  }

/** 获取发音人统计 */
  async getStatistics(): Promise<PlusApiResultSpeakerStatisticsVO> {
    return this.client.get<PlusApiResultSpeakerStatisticsVO>(appApiPath(`/voice-speakers/statistics`));
  }

/** 获取默认发音人 */
  async getDefaultSpeaker(): Promise<PlusApiResultVoiceSpeakerVO> {
    return this.client.get<PlusApiResultVoiceSpeakerVO>(appApiPath(`/voice-speakers/default`));
  }

/** 根据代码获取发音人 */
  async getSpeakerByCode(code: string | number): Promise<PlusApiResultVoiceSpeakerVO> {
    return this.client.get<PlusApiResultVoiceSpeakerVO>(appApiPath(`/voice-speakers/code/${code}`));
  }

/** 获取渠道发音人 */
  async listSpeakersByChannel(channel: string | number): Promise<PlusApiResultListVoiceSpeakerVO> {
    return this.client.get<PlusApiResultListVoiceSpeakerVO>(appApiPath(`/voice-speakers/channel/${channel}`));
  }
}

export function createVoiceSpeakersApi(client: HttpClient): VoiceSpeakersApi {
  return new VoiceSpeakersApi(client);
}
