package types

// 技能市场查询参数
type SkillMarketQueryForm struct {
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	CategoryId int `json:"categoryId"`
	PackageId int `json:"packageId"`
	Keyword string `json:"keyword"`
	SortBy string `json:"sortBy"`
	Size int `json:"size"`
	Page int `json:"page"`
}
