import { appApiPath } from './paths';
import type { HttpClient } from '../http/client';
import type { QueryParams } from '../types/common';
import type { AppCreateForm, AppUpdateForm, NoteCopyRequest, NoteCreateRequest, NoteFolderCreateRequest, NoteFolderUpdateRequest, NoteMoveRequest, NoteUpdateRequest, PlusApiResultAccountSummaryVO, PlusApiResultAppDetailVO, PlusApiResultAppStatisticsVO, PlusApiResultAppVO, PlusApiResultListNoteFolderVO, PlusApiResultNoteFolderVO, PlusApiResultNoteOperationVO, PlusApiResultNoteStatisticsVO, PlusApiResultNoteVO, PlusApiResultPageAppVO, PlusApiResultPageNoteVO, PlusApiResultVoid } from '../types';


export class AppApi {
  private client: HttpClient;
  
  constructor(client: HttpClient) { 
    this.client = client; 
  }

/** 获取笔记详情 */
  async getNoteDetail(noteId: string | number): Promise<PlusApiResultNoteVO> {
    return this.client.get<PlusApiResultNoteVO>(appApiPath(`/notes/${noteId}`));
  }

/** 更新笔记 */
  async updateNote(noteId: string | number, body: NoteUpdateRequest): Promise<PlusApiResultNoteOperationVO> {
    return this.client.put<PlusApiResultNoteOperationVO>(appApiPath(`/notes/${noteId}`), body);
  }

/** 删除笔记 */
  async deleteNote(noteId: string | number): Promise<PlusApiResultVoid> {
    return this.client.delete<PlusApiResultVoid>(appApiPath(`/notes/${noteId}`));
  }

/** 移动笔记 */
  async moveNote(noteId: string | number, body: NoteMoveRequest): Promise<PlusApiResultNoteOperationVO> {
    return this.client.put<PlusApiResultNoteOperationVO>(appApiPath(`/notes/${noteId}/move`), body);
  }

/** 更新文件夹 */
  async updateFolder(folderId: string | number, body: NoteFolderUpdateRequest): Promise<PlusApiResultNoteFolderVO> {
    return this.client.put<PlusApiResultNoteFolderVO>(appApiPath(`/notes/folders/${folderId}`), body);
  }

/** 删除文件夹 */
  async deleteFolder(folderId: string | number): Promise<PlusApiResultNoteOperationVO> {
    return this.client.delete<PlusApiResultNoteOperationVO>(appApiPath(`/notes/folders/${folderId}`));
  }

/** 获取应用详情 */
  async getApp(appId: string | number): Promise<PlusApiResultAppDetailVO> {
    return this.client.get<PlusApiResultAppDetailVO>(appApiPath(`/app/manage/${appId}`));
  }

/** 更新应用 */
  async updateApp(appId: string | number, body: AppUpdateForm): Promise<PlusApiResultAppVO> {
    return this.client.put<PlusApiResultAppVO>(appApiPath(`/app/manage/${appId}`), body);
  }

/** 删除应用 */
  async deleteApp(appId: string | number): Promise<PlusApiResultVoid> {
    return this.client.delete<PlusApiResultVoid>(appApiPath(`/app/manage/${appId}`));
  }

/** 获取笔记列表 */
  async listNotes(params?: QueryParams): Promise<PlusApiResultPageNoteVO> {
    return this.client.get<PlusApiResultPageNoteVO>(appApiPath(`/notes`), params);
  }

/** 创建笔记 */
  async createNote(body: NoteCreateRequest): Promise<PlusApiResultNoteOperationVO> {
    return this.client.post<PlusApiResultNoteOperationVO>(appApiPath(`/notes`), body);
  }

/** 收藏笔记 */
  async favoriteNote(noteId: string | number): Promise<PlusApiResultNoteOperationVO> {
    return this.client.post<PlusApiResultNoteOperationVO>(appApiPath(`/notes/${noteId}/favorite`));
  }

/** 取消收藏笔记 */
  async unfavoriteNote(noteId: string | number): Promise<PlusApiResultNoteOperationVO> {
    return this.client.delete<PlusApiResultNoteOperationVO>(appApiPath(`/notes/${noteId}/favorite`));
  }

/** 复制笔记 */
  async copyNote(noteId: string | number, body: NoteCopyRequest): Promise<PlusApiResultNoteOperationVO> {
    return this.client.post<PlusApiResultNoteOperationVO>(appApiPath(`/notes/${noteId}/copy`), body);
  }

/** 获取文件夹列表 */
  async listFolders(): Promise<PlusApiResultListNoteFolderVO> {
    return this.client.get<PlusApiResultListNoteFolderVO>(appApiPath(`/notes/folders`));
  }

/** 创建文件夹 */
  async createFolder(body: NoteFolderCreateRequest): Promise<PlusApiResultNoteFolderVO> {
    return this.client.post<PlusApiResultNoteFolderVO>(appApiPath(`/notes/folders`), body);
  }

/** 创建应用 */
  async createApp(body: AppCreateForm): Promise<PlusApiResultAppVO> {
    return this.client.post<PlusApiResultAppVO>(appApiPath(`/app/manage`), body);
  }

/** 停用应用 */
  async deactivate(appId: string | number): Promise<PlusApiResultVoid> {
    return this.client.post<PlusApiResultVoid>(appApiPath(`/app/manage/${appId}/deactivate`));
  }

/** 激活应用 */
  async activate(appId: string | number): Promise<PlusApiResultVoid> {
    return this.client.post<PlusApiResultVoid>(appApiPath(`/app/manage/${appId}/activate`));
  }

/** 获取笔记统计 */
  async getNoteStatistics(): Promise<PlusApiResultNoteStatisticsVO> {
    return this.client.get<PlusApiResultNoteStatisticsVO>(appApiPath(`/notes/statistics`));
  }

/** 获取应用统计 */
  async getAppStatistics(): Promise<PlusApiResultAppStatisticsVO> {
    return this.client.get<PlusApiResultAppStatisticsVO>(appApiPath(`/app/manage/statistics`));
  }

/** 搜索应用 */
  async searchApps(params?: QueryParams): Promise<PlusApiResultPageAppVO> {
    return this.client.get<PlusApiResultPageAppVO>(appApiPath(`/app/manage/search`), params);
  }

/** 获取项目应用 */
  async getProjectApps(projectId: string | number, params?: QueryParams): Promise<PlusApiResultPageAppVO> {
    return this.client.get<PlusApiResultPageAppVO>(appApiPath(`/app/manage/project/${projectId}`), params);
  }

/** 获取我的应用 */
  async getMyApps(params?: QueryParams): Promise<PlusApiResultPageAppVO> {
    return this.client.get<PlusApiResultPageAppVO>(appApiPath(`/app/manage/my`), params);
  }

/** 获取账户余额汇总 */
  async getAccountSummary(): Promise<PlusApiResultAccountSummaryVO> {
    return this.client.get<PlusApiResultAccountSummaryVO>(appApiPath(`/account/summary`));
  }

/** 批量删除笔记 */
  async batchDeleteNotes(): Promise<PlusApiResultNoteOperationVO> {
    return this.client.delete<PlusApiResultNoteOperationVO>(appApiPath(`/notes/batch`));
  }
}

export function createAppApi(client: HttpClient): AppApi {
  return new AppApi(client);
}
