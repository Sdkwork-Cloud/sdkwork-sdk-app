from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import GetModelPricesRequest, PlusApiResultListModelPriceVO, PlusApiResultListModelTypeVO, PlusApiResultListString, PlusApiResultModelInfoDetailVO, PlusApiResultModelPriceVO, PlusApiResultModelStatisticsVO, PlusApiResultPageModelInfoVO

class ModelsApi:
    """models API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_model_prices(self, body: GetModelPricesRequest) -> PlusApiResultListModelPriceVO:
        """批量获取模型价格"""
        return self._client.post(f"/app/v3/api/models/prices/batch", json=body)

    def get_model_by_id(self, modelId: str) -> PlusApiResultModelInfoDetailVO:
        """获取模型详情"""
        return self._client.get(f"/app/v3/api/models/{modelId}")

    def get_model_types(self) -> PlusApiResultListModelTypeVO:
        """获取模型类型列表"""
        return self._client.get(f"/app/v3/api/models/types")

    def get_models_by_type(self, modelType: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageModelInfoVO:
        """获取类型模型列表"""
        return self._client.get(f"/app/v3/api/models/type/{modelType}", params=params)

    def get_model_statistics(self) -> PlusApiResultModelStatisticsVO:
        """获取模型统计"""
        return self._client.get(f"/app/v3/api/models/statistics")

    def search(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageModelInfoVO:
        """搜索模型"""
        return self._client.get(f"/app/v3/api/models/search", params=params)

    def get_model_price(self, model: str) -> PlusApiResultModelPriceVO:
        """获取模型价格"""
        return self._client.get(f"/app/v3/api/models/price/{model}")

    def get_popular(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageModelInfoVO:
        """获取热门模型"""
        return self._client.get(f"/app/v3/api/models/popular", params=params)

    def get_models_by_family(self, family: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageModelInfoVO:
        """获取系列模型列表"""
        return self._client.get(f"/app/v3/api/models/family/{family}", params=params)

    def get_all_families(self) -> PlusApiResultListString:
        """获取所有模型系列"""
        return self._client.get(f"/app/v3/api/models/families")

    def get_models_by_channel(self, channel: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageModelInfoVO:
        """获取渠道模型列表"""
        return self._client.get(f"/app/v3/api/models/channel/{channel}", params=params)

    def get_model_by(self, model: str) -> PlusApiResultModelInfoDetailVO:
        """根据模型标识获取详情"""
        return self._client.get(f"/app/v3/api/models/by-model/{model}")

    def get_active(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageModelInfoVO:
        """获取活跃模型列表"""
        return self._client.get(f"/app/v3/api/models/active", params=params)
