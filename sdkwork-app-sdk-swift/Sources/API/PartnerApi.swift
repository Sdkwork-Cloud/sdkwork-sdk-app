import Foundation

public class PartnerApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 获取合作伙伴详情
    public func getPartner(partnerId: String) async throws -> PlusApiResultPartnerDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/partner/\(partnerId)"))
        return response as? PlusApiResultPartnerDetailVO
    }

    /// 更新合作伙伴
    public func updatePartner(partnerId: String, body: PartnerUpdateForm) async throws -> PlusApiResultPartnerVO? {
        let response = try await client.put(ApiPaths.appPath("/partner/\(partnerId)"), body: body)
        return response as? PlusApiResultPartnerVO
    }

    /// 删除合作伙伴
    public func deletePartner(partnerId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.delete(ApiPaths.appPath("/partner/\(partnerId)"))
        return response as? PlusApiResultVoid
    }

    /// 申请成为合作伙伴
    public func createPartner(body: PartnerCreateForm) async throws -> PlusApiResultPartnerVO? {
        let response = try await client.post(ApiPaths.appPath("/partner"), body: body)
        return response as? PlusApiResultPartnerVO
    }

    /// 提现佣金
    public func withdrawCommission(partnerId: String, body: CommissionForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/partner/\(partnerId)/withdraw"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 审批拒绝
    public func reject(partnerId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/partner/\(partnerId)/reject"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 添加佣金
    public func addCommission(partnerId: String, body: CommissionForm) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/partner/\(partnerId)/commission"), body: body)
        return response as? PlusApiResultVoid
    }

    /// 审批通过
    public func approve(partnerId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/partner/\(partnerId)/approve"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 获取下级合作伙伴
    public func getSubordinates(partnerId: String, params: [String: Any]? = nil) async throws -> PlusApiResultPagePartnerVO? {
        let response = try await client.get(ApiPaths.appPath("/partner/subordinates/\(partnerId)"), params: params)
        return response as? PlusApiResultPagePartnerVO
    }

    /// 获取合作伙伴统计
    public func getPartnerStatistics() async throws -> PlusApiResultPartnerStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/partner/statistics"))
        return response as? PlusApiResultPartnerStatisticsVO
    }

    /// 搜索合作伙伴
    public func searchPartners(params: [String: Any]? = nil) async throws -> PlusApiResultPagePartnerVO? {
        let response = try await client.get(ApiPaths.appPath("/partner/search"), params: params)
        return response as? PlusApiResultPagePartnerVO
    }

    /// 获取我的合作伙伴信息
    public func getMy() async throws -> PlusApiResultPartnerDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/partner/my"))
        return response as? PlusApiResultPartnerDetailVO
    }

    /// 根据推广码查询
    public func getByPromotionCode(promotionCode: String) async throws -> PlusApiResultPartnerVO? {
        let response = try await client.get(ApiPaths.appPath("/partner/code/\(promotionCode)"))
        return response as? PlusApiResultPartnerVO
    }
}
