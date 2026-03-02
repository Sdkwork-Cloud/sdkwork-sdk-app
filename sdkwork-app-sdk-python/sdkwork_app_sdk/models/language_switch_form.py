from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class LanguageSwitchForm:
    """切换语言请求"""
    language: str
