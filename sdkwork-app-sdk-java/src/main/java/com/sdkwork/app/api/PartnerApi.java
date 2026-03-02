package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class PartnerApi {
    private final HttpClient client;
    
    public PartnerApi(HttpClient client) {
        this.client = client;
    }

    /** 获取合作伙伴详情 */
    public PlusApiResultPartnerDetailVO getPartner(String partnerId) throws Exception {
        return (PlusApiResultPartnerDetailVO) client.get(ApiPaths.appPath("/partner/" + partnerId + ""));
    }

    /** 更新合作伙伴 */
    public PlusApiResultPartnerVO updatePartner(String partnerId, PartnerUpdateForm body) throws Exception {
        return (PlusApiResultPartnerVO) client.put(ApiPaths.appPath("/partner/" + partnerId + ""), body);
    }

    /** 删除合作伙伴 */
    public PlusApiResultVoid deletePartner(String partnerId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/partner/" + partnerId + ""));
    }

    /** 申请成为合作伙伴 */
    public PlusApiResultPartnerVO createPartner(PartnerCreateForm body) throws Exception {
        return (PlusApiResultPartnerVO) client.post(ApiPaths.appPath("/partner"), body);
    }

    /** 提现佣金 */
    public PlusApiResultVoid withdrawCommission(String partnerId, CommissionForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/partner/" + partnerId + "/withdraw"), body);
    }

    /** 审批拒绝 */
    public PlusApiResultVoid reject(String partnerId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/partner/" + partnerId + "/reject"), null);
    }

    /** 添加佣金 */
    public PlusApiResultVoid addCommission(String partnerId, CommissionForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/partner/" + partnerId + "/commission"), body);
    }

    /** 审批通过 */
    public PlusApiResultVoid approve(String partnerId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/partner/" + partnerId + "/approve"), null);
    }

    /** 获取下级合作伙伴 */
    public PlusApiResultPagePartnerVO getSubordinates(String partnerId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePartnerVO) client.get(ApiPaths.appPath("/partner/subordinates/" + partnerId + ""), params);
    }

    /** 获取合作伙伴统计 */
    public PlusApiResultPartnerStatisticsVO getPartnerStatistics() throws Exception {
        return (PlusApiResultPartnerStatisticsVO) client.get(ApiPaths.appPath("/partner/statistics"));
    }

    /** 搜索合作伙伴 */
    public PlusApiResultPagePartnerVO searchPartners(Map<String, Object> params) throws Exception {
        return (PlusApiResultPagePartnerVO) client.get(ApiPaths.appPath("/partner/search"), params);
    }

    /** 获取我的合作伙伴信息 */
    public PlusApiResultPartnerDetailVO getMy() throws Exception {
        return (PlusApiResultPartnerDetailVO) client.get(ApiPaths.appPath("/partner/my"));
    }

    /** 根据推广码查询 */
    public PlusApiResultPartnerVO getByPromotionCode(String promotionCode) throws Exception {
        return (PlusApiResultPartnerVO) client.get(ApiPaths.appPath("/partner/code/" + promotionCode + ""));
    }
}
