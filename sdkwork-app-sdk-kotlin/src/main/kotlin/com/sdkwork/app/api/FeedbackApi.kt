package com.sdkwork.app.api

import com.sdkwork.app.*
import com.sdkwork.app.http.HttpClient

class FeedbackApi(private val client: HttpClient) {

    /** 关闭反馈 */
    suspend fun close(feedbackId: String, params: Map<String, Any>? = null): PlusApiResultFeedbackDetailVO? {
        return client.put(ApiPaths.appPath("/feedback/$feedbackId/close"), null, params) as? PlusApiResultFeedbackDetailVO
    }

    /** 反馈列表 */
    suspend fun listFeedback(params: Map<String, Any>? = null): PlusApiResultPageFeedbackVO? {
        return client.get(ApiPaths.appPath("/feedback"), params) as? PlusApiResultPageFeedbackVO
    }

    /** 提交反馈 */
    suspend fun submit(body: FeedbackSubmitForm): PlusApiResultFeedbackVO? {
        return client.post(ApiPaths.appPath("/feedback"), body) as? PlusApiResultFeedbackVO
    }

    /** 追加反馈 */
    suspend fun followUp(feedbackId: String, body: FeedbackFollowUpForm): PlusApiResultFeedbackDetailVO? {
        return client.post(ApiPaths.appPath("/feedback/$feedbackId/followup"), body) as? PlusApiResultFeedbackDetailVO
    }

    /** 客服消息列表 */
    suspend fun listSupportMessages(params: Map<String, Any>? = null): PlusApiResultPageSupportMessageVO? {
        return client.get(ApiPaths.appPath("/feedback/support/messages"), params) as? PlusApiResultPageSupportMessageVO
    }

    /** 发送客服消息 */
    suspend fun sendSupportMessage(body: SupportMessageRequest): PlusApiResultSupportMessageVO? {
        return client.post(ApiPaths.appPath("/feedback/support/messages"), body) as? PlusApiResultSupportMessageVO
    }

    /** 举报列表 */
    suspend fun listReports(params: Map<String, Any>? = null): PlusApiResultPageReportVO? {
        return client.get(ApiPaths.appPath("/feedback/reports"), params) as? PlusApiResultPageReportVO
    }

    /** 提交举报 */
    suspend fun submitReport(body: ReportSubmitForm): PlusApiResultReportVO? {
        return client.post(ApiPaths.appPath("/feedback/reports"), body) as? PlusApiResultReportVO
    }

    /** 完成指引 */
    suspend fun completeOnboardingStep(stepId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/feedback/onboarding/$stepId/complete"), null) as? PlusApiResultVoid
    }

    /** FAQ点赞 */
    suspend fun likeFaq(faqId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/feedback/faq/$faqId/like"), null) as? PlusApiResultVoid
    }

    /** FAQ点踩 */
    suspend fun dislikeFaq(faqId: String): PlusApiResultVoid? {
        return client.post(ApiPaths.appPath("/feedback/faq/$faqId/dislike"), null) as? PlusApiResultVoid
    }

    /** 反馈详情 */
    suspend fun getFeedbackDetail(feedbackId: String): PlusApiResultFeedbackDetailVO? {
        return client.get(ApiPaths.appPath("/feedback/$feedbackId")) as? PlusApiResultFeedbackDetailVO
    }

    /** 教程列表 */
    suspend fun listTutorials(params: Map<String, Any>? = null): PlusApiResultPageTutorialVO? {
        return client.get(ApiPaths.appPath("/feedback/tutorials"), params) as? PlusApiResultPageTutorialVO
    }

    /** 教程详情 */
    suspend fun getTutorialDetail(tutorialId: String): PlusApiResultTutorialDetailVO? {
        return client.get(ApiPaths.appPath("/feedback/tutorials/$tutorialId")) as? PlusApiResultTutorialDetailVO
    }

    /** 客服信息 */
    suspend fun getSupportInfo(): PlusApiResultSupportInfoVO? {
        return client.get(ApiPaths.appPath("/feedback/support")) as? PlusApiResultSupportInfoVO
    }

    /** 举报详情 */
    suspend fun getReportDetail(reportId: String): PlusApiResultReportDetailVO? {
        return client.get(ApiPaths.appPath("/feedback/reports/$reportId")) as? PlusApiResultReportDetailVO
    }

    /** 新手指引 */
    suspend fun getOnboardingGuide(): PlusApiResultListOnboardingStepVO? {
        return client.get(ApiPaths.appPath("/feedback/onboarding")) as? PlusApiResultListOnboardingStepVO
    }

    /** FAQ列表 */
    suspend fun listFaqs(params: Map<String, Any>? = null): PlusApiResultPageFaqVO? {
        return client.get(ApiPaths.appPath("/feedback/faq"), params) as? PlusApiResultPageFaqVO
    }

    /** FAQ详情 */
    suspend fun getFaqDetail(faqId: String): PlusApiResultFaqDetailVO? {
        return client.get(ApiPaths.appPath("/feedback/faq/$faqId")) as? PlusApiResultFaqDetailVO
    }

    /** 搜索FAQ */
    suspend fun searchFaqs(params: Map<String, Any>? = null): PlusApiResultListFaqVO? {
        return client.get(ApiPaths.appPath("/feedback/faq/search"), params) as? PlusApiResultListFaqVO
    }

    /** FAQ分类 */
    suspend fun listFaqCategories(): PlusApiResultListFaqCategoryVO? {
        return client.get(ApiPaths.appPath("/feedback/faq/categories")) as? PlusApiResultListFaqCategoryVO
    }
}
