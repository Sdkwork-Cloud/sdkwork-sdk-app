import Foundation

public class AbApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 实验反馈
    public func submitExperimentFeedback(experimentId: String, body: ExperimentFeedbackForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/abtest/\(experimentId)/feedback"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 退出实验
    public func exitExperiment(experimentId: String, params: [String: Any]? = nil) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/abtest/\(experimentId)/exit"), body: nil, params: params)
        return response as? PlusApiResultVoid
    }

    /// 所有特性开关
    public func listFeatureFlags() async throws -> PlusApiResultListFeatureFlagVO? {
        let response = try await client.get(ApiPaths.appPath("/abtest/features"))
        return response as? PlusApiResultListFeatureFlagVO
    }

    /// 批量特性开关
    public func batchCheckFeatures(body: BatchFeatureCheckForm) async throws -> PlusApiResultMapStringFeatureFlagVO? {
        let response = try await client.post(ApiPaths.appPath("/abtest/features"), body: body)
        return response as? PlusApiResultMapStringFeatureFlagVO
    }

    /// 上报实验曝光
    public func trackExperimentExposure(body: ExperimentExposureForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/abtest/exposure"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 上报实验事件
    public func trackExperimentEvent(body: ExperimentEventForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/abtest/events"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 上报实验转化
    public func trackExperimentConversion(body: ExperimentConversionForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/abtest/conversion"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 批量获取分组
    public func batchGetAssignments(body: BatchAssignmentForm) async throws -> PlusApiResultMapStringExperimentAssignmentVO? {
        let response = try await client.post(ApiPaths.appPath("/abtest/assignments"), body: body)
        return response as? PlusApiResultMapStringExperimentAssignmentVO
    }

    /// 实验结果
    public func getExperimentResults(experimentId: String) async throws -> PlusApiResultExperimentResultsVO? {
        let response = try await client.get(ApiPaths.appPath("/abtest/\(experimentId)/results"))
        return response as? PlusApiResultExperimentResultsVO
    }

    /// 实验报告
    public func getExperimentReport(experimentId: String) async throws -> PlusApiResultExperimentReportVO? {
        let response = try await client.get(ApiPaths.appPath("/abtest/\(experimentId)/report"))
        return response as? PlusApiResultExperimentReportVO
    }

    /// UI配置
    public func getUiConfig() async throws -> PlusApiResultUiConfigVO? {
        let response = try await client.get(ApiPaths.appPath("/abtest/ui-config"))
        return response as? PlusApiResultUiConfigVO
    }

    /// 灰度配置
    public func listRolloutConfigs() async throws -> PlusApiResultListRolloutConfigVO? {
        let response = try await client.get(ApiPaths.appPath("/abtest/rollouts"))
        return response as? PlusApiResultListRolloutConfigVO
    }

    /// 灰度发布
    public func checkRollout(rolloutKey: String) async throws -> PlusApiResultRolloutCheckVO? {
        let response = try await client.get(ApiPaths.appPath("/abtest/rollout/\(rolloutKey)"))
        return response as? PlusApiResultRolloutCheckVO
    }

    /// 特性开关
    public func checkFeatureFlag(featureKey: String) async throws -> PlusApiResultFeatureFlagVO? {
        let response = try await client.get(ApiPaths.appPath("/abtest/features/\(featureKey)"))
        return response as? PlusApiResultFeatureFlagVO
    }

    /// 可用实验
    public func listAvailableExperiments() async throws -> PlusApiResultListExperimentVO? {
        let response = try await client.get(ApiPaths.appPath("/abtest/experiments"))
        return response as? PlusApiResultListExperimentVO
    }

    /// 实验详情
    public func getExperimentDetail(experimentId: String) async throws -> PlusApiResultExperimentDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/abtest/experiments/\(experimentId)"))
        return response as? PlusApiResultExperimentDetailVO
    }

    /// 个性化配置
    public func getPersonalizedConfig() async throws -> PlusApiResultMapStringObject? {
        let response = try await client.get(ApiPaths.appPath("/abtest/config"))
        return response as? PlusApiResultMapStringObject
    }

    /// 获取实验分组
    public func getExperimentAssignment(params: [String: Any]? = nil) async throws -> PlusApiResultExperimentAssignmentVO? {
        let response = try await client.get(ApiPaths.appPath("/abtest/assignment"), params: params)
        return response as? PlusApiResultExperimentAssignmentVO
    }

    /// 算法配置
    public func getAlgorithmConfig() async throws -> PlusApiResultAlgorithmConfigVO? {
        let response = try await client.get(ApiPaths.appPath("/abtest/algorithm-config"))
        return response as? PlusApiResultAlgorithmConfigVO
    }
}
