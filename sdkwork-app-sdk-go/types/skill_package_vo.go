package types

// 技能分包信息
type SkillPackageVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	PackageId int `json:"packageId"`
	PackageKey string `json:"packageKey"`
	Name string `json:"name"`
	Summary string `json:"summary"`
	Description string `json:"description"`
	Icon string `json:"icon"`
	CoverImage string `json:"coverImage"`
	CategoryId int `json:"categoryId"`
	CategoryName string `json:"categoryName"`
	Tags []string `json:"tags"`
	Featured bool `json:"featured"`
	SortWeight int `json:"sortWeight"`
	SkillCount int `json:"skillCount"`
}
