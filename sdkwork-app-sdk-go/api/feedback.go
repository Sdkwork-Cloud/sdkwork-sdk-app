package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type FeedbackApi struct {
    client *sdkhttp.Client
}

func NewFeedbackApi(client *sdkhttp.Client) *FeedbackApi {
    return &FeedbackApi{client: client}
}

// 关闭反馈
func (a *FeedbackApi) Close(feedbackId string, query map[string]interface{}) (sdktypes.PlusApiResultFeedbackDetailVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/feedback/%s/close", feedbackId)), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFeedbackDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFeedbackDetailVO](raw)
}

// 反馈列表
func (a *FeedbackApi) ListFeedback(query map[string]interface{}) (sdktypes.PlusApiResultPageFeedbackVO, error) {
    raw, err := a.client.Get(AppApiPath("/feedback"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageFeedbackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageFeedbackVO](raw)
}

// 提交反馈
func (a *FeedbackApi) Submit(body sdktypes.FeedbackSubmitForm) (sdktypes.PlusApiResultFeedbackVO, error) {
    raw, err := a.client.Post(AppApiPath("/feedback"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFeedbackVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFeedbackVO](raw)
}

// 追加反馈
func (a *FeedbackApi) FollowUp(feedbackId string, body sdktypes.FeedbackFollowUpForm) (sdktypes.PlusApiResultFeedbackDetailVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/feedback/%s/followup", feedbackId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultFeedbackDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFeedbackDetailVO](raw)
}

// 客服消息列表
func (a *FeedbackApi) ListSupportMessages(query map[string]interface{}) (sdktypes.PlusApiResultPageSupportMessageVO, error) {
    raw, err := a.client.Get(AppApiPath("/feedback/support/messages"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageSupportMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageSupportMessageVO](raw)
}

// 发送客服消息
func (a *FeedbackApi) SendSupportMessage(body sdktypes.SupportMessageRequest) (sdktypes.PlusApiResultSupportMessageVO, error) {
    raw, err := a.client.Post(AppApiPath("/feedback/support/messages"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultSupportMessageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSupportMessageVO](raw)
}

// 举报列表
func (a *FeedbackApi) ListReports(query map[string]interface{}) (sdktypes.PlusApiResultPageReportVO, error) {
    raw, err := a.client.Get(AppApiPath("/feedback/reports"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageReportVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageReportVO](raw)
}

// 提交举报
func (a *FeedbackApi) SubmitReport(body sdktypes.ReportSubmitForm) (sdktypes.PlusApiResultReportVO, error) {
    raw, err := a.client.Post(AppApiPath("/feedback/reports"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultReportVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultReportVO](raw)
}

// 完成指引
func (a *FeedbackApi) CompleteOnboardingStep(stepId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/feedback/onboarding/%s/complete", stepId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// FAQ点赞
func (a *FeedbackApi) LikeFaq(faqId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/feedback/faq/%s/like", faqId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// FAQ点踩
func (a *FeedbackApi) DislikeFaq(faqId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/feedback/faq/%s/dislike", faqId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 反馈详情
func (a *FeedbackApi) GetFeedbackDetail(feedbackId string) (sdktypes.PlusApiResultFeedbackDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/feedback/%s", feedbackId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFeedbackDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFeedbackDetailVO](raw)
}

// 教程列表
func (a *FeedbackApi) ListTutorials(query map[string]interface{}) (sdktypes.PlusApiResultPageTutorialVO, error) {
    raw, err := a.client.Get(AppApiPath("/feedback/tutorials"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageTutorialVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageTutorialVO](raw)
}

// 教程详情
func (a *FeedbackApi) GetTutorialDetail(tutorialId string) (sdktypes.PlusApiResultTutorialDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/feedback/tutorials/%s", tutorialId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultTutorialDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultTutorialDetailVO](raw)
}

// 客服信息
func (a *FeedbackApi) GetSupportInfo() (sdktypes.PlusApiResultSupportInfoVO, error) {
    raw, err := a.client.Get(AppApiPath("/feedback/support"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultSupportInfoVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSupportInfoVO](raw)
}

// 举报详情
func (a *FeedbackApi) GetReportDetail(reportId string) (sdktypes.PlusApiResultReportDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/feedback/reports/%s", reportId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultReportDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultReportDetailVO](raw)
}

// 新手指引
func (a *FeedbackApi) GetOnboardingGuide() (sdktypes.PlusApiResultListOnboardingStepVO, error) {
    raw, err := a.client.Get(AppApiPath("/feedback/onboarding"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListOnboardingStepVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListOnboardingStepVO](raw)
}

// FAQ列表
func (a *FeedbackApi) ListFaqs(query map[string]interface{}) (sdktypes.PlusApiResultPageFaqVO, error) {
    raw, err := a.client.Get(AppApiPath("/feedback/faq"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageFaqVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageFaqVO](raw)
}

// FAQ详情
func (a *FeedbackApi) GetFaqDetail(faqId string) (sdktypes.PlusApiResultFaqDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/feedback/faq/%s", faqId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultFaqDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultFaqDetailVO](raw)
}

// 搜索FAQ
func (a *FeedbackApi) SearchFaqs(query map[string]interface{}) (sdktypes.PlusApiResultListFaqVO, error) {
    raw, err := a.client.Get(AppApiPath("/feedback/faq/search"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFaqVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFaqVO](raw)
}

// FAQ分类
func (a *FeedbackApi) ListFaqCategories() (sdktypes.PlusApiResultListFaqCategoryVO, error) {
    raw, err := a.client.Get(AppApiPath("/feedback/faq/categories"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListFaqCategoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListFaqCategoryVO](raw)
}
