package types

// 文件夹创建请求
type FolderCreateForm struct {
	Name string `json:"name"`
	ParentId string `json:"parentId"`
}
