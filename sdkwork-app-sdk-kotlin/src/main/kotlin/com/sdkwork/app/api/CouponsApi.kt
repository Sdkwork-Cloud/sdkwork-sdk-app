package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class CouponsApi(private val client: HttpClient) {

    /** 领取优惠券 */
    suspend fun receiveCoupon(couponId: String): PlusApiResultUserCouponVO? {
        return client.post(ApiPaths.appPath("/coupons/$couponId/receive"), null) as? PlusApiResultUserCouponVO
    }

    /** 使用优惠券 */
    suspend fun useCoupon(userCouponId: String, params: Map<String, Any>? = null): PlusApiResultUserCouponVO? {
        return client.post(ApiPaths.appPath("/coupons/my/$userCouponId/use"), null, params) as? PlusApiResultUserCouponVO
    }

    /** 取消使用优惠券 */
    suspend fun cancelUseCoupon(userCouponId: String): PlusApiResultUserCouponVO? {
        return client.post(ApiPaths.appPath("/coupons/my/$userCouponId/cancel"), null) as? PlusApiResultUserCouponVO
    }

    /** 获取可领取优惠券列表 */
    suspend fun listCoupons(params: Map<String, Any>? = null): PlusApiResultPageCouponVO? {
        return client.get(ApiPaths.appPath("/coupons"), params) as? PlusApiResultPageCouponVO
    }

    /** 获取优惠券详情 */
    suspend fun getCouponDetail(couponId: String): PlusApiResultCouponVO? {
        return client.get(ApiPaths.appPath("/coupons/$couponId")) as? PlusApiResultCouponVO
    }

    /** 获取优惠券统计 */
    suspend fun getStatistics(): PlusApiResultCouponStatisticsVO? {
        return client.get(ApiPaths.appPath("/coupons/statistics")) as? PlusApiResultCouponStatisticsVO
    }

    /** 获取我的优惠券列表 */
    suspend fun getMy(params: Map<String, Any>? = null): PlusApiResultPageUserCouponVO? {
        return client.get(ApiPaths.appPath("/coupons/my"), params) as? PlusApiResultPageUserCouponVO
    }

    /** 获取用户优惠券详情 */
    suspend fun getUserCouponDetail(userCouponId: String): PlusApiResultUserCouponVO? {
        return client.get(ApiPaths.appPath("/coupons/my/$userCouponId")) as? PlusApiResultUserCouponVO
    }

    /** 获取可用优惠券列表 */
    suspend fun getAvailable(params: Map<String, Any>? = null): PlusApiResultPageUserCouponVO? {
        return client.get(ApiPaths.appPath("/coupons/my/available"), params) as? PlusApiResultPageUserCouponVO
    }
}
