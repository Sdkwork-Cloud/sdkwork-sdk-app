package types

// 创建笔记文件夹请求
type NoteFolderCreateRequest struct {
	Name string `json:"name"`
	ParentId string `json:"parentId"`
	DiskId string `json:"diskId"`
}
