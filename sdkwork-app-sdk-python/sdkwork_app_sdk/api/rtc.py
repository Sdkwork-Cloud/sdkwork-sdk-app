from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import CreateRoomRequest, PlusApiResultListMapStringObject, PlusApiResultMapStringObject, PlusApiResultVoid

class RtcApi:
    """rtc API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def create_room(self, body: Optional[CreateRoomRequest] = None) -> PlusApiResultMapStringObject:
        """Create RTC room"""
        return self._client.post(f"/app/v3/api/rtc/rooms", json=body)

    def create_room_token(self, roomId: str) -> PlusApiResultMapStringObject:
        """Create RTC room token"""
        return self._client.post(f"/app/v3/api/rtc/rooms/{roomId}/token")

    def end_room(self, roomId: str) -> PlusApiResultVoid:
        """End RTC room"""
        return self._client.post(f"/app/v3/api/rtc/rooms/{roomId}/end")

    def get_room(self, roomId: str) -> PlusApiResultMapStringObject:
        """Get RTC room"""
        return self._client.get(f"/app/v3/api/rtc/rooms/{roomId}")

    def list_records(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListMapStringObject:
        """List RTC records"""
        return self._client.get(f"/app/v3/api/rtc/records", params=params)
