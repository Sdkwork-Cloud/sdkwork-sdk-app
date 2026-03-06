from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import NoteBatchUpdateRequest, NoteContentUpdateRequest, NoteCopyRequest, NoteCreateRequest, NoteFolderCreateRequest, NoteFolderUpdateRequest, NoteMoveRequest, NoteUpdateRequest, PlusApiResultListNoteFolderVO, PlusApiResultNoteBatchUpdateResultVO, PlusApiResultNoteContentVO, PlusApiResultNoteFolderVO, PlusApiResultNoteOperationVO, PlusApiResultNoteStatisticsVO, PlusApiResultNoteVO, PlusApiResultPageNoteVO, PlusApiResultVoid

class NotesApi:
    """notes API client."""
    
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

    def restore_note(self, noteId: str) -> PlusApiResultNoteOperationVO:
        """恢复笔记"""
        return self._client.put(f"/app/v3/api/notes/{noteId}/restore")

    def move_note(self, noteId: str, body: NoteMoveRequest) -> PlusApiResultNoteOperationVO:
        """移动笔记"""
        return self._client.put(f"/app/v3/api/notes/{noteId}/move", json=body)

    def get_note_content(self, noteId: str) -> PlusApiResultNoteContentVO:
        """获取笔记正文"""
        return self._client.get(f"/app/v3/api/notes/{noteId}/content")

    def update_note_content(self, noteId: str, body: NoteContentUpdateRequest) -> PlusApiResultNoteContentVO:
        """更新笔记正文"""
        return self._client.put(f"/app/v3/api/notes/{noteId}/content", json=body)

    def archive_note(self, noteId: str) -> PlusApiResultNoteOperationVO:
        """归档笔记"""
        return self._client.put(f"/app/v3/api/notes/{noteId}/archive")

    def update_folder(self, folderId: str, body: NoteFolderUpdateRequest) -> PlusApiResultNoteFolderVO:
        """重命名文件夹"""
        return self._client.put(f"/app/v3/api/notes/folders/{folderId}", json=body)

    def delete_folder(self, folderId: str) -> PlusApiResultNoteOperationVO:
        """删除文件夹"""
        return self._client.delete(f"/app/v3/api/notes/folders/{folderId}")

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
        """取消收藏"""
        return self._client.delete(f"/app/v3/api/notes/{noteId}/favorite")

    def copy_note(self, noteId: str, body: NoteCopyRequest) -> PlusApiResultNoteOperationVO:
        """复制笔记"""
        return self._client.post(f"/app/v3/api/notes/{noteId}/copy", json=body)

    def batch_update_note(self, noteId: str, body: NoteBatchUpdateRequest) -> PlusApiResultNoteBatchUpdateResultVO:
        """批量更新笔记正文"""
        return self._client.post(f"/app/v3/api/notes/{noteId}/batch-update", json=body)

    def create_batch_update_note(self, noteId: str, body: NoteBatchUpdateRequest) -> PlusApiResultNoteBatchUpdateResultVO:
        """批量更新笔记正文"""
        return self._client.post(f"/app/v3/api/notes/{noteId}:batchUpdate", json=body)

    def list_folders(self) -> PlusApiResultListNoteFolderVO:
        """获取文件夹树"""
        return self._client.get(f"/app/v3/api/notes/folders")

    def create_folder(self, body: NoteFolderCreateRequest) -> PlusApiResultNoteFolderVO:
        """创建文件夹"""
        return self._client.post(f"/app/v3/api/notes/folders", json=body)

    def get_note_statistics(self) -> PlusApiResultNoteStatisticsVO:
        """获取笔记统计"""
        return self._client.get(f"/app/v3/api/notes/statistics")

    def batch_delete(self) -> PlusApiResultNoteOperationVO:
        """批量删除笔记"""
        return self._client.delete(f"/app/v3/api/notes/batch")

    def delete_batch(self) -> PlusApiResultNoteOperationVO:
        """批量删除笔记"""
        return self._client.delete(f"/app/v3/api/notes/batch-delete")
