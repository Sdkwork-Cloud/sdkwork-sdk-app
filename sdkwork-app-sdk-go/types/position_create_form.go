package types

// 创建岗位表单
type PositionCreateForm struct {
	Name string `json:"name"`
	Code string `json:"code"`
	Description string `json:"description"`
	OwnerId int `json:"ownerId"`
	ParentId int `json:"parentId"`
	Level int `json:"level"`
	SortOrder int `json:"sortOrder"`
	Category string `json:"category"`
	RequiredExperienceYears int `json:"requiredExperienceYears"`
	RequiredEducation string `json:"requiredEducation"`
	MaxMemberCount int `json:"maxMemberCount"`
}
