from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultBoolean, PlusApiResultListSkillCategoryVO, PlusApiResultListSkillPackageVO, PlusApiResultListUserSkillVO, PlusApiResultPageSkillVO, PlusApiResultSkillVO, PlusApiResultUserSkillVO, SkillConfigUpdateForm, SkillSaveForm

class SkillApi:
    """skill API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def detail(self, skillId: str) -> PlusApiResultSkillVO:
        """Get skill detail"""
        return self._client.get(f"/app/v3/api/skills/{skillId}")

    def update(self, skillId: str, body: SkillSaveForm) -> PlusApiResultSkillVO:
        """Update skill"""
        return self._client.put(f"/app/v3/api/skills/{skillId}", json=body)

    def update_config(self, skillId: str, body: Optional[SkillConfigUpdateForm] = None) -> PlusApiResultUserSkillVO:
        """Update user skill config"""
        return self._client.put(f"/app/v3/api/skills/{skillId}/config", json=body)

    def list(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageSkillVO:
        """List market skills"""
        return self._client.get(f"/app/v3/api/skills", params=params)

    def create(self, body: SkillSaveForm) -> PlusApiResultSkillVO:
        """Create skill"""
        return self._client.post(f"/app/v3/api/skills", json=body)

    def submit_review(self, skillId: str) -> PlusApiResultSkillVO:
        """Submit skill for review"""
        return self._client.post(f"/app/v3/api/skills/{skillId}/submit-review")

    def publish(self, skillId: str) -> PlusApiResultSkillVO:
        """Publish skill to market"""
        return self._client.post(f"/app/v3/api/skills/{skillId}/publish")

    def offline(self, skillId: str) -> PlusApiResultSkillVO:
        """Offline skill from market"""
        return self._client.post(f"/app/v3/api/skills/{skillId}/offline")

    def enable(self, skillId: str) -> PlusApiResultUserSkillVO:
        """Enable skill for current user"""
        return self._client.post(f"/app/v3/api/skills/{skillId}/enable")

    def disable(self, skillId: str) -> PlusApiResultBoolean:
        """Disable skill for current user"""
        return self._client.post(f"/app/v3/api/skills/{skillId}/disable")

    def list_packages(self) -> PlusApiResultListSkillPackageVO:
        """List skill packages"""
        return self._client.get(f"/app/v3/api/skills/packages")

    def list_mine(self) -> PlusApiResultListUserSkillVO:
        """List my installed skills"""
        return self._client.get(f"/app/v3/api/skills/my")

    def list_categories(self) -> PlusApiResultListSkillCategoryVO:
        """List skill categories"""
        return self._client.get(f"/app/v3/api/skills/categories")
