from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import ChatExportForm, ChatMessageSendForm, ChatSessionCreateForm, ChatSessionUpdateForm, PlusApiResultChatMessageVO, PlusApiResultChatSessionDetailVO, PlusApiResultChatSessionVO, PlusApiResultExportVO, PlusApiResultPageChatMessageVO, PlusApiResultPageChatSessionVO, PlusApiResultVoid

class ChatApi:
    """chat API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_session_detail(self, sessionId: str) -> PlusApiResultChatSessionDetailVO:
        """获取会话详情"""
        return self._client.get(f"/app/v3/api/chat/sessions/{sessionId}")

    def update_session(self, sessionId: str, body: ChatSessionUpdateForm) -> PlusApiResultVoid:
        """更新会话"""
        return self._client.put(f"/app/v3/api/chat/sessions/{sessionId}", json=body)

    def delete_session(self, sessionId: str) -> PlusApiResultVoid:
        """删除会话"""
        return self._client.delete(f"/app/v3/api/chat/sessions/{sessionId}")

    def list_sessions(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageChatSessionVO:
        """获取会话列表"""
        return self._client.get(f"/app/v3/api/chat/sessions", params=params)

    def create_session(self, body: ChatSessionCreateForm) -> PlusApiResultChatSessionVO:
        """创建对话会话"""
        return self._client.post(f"/app/v3/api/chat/sessions", json=body)

    def stop_generation(self, sessionId: str) -> PlusApiResultVoid:
        """停止生成"""
        return self._client.post(f"/app/v3/api/chat/sessions/{sessionId}/stop")

    def get_message_history(self, sessionId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageChatMessageVO:
        """获取消息历史"""
        return self._client.get(f"/app/v3/api/chat/sessions/{sessionId}/messages", params=params)

    def send_message(self, sessionId: str, body: ChatMessageSendForm) -> PlusApiResultChatMessageVO:
        """发送消息"""
        return self._client.post(f"/app/v3/api/chat/sessions/{sessionId}/messages", json=body)

    def regenerate_message(self, sessionId: str, messageId: str) -> PlusApiResultChatMessageVO:
        """重新生成"""
        return self._client.post(f"/app/v3/api/chat/sessions/{sessionId}/messages/{messageId}/regenerate")

    def favorite_message(self, sessionId: str, messageId: str) -> PlusApiResultVoid:
        """收藏消息"""
        return self._client.post(f"/app/v3/api/chat/sessions/{sessionId}/messages/{messageId}/favorite")

    def unfavorite_message(self, sessionId: str, messageId: str) -> PlusApiResultVoid:
        """取消收藏消息"""
        return self._client.delete(f"/app/v3/api/chat/sessions/{sessionId}/messages/{messageId}/favorite")

    def send_message_stream(self, sessionId: str, body: ChatMessageSendForm) -> None:
        """流式发送消息"""
        return self._client.post(f"/app/v3/api/chat/sessions/{sessionId}/messages/stream", json=body)

    def export_conversation(self, sessionId: str, body: ChatExportForm) -> PlusApiResultExportVO:
        """导出对话"""
        return self._client.post(f"/app/v3/api/chat/sessions/{sessionId}/export", json=body)

    def copy_session(self, sessionId: str) -> PlusApiResultChatSessionVO:
        """复制对话"""
        return self._client.post(f"/app/v3/api/chat/sessions/{sessionId}/copy")
