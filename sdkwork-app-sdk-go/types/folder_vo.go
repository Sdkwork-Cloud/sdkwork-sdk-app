package types

// 文件夹响应
type FolderVO struct {
	CreatedAt string `json:"createdAt"`
	UpdatedAt string `json:"updatedAt"`
	FolderId string `json:"folderId"`
	FolderName string `json:"folderName"`
	ParentId string `json:"parentId"`
	ChildCount int `json:"childCount"`
	FileCount int `json:"fileCount"`
}
