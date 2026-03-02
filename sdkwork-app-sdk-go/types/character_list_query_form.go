package types

// 角色列表查询请求
type CharacterListQueryForm struct {
	Style string `json:"style"`
	Keyword string `json:"keyword"`
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
	SortBy string `json:"sortBy"`
	SortOrder string `json:"sortOrder"`
}
