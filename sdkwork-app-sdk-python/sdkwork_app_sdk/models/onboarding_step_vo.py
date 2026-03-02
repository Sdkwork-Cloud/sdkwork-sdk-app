from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class OnboardingStepVO:
    """入职步骤信息"""
    created_at: str = None
    updated_at: str = None
    id: str = None
    title: str = None
    description: str = None
    order: int = None
    completed: bool = None
    complete_time: str = None
