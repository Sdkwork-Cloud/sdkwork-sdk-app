from typing import Any, Dict, List, Optional
from ..http_client import HttpClient
from ..models import FeedbackFollowUpForm, FeedbackSubmitForm, PlusApiResultFaqDetailVO, PlusApiResultFeedbackDetailVO, PlusApiResultFeedbackVO, PlusApiResultListFaqCategoryVO, PlusApiResultListFaqVO, PlusApiResultListOnboardingStepVO, PlusApiResultPageFaqVO, PlusApiResultPageFeedbackVO, PlusApiResultPageReportVO, PlusApiResultPageSupportMessageVO, PlusApiResultPageTutorialVO, PlusApiResultReportDetailVO, PlusApiResultReportVO, PlusApiResultSupportInfoVO, PlusApiResultSupportMessageVO, PlusApiResultTutorialDetailVO, PlusApiResultVoid, ReportSubmitForm, SupportMessageRequest

class FeedbackApi:
    """feedback API client."""
    
    def __init__(self, client: HttpClient):
        self._client = client

    def close(self, feedbackId: str, params: Optional[Dict[str, Any]] = None) -> PlusApiResultFeedbackDetailVO:
        """关闭反馈"""
        return self._client.put(f"/app/v3/api/feedback/{feedbackId}/close", params=params)

    def list_feedback(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageFeedbackVO:
        """反馈列表"""
        return self._client.get(f"/app/v3/api/feedback", params=params)

    def submit(self, body: FeedbackSubmitForm) -> PlusApiResultFeedbackVO:
        """提交反馈"""
        return self._client.post(f"/app/v3/api/feedback", json=body)

    def follow_up(self, feedbackId: str, body: FeedbackFollowUpForm) -> PlusApiResultFeedbackDetailVO:
        """追加反馈"""
        return self._client.post(f"/app/v3/api/feedback/{feedbackId}/followup", json=body)

    def list_support_messages(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageSupportMessageVO:
        """客服消息列表"""
        return self._client.get(f"/app/v3/api/feedback/support/messages", params=params)

    def send_support_message(self, body: SupportMessageRequest) -> PlusApiResultSupportMessageVO:
        """发送客服消息"""
        return self._client.post(f"/app/v3/api/feedback/support/messages", json=body)

    def list_reports(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageReportVO:
        """举报列表"""
        return self._client.get(f"/app/v3/api/feedback/reports", params=params)

    def submit_report(self, body: ReportSubmitForm) -> PlusApiResultReportVO:
        """提交举报"""
        return self._client.post(f"/app/v3/api/feedback/reports", json=body)

    def complete_onboarding_step(self, stepId: str) -> PlusApiResultVoid:
        """完成指引"""
        return self._client.post(f"/app/v3/api/feedback/onboarding/{stepId}/complete")

    def like_faq(self, faqId: str) -> PlusApiResultVoid:
        """FAQ点赞"""
        return self._client.post(f"/app/v3/api/feedback/faq/{faqId}/like")

    def dislike_faq(self, faqId: str) -> PlusApiResultVoid:
        """FAQ点踩"""
        return self._client.post(f"/app/v3/api/feedback/faq/{faqId}/dislike")

    def get_feedback_detail(self, feedbackId: str) -> PlusApiResultFeedbackDetailVO:
        """反馈详情"""
        return self._client.get(f"/app/v3/api/feedback/{feedbackId}")

    def list_tutorials(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageTutorialVO:
        """教程列表"""
        return self._client.get(f"/app/v3/api/feedback/tutorials", params=params)

    def get_tutorial_detail(self, tutorialId: str) -> PlusApiResultTutorialDetailVO:
        """教程详情"""
        return self._client.get(f"/app/v3/api/feedback/tutorials/{tutorialId}")

    def get_support_info(self) -> PlusApiResultSupportInfoVO:
        """客服信息"""
        return self._client.get(f"/app/v3/api/feedback/support")

    def get_report_detail(self, reportId: str) -> PlusApiResultReportDetailVO:
        """举报详情"""
        return self._client.get(f"/app/v3/api/feedback/reports/{reportId}")

    def get_onboarding_guide(self) -> PlusApiResultListOnboardingStepVO:
        """新手指引"""
        return self._client.get(f"/app/v3/api/feedback/onboarding")

    def list_faqs(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultPageFaqVO:
        """FAQ列表"""
        return self._client.get(f"/app/v3/api/feedback/faq", params=params)

    def get_faq_detail(self, faqId: str) -> PlusApiResultFaqDetailVO:
        """FAQ详情"""
        return self._client.get(f"/app/v3/api/feedback/faq/{faqId}")

    def search_faqs(self, params: Optional[Dict[str, Any]] = None) -> PlusApiResultListFaqVO:
        """搜索FAQ"""
        return self._client.get(f"/app/v3/api/feedback/faq/search", params=params)

    def list_faq_categories(self) -> PlusApiResultListFaqCategoryVO:
        """FAQ分类"""
        return self._client.get(f"/app/v3/api/feedback/faq/categories")
