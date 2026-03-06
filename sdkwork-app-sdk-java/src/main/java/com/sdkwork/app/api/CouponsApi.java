package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class CouponsApi {
    private final HttpClient client;
    
    public CouponsApi(HttpClient client) {
        this.client = client;
    }

    /** 领取优惠券 */
    public PlusApiResultUserCouponVO receiveCoupon(String couponId) throws Exception {
        return (PlusApiResultUserCouponVO) client.post(ApiPaths.appPath("/coupons/" + couponId + "/receive"), null);
    }

    /** 积分兑换优惠券 */
    public PlusApiResultUserCouponVO exchangeCouponByPoints(String couponId, CouponPointsExchangeForm body) throws Exception {
        return (PlusApiResultUserCouponVO) client.post(ApiPaths.appPath("/coupons/" + couponId + "/exchange/points"), body);
    }

    /** 兑换优惠券 */
    public PlusApiResultUserCouponVO redeemCoupon(CouponRedeemForm body) throws Exception {
        return (PlusApiResultUserCouponVO) client.post(ApiPaths.appPath("/coupons/redeem"), body);
    }

    /** 使用优惠券 */
    public PlusApiResultUserCouponVO useCoupon(String userCouponId, Map<String, Object> params) throws Exception {
        return (PlusApiResultUserCouponVO) client.post(ApiPaths.appPath("/coupons/my/" + userCouponId + "/use"), null, params);
    }

    /** 回滚积分兑换优惠券 */
    public PlusApiResultUserCouponVO rollbackPointsExchangeCoupon(String userCouponId, CouponRollbackForm body) throws Exception {
        return (PlusApiResultUserCouponVO) client.post(ApiPaths.appPath("/coupons/my/" + userCouponId + "/rollback"), body);
    }

    /** 取消使用优惠券 */
    public PlusApiResultUserCouponVO cancelUseCoupon(String userCouponId) throws Exception {
        return (PlusApiResultUserCouponVO) client.post(ApiPaths.appPath("/coupons/my/" + userCouponId + "/cancel"), null);
    }

    /** 获取可领取优惠券列表 */
    public PlusApiResultPageCouponVO listCoupons(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageCouponVO) client.get(ApiPaths.appPath("/coupons"), params);
    }

    /** 获取优惠券详情 */
    public PlusApiResultCouponVO getCouponDetail(String couponId) throws Exception {
        return (PlusApiResultCouponVO) client.get(ApiPaths.appPath("/coupons/" + couponId + ""));
    }

    /** 获取优惠券统计 */
    public PlusApiResultCouponStatisticsVO getStatistics() throws Exception {
        return (PlusApiResultCouponStatisticsVO) client.get(ApiPaths.appPath("/coupons/statistics"));
    }

    /** 获取我的优惠券列表 */
    public PlusApiResultPageUserCouponVO getMy(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageUserCouponVO) client.get(ApiPaths.appPath("/coupons/my"), params);
    }

    /** 获取用户优惠券详情 */
    public PlusApiResultUserCouponVO getUserCouponDetail(String userCouponId) throws Exception {
        return (PlusApiResultUserCouponVO) client.get(ApiPaths.appPath("/coupons/my/" + userCouponId + ""));
    }

    /** 获取可用优惠券列表 */
    public PlusApiResultPageUserCouponVO getAvailable(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageUserCouponVO) client.get(ApiPaths.appPath("/coupons/my/available"), params);
    }
}
