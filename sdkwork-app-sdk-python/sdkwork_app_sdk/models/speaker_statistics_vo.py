from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class SpeakerStatisticsVO:
    total_speakers: int = None
    active_speakers: int = None
    inactive_speakers: int = None
