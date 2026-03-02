package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class ShareApi {
    private final HttpClient client;
    
    public ShareApi(HttpClient client) {
        this.client = client;
    }

    /** 更新分享设置 */
    public PlusApiResultShareRecordVO updateShareSettings(String shareId, ShareUpdateForm body) throws Exception {
        return (PlusApiResultShareRecordVO) client.put(ApiPaths.appPath("/share/" + shareId + ""), body);
    }

    /** 取消分享 */
    public PlusApiResultVoid cancel(String shareId) throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/share/" + shareId + ""));
    }

    /** 创建分享 */
    public PlusApiResultShareCreateVO createShare(ShareCreateForm body) throws Exception {
        return (PlusApiResultShareCreateVO) client.post(ApiPaths.appPath("/share"), body);
    }

    /** 访问分享 */
    public PlusApiResultVoid visit(String shareCode, ShareVisitForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/share/" + shareCode + "/visit"), body);
    }

    /** 验证分享密码 */
    public PlusApiResultShareVerifyVO verifySharePassword(String shareCode, ShareVerifyForm body) throws Exception {
        return (PlusApiResultShareVerifyVO) client.post(ApiPaths.appPath("/share/" + shareCode + "/verify"), body);
    }

    /** 上报分享 */
    public PlusApiResultVoid track(ShareTrackForm body) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/share/track"), body);
    }

    /** 生成分享海报 */
    public PlusApiResultSharePosterVO generateSharePoster(SharePosterForm body) throws Exception {
        return (PlusApiResultSharePosterVO) client.post(ApiPaths.appPath("/share/poster"), body);
    }

    /** 领取邀请奖励 */
    public PlusApiResultInviteRewardClaimVO claimInviteReward(String rewardId) throws Exception {
        return (PlusApiResultInviteRewardClaimVO) client.post(ApiPaths.appPath("/share/invite/rewards/" + rewardId + "/claim"), null);
    }

    /** 生成邀请链接 */
    public PlusApiResultInviteLinkVO generateInviteLink(InviteLinkForm body) throws Exception {
        return (PlusApiResultInviteLinkVO) client.post(ApiPaths.appPath("/share/invite/link"), body);
    }

    /** 获取访问记录 */
    public PlusApiResultPageShareVisitorVO getShareVisitors(String shareId, Map<String, Object> params) throws Exception {
        return (PlusApiResultPageShareVisitorVO) client.get(ApiPaths.appPath("/share/" + shareId + "/visitors"), params);
    }

    /** 获取分享统计 */
    public PlusApiResultShareStatisticsVO getShareStatistics(String shareId) throws Exception {
        return (PlusApiResultShareStatisticsVO) client.get(ApiPaths.appPath("/share/" + shareId + "/statistics"));
    }

    /** 获取分享信息 */
    public PlusApiResultShareInfoVO getShareInfo(String shareCode, Map<String, Object> params) throws Exception {
        return (PlusApiResultShareInfoVO) client.get(ApiPaths.appPath("/share/" + shareCode + ""), params);
    }

    /** 获取分享平台配置 */
    public PlusApiResultListSharePlatformVO getSharePlatforms() throws Exception {
        return (PlusApiResultListSharePlatformVO) client.get(ApiPaths.appPath("/share/platforms"));
    }

    /** 获取我的分享 */
    public PlusApiResultPageShareRecordVO listMyShares(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageShareRecordVO) client.get(ApiPaths.appPath("/share/my-shares"), params);
    }

    /** 获取邀请记录 */
    public PlusApiResultPageInviteRecordVO getInviteRecords(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageInviteRecordVO) client.get(ApiPaths.appPath("/share/invite/records"), params);
    }

    /** 获取邀请信息 */
    public PlusApiResultInviteInfoVO getInviteInfo() throws Exception {
        return (PlusApiResultInviteInfoVO) client.get(ApiPaths.appPath("/share/invite/info"));
    }

    /** 批量取消分享 */
    public PlusApiResultVoid batchCancelShares() throws Exception {
        return (PlusApiResultVoid) client.delete(ApiPaths.appPath("/share/batch"));
    }
}
