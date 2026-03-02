from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OnboardingPageVO:
    created_at: str = None
    updated_at: str = None
    page_id: str = None
    title: str = None
    description: str = None
    images: List[str] = None
    buttons: List[str] = None
    background_color: str = None
    text_color: str = None
    is_active: bool = None
    order: int = None
