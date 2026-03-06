from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CreateRequest, CreateSessionRequest, PlusApiResultListMapStringObject, PlusApiResultMapStringObject, PlusApiResultVoid, SendSessionMessageRequest, UpdateRequest

class AgentApi:
    """agent API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get(self, agentId: str) -> PlusApiResultMapStringObject:
        """Get agent"""
        return self._client.get(f"/app/v3/api/agents/{agentId}")

    def update(self, agentId: str, body: Optional[UpdateRequest] = None) -> PlusApiResultMapStringObject:
        """Update agent"""
        return self._client.put(f"/app/v3/api/agents/{agentId}", json=body)

    def delete(self, agentId: str) -> PlusApiResultVoid:
        """Delete agent"""
        return self._client.delete(f"/app/v3/api/agents/{agentId}")

    def list(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultMapStringObject:
        """List agents"""
        return self._client.get(f"/app/v3/api/agents", params=params)

    def create(self, body: Optional[CreateRequest] = None) -> PlusApiResultMapStringObject:
        """Create agent"""
        return self._client.post(f"/app/v3/api/agents", json=body)

    def list_sessions(self, agentId: str) -> PlusApiResultListMapStringObject:
        """List sessions"""
        return self._client.get(f"/app/v3/api/agents/{agentId}/sessions")

    def create_session(self, agentId: str, body: Optional[CreateSessionRequest] = None) -> PlusApiResultMapStringObject:
        """Create session"""
        return self._client.post(f"/app/v3/api/agents/{agentId}/sessions", json=body)

    def reset(self, agentId: str) -> PlusApiResultVoid:
        """Reset agent"""
        return self._client.post(f"/app/v3/api/agents/{agentId}/reset")

    def list_session_messages(self, sessionId: str) -> PlusApiResultListMapStringObject:
        """List session messages"""
        return self._client.get(f"/app/v3/api/agents/sessions/{sessionId}/messages")

    def send_session_message(self, sessionId: str, body: Optional[SendSessionMessageRequest] = None) -> PlusApiResultMapStringObject:
        """Send session message"""
        return self._client.post(f"/app/v3/api/agents/sessions/{sessionId}/messages", json=body)

    def clear_session(self, sessionId: str) -> PlusApiResultVoid:
        """Clear session"""
        return self._client.post(f"/app/v3/api/agents/sessions/{sessionId}/clear")

    def stats(self, agentId: str) -> PlusApiResultMapStringObject:
        """Agent stats"""
        return self._client.get(f"/app/v3/api/agents/{agentId}/stats")

    def delete_session(self, sessionId: str) -> PlusApiResultVoid:
        """Delete session"""
        return self._client.delete(f"/app/v3/api/agents/sessions/{sessionId}")
