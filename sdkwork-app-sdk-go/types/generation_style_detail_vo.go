package types

// 生成风格详情响应
type GenerationStyleDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	StyleId string `json:"styleId"`
	Name string `json:"name"`
	Description string `json:"description"`
	Type string `json:"type"`
	ConfigParams map[string]interface{} `json:"configParams"`
	Tags TagsContent `json:"tags"`
	CoverImage ImageMediaResource `json:"coverImage"`
	Assets AssetMediaResourceList `json:"assets"`
	PreviewImage ImageMediaResource `json:"previewImage"`
	IsPublic bool `json:"isPublic"`
	Status string `json:"status"`
	UsageCount int `json:"usageCount"`
}
