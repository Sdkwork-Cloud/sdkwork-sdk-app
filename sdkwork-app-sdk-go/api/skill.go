package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type SkillApi struct {
    client *sdkhttp.Client
}

func NewSkillApi(client *sdkhttp.Client) *SkillApi {
    return &SkillApi{client: client}
}

// Get skill detail
func (a *SkillApi) Detail(skillId string) (sdktypes.PlusApiResultSkillVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/skills/%s", skillId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSkillVO](raw)
}

// Update skill
func (a *SkillApi) Update(skillId string, body sdktypes.SkillSaveForm) (sdktypes.PlusApiResultSkillVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/skills/%s", skillId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSkillVO](raw)
}

// Update user skill config
func (a *SkillApi) UpdateConfig(skillId string, body *sdktypes.SkillConfigUpdateForm) (sdktypes.PlusApiResultUserSkillVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/skills/%s/config", skillId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUserSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserSkillVO](raw)
}

// List market skills
func (a *SkillApi) List(query map[string]interface{}) (sdktypes.PlusApiResultPageSkillVO, error) {
    raw, err := a.client.Get(AppApiPath("/skills"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultPageSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultPageSkillVO](raw)
}

// Create skill
func (a *SkillApi) Create(body sdktypes.SkillSaveForm) (sdktypes.PlusApiResultSkillVO, error) {
    raw, err := a.client.Post(AppApiPath("/skills"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSkillVO](raw)
}

// Submit skill for review
func (a *SkillApi) SubmitReview(skillId string) (sdktypes.PlusApiResultSkillVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/skills/%s/submit-review", skillId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSkillVO](raw)
}

// Publish skill to market
func (a *SkillApi) Publish(skillId string) (sdktypes.PlusApiResultSkillVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/skills/%s/publish", skillId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSkillVO](raw)
}

// Offline skill from market
func (a *SkillApi) Offline(skillId string) (sdktypes.PlusApiResultSkillVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/skills/%s/offline", skillId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultSkillVO](raw)
}

// Enable skill for current user
func (a *SkillApi) Enable(skillId string) (sdktypes.PlusApiResultUserSkillVO, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/skills/%s/enable", skillId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultUserSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultUserSkillVO](raw)
}

// Disable skill for current user
func (a *SkillApi) Disable(skillId string) (sdktypes.PlusApiResultBoolean, error) {
    raw, err := a.client.Post(AppApiPath(fmt.Sprintf("/skills/%s/disable", skillId)), nil, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultBoolean
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultBoolean](raw)
}

// List skill packages
func (a *SkillApi) ListPackages() (sdktypes.PlusApiResultListSkillPackageVO, error) {
    raw, err := a.client.Get(AppApiPath("/skills/packages"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListSkillPackageVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListSkillPackageVO](raw)
}

// List my installed skills
func (a *SkillApi) ListMine() (sdktypes.PlusApiResultListUserSkillVO, error) {
    raw, err := a.client.Get(AppApiPath("/skills/my"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListUserSkillVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListUserSkillVO](raw)
}

// List skill categories
func (a *SkillApi) ListCategories() (sdktypes.PlusApiResultListSkillCategoryVO, error) {
    raw, err := a.client.Get(AppApiPath("/skills/categories"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListSkillCategoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListSkillCategoryVO](raw)
}
