from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import GetModelPricesRequest, PlusApiResultListModelPriceVO, PlusApiResultListModelTypeVO, PlusApiResultListString, PlusApiResultModelInfoDetailVO, PlusApiResultModelPriceVO, PlusApiResultModelStatisticsVO, PlusApiResultPageModelInfoVO

class ModelApi:
    """model API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def get_model_prices(self, body: GetModelPricesRequest) -> PlusApiResultListModelPriceVO:
        """Batch get model prices"""
        return self._client.post(f"/app/v3/api/models/prices/batch", json=body)

    def get_model_by_id(self, modelId: str) -> PlusApiResultModelInfoDetailVO:
        """Get model detail"""
        return self._client.get(f"/app/v3/api/models/{modelId}")

    def get_model_types(self) -> PlusApiResultListModelTypeVO:
        """Get model types"""
        return self._client.get(f"/app/v3/api/models/types")

    def get_models_by_type(self, modelType: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageModelInfoVO:
        """Get models by type"""
        return self._client.get(f"/app/v3/api/models/type/{modelType}", params=params)

    def get_model_statistics(self) -> PlusApiResultModelStatisticsVO:
        """Get model statistics"""
        return self._client.get(f"/app/v3/api/models/statistics")

    def search_models(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageModelInfoVO:
        """Search models"""
        return self._client.get(f"/app/v3/api/models/search", params=params)

    def get_model_price(self, model: str) -> PlusApiResultModelPriceVO:
        """Get model default price"""
        return self._client.get(f"/app/v3/api/models/price/{model}")

    def get_model_price_rules(self, model: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListModelPriceVO:
        """Get model pricing rules"""
        return self._client.get(f"/app/v3/api/models/price-rules/{model}", params=params)

    def get_popular_models(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageModelInfoVO:
        """Get popular models"""
        return self._client.get(f"/app/v3/api/models/popular", params=params)

    def get_models_by_family(self, family: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageModelInfoVO:
        """Get models by family"""
        return self._client.get(f"/app/v3/api/models/family/{family}", params=params)

    def get_all_families(self) -> PlusApiResultListString:
        """Get all families"""
        return self._client.get(f"/app/v3/api/models/families")

    def get_models_by_channel(self, channel: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageModelInfoVO:
        """Get models by channel"""
        return self._client.get(f"/app/v3/api/models/channel/{channel}", params=params)

    def get_model_by(self, model: str) -> PlusApiResultModelInfoDetailVO:
        """Get model detail by alias"""
        return self._client.get(f"/app/v3/api/models/by-model/{model}")

    def get_active_models(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageModelInfoVO:
        """Get active models"""
        return self._client.get(f"/app/v3/api/models/active", params=params)
