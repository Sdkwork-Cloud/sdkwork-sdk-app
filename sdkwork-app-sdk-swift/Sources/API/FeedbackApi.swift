import Foundation

public class FeedbackApi {
    private let client: HttpClient
    
    public init(client: HttpClient) {
        self.client = client
    }

    /// 关闭反馈
    public func close(feedbackId: String, params: [String: Any]? = nil) async throws -> PlusApiResultFeedbackDetailVO? {
        let response = try await client.put(ApiPaths.appPath("/feedback/\(feedbackId)/close"), body: nil, params: params)
        return response as? PlusApiResultFeedbackDetailVO
    }

    /// 反馈列表
    public func listFeedback(params: [String: Any]? = nil) async throws -> PlusApiResultPageFeedbackVO? {
        let response = try await client.get(ApiPaths.appPath("/feedback"), params: params)
        return response as? PlusApiResultPageFeedbackVO
    }

    /// 提交反馈
    public func submit(body: FeedbackSubmitForm) async throws -> PlusApiResultFeedbackVO? {
        let response = try await client.post(ApiPaths.appPath("/feedback"), body: body)
        return response as? PlusApiResultFeedbackVO
    }

    /// 追加反馈
    public func followUp(feedbackId: String, body: FeedbackFollowUpForm) async throws -> PlusApiResultFeedbackDetailVO? {
        let response = try await client.post(ApiPaths.appPath("/feedback/\(feedbackId)/followup"), body: body)
        return response as? PlusApiResultFeedbackDetailVO
    }

    /// 客服消息列表
    public func listSupportMessages(params: [String: Any]? = nil) async throws -> PlusApiResultPageSupportMessageVO? {
        let response = try await client.get(ApiPaths.appPath("/feedback/support/messages"), params: params)
        return response as? PlusApiResultPageSupportMessageVO
    }

    /// 发送客服消息
    public func sendSupportMessage(body: SupportMessageRequest) async throws -> PlusApiResultSupportMessageVO? {
        let response = try await client.post(ApiPaths.appPath("/feedback/support/messages"), body: body)
        return response as? PlusApiResultSupportMessageVO
    }

    /// 举报列表
    public func listReports(params: [String: Any]? = nil) async throws -> PlusApiResultPageReportVO? {
        let response = try await client.get(ApiPaths.appPath("/feedback/reports"), params: params)
        return response as? PlusApiResultPageReportVO
    }

    /// 提交举报
    public func submitReport(body: ReportSubmitForm) async throws -> PlusApiResultReportVO? {
        let response = try await client.post(ApiPaths.appPath("/feedback/reports"), body: body)
        return response as? PlusApiResultReportVO
    }

    /// 完成指引
    public func completeOnboardingStep(stepId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/feedback/onboarding/\(stepId)/complete"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// FAQ点赞
    public func likeFaq(faqId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/feedback/faq/\(faqId)/like"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// FAQ点踩
    public func dislikeFaq(faqId: String) async throws -> PlusApiResultVoid? {
        let response = try await client.post(ApiPaths.appPath("/feedback/faq/\(faqId)/dislike"), body: nil)
        return response as? PlusApiResultVoid
    }

    /// 反馈详情
    public func getFeedbackDetail(feedbackId: String) async throws -> PlusApiResultFeedbackDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/feedback/\(feedbackId)"))
        return response as? PlusApiResultFeedbackDetailVO
    }

    /// 教程列表
    public func listTutorials(params: [String: Any]? = nil) async throws -> PlusApiResultPageTutorialVO? {
        let response = try await client.get(ApiPaths.appPath("/feedback/tutorials"), params: params)
        return response as? PlusApiResultPageTutorialVO
    }

    /// 教程详情
    public func getTutorialDetail(tutorialId: String) async throws -> PlusApiResultTutorialDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/feedback/tutorials/\(tutorialId)"))
        return response as? PlusApiResultTutorialDetailVO
    }

    /// 客服信息
    public func getSupportInfo() async throws -> PlusApiResultSupportInfoVO? {
        let response = try await client.get(ApiPaths.appPath("/feedback/support"))
        return response as? PlusApiResultSupportInfoVO
    }

    /// 举报详情
    public func getReportDetail(reportId: String) async throws -> PlusApiResultReportDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/feedback/reports/\(reportId)"))
        return response as? PlusApiResultReportDetailVO
    }

    /// 新手指引
    public func getOnboardingGuide() async throws -> PlusApiResultListOnboardingStepVO? {
        let response = try await client.get(ApiPaths.appPath("/feedback/onboarding"))
        return response as? PlusApiResultListOnboardingStepVO
    }

    /// FAQ列表
    public func listFaqs(params: [String: Any]? = nil) async throws -> PlusApiResultPageFaqVO? {
        let response = try await client.get(ApiPaths.appPath("/feedback/faq"), params: params)
        return response as? PlusApiResultPageFaqVO
    }

    /// FAQ详情
    public func getFaqDetail(faqId: String) async throws -> PlusApiResultFaqDetailVO? {
        let response = try await client.get(ApiPaths.appPath("/feedback/faq/\(faqId)"))
        return response as? PlusApiResultFaqDetailVO
    }

    /// 搜索FAQ
    public func searchFaqs(params: [String: Any]? = nil) async throws -> PlusApiResultListFaqVO? {
        let response = try await client.get(ApiPaths.appPath("/feedback/faq/search"), params: params)
        return response as? PlusApiResultListFaqVO
    }

    /// FAQ分类
    public func listFaqCategories() async throws -> PlusApiResultListFaqCategoryVO? {
        let response = try await client.get(ApiPaths.appPath("/feedback/faq/categories"))
        return response as? PlusApiResultListFaqCategoryVO
    }
}
