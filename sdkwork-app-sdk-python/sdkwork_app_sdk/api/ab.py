from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import BatchAssignmentForm, BatchFeatureCheckForm, ExperimentConversionForm, ExperimentEventForm, ExperimentExposureForm, ExperimentFeedbackForm, PlusApiResultAlgorithmConfigVO, PlusApiResultExperimentAssignmentVO, PlusApiResultExperimentDetailVO, PlusApiResultExperimentReportVO, PlusApiResultExperimentResultsVO, PlusApiResultFeatureFlagVO, PlusApiResultListExperimentVO, PlusApiResultListFeatureFlagVO, PlusApiResultListRolloutConfigVO, PlusApiResultMapStringExperimentAssignmentVO, PlusApiResultMapStringFeatureFlagVO, PlusApiResultMapStringObject, PlusApiResultRolloutCheckVO, PlusApiResultUiConfigVO, PlusApiResultVoid

class AbApi:
    """ab API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def submit_experiment_feedback(self, experimentId: str, body: ExperimentFeedbackForm) -> PlusApiResultVoid:
        """实验反馈"""
        return self._client.post(f"/app/v3/api/abtest/{experimentId}/feedback", json=body)

    def exit_experiment(self, experimentId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultVoid:
        """退出实验"""
        return self._client.post(f"/app/v3/api/abtest/{experimentId}/exit", params=params)

    def list_feature_flags(self) -> PlusApiResultListFeatureFlagVO:
        """所有特性开关"""
        return self._client.get(f"/app/v3/api/abtest/features")

    def batch_check_features(self, body: BatchFeatureCheckForm) -> PlusApiResultMapStringFeatureFlagVO:
        """批量特性开关"""
        return self._client.post(f"/app/v3/api/abtest/features", json=body)

    def track_experiment_exposure(self, body: ExperimentExposureForm) -> PlusApiResultVoid:
        """上报实验曝光"""
        return self._client.post(f"/app/v3/api/abtest/exposure", json=body)

    def track_experiment_event(self, body: ExperimentEventForm) -> PlusApiResultVoid:
        """上报实验事件"""
        return self._client.post(f"/app/v3/api/abtest/events", json=body)

    def track_experiment_conversion(self, body: ExperimentConversionForm) -> PlusApiResultVoid:
        """上报实验转化"""
        return self._client.post(f"/app/v3/api/abtest/conversion", json=body)

    def batch_get_assignments(self, body: BatchAssignmentForm) -> PlusApiResultMapStringExperimentAssignmentVO:
        """批量获取分组"""
        return self._client.post(f"/app/v3/api/abtest/assignments", json=body)

    def get_experiment_results(self, experimentId: str) -> PlusApiResultExperimentResultsVO:
        """实验结果"""
        return self._client.get(f"/app/v3/api/abtest/{experimentId}/results")

    def get_experiment_report(self, experimentId: str) -> PlusApiResultExperimentReportVO:
        """实验报告"""
        return self._client.get(f"/app/v3/api/abtest/{experimentId}/report")

    def get_ui_config(self) -> PlusApiResultUiConfigVO:
        """UI配置"""
        return self._client.get(f"/app/v3/api/abtest/ui-config")

    def list_rollout_configs(self) -> PlusApiResultListRolloutConfigVO:
        """灰度配置"""
        return self._client.get(f"/app/v3/api/abtest/rollouts")

    def check_rollout(self, rolloutKey: str) -> PlusApiResultRolloutCheckVO:
        """灰度发布"""
        return self._client.get(f"/app/v3/api/abtest/rollout/{rolloutKey}")

    def check_feature_flag(self, featureKey: str) -> PlusApiResultFeatureFlagVO:
        """特性开关"""
        return self._client.get(f"/app/v3/api/abtest/features/{featureKey}")

    def list_available_experiments(self) -> PlusApiResultListExperimentVO:
        """可用实验"""
        return self._client.get(f"/app/v3/api/abtest/experiments")

    def get_experiment_detail(self, experimentId: str) -> PlusApiResultExperimentDetailVO:
        """实验详情"""
        return self._client.get(f"/app/v3/api/abtest/experiments/{experimentId}")

    def get_personalized_config(self) -> PlusApiResultMapStringObject:
        """个性化配置"""
        return self._client.get(f"/app/v3/api/abtest/config")

    def get_experiment_assignment(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultExperimentAssignmentVO:
        """获取实验分组"""
        return self._client.get(f"/app/v3/api/abtest/assignment", params=params)

    def get_algorithm_config(self) -> PlusApiResultAlgorithmConfigVO:
        """算法配置"""
        return self._client.get(f"/app/v3/api/abtest/algorithm-config")
