from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import PlusApiResultPromptEnhanceResponse, PromptEnhanceRequest

class GenerationApi:
    """generation API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def enhance_generation_prompt(self, body: PromptEnhanceRequest) -> PlusApiResultPromptEnhanceResponse:
        """Enhance generation prompt"""
        return self._client.post(f"/app/v3/api/generation/prompt/enhance", json=body)
