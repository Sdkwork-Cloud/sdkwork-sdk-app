import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { PlusApiResultGenerationTaskVO, PlusApiResultPageGenerationTaskVO, PlusApiResultPageVoiceSpeakerListVO, PlusApiResultVoiceSpeakerGenerationVO, PlusApiResultVoid, VoiceSpeakerCloneForm, VoiceSpeakerGenerationForm } from '../types';


export class VoiceSpeakerApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 创建语音生成任务 */
  async createGeneration(body: VoiceSpeakerGenerationForm): Promise<PlusApiResultGenerationTaskVO> {
    return this.client.post<PlusApiResultGenerationTaskVO>(appApiPath(`/generation/voice-speaker`), body);
  }

/** 克隆说话人 */
  async cloneSpeaker(body: VoiceSpeakerCloneForm): Promise<PlusApiResultGenerationTaskVO> {
    return this.client.post<PlusApiResultGenerationTaskVO>(appApiPath(`/generation/voice-speaker/clone`), body);
  }

/** 获取说话人详情 */
  async getSpeakerDetail(speakerId: string | number): Promise<PlusApiResultVoiceSpeakerGenerationVO> {
    return this.client.get<PlusApiResultVoiceSpeakerGenerationVO>(appApiPath(`/generation/voice-speaker/${speakerId}`));
  }

/** 删除说话人 */
  async deleteSpeaker(speakerId: string | number): Promise<PlusApiResultVoid> {
    return this.client.delete<PlusApiResultVoid>(appApiPath(`/generation/voice-speaker/${speakerId}`));
  }

/** 获取任务列表 */
  async listTasks(params?: QueryParams): Promise<PlusApiResultPageGenerationTaskVO> {
    return this.client.get<PlusApiResultPageGenerationTaskVO>(appApiPath(`/generation/voice-speaker/tasks`), params);
  }

/** 获取任务状态 */
  async getTaskStatus(taskId: string | number): Promise<PlusApiResultGenerationTaskVO> {
    return this.client.get<PlusApiResultGenerationTaskVO>(appApiPath(`/generation/voice-speaker/tasks/${taskId}`));
  }

/** 取消任务 */
  async cancelTask(taskId: string | number): Promise<PlusApiResultVoid> {
    return this.client.delete<PlusApiResultVoid>(appApiPath(`/generation/voice-speaker/tasks/${taskId}`));
  }

/** 获取说话人列表 */
  async listSpeakers(params?: QueryParams): Promise<PlusApiResultPageVoiceSpeakerListVO> {
    return this.client.get<PlusApiResultPageVoiceSpeakerListVO>(appApiPath(`/generation/voice-speaker/list`), params);
  }
}

export function createVoiceSpeakerApi(client: HttpClient): VoiceSpeakerApi {
  return new VoiceSpeakerApi(client);
}
