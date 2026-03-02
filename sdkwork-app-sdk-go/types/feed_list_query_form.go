package types

// Feed列表查询表单
type FeedListQueryForm struct {
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
	SortField string `json:"sortField"`
	SortDirection string `json:"sortDirection"`
	Type string `json:"type"`
	ContentType string `json:"contentType"`
	Keyword string `json:"keyword"`
	AuthorId int `json:"authorId"`
	Size int `json:"size"`
	Page int `json:"page"`
}
