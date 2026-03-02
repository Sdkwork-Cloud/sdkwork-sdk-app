import Foundation

public class CouponsApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 领取优惠券
    public func receiveCoupon(couponId: String) async throws -> PlusApiResultUserCouponVO? {
        let response = try await client.post(ApiPaths.appPath("/coupons/\(couponId)/receive"), body: nil)
        return response as? PlusApiResultUserCouponVO
    }

    /// 使用优惠券
    public func useCoupon(userCouponId: String, params: [String: Any]? = nil) async throws -> PlusApiResultUserCouponVO? {
        let response = try await client.post(ApiPaths.appPath("/coupons/my/\(userCouponId)/use"), body: nil, params: params)
        return response as? PlusApiResultUserCouponVO
    }

    /// 取消使用优惠券
    public func cancelUseCoupon(userCouponId: String) async throws -> PlusApiResultUserCouponVO? {
        let response = try await client.post(ApiPaths.appPath("/coupons/my/\(userCouponId)/cancel"), body: nil)
        return response as? PlusApiResultUserCouponVO
    }

    /// 获取可领取优惠券列表
    public func listCoupons(params: [String: Any]? = nil) async throws -> PlusApiResultPageCouponVO? {
        let response = try await client.get(ApiPaths.appPath("/coupons"), params: params)
        return response as? PlusApiResultPageCouponVO
    }

    /// 获取优惠券详情
    public func getCouponDetail(couponId: String) async throws -> PlusApiResultCouponVO? {
        let response = try await client.get(ApiPaths.appPath("/coupons/\(couponId)"))
        return response as? PlusApiResultCouponVO
    }

    /// 获取优惠券统计
    public func getStatistics() async throws -> PlusApiResultCouponStatisticsVO? {
        let response = try await client.get(ApiPaths.appPath("/coupons/statistics"))
        return response as? PlusApiResultCouponStatisticsVO
    }

    /// 获取我的优惠券列表
    public func getMy(params: [String: Any]? = nil) async throws -> PlusApiResultPageUserCouponVO? {
        let response = try await client.get(ApiPaths.appPath("/coupons/my"), params: params)
        return response as? PlusApiResultPageUserCouponVO
    }

    /// 获取用户优惠券详情
    public func getUserCouponDetail(userCouponId: String) async throws -> PlusApiResultUserCouponVO? {
        let response = try await client.get(ApiPaths.appPath("/coupons/my/\(userCouponId)"))
        return response as? PlusApiResultUserCouponVO
    }

    /// 获取可用优惠券列表
    public func getAvailable(params: [String: Any]? = nil) async throws -> PlusApiResultPageUserCouponVO? {
        let response = try await client.get(ApiPaths.appPath("/coupons/my/available"), params: params)
        return response as? PlusApiResultPageUserCouponVO
    }
}
