from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CreateKnowledgeRequest, CreatePostRequest, PlusApiResultListMapStringObject, PlusApiResultMapStringObject

class AgentMemoryApi:
    """agent_memory API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def list(self, agentId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListMapStringObject:
        """List memories"""
        return self._client.get(f"/app/v3/api/agents/{agentId}/memory", params=params)

    def create(self, agentId: str, body: Optional[CreatePostRequest] = None) -> PlusApiResultMapStringObject:
        """Create memory"""
        return self._client.post(f"/app/v3/api/agents/{agentId}/memory", json=body)

    def summarize_session(self, agentId: str, sessionId: str) -> PlusApiResultMapStringObject:
        """Summarize session"""
        return self._client.post(f"/app/v3/api/agents/{agentId}/memory/sessions/{sessionId}/summarize")

    def list_knowledge(self, agentId: str) -> PlusApiResultListMapStringObject:
        """List knowledge"""
        return self._client.get(f"/app/v3/api/agents/{agentId}/memory/knowledge")

    def create_knowledge(self, agentId: str, body: Optional[CreateKnowledgeRequest] = None) -> PlusApiResultMapStringObject:
        """Create knowledge"""
        return self._client.post(f"/app/v3/api/agents/{agentId}/memory/knowledge", json=body)

    def consolidate(self, agentId: str) -> PlusApiResultMapStringObject:
        """Consolidate memories"""
        return self._client.post(f"/app/v3/api/agents/{agentId}/memory/consolidate")

    def stats(self, agentId: str) -> PlusApiResultMapStringObject:
        """Memory stats"""
        return self._client.get(f"/app/v3/api/agents/{agentId}/memory/stats")

    def list_session_history(self, agentId: str, sessionId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListMapStringObject:
        """List session history"""
        return self._client.get(f"/app/v3/api/agents/{agentId}/memory/sessions/{sessionId}/history", params=params)

    def search(self, agentId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListMapStringObject:
        """Search memories"""
        return self._client.get(f"/app/v3/api/agents/{agentId}/memory/search", params=params)

    def get_knowledge(self, agentId: str, documentId: str) -> PlusApiResultMapStringObject:
        """Get knowledge"""
        return self._client.get(f"/app/v3/api/agents/{agentId}/memory/knowledge/{documentId}")

    def delete_knowledge(self, agentId: str, documentId: str) -> PlusApiResultMapStringObject:
        """Delete knowledge"""
        return self._client.delete(f"/app/v3/api/agents/{agentId}/memory/knowledge/{documentId}")

    def list_knowledge_chunks(self, agentId: str, documentId: str) -> PlusApiResultListMapStringObject:
        """List knowledge chunks"""
        return self._client.get(f"/app/v3/api/agents/{agentId}/memory/knowledge/{documentId}/chunks")

    def knowledge_stats(self, agentId: str) -> PlusApiResultMapStringObject:
        """Knowledge stats"""
        return self._client.get(f"/app/v3/api/agents/{agentId}/memory/knowledge/stats")

    def search_knowledge(self, agentId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListMapStringObject:
        """Search knowledge"""
        return self._client.get(f"/app/v3/api/agents/{agentId}/memory/knowledge/search", params=params)

    def delete(self, agentId: str, memoryId: str) -> PlusApiResultMapStringObject:
        """Delete memory"""
        return self._client.delete(f"/app/v3/api/agents/{agentId}/memory/{memoryId}")

    def clear_session(self, agentId: str, sessionId: str) -> PlusApiResultMapStringObject:
        """Clear session memories"""
        return self._client.delete(f"/app/v3/api/agents/{agentId}/memory/sessions/{sessionId}")
