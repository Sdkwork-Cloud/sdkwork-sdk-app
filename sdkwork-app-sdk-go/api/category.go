package api

import (
    "fmt"
    sdktypes "github.com/sdkwork/app-sdk/types"
    sdkhttp "github.com/sdkwork/app-sdk/http"
)

type CategoryApi struct {
    client *sdkhttp.Client
}

func NewCategoryApi(client *sdkhttp.Client) *CategoryApi {
    return &CategoryApi{client: client}
}

// 获取分类详情
func (a *CategoryApi) GetCategoryDetail(categoryId string) (sdktypes.PlusApiResultCategoryDetailVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/category/%s", categoryId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultCategoryDetailVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCategoryDetailVO](raw)
}

// 更新分类
func (a *CategoryApi) UpdateCategory(categoryId string, body sdktypes.CategoryUpdateForm) (sdktypes.PlusApiResultCategoryVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/category/%s", categoryId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCategoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCategoryVO](raw)
}

// 删除分类
func (a *CategoryApi) DeleteCategory(categoryId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/category/%s", categoryId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 更新分类状态
func (a *CategoryApi) UpdateCategoryStatus(categoryId string, query map[string]interface{}) (sdktypes.PlusApiResultCategoryVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/category/%s/status", categoryId)), nil, query, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCategoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCategoryVO](raw)
}

// 移动分类
func (a *CategoryApi) Move(categoryId string, body sdktypes.CategoryMoveForm) (sdktypes.PlusApiResultCategoryVO, error) {
    raw, err := a.client.Put(AppApiPath(fmt.Sprintf("/category/%s/move", categoryId)), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCategoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCategoryVO](raw)
}

// 排序分类
func (a *CategoryApi) SortCategories(body sdktypes.CategorySortForm) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Put(AppApiPath("/category/sort"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}

// 获取分类列表
func (a *CategoryApi) ListCategories(query map[string]interface{}) (sdktypes.PlusApiResultListCategoryVO, error) {
    raw, err := a.client.Get(AppApiPath("/category"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListCategoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListCategoryVO](raw)
}

// 创建分类
func (a *CategoryApi) CreateCategory(body sdktypes.CategoryCreateForm) (sdktypes.PlusApiResultCategoryVO, error) {
    raw, err := a.client.Post(AppApiPath("/category"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultCategoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultCategoryVO](raw)
}

// 获取标签列表
func (a *CategoryApi) ListTags(query map[string]interface{}) (sdktypes.PlusApiResultListTagVO, error) {
    raw, err := a.client.Get(AppApiPath("/category/tags"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListTagVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListTagVO](raw)
}

// 创建标签
func (a *CategoryApi) CreateTag(body sdktypes.TagCreateForm) (sdktypes.PlusApiResultTagVO, error) {
    raw, err := a.client.Post(AppApiPath("/category/tags"), body, nil, nil, "")
    if err != nil {
        var zero sdktypes.PlusApiResultTagVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultTagVO](raw)
}

// 获取分类路径
func (a *CategoryApi) GetCategoryPath(categoryId string) (sdktypes.PlusApiResultListCategoryVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/category/%s/path", categoryId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListCategoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListCategoryVO](raw)
}

// 获取子分类
func (a *CategoryApi) GetChildren(categoryId string) (sdktypes.PlusApiResultListCategoryVO, error) {
    raw, err := a.client.Get(AppApiPath(fmt.Sprintf("/category/%s/children", categoryId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListCategoryVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListCategoryVO](raw)
}

// 获取分类类型
func (a *CategoryApi) GetCategoryTypes() (sdktypes.PlusApiResultListCategoryTypeVO, error) {
    raw, err := a.client.Get(AppApiPath("/category/types"), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListCategoryTypeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListCategoryTypeVO](raw)
}

// 获取分类树
func (a *CategoryApi) GetCategoryTree(query map[string]interface{}) (sdktypes.PlusApiResultListCategoryTreeVO, error) {
    raw, err := a.client.Get(AppApiPath("/category/tree"), query, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultListCategoryTreeVO
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultListCategoryTreeVO](raw)
}

// 删除标签
func (a *CategoryApi) DeleteTag(tagId string) (sdktypes.PlusApiResultVoid, error) {
    raw, err := a.client.Delete(AppApiPath(fmt.Sprintf("/category/tags/%s", tagId)), nil, nil)
    if err != nil {
        var zero sdktypes.PlusApiResultVoid
        return zero, err
    }
    return decodeResult[sdktypes.PlusApiResultVoid](raw)
}
