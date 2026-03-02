from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class DriveContentUpdateForm:
    """Drive file content update form"""
    text: str = None
    contents: Dict[str, str] = None
    prompt: str = None
    thinking_content: str = None
    encoding: str = None
