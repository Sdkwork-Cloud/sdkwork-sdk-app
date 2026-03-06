from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import InstallRequest, PlusApiResultListMapStringObject, PlusApiResultMapStringObject, PlusApiResultVoid, UpdateCredentialsRequest

class ToolApi:
    """tool API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def update_credentials(self, toolId: str, body: Optional[UpdateCredentialsRequest] = None) -> PlusApiResultMapStringObject:
        """Update tool credentials"""
        return self._client.put(f"/app/v3/api/tools/my/{toolId}/credentials", json=body)

    def list_mine(self) -> PlusApiResultListMapStringObject:
        """List my tools"""
        return self._client.get(f"/app/v3/api/tools/my")

    def install(self, body: Optional[InstallRequest] = None) -> PlusApiResultMapStringObject:
        """Install tool"""
        return self._client.post(f"/app/v3/api/tools/my", json=body)

    def test(self, toolId: str) -> PlusApiResultMapStringObject:
        """Test tool"""
        return self._client.post(f"/app/v3/api/tools/market/{toolId}/test")

    def list_market(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListMapStringObject:
        """List tool market"""
        return self._client.get(f"/app/v3/api/tools/market", params=params)

    def get_market_item(self, toolId: str) -> PlusApiResultMapStringObject:
        """Get tool market item"""
        return self._client.get(f"/app/v3/api/tools/market/{toolId}")

    def list_categories(self) -> PlusApiResultListMapStringObject:
        """List tool categories"""
        return self._client.get(f"/app/v3/api/tools/categories")

    def uninstall(self, toolId: str) -> PlusApiResultVoid:
        """Uninstall tool"""
        return self._client.delete(f"/app/v3/api/tools/my/{toolId}")
