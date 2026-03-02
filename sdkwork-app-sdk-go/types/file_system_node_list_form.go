package types

// Filesystem node list query form
type FileSystemNodeListForm struct {
	DiskId string `json:"diskId"`
	ParentId string `json:"parentId"`
	Keyword string `json:"keyword"`
	SortField string `json:"sortField"`
	SortOrder string `json:"sortOrder"`
	PageNum int `json:"pageNum"`
	PageSize int `json:"pageSize"`
}
