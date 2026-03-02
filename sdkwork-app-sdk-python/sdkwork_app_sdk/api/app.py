from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import AppCreateForm, AppUpdateForm, NoteCopyRequest, NoteCreateRequest, NoteFolderCreateRequest, NoteFolderUpdateRequest, NoteMoveRequest, NoteUpdateRequest, PlusApiResultAccountSummaryVO, PlusApiResultAppDetailVO, PlusApiResultAppStatisticsVO, PlusApiResultAppVO, PlusApiResultListNoteFolderVO, PlusApiResultNoteFolderVO, PlusApiResultNoteOperationVO, PlusApiResultNoteStatisticsVO, PlusApiResultNoteVO, PlusApiResultPageAppVO, PlusApiResultPageNoteVO, PlusApiResultVoid

class AppApi:
    """app API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_note_detail(self, noteId: str) -> PlusApiResultNoteVO:
        """获取笔记详情"""
        return self._client.get(f"/app/v3/api/notes/{noteId}")

    def update_note(self, noteId: str, body: NoteUpdateRequest) -> PlusApiResultNoteOperationVO:
        """更新笔记"""
        return self._client.put(f"/app/v3/api/notes/{noteId}", json=body)

    def delete_note(self, noteId: str) -> PlusApiResultVoid:
        """删除笔记"""
        return self._client.delete(f"/app/v3/api/notes/{noteId}")

    def move_note(self, noteId: str, body: NoteMoveRequest) -> PlusApiResultNoteOperationVO:
        """移动笔记"""
        return self._client.put(f"/app/v3/api/notes/{noteId}/move", json=body)

    def update_folder(self, folderId: str, body: NoteFolderUpdateRequest) -> PlusApiResultNoteFolderVO:
        """更新文件夹"""
        return self._client.put(f"/app/v3/api/notes/folders/{folderId}", json=body)

    def delete_folder(self, folderId: str) -> PlusApiResultNoteOperationVO:
        """删除文件夹"""
        return self._client.delete(f"/app/v3/api/notes/folders/{folderId}")

    def get_app(self, appId: str) -> PlusApiResultAppDetailVO:
        """获取应用详情"""
        return self._client.get(f"/app/v3/api/app/manage/{appId}")

    def update_app(self, appId: str, body: AppUpdateForm) -> PlusApiResultAppVO:
        """更新应用"""
        return self._client.put(f"/app/v3/api/app/manage/{appId}", json=body)

    def delete_app(self, appId: str) -> PlusApiResultVoid:
        """删除应用"""
        return self._client.delete(f"/app/v3/api/app/manage/{appId}")

    def list_notes(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageNoteVO:
        """获取笔记列表"""
        return self._client.get(f"/app/v3/api/notes", params=params)

    def create_note(self, body: NoteCreateRequest) -> PlusApiResultNoteOperationVO:
        """创建笔记"""
        return self._client.post(f"/app/v3/api/notes", json=body)

    def favorite_note(self, noteId: str) -> PlusApiResultNoteOperationVO:
        """收藏笔记"""
        return self._client.post(f"/app/v3/api/notes/{noteId}/favorite")

    def unfavorite_note(self, noteId: str) -> PlusApiResultNoteOperationVO:
        """取消收藏笔记"""
        return self._client.delete(f"/app/v3/api/notes/{noteId}/favorite")

    def copy_note(self, noteId: str, body: NoteCopyRequest) -> PlusApiResultNoteOperationVO:
        """复制笔记"""
        return self._client.post(f"/app/v3/api/notes/{noteId}/copy", json=body)

    def list_folders(self) -> PlusApiResultListNoteFolderVO:
        """获取文件夹列表"""
        return self._client.get(f"/app/v3/api/notes/folders")

    def create_folder(self, body: NoteFolderCreateRequest) -> PlusApiResultNoteFolderVO:
        """创建文件夹"""
        return self._client.post(f"/app/v3/api/notes/folders", json=body)

    def create_app(self, body: AppCreateForm) -> PlusApiResultAppVO:
        """创建应用"""
        return self._client.post(f"/app/v3/api/app/manage", json=body)

    def deactivate(self, appId: str) -> PlusApiResultVoid:
        """停用应用"""
        return self._client.post(f"/app/v3/api/app/manage/{appId}/deactivate")

    def activate(self, appId: str) -> PlusApiResultVoid:
        """激活应用"""
        return self._client.post(f"/app/v3/api/app/manage/{appId}/activate")

    def get_note_statistics(self) -> PlusApiResultNoteStatisticsVO:
        """获取笔记统计"""
        return self._client.get(f"/app/v3/api/notes/statistics")

    def get_app_statistics(self) -> PlusApiResultAppStatisticsVO:
        """获取应用统计"""
        return self._client.get(f"/app/v3/api/app/manage/statistics")

    def search_apps(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageAppVO:
        """搜索应用"""
        return self._client.get(f"/app/v3/api/app/manage/search", params=params)

    def get_project_apps(self, projectId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageAppVO:
        """获取项目应用"""
        return self._client.get(f"/app/v3/api/app/manage/project/{projectId}", params=params)

    def get_my_apps(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageAppVO:
        """获取我的应用"""
        return self._client.get(f"/app/v3/api/app/manage/my", params=params)

    def get_account_summary(self) -> PlusApiResultAccountSummaryVO:
        """获取账户余额汇总"""
        return self._client.get(f"/app/v3/api/account/summary")

    def batch_delete_notes(self) -> PlusApiResultNoteOperationVO:
        """批量删除笔记"""
        return self._client.delete(f"/app/v3/api/notes/batch")
