from dataclasses import dataclass
from typing import Optional, List, Dict, Any

@dataclass
class ExportResultVO:
    """导出结果VO"""
    created_at: str = None
    updated_at: str = None
    export_id: str = None
    report_type: str = None
    status: str = None
    download_url: str = None
    file_size: int = None
    completed_at: str = None
    error_message: str = None
