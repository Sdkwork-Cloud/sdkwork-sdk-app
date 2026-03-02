from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ExperimentReportVO:
    """实验报告响应"""
    created_at: str = None
    updated_at: str = None
    experiment_key: str = None
    report_type: str = None
    report_data: Dict[str, Any] = None
    generated_at: str = None
    version: str = None
