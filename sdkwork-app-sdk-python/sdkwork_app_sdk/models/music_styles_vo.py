from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class MusicStylesVO:
    """音乐风格响应"""
    created_at: str = None
    updated_at: str = None
    genres: List[GenreVO] = None
    styles: List[StyleVO] = None
    moods: List[MoodVO] = None
    instruments: List[InstrumentVO] = None
