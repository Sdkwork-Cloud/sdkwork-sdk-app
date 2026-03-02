package types

// 岗位详情响应
type PositionDetailVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	Name string `json:"name"`
	Code string `json:"code"`
	Description string `json:"description"`
	OwnerId int `json:"ownerId"`
	ParentId int `json:"parentId"`
	Level int `json:"level"`
	IsActive bool `json:"isActive"`
	SortOrder int `json:"sortOrder"`
	TreePath TreeNodePath `json:"treePath"`
	FullPathName string `json:"fullPathName"`
	Category string `json:"category"`
	LevelName string `json:"levelName"`
	RequiredExperienceYears int `json:"requiredExperienceYears"`
	RequiredEducation string `json:"requiredEducation"`
	MaxMemberCount int `json:"maxMemberCount"`
	CurrentMemberCount int `json:"currentMemberCount"`
	IsFull bool `json:"isFull"`
}
