import '../http/client.dart';
import '../models.dart';

class FeedbackApi {
  final HttpClient _client;
  
  FeedbackApi(this._client);

  /// 关闭反馈
  Future<PlusApiResultFeedbackDetailVO?> close(String feedbackId, Map<String, dynamic>? params) async {
    final response = await _client.put(ApiPaths.appPath('/feedback/${feedbackId}/close'), params: params);
    return response is PlusApiResultFeedbackDetailVO ? response : null;
  }

  /// 反馈列表
  Future<PlusApiResultPageFeedbackVO?> listFeedback(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feedback'), params: params);
    return response is PlusApiResultPageFeedbackVO ? response : null;
  }

  /// 提交反馈
  Future<PlusApiResultFeedbackVO?> submit(FeedbackSubmitForm body) async {
    final response = await _client.post(ApiPaths.appPath('/feedback'), body: body, contentType: 'application/json');
    return response is PlusApiResultFeedbackVO ? response : null;
  }

  /// 追加反馈
  Future<PlusApiResultFeedbackDetailVO?> followUp(String feedbackId, FeedbackFollowUpForm body) async {
    final response = await _client.post(ApiPaths.appPath('/feedback/${feedbackId}/followup'), body: body, contentType: 'application/json');
    return response is PlusApiResultFeedbackDetailVO ? response : null;
  }

  /// 客服消息列表
  Future<PlusApiResultPageSupportMessageVO?> listSupportMessages(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feedback/support/messages'), params: params);
    return response is PlusApiResultPageSupportMessageVO ? response : null;
  }

  /// 发送客服消息
  Future<PlusApiResultSupportMessageVO?> sendSupportMessage(SupportMessageRequest body) async {
    final response = await _client.post(ApiPaths.appPath('/feedback/support/messages'), body: body, contentType: 'application/json');
    return response is PlusApiResultSupportMessageVO ? response : null;
  }

  /// 举报列表
  Future<PlusApiResultPageReportVO?> listReports(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feedback/reports'), params: params);
    return response is PlusApiResultPageReportVO ? response : null;
  }

  /// 提交举报
  Future<PlusApiResultReportVO?> submitReport(ReportSubmitForm body) async {
    final response = await _client.post(ApiPaths.appPath('/feedback/reports'), body: body, contentType: 'application/json');
    return response is PlusApiResultReportVO ? response : null;
  }

  /// 完成指引
  Future<PlusApiResultVoid?> completeOnboardingStep(String stepId) async {
    final response = await _client.post(ApiPaths.appPath('/feedback/onboarding/${stepId}/complete'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// FAQ点赞
  Future<PlusApiResultVoid?> likeFaq(String faqId) async {
    final response = await _client.post(ApiPaths.appPath('/feedback/faq/${faqId}/like'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// FAQ点踩
  Future<PlusApiResultVoid?> dislikeFaq(String faqId) async {
    final response = await _client.post(ApiPaths.appPath('/feedback/faq/${faqId}/dislike'));
    return response is PlusApiResultVoid ? response : null;
  }

  /// 反馈详情
  Future<PlusApiResultFeedbackDetailVO?> getFeedbackDetail(String feedbackId) async {
    final response = await _client.get(ApiPaths.appPath('/feedback/${feedbackId}'));
    return response is PlusApiResultFeedbackDetailVO ? response : null;
  }

  /// 教程列表
  Future<PlusApiResultPageTutorialVO?> listTutorials(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feedback/tutorials'), params: params);
    return response is PlusApiResultPageTutorialVO ? response : null;
  }

  /// 教程详情
  Future<PlusApiResultTutorialDetailVO?> getTutorialDetail(String tutorialId) async {
    final response = await _client.get(ApiPaths.appPath('/feedback/tutorials/${tutorialId}'));
    return response is PlusApiResultTutorialDetailVO ? response : null;
  }

  /// 客服信息
  Future<PlusApiResultSupportInfoVO?> getSupportInfo() async {
    final response = await _client.get(ApiPaths.appPath('/feedback/support'));
    return response is PlusApiResultSupportInfoVO ? response : null;
  }

  /// 举报详情
  Future<PlusApiResultReportDetailVO?> getReportDetail(String reportId) async {
    final response = await _client.get(ApiPaths.appPath('/feedback/reports/${reportId}'));
    return response is PlusApiResultReportDetailVO ? response : null;
  }

  /// 新手指引
  Future<PlusApiResultListOnboardingStepVO?> getOnboardingGuide() async {
    final response = await _client.get(ApiPaths.appPath('/feedback/onboarding'));
    return response is PlusApiResultListOnboardingStepVO ? response : null;
  }

  /// FAQ列表
  Future<PlusApiResultPageFaqVO?> listFaqs(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feedback/faq'), params: params);
    return response is PlusApiResultPageFaqVO ? response : null;
  }

  /// FAQ详情
  Future<PlusApiResultFaqDetailVO?> getFaqDetail(String faqId) async {
    final response = await _client.get(ApiPaths.appPath('/feedback/faq/${faqId}'));
    return response is PlusApiResultFaqDetailVO ? response : null;
  }

  /// 搜索FAQ
  Future<PlusApiResultListFaqVO?> searchFaqs(Map<String, dynamic>? params) async {
    final response = await _client.get(ApiPaths.appPath('/feedback/faq/search'), params: params);
    return response is PlusApiResultListFaqVO ? response : null;
  }

  /// FAQ分类
  Future<PlusApiResultListFaqCategoryVO?> listFaqCategories() async {
    final response = await _client.get(ApiPaths.appPath('/feedback/faq/categories'));
    return response is PlusApiResultListFaqCategoryVO ? response : null;
  }
}
