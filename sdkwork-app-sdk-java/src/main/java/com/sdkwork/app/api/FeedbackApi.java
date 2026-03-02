package com.sdkwork.app.api;

import com.sdkwork.app.http.HttpClient;
import com.sdkwork.app.model.*;
import java.util.List;
import java.util.Map;

public class FeedbackApi {
    private final HttpClient client;
    
    public FeedbackApi(HttpClient client) {
        this.client = client;
    }

    /** 关闭反馈 */
    public PlusApiResultFeedbackDetailVO close(String feedbackId, Map<String, Object> params) throws Exception {
        return (PlusApiResultFeedbackDetailVO) client.put(ApiPaths.appPath("/feedback/" + feedbackId + "/close"), null, params);
    }

    /** 反馈列表 */
    public PlusApiResultPageFeedbackVO listFeedback(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageFeedbackVO) client.get(ApiPaths.appPath("/feedback"), params);
    }

    /** 提交反馈 */
    public PlusApiResultFeedbackVO submit(FeedbackSubmitForm body) throws Exception {
        return (PlusApiResultFeedbackVO) client.post(ApiPaths.appPath("/feedback"), body);
    }

    /** 追加反馈 */
    public PlusApiResultFeedbackDetailVO followUp(String feedbackId, FeedbackFollowUpForm body) throws Exception {
        return (PlusApiResultFeedbackDetailVO) client.post(ApiPaths.appPath("/feedback/" + feedbackId + "/followup"), body);
    }

    /** 客服消息列表 */
    public PlusApiResultPageSupportMessageVO listSupportMessages(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageSupportMessageVO) client.get(ApiPaths.appPath("/feedback/support/messages"), params);
    }

    /** 发送客服消息 */
    public PlusApiResultSupportMessageVO sendSupportMessage(SupportMessageRequest body) throws Exception {
        return (PlusApiResultSupportMessageVO) client.post(ApiPaths.appPath("/feedback/support/messages"), body);
    }

    /** 举报列表 */
    public PlusApiResultPageReportVO listReports(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageReportVO) client.get(ApiPaths.appPath("/feedback/reports"), params);
    }

    /** 提交举报 */
    public PlusApiResultReportVO submitReport(ReportSubmitForm body) throws Exception {
        return (PlusApiResultReportVO) client.post(ApiPaths.appPath("/feedback/reports"), body);
    }

    /** 完成指引 */
    public PlusApiResultVoid completeOnboardingStep(String stepId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/feedback/onboarding/" + stepId + "/complete"), null);
    }

    /** FAQ点赞 */
    public PlusApiResultVoid likeFaq(String faqId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/feedback/faq/" + faqId + "/like"), null);
    }

    /** FAQ点踩 */
    public PlusApiResultVoid dislikeFaq(String faqId) throws Exception {
        return (PlusApiResultVoid) client.post(ApiPaths.appPath("/feedback/faq/" + faqId + "/dislike"), null);
    }

    /** 反馈详情 */
    public PlusApiResultFeedbackDetailVO getFeedbackDetail(String feedbackId) throws Exception {
        return (PlusApiResultFeedbackDetailVO) client.get(ApiPaths.appPath("/feedback/" + feedbackId + ""));
    }

    /** 教程列表 */
    public PlusApiResultPageTutorialVO listTutorials(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageTutorialVO) client.get(ApiPaths.appPath("/feedback/tutorials"), params);
    }

    /** 教程详情 */
    public PlusApiResultTutorialDetailVO getTutorialDetail(String tutorialId) throws Exception {
        return (PlusApiResultTutorialDetailVO) client.get(ApiPaths.appPath("/feedback/tutorials/" + tutorialId + ""));
    }

    /** 客服信息 */
    public PlusApiResultSupportInfoVO getSupportInfo() throws Exception {
        return (PlusApiResultSupportInfoVO) client.get(ApiPaths.appPath("/feedback/support"));
    }

    /** 举报详情 */
    public PlusApiResultReportDetailVO getReportDetail(String reportId) throws Exception {
        return (PlusApiResultReportDetailVO) client.get(ApiPaths.appPath("/feedback/reports/" + reportId + ""));
    }

    /** 新手指引 */
    public PlusApiResultListOnboardingStepVO getOnboardingGuide() throws Exception {
        return (PlusApiResultListOnboardingStepVO) client.get(ApiPaths.appPath("/feedback/onboarding"));
    }

    /** FAQ列表 */
    public PlusApiResultPageFaqVO listFaqs(Map<String, Object> params) throws Exception {
        return (PlusApiResultPageFaqVO) client.get(ApiPaths.appPath("/feedback/faq"), params);
    }

    /** FAQ详情 */
    public PlusApiResultFaqDetailVO getFaqDetail(String faqId) throws Exception {
        return (PlusApiResultFaqDetailVO) client.get(ApiPaths.appPath("/feedback/faq/" + faqId + ""));
    }

    /** 搜索FAQ */
    public PlusApiResultListFaqVO searchFaqs(Map<String, Object> params) throws Exception {
        return (PlusApiResultListFaqVO) client.get(ApiPaths.appPath("/feedback/faq/search"), params);
    }

    /** FAQ分类 */
    public PlusApiResultListFaqCategoryVO listFaqCategories() throws Exception {
        return (PlusApiResultListFaqCategoryVO) client.get(ApiPaths.appPath("/feedback/faq/categories"));
    }
}
